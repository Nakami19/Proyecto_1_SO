/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import static Interfaces.Ventana.getCn_Pm_State;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Natalia
 */
public class ProjectManager extends Thread {
    private int sueldoph;
    private int dayDuration;
    private float salarioacc=0;
    private int horas; //pasar la duracion de un dia a una hora, se divide entre 24 
    private Semaphore mutex;
    private Drive drive;
    private String estado;
    private int dineroDescontado = 0;
    private int faltas = 0;

    public ProjectManager(int sueldoph, int dayDuration, Semaphore mutex, Drive drive) {
        this.sueldoph = sueldoph;
        this.dayDuration = dayDuration;
        this.mutex = mutex;
        this.estado="Trabajando";
        this.horas=this.dayDuration/24;
        this.drive=drive;
    }
    
    
    
    @Override
    
    public void run() {
        
        while(true) {
            //primero se hace que pasen las 16 horas
            for (int i = 1; i <= 16; i++) {
                try {
                    this.estado="Viendo One Piece";
                    getCn_Pm_State().setText(this.estado);
                   // System.out.println(this.estado);
                    sleep(this.horas/2);//espera media hora
                    
                    this.estado="Trabajando"; //paso la media hora y trabaja de nuevo
                    getCn_Pm_State().setText(this.estado);
                    //System.out.println(this.estado);
                    sleep(this.horas/2);//espera media hora
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("error en pm en las 16 horas "+this.drive.getEstudio());
                }
            }
            
            try {
                //ya pasaron las 16 horas, ahora trabaja durante 8 horas
                sleep(this.horas*8);//pasan las 8 horas y baja el contador
                this.mutex.acquire();
                this.drive.setDiasEntrega(this.drive.getDiasEntrega()-1); //baja en 1 el contador de dias hasta la entrega
                this.mutex.release();
                //ahora cobra su dia de trabajo
                this.drive.setCostos(this.drive.getCostos()+this.sueldoph*24); //al costo le sumo lo que gano el empleado ese dia
                this.salarioacc+=this.sueldoph*24;
                
                //System.out.println("dias hasta la entrega "+this.drive.getDiasEntrega());
            } catch (InterruptedException ex) {
                Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("error en pm en las 8 horas "+this.drive.getEstudio());
            }
            
            
        
        }
    
    }

    public int getSueldoph() {
        return sueldoph;
    }

    public void setSueldoph(int sueldoph) {
        this.sueldoph = sueldoph;
    }

    public int getDayDuration() {
        return dayDuration;
    }

    public void setDayDuration(int dayDuration) {
        this.dayDuration = dayDuration;
    }

    public float getSalarioacc() {
        return salarioacc;
    }

    public void setSalarioacc(float salarioacc) {
        this.salarioacc = salarioacc;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public Semaphore getMutex() {
        return mutex;
    }

    public void setMutex(Semaphore mutex) {
        this.mutex = mutex;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public int getDineroDescontado(){
        return dineroDescontado;
    }
    
    public void setDineroDescontado(int dineroDescontado){
        this.dineroDescontado = dineroDescontado;
    }
    
    public int getFaltas(){
        return faltas;
    }
    
    public void setFaltas(int faltas){
        this.faltas = faltas;
    }
    
}

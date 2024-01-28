/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

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
                    System.out.println(this.estado);
                    sleep(this.horas/2);//espera media hora
                    
                    this.estado="Trabajando"; //paso la media hora y trabaja de nuevo 
                    System.out.println(this.estado);
                    sleep(this.horas/2); //trabaja media y luego vuelve a ver anime
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            try {
                //ya pasaron las 16 horas, ahora trabaja durante 8 horas
                sleep(this.horas*8);//pasan las 8 horas y baja el contador
                this.mutex.acquire();
                this.drive.setDiasEntrega(this.drive.getDiasEntrega()-1); //baja en 1 el contador de dias hasta la entrega
                this.mutex.release();
                //ahora cobra su dia de trabajo
                this.salarioacc+=this.sueldoph*24;
                
                System.out.println("dias hasta la entrega "+this.drive.getDiasEntrega());
            } catch (InterruptedException ex) {
                Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, null, ex);
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
    
    
}

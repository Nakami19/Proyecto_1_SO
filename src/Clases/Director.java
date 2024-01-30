/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Clases;

import Interfaces.Ventana;
import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Tomas
 */
public class Director extends Thread{
    private int sueldoph; //Sueldo por Hora del Director
    private Semaphore mutex; // Semáforo
    private int dayDuration; //Duración del día
    private float salarioAcc = 0; // Salario acumulado
    private Drive drive; //El Drive común de toda la compañía, necesario para el contador de días
    private String estado; // Qué esta haciendo
    private int horaAleatoria; //La hora aleatoria para revisar al PM
    private double horas; //Conversión del día completo en horas
    private ProjectManager pm;
    
    public Director(int sueldoph, int dayDuration, Semaphore mutex, Drive drive, ProjectManager pm){
        this.sueldoph = sueldoph;
        this.dayDuration = dayDuration;
        this.mutex = mutex;
        this.drive = drive;
        this.estado = "Trabajando";
        this.horaAleatoria = 0;
        this.horas = this.dayDuration/24;
        this.pm = pm;
    }
    
    public int getSueldoph(){
        return sueldoph;
    }
    
    public void setSueldoph(int sueldoph){
        this.sueldoph = sueldoph;
    }
    
    public Semaphore getMutex(){
        return mutex;
    }
    
    public void setMutex(Semaphore mutex){
        this.mutex = mutex;
    }
    
    public int getDayDuration(){
        return dayDuration;
    }
    
    public void setDayDuration(int dayDuration){
        this.dayDuration = dayDuration;
    }
    
    public float getSalarioAcc(){
        return salarioAcc;
    }
    
    public void setSalarioAcc(float salarioAcc){
        this.salarioAcc = salarioAcc;
    }
    
    public Drive getDrive(){
        return drive;
    }
    
    public void setDrive(Drive drive){
        this.drive = drive;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    public int getHoraAleatoria(){
        return horaAleatoria;
    }
    
    public void setHoraAleatoria(int horaAleatoria){
        this.horaAleatoria = horaAleatoria;
    }
    
    public double getHoras(){
        return horas;
    }
    
    public void setHoras(int horas){
        this.horas = horas;
    }
    
    public ProjectManager getProjectManager(){
        return pm;
    }
    
    public void setProjectManager(ProjectManager pm){
        this.pm = pm;
    }
    
    @Override
    public void run(){
        while(true){
            //System.out.println(drive.getDiasEntrega() + " jajaja "+ drive.getEstudio());
            if(this.drive.getDiasEntrega() == 0){
                try{
                    this.estado = "Entregando Capitulos";
                    changeText(); //??????? Porque no se cambia a la cosa??????
                    //System.out.println("Estado: "+this.estado);
                    //System.out.println(this.estado);
                    sleep(this.dayDuration);      
                    this.mutex.acquire(); // Wait, empieza la parte crítica
                    
                    this.drive.setDiasEntrega(this.drive.getDiasEntregaOriginal());//Reinicia los días requeridos
                    //Aquí va una función para calcular la ganancia, en donde se agarran los caps y se multiplica y se añade a estudio, pero esa conexión no está hecha todavía
                    
                    if(this.drive.getCaps() > 0){this.drive.setCaps(0);}else{System.out.println("NO SE ENTREGÓ CAPS");
                    }//Reinicia el la cantidad de caps a 0 ya que agarró todos los que tenían
                    
                    this.mutex.release(); //Signal, termina la parte crítica
                }catch(InterruptedException ex){
                        Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
                        System.out.println("error en director en run cuando entrega "+this.drive.getEstudio());
                }                
            }else{
                //Acá abajo está todo el código de el director cuando NO esta entregando caps
                Random random = new Random();
                this.horaAleatoria=random.nextInt(24);
                
                //Aquí van a pasar las 24 horas
                for(int i = 1; i <= 24; i++){
                    try{                        
                        //System.out.println(this.estado);
                        this.estado = "Trabajando";
                        changeText();
                        //System.out.println("Estado: "+this.estado);
                        if(i == this.horaAleatoria){
                            this.estado = "Revisando al Project Manager";
                            changeText();
                            //System.out.println("Estado: "+this.estado);
                            if(this.getProjectManager().getEstado().equals("Viendo One Piece")){
                                //System.out.println("ATRAPADO!!!");
                                this.getProjectManager().setFaltas(this.getProjectManager().getFaltas() + 100);
                                this.getProjectManager().setDineroDescontado(this.getProjectManager().getDineroDescontado() + 100);
                                this.getProjectManager().setSalarioacc(this.getProjectManager().getSalarioacc() - 100);
                            } else{
                            //System.out.println("Mosca pues");
                            }
                        }
                        //System.out.println("horaaa "+this.horas);
                        sleep((long) (this.horas/(12/7))); //Se llevan los 35 minutos que se requieren                    
                    }catch(InterruptedException ex){
                        Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
                        System.out.println("error en director en run cuando no entrega "+this.drive.getEstudio());
                    }
                }                
            }
                    
                this.salarioAcc+=this.sueldoph*24;
        }
    }
    
    public void changeText(){
        Ventana.getCn_Director_State().setText(this.estado);
    }
}
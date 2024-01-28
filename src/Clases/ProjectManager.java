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
    private int horas; //pasar la duracion de un dia a horas, se divide entre 24 
    private Semaphore mutex;
    private String estado;

    public ProjectManager(int sueldoph, int dayDuration, Semaphore mutex) {
        this.sueldoph = sueldoph;
        this.dayDuration = dayDuration;
        this.mutex = mutex;
        this.estado="Trabajando";
        this.horas=this.dayDuration/24;
    }
    
    
    
    @Override
    
    public void run() {
        
        while(true) {
            //primero se hace que pasen las 16 horas
            for (int i = 0; i <= 16; i++) {
                try {
                    this.estado="Viendo One Piece";
                    sleep(this.horas/2);//espera media hora
                    
                    this.estado="Trabajando"; //paso la media hora y trabaja de nuevo 
                    sleep(this.horas/2); //trabaja media y luego vuelve a ver anime
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
        }
    
    }
    
    public void Veranime() {}
    
}

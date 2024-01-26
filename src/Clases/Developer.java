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
public class Developer extends Thread {
    
    private int acc=0; //cuenta el dia, inicia en 0
    private Drive drive;
    private int type; //tipo de trabajador 
    private int sueldoph; //sueldo por hora del trabajador 
    private Semaphore mutex; //semforo
    private int dayDuration;//duracion del dia 
    private float salarioacc=0; //salario acumulado en total, inicia en 0

    public Developer(Drive drive, int type, int sueldoph, Semaphore m, int dayDuration, float salarioacc) {
        this.drive = drive;
        this.type = type;
        this.sueldoph = sueldoph;
        this.mutex = m;
        this.dayDuration = dayDuration;
    }
    
    
    @Override
    public void run() {
        
        while(true) {
            try {
                obtenerSalario();
                Work();
                sleep(this.dayDuration);
            } catch (InterruptedException ex) {
                Logger.getLogger(Developer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    public void Work() {
    
    
    }
    
    public void obtenerSalario() {
        this.salarioacc+=this.sueldoph*24;
    
    }
    
    
}

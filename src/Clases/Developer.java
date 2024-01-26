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
    private int type; //tipo de trabajo
    private int sueldoph; //sueldo por hora del trabajador 
    private Semaphore mutex; //semforo
    private int dayDuration;//duracion del dia 
    private float salarioacc=0; //salario acumulado en total, inicia en 0
    private float produccionPordia; //tiempo que tarda un trabajador en crear su parte, cada trabajador puede tener un numero diferente que represente su dia, ej el animador es 0.34 y cuando pasan 3 dias hace algo, el guionista necesita dos dias entonces en vez de 0.34 puedo poner 0.5 

    public Developer(Drive drive, int type, int sueldoph, Semaphore m, int dayDuration, float salarioacc, float ppd) {
        this.drive = drive;
        this.type = type;
        this.sueldoph = sueldoph;
        this.mutex = m;
        this.dayDuration = dayDuration;
        this.produccionPordia=ppd;
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
        this.acc+=this.produccionPordia; 
    
    }
    
    public void obtenerSalario() {
        this.salarioacc+=this.sueldoph*24;
    
    }
    
    
}

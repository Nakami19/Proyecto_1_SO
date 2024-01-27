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
    
    private double acc=0; //cuenta el dia, inicia en 0
    private Drive drive;
    private int type; //tipo de trabajo
    private int sueldoph; //sueldo por hora del trabajador 
    private Semaphore mutex; //semforo
    private int dayDuration;//duracion del dia 
    private float salarioacc=0; //salario acumulado en total, inicia en 0
    private double produccionPordia; //tiempo que tarda un trabajador en crear su parte, cada trabajador puede tener un numero diferente que represente su dia, ej el animador es 0.34 y cuando pasan 3 dias hace algo, el guionista necesita dos dias entonces en vez de 0.34 puedo poner 0.5 
    private String estudio; //cartoon o nick, capaz saber el estudio aqui no es tan importante
    
    public Developer(Drive drive, int type, int sueldoph, Semaphore m, int dayDuration,double ppd, String estudio) {
        this.drive = drive;
        this.type = type;
        this.sueldoph = sueldoph;
        this.mutex = m;
        this.dayDuration = dayDuration;
        this.produccionPordia=ppd;
        this.estudio=estudio;
    }
    
    
    @Override
    public void run() {
        
        while(true) {
            try {
                obtenerSalario();
                Work();
                System.out.println("Trabajador: "+ this.type+" trabaja en: "+this.estudio + " gana: "+this.salarioacc+"$");
                sleep(this.dayDuration);
            } catch (InterruptedException ex) {
                Logger.getLogger(Developer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    //no se si esto haga falta 
    //type 0 guion
    //type 1 escenario
    //type 2 animacion 
    //type 3 doblaje
    //type 4 plot twist 
    public void Work() {
        this.acc+=this.produccionPordia; 
        if(this.acc>=1) {try {
            //si completa sus dias para producir
            this.mutex.acquire(); //wait
            //empieza parte critica 
            this.drive.addPart(this.type); //se añade la parte al drive, aqui creo que si necesito pasarle el tipo 
            this.mutex.release(); //sognal
            this.acc=0; //se reinicia la produccion
            } catch (InterruptedException ex) {
                Logger.getLogger(Developer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    }
    
    public void obtenerSalario() {
        this.salarioacc+=this.sueldoph*24;
    
    }

    public double getAcc() {
        return acc;
    }

    public void setAcc(double acc) {
        this.acc = acc;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getSueldoph() {
        return sueldoph;
    }

    public void setSueldoph(int sueldoph) {
        this.sueldoph = sueldoph;
    }

    public Semaphore getMutex() {
        return mutex;
    }

    public void setMutex(Semaphore mutex) {
        this.mutex = mutex;
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

    public double getProduccionPordia() {
        return produccionPordia;
    }

    public void setProduccionPordia(double produccionPordia) {
        this.produccionPordia = produccionPordia;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
    
}

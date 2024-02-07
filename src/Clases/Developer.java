/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Interfaces.Ventana;
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
    private boolean continuar=true; //para detener el hilo

    
    public Developer(Drive drive, int type, int sueldoph, Semaphore m, int dayDuration,double ppd, String estudio) {
        this.drive = drive;
        this.type = type;
        this.sueldoph = sueldoph;
        this.mutex = m;
        this.dayDuration = dayDuration;
        this.produccionPordia=ppd;
        this.estudio=estudio;
    }
    
    public void detener() {
        this.continuar=false;
    }
    
    @Override
    public void run() {
        
        while(this.continuar) {
            try {
                obtenerSalario();
                //System.out.println("Trabajador: "+ this.type+" trabaja en: "+this.estudio + " gana: "+this.salarioacc+"$");
//                if (type==5) {        
//                    if(PuedeEnsamblar()) {
//                        Work();
//                    }
//                } else {
                Work();
//                }
                sleep(this.dayDuration);
            } catch (InterruptedException ex) {
                Logger.getLogger(Developer.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Error!!! "+this.estudio+" en run "+ this.type );
            
                
            }
        }
        
    }
    //no se si esto haga falta 
    //type 0 guion
    //type 1 escenario
    //type 2 animacion 
    //type 3 doblaje
    //type 4 plot twist 
    //type 5 ensamblador
    public void Work() {
        this.acc+=this.produccionPordia; 
        if(this.acc>=1) {try {
            //si completa sus dias para producir
            this.mutex.acquire(); //wait
            //empieza parte critica
            if(this.type==5) {
                if(PuedeEnsamblar()) {
                this.drive.Create();
                }
                 //se crea un cap
            }
            else {
            this.drive.addPart(this.type); //se añade la parte al drive, aqui creo que si necesito pasarle el tipo 
            }
            
            this.mutex.release(); //signal
            this.acc=0; //se reinicia la produccion
            } catch (InterruptedException ex) {
                Logger.getLogger(Developer.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Error!!! "+this.estudio+" en work "+ this.type );
            }
        }
    
    }
    
    public boolean PuedeEnsamblar() {
        //try { 
            //this.mutex.acquire(); //debe acceder al drive y solo puede hacerlo uno a la vez entpnces con esto otro hilo no puede acceder mientras el ensamblador revisa
                if(this.estudio.compareTo("Nickelodeon")==0) {
                    if(drive.getCapsHastaPlot()>0) {
                        if(drive.getGuion()>=2 && drive.getEscenario()>=1 && drive.getAnimaciones()>=4 && drive.getDoblajes()>=4) {
                            return true;
                        }
                        else {
                            return false;
                        }
                    }
                    else {
                        if(drive.getGuion()>=2 && drive.getEscenario()>=1 && drive.getAnimaciones()>=4 && drive.getDoblajes()>=4 && drive.getPlotTwist()>=2) {
                            return true;
                        }
                        else {
                            return false;
                        }
                    
                    }
                }
                if(this.estudio.compareTo("Cartoon Network")==0) {
                    if(drive.getCapsHastaPlot()>0) {
                        if(drive.getGuion()>=1 && drive.getEscenario()>=2 && drive.getAnimaciones()>=6 && drive.getDoblajes()>=5) {
                            return true;
                        }
                        else {
                            return false;
                        }
                    }
                    else {
                        if(drive.getGuion()>=1 && drive.getEscenario()>=2 && drive.getAnimaciones()>=6 && drive.getDoblajes()>=5 && drive.getPlotTwist()>=1) {
                            return true;
                        }
                        else {
                            return false;
                        }
                    
                    }
                }
          //  this.mutex.release();
        //} catch (InterruptedException ex) {
           // Logger.getLogger(Developer.class.getName()).log(Level.SEVERE, null, ex);
        //}
        return false;
    }
    
    public void obtenerSalario() {
        try{
            this.mutex.acquire();
            this.drive.setCostos(this.drive.getCostos()+this.sueldoph*24); //al costo le sumo lo que gano el empleado ese dia
            if(this.estudio.compareTo("Nickelodeon")==0){
                Ventana.getNk_Loss_Counter().setText(Integer.toString((int) this.drive.getCostos())+"$");
            }else{
                Ventana.getCn_Loss_Counter().setText(Integer.toString((int) this.drive.getCostos())+"$");
            }            
            this.mutex.release();
            this.salarioacc+=this.sueldoph*24;
            
        }catch(InterruptedException ex) {
                Logger.getLogger(Developer.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Error!!! "+this.estudio+" en obtenerSalario "+ this.type );
        }
            
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

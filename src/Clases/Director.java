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
//    public void run() {
//        while (true) {
//            try {
//                mutex.acquire();
//                if(this.drive.getDiasEntrega()<=0){
//                  this.estado="Entregando capitulos";
//                  changeStateText();
//                  
//                  if(this.drive.getCapN() <= 0 && this.drive.getCapP() <= 0){
//                        System.out.println("NO SE ENTREGO NINGUN CAPITULO");
//                    }else{
//                        if(this.drive.getCapN() > 0){
//                        this.drive.calcularGananciaN(this.drive.getCapN());
//                        this.drive.setCapN(0);
//                        
//                    }
//                        if(this.drive.getCapP() > 0){
//                            this.drive.calcularGananciaP(this.drive.getCapN());
//                            this.drive.setCapP(0);
//                        }
//                }
//                this.drive.setDiasEntrega(this.drive.getDiasEntregaOriginal());
//                mutex.release();
//                obtenerSalario();
//                sleep(this.dayDuration);
//                
//             }
//                else {
//                mutex.release();
//                Random random = new Random();
//                int horaAleatoria;
//                while((horaAleatoria=random.nextInt(24))==0) {
//                    horaAleatoria=random.nextInt(24);
//                }
//                System.out.println("HORA ALEATORIA: "+horaAleatoria+ " "+this.drive.getEstudio());
//                
//                    for (int i = 1; i <= 24; i++) {
//                        this.estado = "Labores Administrativas";
//                        changeStateText();
//                        if(i==horaAleatoria){
//                            this.estado = "Revisando al Project Manager";
//                            changeStateText();
//                            if(this.getProjectManager().getEstado().equals("Viendo One Piece")){
//                System.out.println("ATRAPADO!!! " + this.drive.getEstudio());
//                this.getProjectManager().setFaltas(this.getProjectManager().getFaltas() + 1);
//                this.getProjectManager().setDineroDescontado(this.getProjectManager().getDineroDescontado() + 100);
//                this.getProjectManager().setSalarioacc(this.getProjectManager().getSalarioacc() - 100);
//                changeFailText();}
//                            //checkPm();
//                            
//                        }
//                        sleep((long) (this.horas/(12/7)));
//                    }
//                    obtenerSalario();
//                }
//            } catch (Exception e) {
//                System.out.println("pipipipipi");
//            }
//        
//        }
//    
//    }
    public void run(){
        while(true){
     
            if(this.drive.getDiasEntrega() <= 0){
                try{
                    this.estado = "Entregando Capitulos";
                    changeStateText(); //??????? Porque no se cambia a la cosa??????
                    //System.out.println("Estado: "+this.estado);
                    //System.out.println(this.estado);
                    sleep(this.dayDuration);      
                    this.mutex.acquire(); // Wait, empieza la parte crítica
                    
                    this.drive.setDiasEntrega(this.drive.getDiasEntregaOriginal());//Reinicia los días requeridos
                    Ventana.getNk_Deadline_Counter().setText(Integer.toString(this.drive.getDiasEntrega()));
                    Ventana.getCn_Deadline_Counter().setText(Integer.toString(this.drive.getDiasEntrega()));
                    //Aquí va una función para calcular la ganancia, en donde se agarran los caps y se multiplica y se añade a estudio, pero esa conexión no está hecha todavía
                    
                    if(this.drive.getCapN() <= 0 && this.drive.getCapP() <= 0){
                        System.out.println("NO SE ENTREGO NINGUN CAPITULO");
                    }else{
                        if(this.drive.getCapN() > 0){
                        this.drive.calcularGananciaN(this.drive.getCapN());
                        this.drive.setCapN(0);
                        Ventana.getNk_Cont_Caps().setText(Integer.toString(this.drive.getCapN()));
                        Ventana.getCn_Cont_Caps().setText(Integer.toString(this.drive.getCapN()));
                        
                    }
                        if(this.drive.getCapP() > 0){
                            this.drive.calcularGananciaP(this.drive.getCapN());
                            this.drive.setCapP(0);
                            Ventana.getNk_Cont_PW().setText(Integer.toString(this.drive.getCapP()));
                            Ventana.getCn_Cont_PW().setText(Integer.toString(this.drive.getCapP()));
                        }
                    }                 
                                        
                    this.mutex.release(); //Signal, termina la parte crítica
                }catch(InterruptedException ex){
                        Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
                        System.out.println("error en director en run cuando entrega "+this.drive.getEstudio());
                }                
            }else if(this.drive.getDiasEntrega()>0) {
               
                //Acá abajo está todo el código de el director cuando NO esta entregando caps
                Random random = new Random();
                while((this.horaAleatoria=random.nextInt(24))==0) {
                    this.horaAleatoria=random.nextInt(24);
                }
                //horaAleatoria = 16;
                //System.out.println("Diasss "+this.drive.getDiasEntrega()+" "+this.drive.getEstudio());
                //System.out.println("HORA ALEATORIA: "+ this.horaAleatoria+ " "+this.drive.getEstudio());
                //Aquí van a pasar las 24 horas
                for(int i = 1; i <= 24; i++){
                    try{                        
                        //System.out.println(this.estado);
                        this.estado = "Trabajando";
                        changeStateText();
                        //System.out.println("Estado: "+this.estado);
                        if(i == this.horaAleatoria){
                            //System.out.println(i+" numero "+"hora aleatoria: "+this.horaAleatoria);
                            this.estado = "Revisando al Project Manager";
                            changeStateText();
                            if(this.horaAleatoria <=16){
                                //System.out.println("LO ATRAPE SI O SI "+this.drive.getEstudio());                            
                            }
                            mutex.acquire();
                            //System.out.println(pm.getEstado()+" el pm esta "+ drive.getEstudio());
                            boolean continuar=checkPm();
                            //System.out.println(pm.getEstado()+" el pm esta");
                            if(!continuar){
                            sleep((long) (this.horas/(60/17)));
                           // System.out.println(pm.getEstado()+" el pm esta "+ drive.getEstudio());
                            continuar=checkPm();
                            //System.out.println(pm.getEstado()+" el pm esta");
                            }
                            if(!continuar) {
                            sleep((long) (this.horas/(60/17)));
                            //System.out.println(pm.getEstado()+" el pm esta "+ drive.getEstudio());
                            checkPm();
                            }
                            mutex.release();
                            
                            
                        }
                        //System.out.println("horaaa "+this.horas);
                        sleep((long) (this.horas/(12/7))); //Se llevan los 35 minutos que se requieren
                    }catch(InterruptedException ex){
                        Logger.getLogger(Director.class.getName()).log(Level.SEVERE, null, ex);
                        System.out.println("error en director en run cuando no entrega "+this.drive.getEstudio());
                    }
                }                
            }            
            obtenerSalario();            
        }
    }
    
    public void changeStateText(){
        if(this.drive.getEstudio().compareTo("Nickelodeon") == 0){
            Ventana.getNk_Director_State().setText(this.estado);
        }else{
            Ventana.getCn_Director_State().setText(this.estado);
        }        
    }  
        
    public void obtenerSalario() {
        try{
            this.mutex.acquire();
            this.drive.setCostos(this.drive.getCostos()+this.sueldoph*24); //al costo le sumo lo que gano el empleado ese dia            
            this.mutex.release();
            this.salarioAcc+=this.sueldoph*24;
            
        }catch(InterruptedException ex) {
                Logger.getLogger(Developer.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Error!!! del Director en obtenerSalario ");
        }
            
    }
    
    public void changeFailText(){
        if(this.drive.getEstudio().compareTo("Nickelodeon") == 0){
//            System.out.println("Atrapado el de Nickelodeon!");
            Ventana.getNk_Fail_Counter().setText(Integer.toString(this.getProjectManager().getFaltas()));
            Ventana.getNk_Discount_Counter().setText(Integer.toString(this.getProjectManager().getDineroDescontado()) +"$");
        }else{
//            System.out.println("Atrapado el de Cartoon Network!");
            Ventana.getCn_Fail_Counter().setText(Integer.toString(this.getProjectManager().getFaltas()));
            Ventana.getCn_Discount_Counter().setText(Integer.toString(this.getProjectManager().getDineroDescontado()) +"$");
        }     
    }
    
    public boolean checkPm(){
        if(this.getProjectManager().getEstado().equals("Viendo One Piece")){
                //System.out.println("ATRAPADO!!! " + this.drive.getEstudio());
                this.getProjectManager().setFaltas(this.getProjectManager().getFaltas() + 1);
                this.getProjectManager().setDineroDescontado(this.getProjectManager().getDineroDescontado() + 100);
                this.getProjectManager().setSalarioacc(this.getProjectManager().getSalarioacc() - 100);
                changeFailText();
                return true;
        } else{
            return false;
        //System.out.println("Mosca pues");
        }
    }
}
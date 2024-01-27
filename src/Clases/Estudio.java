/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import EDD.Lista;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Natalia
 */
public class Estudio {
    //una lista por cada tipo de empleado
    private String name;
    private double ganancias;
    private double costos;
    private double utilidad;
    private Drive personalDrive; //drive del estudio
    private Semaphore mutex; // un semaforo para el estudio, asi los trabajadores de este estudio acceden uno a la vez al drive del estudio
    private Lista listaGuion;
    private Lista listaEscenario;
    private Lista listaAnimacion;
    private Lista listaDoblaje;
    private Lista listaPlotTwist;
    
    public Estudio(String name, int capsPlot) {
        this.name = name;
        this.ganancias=0;
        this.costos=0;
        this.utilidad=0;
        this.personalDrive=new Drive(name, capsPlot);
        this.mutex=new Semaphore(1);
        this.listaGuion = new Lista();
        this.listaDoblaje = new Lista();
        this.listaEscenario = new Lista();
        this.listaAnimacion = new Lista();
        this.listaDoblaje = new Lista();
        this.listaPlotTwist = new Lista();
    }
    
    
    public void AddDeveloper(int type, int cantidad) { //saber el tipo de desarrollador a añadir y la cantidad
        if(type==0) {
            for (int i = 1; i<=cantidad; i++) {
                Developer guion1=new Developer(getPersonalDrive(),0,20,getMutex(),3000,0.5,getName());
                getListaGuion().insertBegin(guion1);
                guion1.start();
            }
        }
        if(type==1) {
            for (int i = 1; i<=cantidad; i++) {
                Developer escenario1=new Developer(getPersonalDrive(),1,26,getMutex(),3000,0.5,getName());
                getListaEscenario().insertBegin(escenario1);
                escenario1.start();
            }
        }
        if(type==2) {
            for (int i = 1; i<=cantidad; i++) {
                Developer animacion1=new Developer(getPersonalDrive(),2,40,getMutex(),3000,1,getName());
                getListaAnimacion().insertBegin(animacion1);
                animacion1.start();
            }
        }
        if(type==3) {
            for (int i = 1; i<=cantidad; i++) {
                Developer doblaje1=new Developer(getPersonalDrive(),3,16,getMutex(),3000,1,getName());
                getListaDoblaje().insertBegin(doblaje1);
                doblaje1.start();
            }
        }
        if(type==4) {
            for (int i = 1; i<=cantidad; i++) {
                Developer plotT1=new Developer(getPersonalDrive(),4,34,getMutex(),3000,0.34,getName());
                getListaPlotTwist().insertBegin(plotT1);
                plotT1.start();
            }
        }
        
        if(type==5) {
            for (int i = 1; i<=cantidad; i++) {
                Developer ensam=new Developer(getPersonalDrive(),5,50,getMutex(),3000,0.5,getName());
                
                ensam.start();
            }
        
        }
    
    
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGanancias() {
        return ganancias;
    }

    public void setGanancias(double ganancias) {
        this.ganancias = ganancias;
    }

    public double getCostos() {
        return costos;
    }

    public void setCostos(double costos) {
        this.costos = costos;
    }

    public double getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(double utilidad) {
        this.utilidad = utilidad;
    }

    public Drive getPersonalDrive() {
        return personalDrive;
    }

    public void setPersonalDrive(Drive personalDrive) {
        this.personalDrive = personalDrive;
    }

    public Semaphore getMutex() {
        return mutex;
    }

    public void setMutex(Semaphore mutex) {
        this.mutex = mutex;
    }
    
    public Lista getListaGuion(){
        return listaGuion;
    }
    
    public void setListaGuion(Lista listaGuion){
        this.listaGuion = listaGuion;
    }
    
    public Lista getListaEscenario(){
        return listaEscenario;
    }
    
    public void setListaEscenario(Lista listaEscenario){
        this.listaEscenario = listaEscenario;
    }
    
    public Lista getListaAnimacion(){
        return listaAnimacion;
    }
    
    public void setListaAnimacion(Lista listaAnimacion){
        this.listaAnimacion = listaAnimacion;
    }
    
    public Lista getListaDoblaje(){
        return listaDoblaje;
    }
    
    public void setListaDoblaje(Lista listaDoblaje){
        this.listaDoblaje = listaDoblaje;
    }
    
    public Lista getListaPlotTwist(){
        return listaPlotTwist;
    }
    
    public void setListaPlotTwist(Lista listaPlotTwist){
        this.listaPlotTwist = listaPlotTwist;
    }
    
}

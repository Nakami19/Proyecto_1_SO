/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

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

    public Estudio(String name) {
        this.name = name;
        this.ganancias=0;
        this.costos=0;
        this.utilidad=0;
        this.personalDrive=new Drive(this.name);
        this.mutex=new Semaphore(1);
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
    
    
    
    
}

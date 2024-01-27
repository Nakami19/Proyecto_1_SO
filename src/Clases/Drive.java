/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Natalia
 */
public class Drive {
    //partes de un capitulo
    public int guion;
    public int escenario;
    public int animaciones;
    public int doblajes;
    public int plotTwist;
    
   private int caps; //cantidad de capitulos creados
   
   private String estudio;

    public Drive(String estudio) {
        this.guion = 0;
        this.escenario = 0;
        this.animaciones = 0;
        this.doblajes = 0;
        this.plotTwist = 0;
        this.caps = 0;
        this.estudio=estudio;
    }
   
       //type 0 guion
    //type 1 escenario
    //type 2 animacion 
    //type 3 doblaje
    //type 4 plot twist 
    
    public void addPart(int type) {
        if (type==0) {
            this.guion+=1;
            System.out.println("guiones disponibles de "+this.estudio+": " + this.guion);
        }
        if (type==1) {
            this.escenario+=1;
            System.out.println("escenarios disponiblesde "+this.estudio+": " + this.escenario);
        }
        if (type==2) {
            this.animaciones+=1;
            System.out.println("animaciones disponiblesde "+this.estudio+": " + this.animaciones);

        }
        if (type==3) {
            this.doblajes+=1;
        }
        if (type==4) {
            this.plotTwist+=1;
        }
    }

    public int getGuion() {
        return guion;
    }

    public void setGuion(int guion) {
        this.guion = guion;
    }

    public int getEscenario() {
        return escenario;
    }

    public void setEscenario(int escenario) {
        this.escenario = escenario;
    }

    public int getAnimaciones() {
        return animaciones;
    }

    public void setAnimaciones(int animaciones) {
        this.animaciones = animaciones;
    }

    public int getDoblajes() {
        return doblajes;
    }

    public void setDoblajes(int doblajes) {
        this.doblajes = doblajes;
    }

    public int getPlotTwist() {
        return plotTwist;
    }

    public void setPlotTwist(int plotTwist) {
        this.plotTwist = plotTwist;
    }

    public int getCaps() {
        return caps;
    }

    public void setCaps(int caps) {
        this.caps = caps;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
    
    
}

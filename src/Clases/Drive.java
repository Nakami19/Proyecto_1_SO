/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Interfaces.Ventana;

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
   private int capN; //capitulo normal
   private int capP; //capitulo con plot Twist, se me ocurre que para ir calculando la utilidad/ganancias cada vez que se cree algo 
   private int capsHastaPlot;
   private int DiasEntrega;
   private int DiasEntregaOriginal;
   private String estudio;
   private double ganancias;
   private double costos; 
   private double utilidad;  

    public Drive(String estudio, int capsPlot) {
        this.guion = 0;
        this.escenario = 0;
        this.animaciones = 0;
        this.doblajes = 0;
        this.plotTwist = 0;
        this.caps = 0;
        this.estudio=estudio;
        this.capsHastaPlot=capsPlot;
        this.ganancias = 0;
        this.costos = 0;
        this.utilidad = 0;
        this.capN = 0;
        this.capP = 0;
        //this.DiasEntrega=Diasentrega;
        //this.DiasEntregaOriginal = Diasentrega;
    }
   
       //type 0 guion
    //type 1 escenario
    //type 2 animacion 
    //type 3 doblaje
    //type 4 plot twist 
    
    public void addPart(int type) {
        if (type==0) {
            if(this.guion<25) {
                this.guion+=1;
                if(this.estudio.compareTo("Nickelodeon") == 0){
                    Ventana.getDrive_Guionista_Nk().setText(Integer.toString(guion));
                }else{
                    Ventana.getDrive_Guionista_Cn().setText(Integer.toString(guion));
                }
            }
            else {System.out.println("Drive lleno!! guion");}
            //System.out.println("guiones disponibles de "+this.estudio+": " + this.guion);
        }
        if (type==1) {
            if (this.escenario<20) {
                this.escenario+=1;
                if(this.estudio.compareTo("Nickelodeon") == 0){
                    Ventana.getDrive_Escenario_Nk().setText(Integer.toString(escenario));
                }else{
                    Ventana.getDrive_Escenario_Cn().setText(Integer.toString(escenario));
                }
            }
            else {System.out.println("Drive lleno!! escenario");}
            //System.out.println("escenarios disponiblesde "+this.estudio+": " + this.escenario);
        }
        if (type==2) {
            if (this.animaciones<55) {
                if((this.animaciones+=3)>55){
                    this.animaciones+=(55-this.animaciones);
                } else {
                    this.animaciones+=3;
                }
                if(this.estudio.compareTo("Nickelodeon") == 0){
                    Ventana.getDrive_Personaje_Nk().setText(Integer.toString(animaciones));
                }else{
                    Ventana.getDrive_Personaje_Cn().setText(Integer.toString(animaciones));
                }
                
            }
            else {System.out.println("Drive lleno!! animacion "+this.estudio);}
           // System.out.println("animaciones disponiblesde "+this.estudio+": " + this.animaciones);

        }
        if (type==3) {
            if (this.doblajes<35) {
                if((this.doblajes+=3)>35){
                    this.doblajes+=(35-this.doblajes);
                } else {
                    this.doblajes+=3;
                }
                if(this.estudio.compareTo("Nickelodeon") == 0){
                    Ventana.getDrive_Doblaje_Nk().setText(Integer.toString(doblajes));
                }else{
                    Ventana.getDrive_Doblaje_Cn().setText(Integer.toString(doblajes));
                }
                
               //System.out.println("doblajes disponiblesde "+this.estudio+": " + this.doblajes);
            }
            else {System.out.println("Drive lleno!! doblaje "+this.estudio);}
        }
        if (type==4) {
            if (this.plotTwist<10) {
               this.plotTwist+=1;
               //System.out.println("plot twist disponiblesde "+this.estudio+": " + this.plotTwist);
               if(this.estudio.compareTo("Nickelodeon") == 0){
                    Ventana.getDrive_PW_Nk().setText(Integer.toString(plotTwist));
                }else{
                    Ventana.getDrive_PW_Cn().setText(Integer.toString(plotTwist));
                }
            }
            else {System.out.println("Drive lleno!! plot");}
        }
    }
    
    public void Create() {
        if(this.estudio.compareTo("Nickelodeon")==0) {
            if(this.capsHastaPlot>0) {
                this.guion-=2;
                this.escenario-=1;
                this.animaciones-=4;
                this.doblajes-=4;
                this.capsHastaPlot-=1;
                this.capN+=1;
                Ventana.getNk_Cont_Caps().setText(Integer.toString(capN));
                System.out.println("se creo un cap nick");
                
                
            }else {
                this.guion-=2;
                this.escenario-=1;
                this.animaciones-=4;
                this.doblajes-=4;
                this.plotTwist-=2; 
                this.capsHastaPlot=5;
                this.capP+=1;
                Ventana.getNk_Cont_PW().setText(Integer.toString(capP));
                //System.out.println("se creo uno con plot");
            }
            Ventana.getDrive_Guionista_Nk().setText(Integer.toString(guion));
            Ventana.getDrive_Escenario_Nk().setText(Integer.toString(escenario));
            Ventana.getDrive_Personaje_Nk().setText(Integer.toString(animaciones));
            Ventana.getDrive_Doblaje_Nk().setText(Integer.toString(doblajes));
            Ventana.getDrive_PW_Nk().setText(Integer.toString(plotTwist));
        }
        else {
            if(this.capsHastaPlot>0) {
                this.guion-=1;
                this.escenario-=2;
                this.animaciones-=6;
                this.doblajes-=5;
                this.capsHastaPlot-=1;
                this.capN+=1;
                Ventana.getCn_Cont_Caps().setText(Integer.toString(capN));

            }else {
                this.guion-=1;
                this.escenario-=2;
                this.animaciones-=6;
                this.doblajes-=5;
                this.plotTwist-=1; 
                this.capsHastaPlot=3;
                this.capP+=1;
                Ventana.getCn_Cont_Caps().setText(Integer.toString(capN));
            }
            System.out.println("se creo un cap cartoon");
            Ventana.getDrive_Guionista_Cn().setText(Integer.toString(guion));
            Ventana.getDrive_Escenario_Cn().setText(Integer.toString(escenario));
            Ventana.getDrive_Personaje_Cn().setText(Integer.toString(animaciones));
            Ventana.getDrive_Doblaje_Cn().setText(Integer.toString(doblajes));
            Ventana.getDrive_PW_Cn().setText(Integer.toString(plotTwist));
        
        }
//        System.out.println("caps creados: "+this.caps);
//        System.out.println("guiones disponibles luego  de "+this.estudio+": " + this.guion);
//        System.out.println("escenarios disponiblesde luego "+this.estudio+": " + this.escenario);
//        System.out.println("animaciones disponiblesde luego "+this.estudio+": " + this.animaciones);
//        System.out.println("doblajes disponiblesde luego "+this.estudio+": " + this.doblajes);
//        System.out.println("plot twist disponiblesde luego "+this.estudio+": " + this.plotTwist);

    }
    
    public void calcularGananciaN(float ganancia){
        if(this.estudio.compareTo("Nickelodeon") == 0){
            setGanancias(getGanancias() + ganancia*450000);
        }else{
            setGanancias(getGanancias() + ganancia*300000);
        }
        System.out.println("GANANCIAS:"+ getEstudio() + " " + getGanancias());
    }
    
    public void calcularGananciaP(float ganancia){
        if(this.estudio.compareTo("Nickelodeon") == 0){
            setGanancias(getGanancias() + ganancia*500000);
        }else{
            setGanancias(getGanancias() + ganancia*650000);
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

    public int getCapsHastaPlot() {
        return capsHastaPlot;
    }

    public void setCapsHastaPlot(int capsHastaPlot) {
        this.capsHastaPlot = capsHastaPlot;
    }

    public int getDiasEntrega() {
        return DiasEntrega;
    }

    public void setDiasEntrega(int DiasEntrega) {
        this.DiasEntrega = DiasEntrega;
    }
    
    public int getDiasEntregaOriginal(){
        return DiasEntregaOriginal;
    }
    
    public void setDiasEntregaOriginal(int DiasEntregaOriginal){
        this.DiasEntregaOriginal = DiasEntregaOriginal;
    }
    
    public double getCostos(){
        return costos;
    }
    
    public void setCostos(double costos){
        this.costos = costos;
    }
    
    public double getGanancias(){
        return ganancias;
    }
    
    public void setGanancias(double ganancias){
        this.ganancias = ganancias;
    }
    
    public double getUtilidad(){
        return utilidad;
    }
    
    public void setUtilidad(double utilidad){
        this.utilidad = utilidad;
    }

    public int getCapN() {
        return capN;
    }

    public void setCapN(int capN) {
        this.capN = capN;
    }

    public int getCapP() {
        return capP;
    }

    public void setCapP(int capP) {
        this.capP = capP;
    }
    
    
}

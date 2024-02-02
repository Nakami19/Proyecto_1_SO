/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Interfaces;

import Clases.Estudio;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Tomas
 */
public class Global {
    final static XYSeries Cn = new XYSeries( "Cartoon Network" );           

    final static XYSeries Nk = new XYSeries( "Nickelodeon" );
      
    final static XYSeriesCollection dataset = new XYSeriesCollection( );
    
    private static int daycounter = 0;

    public static XYSeries getCn() {
        return Cn;
    }

    public static XYSeries getNk() {
        return Nk;
    }

    public static XYSeriesCollection getDataset() {
        return dataset;
    }
    
    public static void addCn(int num1, int num2){
        getCn().add(num1, num2);
    }
    
    public static void addNk(int num1, int num2){
        getNk().add(num1, num2);
    }   
    
    public static void addSeries(XYSeries serie){
        getDataset().addSeries(serie);
    }

    public static int getDaycounter() {
        return daycounter;
    }

    public static void setDaycounter(int daycounter) {
        Global.daycounter = daycounter;
    }
        
    
}

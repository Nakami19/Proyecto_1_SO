/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Clases.Developer;
import Clases.Drive;
import Clases.Estudio;
import EDD.Lista;
import Interfaces.Ventana;
import java.util.concurrent.Semaphore;


/**
 *
 * @author Natalia, Tomás Gil
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Ventana ventana= new Ventana();
      ventana.setVisible(true);

//    Semaphore mutex = new Semaphore(1);
//        Drive drive = new Drive("nick");
//        Drive drive2 = new Drive("cartoon");
//        
//        Developer guion1=new Developer(drive,0,20,mutex,3000,0.5,"nick");
//        Developer escenario1=new Developer(drive,1,26,mutex,3000,0.34,"nick");
//        
//        guion1.start();
//        escenario1.start();

    
    Estudio cartoon=new Estudio("Cartoon Network");
    
    //Developer guion1=new Developer(nick.getPersonalDrive(),0,20,nick.getMutex(),3000,0.5,nick.getName());
    //Developer escenario1=new Developer(nick.getPersonalDrive(),1,26,nick.getMutex(),3000,0.34,nick.getName());
    
    //Developer guion2=new Developer(cartoon.getPersonalDrive(),0,20,cartoon.getMutex(),3000,0.5,cartoon.getName());
    //Developer escenario2=new Developer(cartoon.getPersonalDrive(),1,26,cartoon.getMutex(),3000,0.34,cartoon.getName());
    
    //guion1.start();
    //guion2.start();
    //escenario1.start();
    //escenario2.start();
      
    }
    
}

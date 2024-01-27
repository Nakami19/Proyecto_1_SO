/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package EDD;

import Clases.Developer;

/**
 *
 * @author Tomas
 */
public class Nodo {
    private Developer data;
    private Nodo next;
    
    public Nodo(Developer data){
        this.data = data;
        this.next = null;
    }
    
    public Developer getData(){
        return data;
    }
    
    public void setData(Developer data){
        this.data = data;
    }
    
    public Nodo getNext(){
        return next;
    }
    
    public void setNext(Nodo next){
        this.next = next;
    }
    
}

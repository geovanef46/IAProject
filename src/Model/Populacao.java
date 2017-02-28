package Model;


import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author root
 */
public class Populacao {
    
    List<Sala> lSalas;
    List<Componente> lComp;
    List<Componente> listaPovoada;
   

    public Populacao() {
        this.lComp = new ArrayList<>();
        this.lSalas = new ArrayList<>();
        listaPovoada = new ArrayList<>();
        gerarSalas();
        gerarComponentes();
        montaLista(lComp);
    }
    
    
    public void gerarSalas(){
        lSalas.add(new Sala("01"));
        lSalas.add(new Sala("02"));
        lSalas.add(new Sala("03"));
        lSalas.add(new Sala("04"));
        lSalas.add(new Sala("05"));
     
    }
    
    public void gerarComponentes(){
        
        lComp.add(new Componente("01", "OAC", null));
        lComp.add(new Componente("02", "APS", null));
        lComp.add(new Componente("03", "IA", null));
        lComp.add(new Componente("04", "CAD", null));
        lComp.add(new Componente("05", "ED", null));

    }
    
    public void montaLista(List<Componente> comp){
    Componente c3;
    List<Componente> listaAux = comp;
        for(Componente c1: comp){
            for (Componente c2: listaAux) {
                 c3 = c1;
                 c3.setReferencia(c2);
                System.out.println("-> "+c3.getCod()+","+c3.getReferencia().getCod());
                listaPovoada.add(c3);
            }
            
        }

    }
    
    
    public void printList(){
        int i = 1;
        for(Componente c: listaPovoada){
        System.err.println(i+": C -> "+c.getCod()+","+c.getReferencia().getCod());
        i++;
        }
     }
    
    
    public static void main(String[] args) {
        Populacao gera = new Populacao();
        gera.printList();
    }
    
    
}
    

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

    List<Componente> listaAux = comp;
        for(Componente c1: comp){
            for (Componente c2: listaAux) {
                c1.setReferencia(c2);
                 addLista(c1);
                
            }
            
        }
        retirarRepetidos();
    }
    public void addLista(Componente c){
        Componente c1 = new Componente(c.getCod(), c.getNome(), null);
        c1.setReferencia(c.getReferencia());

        listaPovoada.add(c1);
    }
    
    
    
    public void retirarRepetidos(){
        List<Componente> list = new ArrayList<>();
        for(Componente c : listaPovoada){
            if(c.getCod().equals(c.getReferencia().getCod())){
             list.add(c);
            }
         
        }
        for(Componente c: list){
            listaPovoada.removeAll(list);
        }
    }
    
    
    public void printList(){
        int i = 1;
        for(Componente c: listaPovoada){
        System.out.println(i+": C -> "+c.getCod()+","+c.getReferencia().getCod());
        i++;
        }
     }
    
    
    public static void main(String[] args) {
        Populacao gera = new Populacao();
       
        gera.printList();
        
    }
    
    
}
    

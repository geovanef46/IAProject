
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
public class Slot {
    
    List<Sala> lsalas;
    List<Componente> lComp;
    List<Componente> listaPovoada;
   

    public Slot() {
        this.lsalas = new ArrayList<>();
      
        gerarComponentes();
        listaPovoada = montaLista(lComp);
    }
    
    
    public List<Sala> gerarSalas(){
        List<Sala> lComp = new ArrayList<Sala>();
        lComp.add(new Sala("01"));
        lComp.add(new Sala("02"));
        lComp.add(new Sala("03"));
        lComp.add(new Sala("04"));
        lComp.add(new Sala("05"));
        return lComp;
    }
    
    public void gerarComponentes(){
        lComp = new ArrayList<Componente>();
        lComp.add(new Componente("01", "OAC", null));
        lComp.add(new Componente("02", "APS", null));
        lComp.add(new Componente("03", "IA", null));
        lComp.add(new Componente("04", "CAD", null));
        lComp.add(new Componente("05", "ED", null));

    }
    
    public List montaLista(List<Componente> comp){
    listaPovoada = new ArrayList<>();
    List<Componente> listaAux = comp;
        for(Componente c1: comp){
            for (Componente c2: listaAux) {
                c1.setReferencia(listaAux.indexOf(c2));
                System.out.println(c1.getCod()+", ref= "+ lComp.get(c1.getReferencia()).getNome());
                listaPovoada.add(c1);
            }
        }
    
   return listaPovoada;
    }
    
    
    public void printList(){
        int i = 1;
        for(Componente c: listaPovoada){
        System.err.println(i+": C -> "+c.getCod()+","+lComp.get(c.getReferencia()).getNome());
        i++;
        }
     }
    
    
    public static void main(String[] args) {
        Slot slot = new Slot();
        slot.printList();
    }
    
    
}
    

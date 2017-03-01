/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import java.util.Vector;

/**
 *
 * @author jason
 */
public class Arvore {
    
    List<Matriz> listaDeMatrizes = new Vector<>();
    List<No> arvore = new Vector<>();
    No noRaiz;
    
    public void montarArvore(List<Componente> listaComponentes){
        Matriz matriz = new Matriz();
     
        for (Componente c1 : listaComponentes) {       
            matriz.setArray(c1);
            if(matriz.abaixo()){
            matriz.setArray(c1.getReferencia());
            matriz.acima();
            }
            listaDeMatrizes.add(matriz);
        }
        criaRaiz();
        povoarArvore(listaComponentes);
    }
    
    public void criaRaiz(){
        noRaiz = new No(new Matriz(), null);
        arvore.add(noRaiz);
        povoarRaiz();
    }
    
    public void povoarRaiz(){
        for (Matriz m : listaDeMatrizes) {
            No no = new No(m, noRaiz);
            arvore.add(no);
        }
    }
    
        public void povoarArvore(List<Componente> listaComponentes){
        for (No no  : arvore) {
            no.matriz.setArray(null);
            
        }
    }
    
}

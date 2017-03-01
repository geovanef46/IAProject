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
    
    
    public void montarArvore(List<Componente> listaComponentes){
        Matriz matriz = new Matriz();
        List<Componente> listAux = listaComponentes;
        for (Componente c1 : listAux) {       
            matriz.setArray(c1);
            if(matriz.abaixo()){
            matriz.setArray(c1.getReferencia());
            }
        }
    }
}

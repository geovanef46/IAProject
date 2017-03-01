/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author jason
 */
public class Matriz {

    int horarios = 2;
    int turmas = 5;
    private Componente[][] array = new Componente[horarios][turmas];
    int linha = 0;
    int coluna = 0;

    public Matriz() {

    }

    public boolean direita() {
        if (linha != turmas) {
            this.linha++;
            return true;
        }
        return false;
    }

    public boolean esquerda() {
        if (linha != 0) {
            this.linha--;
            return true;
        }
        return false;
    }

    public boolean abaixo() {
        if (coluna != horarios) {
            this.coluna++;
            return true;
        }
        return false;
    }

    public boolean acima() {
        if (coluna != 0) {
            this.coluna--;
            return true;
        }
        return false;
    }

    /**
     * @return the array
     */
    public Componente getArray(int linha, int coluna) {
        return array[linha][coluna];
    }

    /**
     * @param array the array to set
     */
    public void setArray(Componente c) {
        this.array[linha][coluna] = c;
    }

}

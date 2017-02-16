
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
public class Sala {
    
    private int nAulas = 2;
    private String cod;
    List<Componente> lComp = new ArrayList<Componente>();

    public Sala(String cod) {
        this.cod = cod;
    }
    
    
    /**
     * @return the nAulas
     */
    public int getnAulas() {
        return nAulas;
    }

    /**
     * @param nAulas the nAulas to set
     */
    public void setnAulas(int nAulas) {
        this.nAulas = nAulas;
    }

    /**
     * @return the cod
     */
    public String getCod() {
        return cod;
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(String cod) {
        this.cod = cod;
    }
}

package Model;


public class Componente {
    
    private int CH = 2;
    private String cod;
    private String nome;
    private String area;
    private Componente CRef;

   

    public Componente(String cod, String nome, String area) {
        this.cod = cod;
        this.nome = nome;
        this.area = area;
    }
    
    
    
    /**
     * @return the CH
     */
    public int getCH() {
        return CH;
    }

    /**
     * @param CH the CH to set
     */
    public void setCH(int CH) {
        this.CH = CH;
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

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * @return the referencia
     */
    public Componente getReferencia() {
        return CRef;
    }

    /**
     * @param referencia the referencia to set
     */
    public void setReferencia(Componente referencia) {
        this.CRef = referencia;
    }

    @Override
    public String toString() {
        return this.getNome(); //To change body of generated methods, choose Tools | Templates.
    }


    public boolean equals(Componente obj) {
        return this.getCod().equals(obj.getCod()); //To change body of generated methods, choose Tools | Templates.
    }
   
    
    
    
    
}

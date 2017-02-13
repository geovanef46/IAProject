

import java.util.Set;
import java.util.Vector;
import java.util.HashSet;


/**
 * @author Frederico Bublitz
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class Busca {
	
	private Set conjunto;
	private Vector fila;
	public Vector solucao;
	
	
	public Busca(No root){		
		fila = new Vector();
		this.solucao = new Vector();
		conjunto = new HashSet();
		
		if(conjunto.add(root)){
			fila.add(root);
		}
		cBusca((No)fila.remove(0));
	}
	
	
	public void cBusca(No no){
		int nivelAtual = no.nivel;
		long time = System.currentTimeMillis();
		while(!no.eFinal()){
			
			no.criaFilhos();
			if(no.getBaixo() != null){				
				if(conjunto.add(no.getBaixo())){					
					fila.add(no.getBaixo());
				}				
			}
			
			if(no.getCima() != null){
				if(conjunto.add(no.getCima())){
					fila.add(no.getCima());
				}				
			}
			
			if(no.getDir() != null){
				if(conjunto.add(no.getDir())){
					fila.add(no.getDir());
				}				
			}
			
			if(no.getEsq() != null){
				if(conjunto.add(no.getEsq())){
					fila.add(no.getEsq());
				}
			}
			
			no = (No)fila.remove(0);
			if(no.nivel != nivelAtual){
				nivelAtual = no.nivel;				
				System.out.println(nivelAtual + " - " + (System.currentTimeMillis() - time)+"ms");
				time = System.currentTimeMillis();
			}
		}
		if(no.eFinal()){
			getSolucao(no);
		}
	}

	
	public void getSolucao(No no){				
		String s = "";
		if(no.getPai()!= null){	
							
			if((no.getPai().getBaixo() != null)&&(no.getPai().getBaixo().equals(no))){
//				System.out.println("Baixo");
				s = "Baixo";				
			}
			if((no.getPai().getCima() != null)&&(no.getPai().getCima().equals(no))){
//				System.out.println("cima");
				s = "Cima";
			}
			if((no.getPai().getDir() != null)&&(no.getPai().getDir().equals(no))){
//				System.out.println("direta");
				s = "Direita";
			}
			if((no.getPai().getEsq() != null)&&(no.getPai().getEsq().equals(no))){
				//System.out.println("esquerda");
				s  = "Esquerda";
			}
			this.solucao.add(0,s);
			
			getSolucao(no.getPai());
		}
	}	
}

public class No {
	private Disciplinas[] disc;
//	private No fim = new No(1,2,3,4,5,6,7,8,0);		

	private static final int T = 3;	//tamanho da matriz ex m3x3
	public int nivel;	

	/**
	 * Construtor que repassa os numeros para a matriz que representa o "jogo"
	 */
	public No(int a0,int a1,int a2,int a3,int a4,int a5,int a6,int a7,int a8){
		disc = new int [T][T];
		disc[0][0] = a00;
		disc[0][1] = a01;
		disc[0][2] = a02;
		disc[1][0] = a10;
		disc[1][1] = a11;
		disc[1][2] = a12;
		disc[2][0] = a20;
		disc[2][1] = a21;
		disc[2][2] = a22;			
	}	
	
	
	
	
	/**
	 * retorna em que posicao esta o elemento branco
	 * @return
	 */
	public int getPosBranco(){
		int pos = 0;
		for (int i=0; i<T; i++){
			for (int j=0; j<T; j++){				
				if(this.disc[i][j] == 0){					
					return pos;
				}
				pos++;
			}
		}
		return pos;
	}
	
	public boolean equals(Object no){
		int numIguais = 0;
		for (int i=0; i<T; i++){
			for (int j=0; j<T; j++){				
				if(this.disc[i][j] == ((No)no).disc[i][j]){
					numIguais++;							
				}									
			}
		}
		if (numIguais == (T*T)){
			return true;	
		}else{
			return false;
		}
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < T; i++) {
			for (int j = 0; j < T; j++) {
				buffer.append(disc[i][j]);
			}
		}		
		return Integer.valueOf(buffer.toString()).intValue();
	}

	
	
	/**
	 * Metodo que para cada possibilidade de movimento do "Branco" cria um objeto "No"
	 *
	 */
	public void criaFilhos(){
		switch (this.getPosBranco()){
			case 0://o branco esta na posicao 00
//				move o branco para a direita
				dir = new No(disc[0][1],disc[0][0],disc[0][2],disc[1][0],disc[1][1],disc[1][2],disc[2][0],disc[2][1],disc[2][2]);

//				move o branco para baixo
				baixo = new No(disc[1][0],disc[0][1],disc[0][2],disc[0][0],disc[1][1],disc[1][2],disc[2][0],disc[2][1],disc[2][2]);
				break;
			case 1://o branco esta na posicao 01
//				move o branco para a esquerda
				esq = new No(disc[0][1],disc[0][0],disc[0][2],disc[1][0],disc[1][1],disc[1][2],disc[2][0],disc[2][1],disc[2][2]);
//				move o branco para a direta
				dir = new No(disc[0][0],disc[0][2],disc[0][1],disc[1][0],disc[1][1],disc[1][2],disc[2][0],disc[2][1],disc[2][2]);
//				move o branco para baixo 
				baixo = new No(disc[0][0],disc[1][1],disc[0][2],disc[1][0],disc[0][1],disc[1][2],disc[2][0],disc[2][1],disc[2][2]);
				break;
			case 2://Branco esta na posi��o 02							
				esq = new No(disc[0][0],disc[0][2],disc[0][1],disc[1][0],disc[1][1],disc[1][2],disc[2][0],disc[2][1],disc[2][2]);
				baixo = new No(disc[0][0],disc[0][1],disc[1][2],disc[1][0],disc[1][1],disc[0][2],disc[2][0],disc[2][1],disc[2][2]);
				break;
			case 3://Branco esta na posicao 10
				cima = new No(disc[1][0],disc[0][1],disc[0][2],disc[0][0],disc[1][1],disc[1][2],disc[2][0],disc[2][1],disc[2][2]);
				dir = new No(disc[0][0],disc[0][1],disc[0][2],disc[1][1],disc[1][0],disc[1][2],disc[2][0],disc[2][1],disc[2][2]);
				baixo = new No(disc[0][0],disc[0][1],disc[0][2],disc[2][0],disc[1][1],disc[1][2],disc[1][0],disc[2][1],disc[2][2]);
				break;
			case 4:
				cima = new No(disc[0][0],disc[1][1],disc[0][2],disc[1][0],disc[0][1],disc[1][2],disc[2][0],disc[2][1],disc[2][2]);
				esq = new No(disc[0][0],disc[0][1],disc[0][2],disc[1][1],disc[1][0],disc[1][2],disc[2][0],disc[2][1],disc[2][2]);
				dir = new No(disc[0][0],disc[0][1],disc[0][2],disc[1][0],disc[1][2],disc[1][1],disc[2][0],disc[2][1],disc[2][2]);
				baixo = new No(disc[0][0],disc[0][1],disc[0][2],disc[1][0],disc[2][1],disc[1][2],disc[2][0],disc[1][1],disc[2][2]);
				break;
			case 5:
				cima = new No(disc[0][0],disc[0][1],disc[1][2],disc[1][0],disc[1][1],disc[0][2],disc[2][0],disc[2][1],disc[2][2]);
				esq = new No(disc[0][0],disc[0][1],disc[0][2],disc[1][0],disc[1][2],disc[1][1],disc[2][0],disc[2][1],disc[2][2]);
				baixo = new No(disc[0][0],disc[0][1],disc[0][2],disc[1][0],disc[1][1],disc[2][2],disc[2][0],disc[2][1],disc[1][2]);
				break;
			case 6:
				cima = new No(disc[0][0],disc[0][1],disc[0][2],disc[2][0],disc[1][1],disc[1][2],disc[1][0],disc[2][1],disc[2][2]);
				dir = new No(disc[0][0],disc[0][1],disc[0][2],disc[1][0],disc[1][1],disc[1][2],disc[2][1],disc[2][0],disc[2][2]);
				break;
			case 7:
				esq = new No(disc[0][0],disc[0][1],disc[0][2],disc[1][0],disc[1][1],disc[1][2],disc[2][1],disc[2][0],disc[2][2]);
				cima = new No(disc[0][0],disc[0][1],disc[0][2],disc[1][0],disc[2][1],disc[1][2],disc[2][0],disc[1][1],disc[2][2]);
				dir = new No(disc[0][0],disc[0][1],disc[0][2],disc[1][0],disc[1][1],disc[1][2],disc[2][0],disc[2][2],disc[2][1]);
				break;
			case 8:
				cima = new No(disc[0][0],disc[0][1],disc[0][2],disc[1][0],disc[1][1],disc[2][2],disc[2][0],disc[2][1],disc[1][2]);
				esq = new No(disc[0][0],disc[0][1],disc[0][2],disc[1][0],disc[1][1],disc[1][2],disc[2][0],disc[2][2],disc[2][1]);
				break; 			
		}
		relacionaPai();
	}
	/**
	 * Metodo que faz com os "filhos" deste No tenha ele como "Pai"	 
	 */
	public void relacionaPai(){
		if(esq != null){
			esq.pai = this;
			esq.nivel = this.nivel+1;
		}
		if(dir != null){
			dir.pai = this;
			dir.nivel = this.nivel+1;
		}
		if(cima != null){
			cima.pai = this;
			cima.nivel = this.nivel+1;
		}
		if(baixo != null){
			baixo.pai = this;
			baixo.nivel = this.nivel+1;
		}
	}
	
	/**
	 * Metodo que verifica quantod elementos estao na posicao certa
	 * @return numero de posicoes certas
	 */
	public int posicoesCertas(){
		No fim = new No(1,2,3,4,5,6,7,8,0);
		int numPosCertas = 0;		
		for (int i=0; i<T; i++){
			for (int j=0; j<T; j++){								
				if(this.disc[i][j] == fim.disc[i][j]){					
					numPosCertas++;
				}			
			}		
		}	
		return numPosCertas;
	}
	
//	public int getPosCantoCertas(){
//		No fim = new No(1,2,3,4,5,6,7,8,0);
//		int certas = 0;		
//		for(int i =0;i<T;i++){
//			if(this.a[i][0] == fim.a[i][0]){					
//				certas++;
//			}
//		}
//		for(int j=1;j<T;j++){
//			if(this.a[0][j] == fim.a[0][j]){					
//				certas++;
//			}			
//		}
//		return certas;		
//	}
	
	/**
	 * metodo que verifica se o No esta no estado final.
	 * @return
	 */
	public boolean eFinal(){
		if (this.posicoesCertas() == (T*T)){	
			return true;
		}else{
			return false;
		}
	}
	
	
	public No getBaixo() {
		return baixo;
	}

	public No getCima() {
		return cima;
	}

	public No getDir() {
		return dir;
	}

	public No getEsq() {
		return esq;
	}

	public No getPai() {
		return pai;
	}
	
}
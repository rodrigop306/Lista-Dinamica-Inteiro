import javax.swing.JOptionPane;

public class ListaLigada {
	private No inicio;
	
	public ListaLigada() {
		inicio = null;
	}
	
	public void adicionaInicio(int elem) {
		No novo = new No(elem);
		novo.prox = inicio; //1
		inicio = novo;
	}
	
	public void adicionaFinal(int elem){
		if(inicio==null){
			inicio = new No(elem);
		}else{
			No aux = inicio;
			while(aux.prox!=null){
				aux=aux.prox;
			}
			aux.prox = new No(elem);
		}
	}
	
	public void adicionaPosicao(int elem, int pos){
		No novo = new No(elem);
		if(pos==1){
			novo.prox = inicio;
			inicio=novo; //1			
		}else{
			No aux = inicio;
			//System.out.println(inicio);
			int contador=1;
			while(aux.prox!=null && contador<pos-1){
				aux=aux.prox;
				contador++;
			}
			//System.out.println(contador);
			if(aux.prox==null && contador==pos-1){
				aux.prox=novo;
			}else if(contador==pos-1) {
				novo.prox = aux.prox;
				aux.prox = novo;
			}else{			
				JOptionPane.showMessageDialog(null, "ERRO: Posicao invalida");
			}
		}
	}
	
	public int removeInicio(){
		int r=-1;
		if(inicio==null){
			JOptionPane.showMessageDialog(null, "ERRO: Lista vazia");
		}else{
			r=inicio.dado;
			inicio=inicio.prox;
		}
		return r;
	}
	public int removePos(int pos) {
		int r=-1;
		if(inicio==null) {
			JOptionPane.showMessageDialog(null, "ERRO: Lista vazia");
		}
		if(pos==1) {
			r=inicio.dado;
			inicio=inicio.prox;
		}else {
			int contador=1;
			No aux1=inicio;
			No aux2=null;
			while(aux1.prox!=null && contador<pos){
				aux2=aux1;	
				aux1=aux1.prox;
				contador++;
			}
			System.out.println(contador);
			if(aux1.prox==null && contador==pos) {
				r=aux1.dado;
				aux2.prox=null;
			}
			else if(contador==pos) {
				r=aux1.dado;
				aux2.prox=aux1.prox;
			}else {
				JOptionPane.showMessageDialog(null, "Posicao invalida");
			}
		}
		return r;
	}
	public int removeFinal(){
		int r=-1;
		if(inicio==null){
			JOptionPane.showMessageDialog(null, "ERRO: Lista vazia");
		}else if(inicio.prox==null){
			r=inicio.dado;
			inicio=null;			
		}else{
			No aux1=inicio;
			No aux2=null;
			while(aux1.prox!=null){
				aux2=aux1;	
				aux1=aux1.prox;							
			}
			r=aux1.dado;
			aux2.prox=null;			
		}
		return r;
	}
	@Override
	public String toString(){
		String s="";
		No aux = inicio;
		while(aux!=null){
			s=s+" "+aux.dado;
			aux=aux.prox;
		}
		return s;
	}
}

package filadinamica;

public class FilaDinamica {

    private No inicio;
    private No fim;
    private int tamanho;

    public FilaDinamica() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    public No getFim() {
        return fim;
    }

    public void setFim(No fim) {
        this.fim = fim;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isEmpty(){
        return this.tamanho == 0;
    }

    public void enqueue(int valor){
        No novo = new No(valor);

        if(isEmpty()){
            this.inicio = this.fim = novo;
            this.tamanho++;
            return;
        }

        this.tamanho++;
        this.fim.setProx(novo);
        this.fim = this.fim.getProx();
    
    }

    public int dequeue(){

        if(this.isEmpty()){
            System.out.println("vazia");
            return -1;
        }
        else if(this.tamanho == 1){
            int aux = this.inicio.getValor();
            this.inicio = this.inicio.getProx();
            this.tamanho--;
            return aux;
        }

        int aux = this.inicio.getValor();
        this.inicio = this.inicio.getProx();
        this.tamanho--;
        return aux;
    }

    public String toString(){
		StringBuilder builder = new StringBuilder();

		No atual = inicio;

		builder.append("Fila: [");

		while(atual != null){
			builder.append(atual.getValor());
			if(atual.getProx() != null){
				builder.append(" -> ");
			}
		}

        builder.append("]");

        return builder.toString();
	}
}

package listaduplamenteencadeada;

public class ListaDuplamenteEncadeada {

    private No inicio;
    private No fim;
    private int tamanho;

    public ListaDuplamenteEncadeada() {
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

    public void insereInicio(int valor){
        No novo = new No(valor);

        if(this.isEmpty()){
            this.inicio = novo;
            this.fim = novo;
            this.tamanho++;
            return;
        }

        novo.setProx(this.getInicio());
        this.inicio = novo;
        this.tamanho++;

    }

    public String exibeLista(){
        String str = "";
        if(this.isEmpty()){
            str += "vazia";
            return str;
        }

        for(No i = this.inicio; i != null; i = i.getProx()){
            str += i.getValor() + ", ";
        }

        return str;
    }

    public String listaReversa(){
        String str = "";
        if(this.isEmpty()){
            str += "vazia";
            return str;
        }

        No ultimo = this.fim;
        while(ultimo != null){
            str += ultimo.getValor() + ", ";
            ultimo = ultimo.getAnt();
        }

        return str;
    }    
}

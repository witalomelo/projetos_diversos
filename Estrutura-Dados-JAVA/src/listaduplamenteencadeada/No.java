package listaduplamenteencadeada;

public class No {

    private int valor;
    private No ant;
    private No prox;

    public No(int valor) {
        this.valor = valor;
        this.ant = null;
        this.prox = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public No getAnt() {
        return ant;
    }

    public void setAnt(No ant) {
        this.ant = ant;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }  
    
}

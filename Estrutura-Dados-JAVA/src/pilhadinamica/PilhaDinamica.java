package pilhadinamica;

public class PilhaDinamica {

    private No topo;
    private int tamanho;

    public boolean isEmpty(){
        return this.topo == null;
    }

    public void empilhar(int valor){
      No novo = new No(valor);
      novo.setProx(this.topo);
      this.topo = novo;
      this.tamanho++;
    }

    public int desempilhar(){
        if(isEmpty()){
            System.out.println("vazia");
            return -1;
        }

        int tmp = this.topo.getValor();
        this.tamanho--;
        this.topo = this.topo.getProx();
        return tmp;
    }

    public PilhaDinamica() {
        this.topo = null;
        this.tamanho = 0;
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();

        No atual = this.topo;

        builder.append("[");
        while(atual != null){
            builder.append(atual.getValor());
            if(atual.getProx() != null){
                builder.append(", ");
            }

            atual = atual.getProx();
        }

        builder.append("]");
        
        return builder.toString();
    }

    public No getTopo() {
        return topo;
    }

    public void setTopo(No topo) {
        this.topo = topo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    
    
}

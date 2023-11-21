package pilhaestatica;

public class PilhaEstatica {

    private int vect[];
    private int topo; //posição no vetor vect
    private int tamanho;

    public PilhaEstatica(int tam) {
        this.vect = new int[tam];
        this.topo = 0;
    }

    public boolean isEmpty() {
        return this.topo == 0;
    }

    public boolean isFull() {
        return this.topo == this.vect.length;
    }

    public void empilhar(int valor) {
        if (isFull()) {
            System.out.println("pilha cheia");
            return;
        }

        this.vect[topo] = valor;
        this.topo++;

    }

    public void desempilhar() {
        if (isEmpty()) {
            System.out.println("pilha vazia");
        } else {
            this.topo--;
        }
    }
    
    public String toString(){
        StringBuilder builder = new StringBuilder();

        builder.append("[");

        for(int i = 0; i < topo; i++){
            builder.append(vect[i]);

            if(i < topo - 1){
                builder.append(", ");
            }
        }
        builder.append("]");

       return builder.toString();

    }
}

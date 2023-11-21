package listasimplesmenteencadeada;

public class Lista {

    private No inicio;
    private int tamanho;

    public Lista() {
        this.inicio = null;
        this.tamanho = 0;
    }

    public boolean isEmpty(){
        return this.inicio == null;
    }

    public void insereInicio(int valor){
        No novo = new No(valor);
        novo.setProx(inicio);
        this.setInicio(novo);
        this.tamanho++;

    }

    public void insereFim(int valor){
        No novo = new No(valor);

        if(isEmpty()){
            this.setInicio(novo);
            return;
        }

        No n1 = this.getInicio();
        while(n1.getProx() != null){
            n1 = n1.getProx(); //armazena o ultimo valor null
        }

        n1.setProx(novo);
        this.tamanho++;
    }

    public void removeFim(){
        if(this.isEmpty()){ //vazio
            System.out.println("vazio");
            return;
        } else if (this.inicio.getProx() == null){ //unico elemento
            System.out.println("Removido o numero: " + this.inicio.getValor());
            this.inicio = null;
            this.tamanho--;
            return;
        }

        No aux1 = this.getInicio().getProx(); //segundo elemento 
        No aux2 = this.getInicio(); // primeiro elemento

        while(aux1.getProx() != null){
            aux1 = aux1.getProx(); //ultimo elemento
            aux2 = aux2.getProx(); //penultimo elemento
        }

        System.out.println("removido: " + aux1.getValor());
        aux2.setProx(null); //removendo prox do aux2
        this.tamanho--;
    }

    public void buscarLista(int valor){
        if(this.isEmpty()){
            System.out.println("lista vazia");
            return;
        }

        No n1 = this.getInicio();
        int cont =  0;

        while(n1.getProx() != null){
            if(n1.getValor() == valor){
                System.out.println("Valor encontrado na posição: " + cont);
                return;
            }

            n1 = n1.getProx();
            cont ++;
        }

        System.out.println("valor não encontrado");
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();

        No n1 = this.getInicio();

        builder.append("[");

        while(n1 != null){ //ate o ultimo
            builder.append(n1.getValor());
            if(n1.getProx() != null){ //ate o penultimo
                builder.append(", ");
            }

            n1 = n1.getProx();
        }
        
        builder.append("]");
        return builder.toString();
    }

  
    

    

    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    
    
}

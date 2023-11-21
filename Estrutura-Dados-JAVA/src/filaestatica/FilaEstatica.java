package filaestatica;

public class FilaEstatica {

    private int inicio;
    private int fim;
    private int qtdElementos;
    private int tamanho;
    private int fila[];

    public FilaEstatica() {
        this.inicio = this.fim = -1;;
        this.qtdElementos = 0;
        this.tamanho = 100;
        this.fila = new int[this.tamanho];
    }

    public boolean isEmpty(){
        return qtdElementos == 0;
    }

    public boolean isFull(){
        return this.qtdElementos == this.tamanho -1;
    }

    public void enfileirar(int valor){
        if(this.isFull()){
            System.out.println("cheia");
            return;
        } 

        else if(this.inicio == -1){ //fila vazia
            this.inicio = this.fim = 0;
            this.fila[fim] = valor;
            this.qtdElementos++;
            return;
        }

        this.fim++;
        this.qtdElementos++;
        this.fila[fim] = valor;
    }

    public int desenfileirar(){
        if(isEmpty()){
            System.out.println("vazia");
            return -1;
        }

        int aux = this.fila[this.inicio];
        this.inicio++;
        this.qtdElementos--;
        return aux;
    }

    public String toString(){
        String str = "";
        for(int i = this.inicio; i <= this.fim; i++) {
            str += this.fila[i] + ", ";
        }
        return str;
    }

    public int getQtdElementos(){
        return this.qtdElementos;
    }
}

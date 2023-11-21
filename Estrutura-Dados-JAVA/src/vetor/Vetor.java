package vetor;

public class Vetor {

    private int tamanho;
    private int vect[];

    public Vetor(int tamanho) {
        this.tamanho = tamanho;
        this.vect = new int[tamanho];
    }

    public void inserirElementos(int n){
        int pos = 0;
        for(int i = 0; i< this.tamanho; i++){
            if(this.vect[i] == 0){
                this.vect[i] = n;
                break;
            } else {
                if( i == this.tamanho-1){
                    System.out.println("cheio");
                }

            }
        }
    }

    public int somaVetor(){
        int soma = 0;
        for(int i = 0; i< this.tamanho; i++){
            soma += this.vect[i];
        }
        return soma;
    }

    public int multiplicaVetor(int n){
        int res = 0;
        for(int i = 0; i< this.tamanho; i++){
          this.vect[i] *= n;
          res += this.vect[i];
        }

        return res;

    }
    
}

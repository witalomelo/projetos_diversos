package pilhaestatica;

public class Program {
    public static void main(String[] args) {
        
        PilhaEstatica pe = new PilhaEstatica(10);

        pe.empilhar(1);
        pe.empilhar(2);
        pe.empilhar(3);
        pe.empilhar(10);
        pe.desempilhar();
        pe.desempilhar();

        System.out.println(pe);


       
    }

}

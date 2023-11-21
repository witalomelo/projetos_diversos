package filaestatica;

public class Program {
    public static void main(String[] args) {
        FilaEstatica fe = new FilaEstatica();

        fe.enfileirar(10);
        fe.enfileirar(20);
        fe.enfileirar(30);
        fe.enfileirar(40);

        fe.desenfileirar();

        System.out.println(fe.getQtdElementos());

        System.out.println(fe);
    }
}

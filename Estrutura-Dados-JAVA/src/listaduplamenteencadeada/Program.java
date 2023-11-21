package listaduplamenteencadeada;

public class Program {

    public static void main(String[] args) {
        ListaDuplamenteEncadeada ld = new ListaDuplamenteEncadeada();

        ld.insereInicio(10);
        ld.insereInicio(20);
        ld.insereInicio(30);
        

        //System.out.println(ld.exibeLista());

        System.out.println(ld.listaReversa());
    }
    
}

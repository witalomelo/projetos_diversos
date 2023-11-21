package listasimplesmenteencadeada;

public class Program {

    public static void main(String[] args) {
        
        Lista ld = new Lista();

        ld.insereInicio(1);
        ld.insereInicio(2);

        ld.insereFim(3);

        //ld.buscarLista(1);

        ld.removeFim();


        System.out.println(ld);
    }
    
}

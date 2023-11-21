package pilhadinamica;

public class Program {

    public static void main(String[] args) {

        PilhaDinamica pd = new PilhaDinamica();

        pd.empilhar(1);
        pd.empilhar(2);
        pd.empilhar(3);

        pd.desempilhar();

        System.out.println(pd);

        
    }

  
    
    
}

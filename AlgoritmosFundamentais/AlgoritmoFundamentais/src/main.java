import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("""
                Escolha uma opcao:
                1) Contagem
                2) Fibonnaci
                3) MDC
                4) Numero Primo
                5) Ordenacao
                6) Somatorio
                """);

        int opcao = input.nextInt();

        
            switch(opcao){
                case 1 :
                Contagem ct = new Contagem();
                ct.Contagem();
                break;

                case 2:
                Fibonnaci fb = new Fibonnaci();
                fb.Fibonnaci();
                break;

                case 3:
                MDC mdc = new MDC();
                mdc.MDC();
                break;

                case 4:
                NumeroPrimo np = new NumeroPrimo();
                np.NumeroPrimo();
                break;

                case 5:
                Ordenacao o = new Ordenacao();
                o.Ordenacao();
                break;

                case 6 :
                Somatorio sm = new Somatorio();
                sm.Somatorio();
                break;

                default:
                System.out.println("opcao invalida");


            }
        }


    }
    


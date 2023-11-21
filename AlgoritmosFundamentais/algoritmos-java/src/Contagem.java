import java.util.Scanner;

public class Contagem {
    public void Contagem() {
        Scanner input = new Scanner (System.in);

        int n1;
        int n;
    
        System.out.print("digite o n1: ");
        n1 = input.nextInt();
    
        System.out.print("digite o n2: ");
        n = input.nextInt();

        input.close(); //fechar input


        int cont = 0;
        for (int i = n1; i <= n; i++) {
            if (i % 1 == 0) {
                cont++;
            }
          }
          
          System.out.println("Existem " + cont + " valores inteiros entre " + n1 + " e " + n + ".");
        }
      }
    
    


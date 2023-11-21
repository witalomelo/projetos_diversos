package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.println("Enter file path: ");
        String srcFileStr = sc.nextLine();

        File scrFile = new File(srcFileStr);
        String srcFolderStr = scrFile.getParent(); //obtem o caminho desprezando o nome do arquivo

        //criando diretorio
        boolean sucess = new File(srcFolderStr + "/out").mkdir();

        String targetFileStr = srcFolderStr + "/out/summary.csv";

        //System.out.println("Folder created: " + sucess);

        try (BufferedReader br = new BufferedReader(new FileReader(srcFileStr))){ //fazer leitura do arquivo de entrada 

            String itemCsv = br.readLine();
            while(itemCsv != null){
                
                String[] fields = itemCsv.split(",");
                String nome = fields[0];
                double preco = Double.parseDouble(fields[1]);
                int quantidade = Integer.parseInt(fields[2]);

                list.add(new Product(nome, preco, quantidade));

                itemCsv = br.readLine();

            }

            //escrevendo no arquivo summary
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){

                for(Product item : list){
                    bw.write(item.getNome() + ", " + String.format("%.2f", item.valorTotal())); //editando com duas casas decimais
                    bw.newLine(); //consumindo quebra de linha 
                }

                System.out.println(targetFileStr + "CREATED");

            } catch(IOException e){
                System.out.println("Erro: " + e.getMessage());
            }

        } catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();

    }
}

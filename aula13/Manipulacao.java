package aula13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Manipulacao {
    public static void main(String[] args) {
        
        try {
            File arquivo = new File("arquivo.txt");
            if (arquivo.createNewFile()) {
                System.out.println("Arquivo criado: " + arquivo.getName());
            } else {
                System.out.println("Arquivo ja existe");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileWriter writer = new FileWriter("arquivo.txt");
            writer.write("Ola, este e o conteudo inicial\n");
            writer.write("Linha 2 do arquivo\n");
            writer.close();
            System.out.println("conteudo escrito com sucesso");
        } catch (IOException e) {
            System.out.println("Erro ao escrever: " + e.getMessage());
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("arquivo.txt"));
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler: " + e.getMessage());
        }


        try {
            FileWriter fw = new FileWriter("arquivo.txt");
            fw.write("conteudo alterado\n");
            fw.write("");
        } catch (Exception e) {
            // TODO: handle exception
        }
















    }
}
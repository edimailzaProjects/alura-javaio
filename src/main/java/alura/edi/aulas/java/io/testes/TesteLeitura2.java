package alura.edi.aulas.java.io.testes;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura2
{

    public static void main(String[] args) throws IOException
    {
        //Aqui é o padrão Decorator
        FileInputStream fileInputStream = new FileInputStream("./src/main/resources/lorem.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String linha = bufferedReader.readLine();
        System.out.println(linha); //só vai ler a primeira linha
        System.out.println();
        
        // este while permitirá ler todas as linhas do arquivo
        while (linha != null)
        {
            System.out.println(linha);
            linha = bufferedReader.readLine();
        }

        bufferedReader.close();

    }

}

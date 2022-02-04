package alura.edi.aulas.java.io.testes;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura3
{

    public static void main(String[] args) throws IOException
    {
        //Se eu preciso ler uma imagem ou um pdf, eu sempre vou usar Streams
        
        //FileInputStream - sabe ler bits e bytes
        //FileInputStream herda da classe InputStream
        FileInputStream fileInputStream = new FileInputStream("./src/main/resources/lorem.txt");
        
        // InputStreamReader - lê e foca nos caractetes ou dados binários.
        //Focado mais na leitura de textos
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        
        //Assim como InputStreamReader herda de Reader, BufferedReader herda também
        //São filhos CONCRETOS enquanto que Reader é ABSTRATA
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String linha = bufferedReader.readLine();
        System.out.println(linha); 
        System.out.println();
        
        
        while (linha != null)
        {
            System.out.println(linha);
            linha = bufferedReader.readLine();
        }

        bufferedReader.close();

    }

}

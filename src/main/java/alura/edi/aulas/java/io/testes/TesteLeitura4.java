package alura.edi.aulas.java.io.testes;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura4
{

    public static void main(String[] args) throws IOException
    {
        //Logo, posso colocar apenas InputStream em vez de FileInputStream
        InputStream fileInputStream = new FileInputStream("./src/main/resources/lorem.txt");
        
        //O mesmo vale para InputStreamReader
        Reader inputStreamReader = new InputStreamReader(fileInputStream);
        
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

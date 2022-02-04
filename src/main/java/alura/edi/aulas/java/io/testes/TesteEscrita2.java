package alura.edi.aulas.java.io.testes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteEscrita2
{
    public static void main(String[] args) throws IOException
    {
        //Junção de conhecimentos aula 1 e 2
        
        OutputStream fileOutputStream = new FileOutputStream("./src/main/resources/lorem_writer.txt");
        Writer inputStreamWriter = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(inputStreamWriter);

        bufferedWriter.write("Hello Java IO");
        bufferedWriter.newLine(); // pula linha
        bufferedWriter.write("Lorem ipsum dolor sit amet...");
        bufferedWriter.close();

        InputStream fileInputStream = new FileInputStream("./src/main/resources/lorem_writer.txt");
        Reader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String linha = bufferedReader.readLine();
        System.out.println();

        while (linha != null)
        {
            System.out.println(linha);
            linha = bufferedReader.readLine();
        }

        bufferedReader.close();
    }

}

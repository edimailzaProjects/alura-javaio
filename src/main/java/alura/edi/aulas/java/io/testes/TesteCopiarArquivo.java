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

public class TesteCopiarArquivo
{
    public static void main(String[] args) throws IOException
    {
        InputStream fileInputStream = new FileInputStream("./src/main/resources/lorem_ctrl_c.txt");
        Reader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        
        OutputStream fileOutputStream = new FileOutputStream("./src/main/resources/lorem_ctrl_v.txt");      
        Writer outputStreamWriter = new OutputStreamWriter(fileOutputStream);       
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        String linha = bufferedReader.readLine();

        while (linha != null)
        {
            bufferedWriter.write(linha);
            bufferedWriter.newLine();
            linha = bufferedReader.readLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}

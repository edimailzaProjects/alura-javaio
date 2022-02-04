package alura.edi.aulas.java.io.testes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteSystemOut
{
    public static void main(String[] args) throws IOException
    {
        
        InputStream fileInputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        OutputStream fileOutputStream = System.out; //troca por sysout -> escreve a saída no console
        Writer outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        String linha = bufferedReader.readLine();

        while (linha != null && !linha.isEmpty())
        {
            bufferedWriter.write(linha);
            bufferedWriter.newLine();
            bufferedWriter.flush(); //descarga de dados
            linha = bufferedReader.readLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}

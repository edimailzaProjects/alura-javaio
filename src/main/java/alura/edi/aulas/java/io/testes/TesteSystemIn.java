package alura.edi.aulas.java.io.testes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteSystemIn
{
    public static void main(String[] args) throws IOException
    {
        //Dados inseridos pelo usuário
        InputStream fileInputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        OutputStream fileOutputStream = new FileOutputStream("./src/main/resources/lorem_usuario_escreveu.txt");
        Writer outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        String linha = bufferedReader.readLine();

        //Duplo ENTER para sair linha.isEmpty
        while (linha != null && !linha.isEmpty())
        {
            bufferedWriter.write(linha);
            bufferedWriter.newLine();
            linha = bufferedReader.readLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}

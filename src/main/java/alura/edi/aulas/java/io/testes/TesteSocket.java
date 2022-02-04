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
import java.net.Socket;

public class TesteSocket
{
    // Socket: Simula a comunicação entre dois computadores
    public static void main(String[] args) throws IOException
    {
        @SuppressWarnings("resource")
        Socket socket = new Socket();

        InputStream inputStream = socket.getInputStream(); //comunicação da rede
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        OutputStream fileOutputStream = socket.getOutputStream(); //comunicação da rede
        Writer outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        String linha = bufferedReader.readLine();

        while (linha != null && !linha.isEmpty())
        {
            bufferedWriter.write(linha);
            bufferedWriter.newLine();
            bufferedWriter.flush(); 
            linha = bufferedReader.readLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }

}

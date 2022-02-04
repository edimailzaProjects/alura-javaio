package alura.edi.aulas.java.io.testes;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita1
{
    public static void main(String[] args) throws IOException
    {
      
        OutputStream fileInputStream = new FileOutputStream("./src/main/resources/lorem_writer.txt");      
        Writer inputStreamWriter = new OutputStreamWriter(fileInputStream);       
        BufferedWriter bufferedWriter = new BufferedWriter(inputStreamWriter);
        
        bufferedWriter.write("Hello Java IO");
        bufferedWriter.newLine(); //pula linha
        bufferedWriter.write("Lorem ipsum dolor sit amet...");
        bufferedWriter.close();
        
    }

}

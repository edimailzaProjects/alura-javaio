package alura.edi.aulas.java.io.testes;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura1
{

    public static void main(String[] args) throws IOException
    {
        // Fluxo de entrada com Arquivo
        FileInputStream fileInputStream = new FileInputStream("./src/main/resources/lorem.txt");
        
        //Este comando vai apenas me devolver os bytes em vez do texto
        //fileInputStream.read();
        
        //Logo, deve-se utilizar o InputStreamReader e o BufferedReader para transformar 
        //os bits e bytes em uma linha texto. O Buffer vai guardar todos os caracteres em uma linha
        
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        
        String linha = bufferedReader.readLine();
        System.out.println(linha);
        
        bufferedReader.close(); //se eu abrir, devo fechar
        
    }

}

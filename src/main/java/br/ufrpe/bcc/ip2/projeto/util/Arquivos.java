package br.ufrpe.bcc.ip2.projeto.util;

import java.io.*;
import java.util.List;

public class Arquivos {
    public static List<String> lerArquivo(String caminhoArquivo) {

        BufferedReader conteudoCSV = null;

        try {
            conteudoCSV = new BufferedReader(new FileReader(new File(caminhoArquivo)));
            String linha = conteudoCSV.readLine();

            while (linha != null) {
                String[] info = linha.split(",");
                System.out.println("[Time " + info[0] + " Pontos " + info[5] + "]");
                linha = conteudoCSV.readLine();
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Fora do initervalo.");
        }
        catch (IOException e) {
            System.out.println("Erro!");
        }
        finally {
            if (conteudoCSV != null) {
                try {
                    conteudoCSV.close();
                } catch (IOException e) {
                    System.out.println("Erro ao fechar o arquivo!");
                }
            }
        }
        return null;
    }

}

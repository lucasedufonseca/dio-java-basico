package edu.lucas.inicio;
import java.util.Scanner;

public class MinhaClasse {
    
    //Bloco de código

    
    public static void main (String [] args) {
        System.out.println("Meu primeiro código Java");
        System.out.println("");
        System.out.println("Qual o seu nome?");
        
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();

        System.out.println("Seu nome é " + nome);

        scanner.close();
    }


}

package edu.lucas.anatomiaclasses;
public class DeclaracaoVariaveisMetodos {
    
    public static void main (String [] args) {

        String nomeCarro = "Camaro March 1";
        int anoFabricacao = 2022;
        boolean velhoNovo;
        String firstNameOwner = "Lucas";
        String LastNameOwner = "Fonseca";
        int torqueMotor = 50;
        int numeroAceleradores = 5;

        if (anoFabricacao > 2010) {
            System.out.println("O carro " + nomeCarro + " é novo, pois foi lancedo em " + anoFabricacao);
        } else {
            System.out.println("O carro " + nomeCarro + " é velho, pois foi lancedo em " + anoFabricacao);
        }

        String nomeCompleto = nomeCompleto(firstNameOwner, LastNameOwner);
        System.out.println(nomeCompleto);

        int numeroDeCavalos = multiplicar(numeroAceleradores, torqueMotor);
        System.out.println("O " + nomeCarro + " tem " + numeroDeCavalos + " Cavalos");

    };

    public static String nomeCompleto (String primeiroNome, String ultimoNome) {
        return primeiroNome.concat(" ").concat(ultimoNome);
    }

    public static int multiplicar (int numero1, int numero2) {
        return numero1 * numero2;
    }


}
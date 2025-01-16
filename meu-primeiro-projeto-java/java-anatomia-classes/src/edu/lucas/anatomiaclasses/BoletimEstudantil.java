package edu.lucas.anatomiaclasses;
import java.util.Scanner;

public class BoletimEstudantil {
    
    public static void main(String [] args) {

        int mediaFinal = 60;

        //Variáveis declaradas fora do escopo do While, acessíveis posteriormente no código

        int notaPrimeiroBimestre = 0;
        int notaSegundoBimestre = 0;
        int notaTerceiroBimestre = 0;
        int notaQuartoBimestre = 0;

        //Variáveis recebidas por imput

        // Nota do primeiro bimestre
        Scanner scanner = new Scanner(System.in);

        while (true) {
                System.out.println("Nota do aluno no primeiro bimestre:");

                String imputNotaPrimeiroBimestre = scanner.nextLine();

                try {
                     notaPrimeiroBimestre = Integer.parseInt(imputNotaPrimeiroBimestre);

                    if (notaPrimeiroBimestre > 100 || notaPrimeiroBimestre < 0 ) {
                        System.out.println("Erro: a nota deve ser de no máximo 100 ou de no mínimo 0. Tente novamente");
                        continue;
                    }

                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Erro: Por favor insira um número inteiro válido.");
                    continue;
                }
            
            }   
        
        //Nota do segundo Bimestre

        while (true) {
            System.out.println("Nota do aluno no segundo bimestre:");
            String imputNotaSegundoBimestre = scanner.nextLine();

            try {
                notaSegundoBimestre = Integer.parseInt(imputNotaSegundoBimestre);

                if (notaSegundoBimestre > 100 || notaSegundoBimestre < 0) {
                    System.out.println("Erro: a nota deve ser de no máximo 100 ou de no mínimo 0. Tente novamente");
                    continue;
                }

                break;
            } catch (NumberFormatException e) {
                System.out.println("Erro: Por favor insira um número inteiro válido." + e.getMessage());
                continue;
            }
        }

        //Nota terceiro Bimestre    
        while (true) {
            System.out.println("Nota do aluno no terceiro bimestre:");
            String imputNotaTerceiroBimestre = scanner.nextLine();

            try {
                notaTerceiroBimestre = Integer.parseInt(imputNotaTerceiroBimestre);

                if (notaTerceiroBimestre > 100 || notaTerceiroBimestre < 0) {
                    System.out.println("Erro: a nota deve ser de no máximo 100 ou de no mínimo 0. Tente novamente");
                    continue;
                }

                break;
            } catch (NumberFormatException e) {
                System.out.println("Erro: Por favor insira um número inteiro válido." + e.getMessage());
                continue;
            }
        }

        //Nota quarto bimestre
        while (true) {
            System.out.println("Nota do aluno no quarto bimestre:");
            String imputNotaQuartoBimestre = scanner.nextLine();

            try {
                notaQuartoBimestre = Integer.parseInt(imputNotaQuartoBimestre);
            } catch (NumberFormatException e) {
                System.out.println("Erro: Por favor insira um número inteiro válido." + e.getMessage());
                continue;
            } 

            if (notaQuartoBimestre > 100 || notaQuartoBimestre < 0) {
                System.out.println("Erro: a nota deve ser de no máximo 100 ou de no mínimo 0. Tente novamente");
                continue;
            } else{
                break;
            }
        }

        //close all inputs
        scanner.close();  
        
        double notaFinalDoAluno = (notaPrimeiroBimestre + notaSegundoBimestre + notaSegundoBimestre + notaQuartoBimestre) / 4;

        if (notaFinalDoAluno < mediaFinal) {
            System.out.println("A nota final do aluno foi " + notaFinalDoAluno + ".O aluno foi REPROVADO");
        } else if (notaFinalDoAluno == mediaFinal) {
            System.out.println("A nota final do aluno foi " + notaFinalDoAluno + ".O aluno ficou na média e foi APROVADO");
        } else {
            System.out.println("A nota final do aluno foi " + notaFinalDoAluno + ".O aluno foi APROVADO");
        }
    }
       
}

import java.util.Random;

/*
Aluno: Yan F. Hausmann
Turma: Java 1

 * Exercícios Práticos | Proposto na data 11/03
 * Professor Davi Saldanha

 * 01  Faça um programa que permita ao usuário entrar com uma matriz de tamanho 3 × 3 
       de números inteiros. Em seguida, calcule um vetor contendo três posições, 
       em que cada posição deverá armazenar a soma dos números de cada coluna da matriz. 
       Exiba na tela esse array

 */

public class Exercicio01MatrizBidimensional {

    public static void main(String[] args) {

        int valores[][] = new int[3][3];
        int tamValores = valores.length;
        
        int valorFinal[] = new int[3];
        
        Random gen = new Random();
        
        int contPos = 1;
        
        for (int l = 0; l < tamValores; l++) {
            for (int c = 0; c < tamValores; c++) {
                valores[l][c] = gen.nextInt(20)+1;
                System.out.println("Valor Nº" + (contPos++) + ": " + valores[l][c]);
            }
            System.out.println("--------------------");
        }
        
        contPos = 1;
         
        for (int c = 0; c < 3; c++) {
            for (int l = 0; l < tamValores; l++) {
                valorFinal[c] += valores[l][c];
            }
            System.out.println("Soma de Valores da Coluna Nº" + (contPos++) +": "+ valorFinal[c]);
        }
        
        System.out.println("--------------------");
    }


        /* 
        Esta resoluçã é praticamente a mesma da anterior, alterando apenas o cálculo;
        Nesta, calcula o valor total de cada linha, ao invés de calcular o valor total de cada coluna.

        
        int valores[][] = new int[3][3];
        int tamValores = valores.length;

        int valorFinal[] = new int[3];

        Random gen = new Random();
        
        int contPos = 1;
        for (int l = 0; l < tamValores; l++) {
            for (int c = 0; c < tamValores; c++) {
                valores[l][c] = gen.nextInt(20)+1;
                System.out.println("Valor Nº" + (contPos++) + ": " + valores[l][c]);
            }
           System.out.println("--------------------");
        }
        contPos = 1;
                
        for (int l = 0; l < tamValores; l++) {
            for (int c = 0; c < 3; c++) {
                valorFinal[l] += valores[l][c];
            }
            System.out.println("Soma de Valores da Linha Nº" + (contPos++) +": "+ valorFinal[l]);
        }
        System.out.println("--------------------");
        */
}
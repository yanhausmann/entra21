import java.util.Random;

/*
Aluno: Yan F. Hausmann
Turma: Java 1

 * Exercícios Práticos | Proposto na data 11/03
 * Professor Davi Saldanha

 * 03  Crie um algoritmo que calcule a soma dos valores da diagonal principal de uma matriz 5x5.

 */

public class Exercicio03MatrizBidimensional {
    public static void main(String[] args) {

        int notas[][] = new int[5][5];
        int tamNotas = notas.length;
        Random gen = new Random();

        //CADASTRAR NOTAS EM TODAS AS POSIÇÕES DA MATRIZ NOTAS
        for (int l = 0; l < tamNotas; l++) {
            for (int c = 0; c < tamNotas; c++) {
                notas[l][c] = gen.nextInt(10);
                System.out.printf("%-2d | ", notas[l][c]);
            }
            System.out.println();
            System.out.println("------------------------");
        }
            
        //SOMAR DIAGONAL
        int somaNotasDiag = 0;
        for (int l = 0; l < tamNotas; l++) {
            somaNotasDiag += notas[l][l];
        }
        System.out.println("A soma das notas diagonais: " + somaNotasDiag);
        
        
        //SOMAR DIAGONAL INVERTIDA
        int somaDiagonalSecundaria = 0;
        for (int i = 0; i < tamNotas; i++) {
            somaDiagonalSecundaria += notas[i][tamNotas - 1 - i];
        }
        System.out.println("A soma das notas da diagonal inversa: " + somaDiagonalSecundaria);
        System.out.println("------------------------");
    }
}

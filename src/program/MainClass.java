package program;

import entities.BoxOffice;

import java.util.Scanner;

public class MainClass {
    public static void main(String[]args){
        Scanner tc = new Scanner(System.in);

        System.out.print("Numeros de Fileiras: ");
        int numeroFileiras = tc.nextInt();
        System.out.print("Numero de cadeiras por fila: ");
        int cadeirasEmCadaFileira = tc.nextInt();

        BoxOffice boxOffice = new BoxOffice(numeroFileiras, cadeirasEmCadaFileira);

        //Inciciando a matriz. Formando as coordenadas dos assentos:
        char[][] matrizCadeiras = new char[numeroFileiras][cadeirasEmCadaFileira];

        //Definindo "S" como assentos vazios na matriz:
        for (int i = 0; i < matrizCadeiras.length; i++){
            for (int j = 0; j < matrizCadeiras[i].length; j++ ){
                matrizCadeiras[i][j] = 'S';
            }
        }

        //Entrada de dados para definir o assento selecionado na matriz:
        System.out.print("Número da fileira: ");
        int numeroDaFileira = tc.nextInt();
        System.out.print("Número da cadeira: ");
        int numeroDaCadeira = tc.nextInt();

        //loop para imprimir os assentos de acordo com o tamanho das coordenadas:
        System.out.print("  ");
        for (int coluna = 1; coluna <= cadeirasEmCadaFileira; coluna++){
            System.out.print(coluna + " ");
        }
        System.out.println();

        for (int linha = 1; linha <= numeroFileiras; linha++){
            System.out.print(linha + " ");
            for (int coluna = 1; coluna <= cadeirasEmCadaFileira; coluna++){
                System.out.print("S ");
            }
            System.out.println();
        }

        System.out.println();

        boxOffice.PrecoIngressoCinema();

        System.out.print("\nCinema:");

        //Logica que define aonde o assento esta sendo selecionado e alterando de "S" para "B" na matriz:
        if (numeroDaFileira >= 0 && numeroDaFileira < cadeirasEmCadaFileira &&
            numeroDaCadeira >= 0 && numeroDaCadeira < numeroFileiras){
                matrizCadeiras[numeroDaFileira - 1][numeroDaCadeira - 1] = 'B';
        } else {
            System.out.println("[ERRO]Assento inválido!");
        }
        System.out.println();

        //loop para imprimir atualizado, imrpimendo o assento escolhido de acordo com as coordenadas:
        System.out.print("  ");
        for (int coluna = 1; coluna <= cadeirasEmCadaFileira; coluna++){
            System.out.print(coluna + " ");
        }
        System.out.println();

        for (int linha = 1; linha <= numeroFileiras; linha++){
            System.out.print(linha + " ");
            for (int coluna = 1; coluna <= cadeirasEmCadaFileira; coluna++){
                System.out.print(matrizCadeiras[linha - 1][coluna - 1] + " ");
            }
            System.out.println();
        }

        //Impressão dos valor total dos assentos:

        tc.close();
    }
}

package program;

import entities.BoxOffice;
import entities.SeatCoordinates;
import java.util.Scanner;

public class MainClass {
    public static void main(String[]args){
        Scanner tc = new Scanner(System.in);

        //Entrada a quantidade de assentos do cinema:
        System.out.print("Numeros de Fileiras: ");
        int numeroFileiras = tc.nextInt();
        System.out.print("Numero de cadeiras por fila: ");
        int cadeirasEmCadaFileira = tc.nextInt();

        //Instanciando objeto boxOffice:
        BoxOffice boxOffice = new BoxOffice(numeroFileiras, cadeirasEmCadaFileira);

        //Inciciando a matriz. Formando as coordenadas dos assentos:
        SeatCoordinates.iniciarMatriz(numeroFileiras, cadeirasEmCadaFileira);

        //Entrada de dados para selecionar assento na matriz:
        System.out.print("Número da fileira: ");
        int numeroDaFileira = tc.nextInt();
        System.out.print("Número da cadeira: ");
        int numeroDaCadeira = tc.nextInt();

        //loop para imprimir os assentos de acordo com o tamanho das coordenadas:
        SeatCoordinates.imprimirAssentos();

        System.out.println();

        //Imprimir os dados da bilheteria:
        boxOffice.PrecoIngressoCinema();

        System.out.print("\nCinema:");

        //Logica que define aonde o assento esta sendo selecionado e alterando de "S" para "B" na matriz:
        SeatCoordinates.reservarAssentos(numeroDaFileira, numeroDaCadeira);
        System.out.println();

        //loop para imprimir atualizado, imrpimendo o assento escolhido de acordo com as coordenadas:
        SeatCoordinates.imprimirAssentos();

        tc.close();
    }
}
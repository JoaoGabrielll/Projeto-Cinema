package program;

import entities.Cinema;

import java.util.Scanner;

public class MainClass {
    public static void main(String[]args){
        Scanner tc = new Scanner(System.in);

        int numeroFileiras, cadeirasEmCadaFileira;

        System.out.println("Cinema:\n" +
                "  1 2 3 4 5 6 7 8 9\n" +
                "1 S S S S S S S S S\n" +
                "2 S S S S S S S S S\n" +
                "3 S S S S S S S S S\n" +
                "4 S S S S S S S S S\n" +
                "5 S S S S S S S S S\n" +
                "6 S S S S S S S S S\n" +
                "7 S S S S S S S S S\n" +
                "8 S S S S S S S S S\n" +
                "9 S S S S S S S S S\n");
        System.out.print("Numeros de Fileiras: ");
        numeroFileiras = tc.nextInt();
        System.out.print("Numero de cadeiras por fila: ");
        cadeirasEmCadaFileira = tc.nextInt();

        Cinema cinema = new Cinema(numeroFileiras, cadeirasEmCadaFileira);

        System.out.println(cinema.precoIngressosDoCinema());
        tc.close();
    }
}

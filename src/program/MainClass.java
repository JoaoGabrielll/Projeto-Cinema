package program;

import entities.Cinema;

import java.util.Scanner;

public class MainClass {
    public static void main(String[]args){
        Scanner tc = new Scanner(System.in);

        int numeroFileiras, cadeirasEmCadaFileira;

        System.out.print("Numeros de Fileiras: ");
        numeroFileiras = tc.nextInt();
        System.out.print("Numero de cadeiras por fila: ");
        cadeirasEmCadaFileira = tc.nextInt();

        Cinema cinema = new Cinema(numeroFileiras, cadeirasEmCadaFileira);

        System.out.println(cinema.cadeirasCinema());
        tc.close();
    }
}

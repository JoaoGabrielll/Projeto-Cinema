package entities;

public class SeatCoordinates {

    private static char [][] matrizCadeiras;
    public static void iniciarMatriz(int numeroFileiras, int cadeirasEmCadaFileira){
        matrizCadeiras = new char[numeroFileiras][cadeirasEmCadaFileira];

        //Definindo "S" como assentos vazios na matriz:
        for (int i = 0; i < matrizCadeiras.length; i++){
            for (int j = 0; j < matrizCadeiras[i].length; j++ ){
                matrizCadeiras[i][j] = 'S';
            }
        }
    }

    public static void reservarAssentos(int numeroDaFileira, int numeroDaCadeira){
        //Logica que define aonde o assento esta sendo selecionado e alterando de "S" para "B" na matriz:
        if (numeroDaFileira >= 0 && numeroDaFileira < matrizCadeiras.length &&
                numeroDaCadeira >= 0 && numeroDaCadeira < matrizCadeiras[0].length){
            matrizCadeiras[numeroDaFileira - 1][numeroDaCadeira - 1] = 'B';
        } else {
            System.out.println("[ERRO]Assento inválido!");
        }
    }

    public static void imprimirAssentos(){

        //loop para imprimir os assentos de acordo com o tamanho das coordenadas:
        System.out.print("  ");
        for (int coluna = 1; coluna <= matrizCadeiras[0].length; coluna++){
            System.out.print(coluna + " ");
        }
        System.out.println();

        for (int linha = 1; linha <= matrizCadeiras.length; linha++){
            System.out.print(linha + " ");
            for (int coluna = 1; coluna <= matrizCadeiras[0].length; coluna++){
                System.out.print(matrizCadeiras[linha - 1][coluna - 1] + " ");
            }
            System.out.println();
        }
    }

}

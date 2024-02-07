/*
    Fazer um programa para ler os valores da largura e altura
    de um retângulo. Em seguida, mostrar na tela o valor de sua área,
    perímetro e diagonal. Usar classes com as seguintes descrições:

    Retangle

    -Width: double
    -Height: double

    +Area(): double
    +Perimetro(): double
    +Diagonal(): double


 */


import entities.Triangule;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangule retangulo;
        retangulo = new Triangule();
        System.out.println("Entre com os seguintes valores:");
        System.out.print("Width: ");
        retangulo.width = sc.nextDouble();

        System.out.print("Height: ");
        retangulo.height = sc.nextDouble();

        System.out.println(retangulo);


        sc.close();
    }
}
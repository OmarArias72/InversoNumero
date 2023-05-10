/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
import java.util.Scanner;

public class ObtenerInverso {

    static void Invertir() {
        int num, rem;
        int rev = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        num = entrada.nextInt();

        do {
            rem = num % 10;

            rev = rev * 10 + rem;
            num = num / 10;
        } while (num > 0);

        // Printing the reverse number
        System.out.println("Reverse of given number: "
                + rev);

    }

    // Main driver method
    public static void main(String[] args) {
        Invertir();
    }
}

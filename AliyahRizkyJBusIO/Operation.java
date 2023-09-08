//import java.io.*;
import java.util.Scanner;

public class Operation{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("SIMPLE CALCULATOR");
        System.out.print("Enter number1: ");
        float a = input.nextFloat();
        System.out.print("Enter number1: ");
        float b = input.nextFloat();

        System.out.print("Hasil penjumlahan variabel a dan b = ");
        System.out.println(String.format("%.2f", (a+b)));
        System.out.println(String.format("Hasil pengurangan variabel a dan b = %.2f", (a - b)));
        System.out.println(String.format("Hasil perkalian variabel a dan b = %.2f", (a * b)));
        System.out.println(String.format("Hasil pembagian variabel a dan b = %.2f", (a / b)));
    }
}

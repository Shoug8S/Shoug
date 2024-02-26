/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskForCulp;
 import java.util.Scanner;
/**
 *
 * @author SHOUG
 */
public class NewClass {
   



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("و The maximum number is: " + num1);
        } else if (num2 > num1) {
            System.out.println("The maximum number is: " + num2);
        } else {
            System.out.println("╭Both numbers are equal!");
        }

        
    }
}



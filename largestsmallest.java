/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexe1;

import java.util.Scanner;
/**
 *
 * @author ELCOT
 */
public class largestsmallest {
    
public static void main(String[] args) {
    int smallest = 0;
    int large = 0;
    int num;
    System.out.println("enter the number");
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    num = input.nextInt();
    smallest = num;
    for (int i = 1; i < n; i++) {
        num = input.nextInt();
        if (num > large) {
            large = num;
        }
        if (num < smallest) {
            smallest = num;
        }
    }
    System.out.println("the largest is:" + large);
    System.out.println("Smallest no is : " + smallest);
}
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão2;

import java.util.Scanner;

/**
 *
 * @author Vycto
 */
public class Main {
     public static void main(String[] args) {
        Scanner Recurs = new Scanner (System.in);
        
        System.out.println("Digite a posição do numero :");
        int n1 = Recurs.nextInt();
        for (int i = 0; i<n1; i++){
        System.out.println("Proximo numero da sequencia de fibonacci: " + (SFibonati.Fibonacci(i)+" "));
        
        }
        
    }
    
}


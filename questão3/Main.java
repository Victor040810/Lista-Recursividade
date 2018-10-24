/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão3;

import java.util.Scanner;

/**
 *
 * @author Vycto
 */
public class Main {

 public static void main(String[] args) {
        Scanner Recurs = new Scanner (System.in);
        System.out.print("Digite um inteiro:");
        int n1 = Recurs.nextInt();
        
        int result = Iinversão.invert(n1, 0);
        System.out.println("O numero invertido: " + result);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão1;

import java.util.Scanner;

/**
 *
 * @author Vyctor
 */
public class Main {

    public static void main (String [] args ){
        Scanner Recurs = new Scanner (System.in);
        
        System.out.print("Digite um numero: ");
          
        System.out.println ("O numero fatorial retornado: " + (NFatorial.fact(Recurs.nextInt())));
        
        
    }
    
}
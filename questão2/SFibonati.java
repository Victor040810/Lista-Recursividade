/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão2;

/**
 *
 * @author Vycto
 */
public class SFibonati {
    public static int Fibonacci(int n){
        
        if(n < 2){
            return 1;
        }
        
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
}
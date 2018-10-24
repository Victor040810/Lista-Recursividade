/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vycto
 */
public class Questão5 {
    public static void main(String[] args) {
        
        int Recurs = soma(5);
        System.out.println(Recurs);
    }
    public static int soma(int n){
        if(n > 1){
            return n + soma(n-1);
        }
        return 1;
        
    }
}


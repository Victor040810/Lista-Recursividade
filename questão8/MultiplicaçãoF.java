/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão8;

/**
 *
 * @author Vycto
 */
public class MultiplicaçãoF {

  public static void main(String[] args) {
        
        int n = 8;
        int n1 = 10;
        // Variavel de multiplicação
        System.out.println(M(n, n1));
        
    }
    
public static int M(int n, int n1){
        if(n1 > 0){
            return  n+ M (n, n1-1);
        }else {
        }
         return 0;
        
    }
    
}
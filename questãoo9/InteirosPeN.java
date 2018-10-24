/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questãoo9;

/**
 *
 * @author Vycto
 */
public class InteirosPeN {

 public static void main(String[] args) {
     System.out.println("Ordem crescente ");
        
        NumNaturais(12);
    }
    
   public static void NumNaturais(int n){
  
  
  if (n>0){
    NumNaturais(n-1);
        System.out.println(n);
    
        }  
     }
 }

    
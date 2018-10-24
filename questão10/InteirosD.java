/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão10;

/**
 *
 * @author Vycto
 */
public class InteirosD {

  
 public static void main(String[] args) {
        
     System.out.println(" Ordem Decrescente ");
        
        NumNaturais(12);
    }
    
   public static void NumNaturais(int n){
  
     
  if (n>0){
      
     System.out.println(n);
     NumNaturais(n-1);
    
        }  
     }
   }
 
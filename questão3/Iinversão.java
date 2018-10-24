/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão3;

/**
 *
 * @author Vycto
 */
public class Iinversão {

   public static int invert(int n, int s){
        if (n == 0){
            return s;
        }else {
     }   
      return invert  (n/10, s * 10 + n%10);
       
   }   
}
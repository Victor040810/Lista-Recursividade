/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão4;

/**
 *
 * @author Vycto
 */
public class Main {
 public static void main(String[] args) {
        int i[]= {1,2,3,4,5};
       
             int result = SomaN (i, 0);
          
             System.out.println(result);
    }
    
    public static int SomaN(int i[], int s){
                
        if(s< i.length){
            return i[s] +  SomaN(i, s +1);
        }
        return  1;
    }
}
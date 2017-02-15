/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Kevin Gerardo Hinojosa Castellanos   A01411383   IMT

package spp.khinojosac.t02.p2;
import java.util.Scanner;
/**
 *
 * @author Kevin Hinojosa
 */
public class SPPKHinojosaCT02P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      
        System.out.println("Introduce a number");
      String valsub=teclado.nextLine();
      int valinf= Integer.parseInt(valsub);
      
      for (int i=1; i<= valinf; i++){
          if(valinf % i == 0){
              System.out.println("i");
          }
         
          
          if(valinf % 3 == 0){
              System.out.println("The number is divisible by three");
          }
          
          else{
              System.out.println("The number is not divisible by three");
          }
          
          if(valinf % 5 == 0){
              System.out.println("The number is divisible by five");
          }
          
          else{
              System.out.println("The number is not divisible by five");
          }
          
          if(valinf % 2 == 0){
              System.out.println("The number is Pair ");
          }
          
          else{
              System.out.println("The number is Pair");
          }
          
          teclado.nextLine();
      }
    }
    
}

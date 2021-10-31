/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangkaproject;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class GameTebakAngkaProject {

    /**
     * @param args the command line arguments
     */
//    System.out.println(randInt(int min, int max));
    
    public static void main(String[] args) {
      Random rand = new Random(); //instance of random class
      int batas = 100;
      int nilai = rand.nextInt(batas); 
//      System.out.println("Random = : " + nilai);
      
      boolean cek = true;
      
      while (cek == true){
        Scanner data = new Scanner(System.in);
        System.out.print("Masukkan pilihan : ");
        int bil = data.nextInt();
        if (bil == nilai){
            System.out.println("Bilangan tebakan anda BENAR");   
            cek = false; 
        }else if(bil >= nilai){
            System.out.println("Bilangan tebakan anda terlalu besar");   
        }else if (bil <= nilai){
            System.out.println("Bilangan tebakan anda terlalu kecil");  
        }
    }
    }
    
}

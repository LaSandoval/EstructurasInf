/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package torres.hanoi;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class TorresHanoi {
 public static void Hanoi(int n, int origen, int auxiliar, int destino){
        
        if(n !=1){
        Hanoi(n-1,origen,destino,auxiliar);
        System.out.println("Se mueve el disco del origen "+ origen+ " al destino "+ destino);
        Hanoi(n-1,auxiliar,origen,destino);
        
        }
        else{
        System.out.println("Se mueve el disco del origen "+ origen+ " al destino "+ destino);   

     
           
            
        }   
 }
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite la cantidad de bloques que desea combinar");
        int cantBloque=sc.nextInt();
        Hanoi(cantBloque, 1,2,3);
    
    }
    
}



  
     


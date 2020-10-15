/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.google_kickstart;


import java.util.Scanner;

/**
 *
 * @author ivanmillan36
 */
public class Round_D_2020 {
    public static void main(String[] args) {
        int T, N;
        int V[];
        
        Scanner sc = new Scanner(System.in);
          
        T = sc.nextInt();
        int aux = 1;
        do{          
            N = sc.nextInt();
            V = new int[N];
            
            for(int i=0 ; i<N ; i++){
                V[i] = sc.nextInt();
            }
            
            System.out.println("Case #" + aux + ": " + calcular(V));
            aux++;
            
        }while(aux <= T);
    }
    
    public static int calcular(int arreglo[]){
        boolean esMayor = true;
        int cant_mayores = 0;
        
        for(int i=0 ; i<arreglo.length-1 ; i++){
            if (arreglo[i] > arreglo[i+1]){
                
                for(int j=0 ; j<i ; j++){                      
                    if(arreglo[i] <= arreglo[j]){
                        esMayor = false;
                    }
                }
                if(esMayor){
                    cant_mayores++;
                }                
                esMayor = true;
            }
            
        }
        
        for(int i=0 ; i<arreglo.length-1 ; i++){
            if (arreglo[arreglo.length-1] <= arreglo[i]){
                esMayor = false;
            }
        }
        if(esMayor){
            cant_mayores++;
        }
        return cant_mayores;
    }
    
}

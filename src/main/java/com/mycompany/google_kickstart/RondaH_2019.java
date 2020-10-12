/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.google_kickstart;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


/**
 *
 * @author ivanmillan36
 */
@SuppressWarnings("unchecked")
public class RondaH_2019 {
    public static void main(String[] args) {
        int T, N, X;
        
        Scanner sc = new Scanner(System.in);
          
        T = sc.nextInt();
        int aux = 1;
        do{          
            
            N = sc.nextInt();
            X = sc.nextInt();
           
        
            int A[][] = new int[N][2];
            Queue<Integer> R=new LinkedList();
        
            for (int i=0 ; i < N ; i++){
                A[i][0] = sc.nextInt();
                A[i][1] = i+1;
            }
        
            while(R.size() < N){
                retirarDinero(A, X, R);
                pasarAlFinal(A);
            }
            
            System.out.print("Case #" + aux + ": ");
            R.forEach(dato -> {
                System.out.print(dato + " ");
            });
            System.out.println("");
            aux++;
            
        }while(aux <= T);
        
    }
    
    public static void retirarDinero(int A[][], int X, Queue R){
        
        if (A[0][0] > 0){
            A[0][0] -= X;
        }
        
        if(A[0][0] <= 0 && A[0][1] != -100){
            R.add(Integer.valueOf(A[0][1]));
            A[0][1] = -100;
        }
        
        
    }
    
    public static void pasarAlFinal(int A[][]) {
        int aux1, aux2;
        aux1 = A[0][0];
        aux2 = A[0][1];
        
        for (int i=0 ; i < A.length-1 ; i++){
            
            A[i][0] = A[i+1][0];
            A[i][1] = A[i+1][1];
            
        }
        
        A[A.length-1][0] = aux1;
        A[A.length-1][1] = aux2;
        
    }
}

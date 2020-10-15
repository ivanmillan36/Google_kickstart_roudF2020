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
public class RoundE_2020 {
    public static void main(String[] args) {
        
        int T, N, caso = 1;
        Scanner sc = new Scanner(System.in);
        
        T = sc.nextInt();
        
        do{
            N = sc.nextInt();
        
            int A[] = new int[N];
        
            for (int i=0 ; i<A.length ; i++){
                A[i] = sc.nextInt();
            }
        
            int cont = 2;
            int cont_max = 0;
            if(A.length == 2){
                cont = 2;
                cont_max = 2;
            }else{
                for(int i=0; i<A.length-2 ; i++){
                    if((Math.abs(A[i]-A[i+1]) == Math.abs(A[i+1] - A[i+2])) && ((A[i] == A[i+1] && A[i+1] == A[i+2]) || (A[i] < A[i+1] && A[i+1] < A[i+2]) || (A[i] > A[i+1] && A[i+1] > A[i+2]))){                        
                        cont++;                      
                    }else {
                        if(cont > cont_max){
                            cont_max = cont;
                        }
                        cont = 2;
                    }
                }
                if(cont > cont_max){
                    cont_max = cont;
                }
            }
        
            System.out.println("Case #" + caso + ": " + cont_max);
            caso++;
        }while(caso <= T);    
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obcjects;

import java.util.Scanner;

/**
 *
 * @author Gawin
 */
public class Obcjects {


    public static void main(String[] args) {
       int n;
       double x;
       Scanner scan=new Scanner(System.in);
       System.out.println("Podaj liczbę n");
       n=scan.nextInt();
       System.out.println("Podaj liczbę x");
       x=scan.nextInt();
       Maths one=new Maths(n);
       System.out.println("*****************************************************");
       Maths two=new Maths(n,x);
        
    }
    
}

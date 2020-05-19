/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obcjects;
/**
 *
 * @author Gawin
 */
public class Maths {
    static double pi=3.14;
    static double sinus=0.71,cosinus;
    int number,result ;
    double argument;
    Maths(int number){
        this.number=number;
        result=1;
        for(int i=number;i>=1;i--){
            result*=i;
        }
        System.out.println("Math(int number)-Liczenie silni z n");
        System.out.println("Liczenie silni z n="+result);
    }
    
    Maths(int number,double argument){
        this(number);
        this.number=number;
        this.argument=argument;
        result=1;
        System.out.println("Math(int number,double argument)-Podniesienie n do potęgi x");
        for(int i=0;i<argument;i++){
            result*=number;
        }
        System.out.println("N do potęgi x="+result);
    }
    static{
        System.out.println("Pi w zaokrągleniu do dwóch miejsc po przecinku="+pi);
    }
    static{
        cosinus=sinus;
        System.out.println("Dla kąta 45 stopni sinus i cosinus="+cosinus);
    }
    
}

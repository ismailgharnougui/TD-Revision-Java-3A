/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestIF;

/**
 *
 * @author sanabenfadhel
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Somme s1=new Somme();
        calcul(s1, 10, 12);
        
        Soustraction sou=new Soustraction();
        calcul(sou, 10, 5);
        
        
        calcul((int x1,int x2)->{return x1+x2;}, 20, 10);
        
         calcul((int x1,int x2)->{return x1*x2;}, 20, 10);
         
          calcul((x1,x2)->x1+x2, 20, 10);
        
    }
    public static void calcul(ICalcul ic,int a,int b)
    {
        System.out.println(ic.calculer(a, b));
    }
}

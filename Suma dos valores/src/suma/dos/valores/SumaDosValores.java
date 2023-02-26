/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma.dos.valores;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class SumaDosValores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x1,x2,suma;
        
        Scanner leer=new Scanner (System.in);
        
        System.out.println("Ingresa el primer valor");
        x1=leer.nextDouble();
        
        System.out.println("Ingresa el segundo valor");
        x2=leer.nextDouble();
        
        suma=x1+x2;
        System.out.println("la suma vale "+suma);
        
        
        // TODO code application logic here
    }
    
}

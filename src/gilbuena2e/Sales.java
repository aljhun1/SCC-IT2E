/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gilbuena2e;

import java.util.Scanner;

/**
 *
 * @author SCC-COLLEGE
 */
public class Sales {
    public void getSales(){
        
      Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Customer name: ");
        String Customer = input.nextLine();
        
        System.out.print("Enter Product name: ");
        String Product = input.nextLine();
        
        System.out.print("Enter Quantity: ");
        int Quant = input.nextInt();
        
        System.out.print("Enter Price: ");
        int Price = input.nextInt();
        
        System.out.print("Enter Cash: ");
        int Cash = input.nextInt();
        
        System.out.println("\n--------------------------------");
        System.out.println("RECIEPT" );
        System.out.println("--------------------------------");
        
        System.out.println("Name: " +Customer);
        System.out.println("Item: " +Product);
        System.out.println("Quantity: " +Quant);
        System.out.println("--------------------------------");
        System.out.println("Total Due: " +(Quant*Price));
        System.out.println("Cash: " +(Cash));
        System.out.println("--------------------------------");
        System.out.println("Change: " +(Cash-(Quant*Price)));
    
    }

}

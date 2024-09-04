/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package undang;

import java.util.Scanner;


public class Sales {
   
    public void getSales(){
        Scanner myInput = new Scanner (System.in);

        String cname, pname;
        int quanti, price, cash;
       
       
        System.out.print("Enter Customer name: ");
        cname = myInput.nextLine();
        System.out.print("Enter Product name: ");
        pname = myInput.nextLine();
        System.out.print("Enter Quantity: ");
        quanti = myInput.nextInt();
        System.out.print("Enter price: ");
        price = myInput.nextInt();
        System.out.print("Enter cash: ");
        cash = myInput.nextInt();
       
        System.out.println("---------------------------------");
        System.out.println("Name: "+cname+"\nItem name: "+pname+"\nEnter Quantity: "+quanti);
        System.out.println("---------------------------------");
        System.out.println("Total due: "+(quanti*price)+".00");
        System.out.println("Cash: "+cash+".00");
        System.out.println("---------------------------------");
        System.out.println("Change: "+(cash-(quanti*price)+".00");
        System.out.println("---------------------------------");
       
    }
   
}
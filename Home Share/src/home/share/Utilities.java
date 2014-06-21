/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package home.share;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
/**
 *
 * @author Misa
 */
public class Utilities {
    
    private Scanner sc = new Scanner(System.in);
    public Transaction transactionInfo(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String temp;
        double price;
        Date date;
        System.out.print("Date of the transaction(DD/MM/YYYY): ");
        temp = sc.next();
        try {
            date = formatter.parse(temp);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        System.out.print("Description: ");
        temp = sc.next();
        System.out.print("Price: ");
        price = sc.nextDouble();
        
        
    }
}

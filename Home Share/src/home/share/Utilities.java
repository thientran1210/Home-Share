/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package home.share;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
        Date date = new Date();
        System.out.print("Date of the transaction(DD/MM/YYYY): ");
        temp = sc.next();
        try {
            date = formatter.parse(temp);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        System.out.print("Description: ");
        if (sc.hasNextLine())
            sc.next();
        temp = sc.nextLine();
        System.out.print("Price: ");
        price = sc.nextDouble();
        
        Transaction newTrans = new Transaction ("0001",date,temp,price);
        return newTrans;
        
    }
    
    public ArrayList<Integer> selectMember(ArrayList<Member> memberList, int owner){
        
        String line;
        String[] ele;
        ArrayList<Integer> members = new ArrayList<Integer>();
        System.out.println("Please select who involve in this transaction: ");
        for(int i = 0;i<memberList.size();i++){
            if(i != owner)
            System.out.print(i+1+":"+memberList.get(i).getName()+" ");
        }
        System.out.println();
        if (sc.hasNextLine())
            sc.nextLine();
        line = sc.nextLine();
        ele = line.split(" ");

        for(String s:ele){
            members.add(Integer.parseInt(s));
        }
        
        return members;
    }
    
    public int searchMember(ArrayList<Member> memberList){
        String name;
        int me = 0;
        System.out.print("Owner's name: ");
        name = sc.next();
        for (Member m:memberList){
            if(m.getName().equals(name)){
                me = memberList.indexOf(m);
                break;
            }
        }
        
        return me;
        
    }
}

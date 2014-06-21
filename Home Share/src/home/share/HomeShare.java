/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package home.share;

import java.util.ArrayList;

/**
 *
 * @author toshiba
 */
public class HomeShare {

    private ArrayList<Transaction> transactionList;
    private ArrayList<Member> memberList;
    
    public HomeShare (ArrayList<Transaction> tList, ArrayList<Member> mList)
    {
        this.transactionList = tList;
        this.memberList = mList;
    }
    
    public void addMember (Member member){
        memberList.add(member);
    }
    
    public void addTransaction (){
        Utilities util = new Utilities();
        
        
    }
    
    
}

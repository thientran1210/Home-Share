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

    private ArrayList<Member> memberList;
    Utilities util = new Utilities();
    
    public HomeShare (ArrayList<Member> mList)
    {
        this.memberList = mList;
    }
    
    public void addMember (Member member){
        memberList.add(member);
    }
    
    public void addTransaction (){
        int m;
        double price;
        ArrayList<Integer> debtMemberIndex = null;
        Transaction trans = null;
        m = util.searchMember(this.memberList);
        trans = memberList.get(m).addOwnTransaction();
        debtMemberIndex = util.selectMember(memberList,m);
        price = calculateFee(trans,1+debtMemberIndex.size());
        memberList.get(m).setOwnMoney(price);
        for (int i :debtMemberIndex){
            this.memberList.get(i-1).addDebtTransaction(trans);
            this.memberList.get(i-1).setDebtMoney(price);
        }
    }
    
    public double calculateFee(Transaction trans, int numbOfMember){
        return trans.getPrice()/numbOfMember;
    }
    
}

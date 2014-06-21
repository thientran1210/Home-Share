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
        Member m = null;
        ArrayList<Integer> debtMemberIndex = null;
        Transaction trans = null;
        m = util.searchMember(this.memberList);
        trans = m.addOwnTransaction();
        debtMemberIndex = util.selectMember(memberList);
        for (int i :debtMemberIndex){
            this.memberList.get(i).addDebtTransaction(trans);
        }
        
        
        
    }
    
    
}

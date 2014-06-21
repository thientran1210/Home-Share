/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package home.share;

import java.util.ArrayList;

/**
 *
 * @author Misa
 */
public class Application {
    
    public static void main (String args[]){
        
        ArrayList<Member> memberList = new ArrayList<Member>();
        memberList.add(new Member("Thien"));
        memberList.add(new Member("Quoc"));
        memberList.add(new Member("Di"));
        memberList.add(new Member("Phong"));
        memberList.add(new Member("Misa"));
        HomeShare hs = new HomeShare(memberList);
        hs.addTransaction();
    }
}

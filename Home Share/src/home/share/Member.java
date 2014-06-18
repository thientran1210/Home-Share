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
public class Member {
    
    private String name;
    private double debtMoney;
    private double ownMoney;

    public Member(String name) {
        this.name = name;
        this.debtMoney = 0;
        this.ownMoney = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDebtMoney() {
        return debtMoney;
    }

    public void setDebtMoney(double debtMoney) {
        this.debtMoney = debtMoney;
    }

    public double getOwnMoney() {
        return ownMoney;
    }

    public void setOwnMoney(double ownMoney) {
        this.ownMoney = ownMoney;
    }
    
    
    
    
    
    
    
    
}

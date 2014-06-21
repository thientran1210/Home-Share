/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package home.share;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author toshiba
 */
public class Transaction {
    
    private String Id;
    private Date date;
    private String description;
    private double price;

    public Transaction (String id, Date date, String description, double price){
        this.Id = id;
        this.date = date;
        this.description = description;
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
}

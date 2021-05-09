/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import java.io.Serializable;

/**
 *
 * @author admin
 */
public abstract class Person implements Serializable {
   private int cardnumber;
   private int phone;

    public Person() {
    }

    public Person(int cardnumber, int phone) {
        this.cardnumber = cardnumber;
        this.phone = phone;
    }

    public int getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(int cardnumber) {
        this.cardnumber = cardnumber;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" + "cardnumber=" + cardnumber + ", phone=" + phone + '}';
    }
   
}

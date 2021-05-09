/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import java.io.Serializable;
import java.util.*;

/**
 *
 * @author admin
 */
public class Ticket implements Serializable  {

    private int Ticketid;
        private int Seatno;

    private String ticketDate;

    public void setTicketid(int Ticketid) {
        this.Ticketid = Ticketid;
    }
        public void setSeatno(int Seatno) {
        this.Seatno = Seatno;
    }

    public Ticket(String ticketDate) {
        this.ticketDate = ticketDate;
    }

    public Ticket(int Ticketid,  String ticketDate,int Seatno) {
        this.Ticketid = Ticketid;
        this.Seatno = Seatno;
        this.ticketDate = ticketDate;
    }

    public Ticket(int Ticketid, String ticketDate) {
        this.Ticketid = Ticketid;
        this.ticketDate = ticketDate;
    }

    public Ticket() {
    }

    public int getTicketid() {
        return Ticketid;
    }



    public String getTicketDate() {
        return ticketDate;
    }

    public void setTicketDate(String ticketDate) {
        this.ticketDate = ticketDate;
    }

    public Ticket(int Ticketid) {
        this.Ticketid = Ticketid;
    }

    public int getSeatno() {
        return Seatno;
    }

    @Override
    public String toString() {
        return "Ticket{" + "Ticketid=" + Ticketid + ", Seatno=" + Seatno + ", ticketDate=" + ticketDate + '}';
    }

  

}

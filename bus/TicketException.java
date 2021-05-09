/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

/**
 *
 * @author Tasneem Alaa
 */
public class TicketException extends Exception{
String Msg;
 String warning;
    public TicketException() {
        
        
        warning="Please Check the ID that You Entered";
    }

 

    public String getWarning() {
        return warning;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }

    @Override
    public String toString() {
        return "TicketException{" + "Msg=" + Msg + ", warning=" + warning + '}';
    }
    
    
}

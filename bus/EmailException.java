/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

/**
 *
 * @author admin
 */
public class EmailException extends Exception {
    String HintMessage;
    

    public EmailException() {
        HintMessage="Hint: Emails should contain @ and end with .com";
    }

    public String getHintMessage() {
        return HintMessage;
    }

    public void setHintMessage(String HintMessage) {
        this.HintMessage = HintMessage;
    }

    @Override
    public String toString() {
        return "EmailException{" + "HintMessage=" + HintMessage + '}';
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import java.util.*;

/**
 *
 * @author pc
 */
public class MyException extends Exception {
String Msg;
 String Warning;
    public MyException() {
      Warning= " Please fil the time field ";
    }

   
    public String getWarning() {
        return Warning;
    }

    public void setWarning(String Warning) {
        this.Warning = Warning;
    }

    @Override
    public String toString() {
        return "MyException{" + "Msg=" + Msg + ", Warning=" + Warning + '}';
    }
     
}

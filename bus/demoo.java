/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.*;
/**
 *
 * @author admin
 */
public class demoo {
    public static void main(String[] args)throws Exception {
        ArrayList<Trip> tt= new ArrayList<>();
        tt.add(new Trip("Cairo","Alex",150,4));
        tt.add(new Trip("Hurghada","Cairo",250,3));
        tt.add(new Trip("Luxor","Cairo",350,7));
        tt.add(new Trip("Alex","Cairo",150,10));
        int total=0;
     
        
        FileOutputStream fos= new FileOutputStream("Bookings.txt");
        ObjectOutputStream dso= new ObjectOutputStream(fos);
         
       
        dso.writeObject(tt);
        
        
             
              dso.close();
              fos.close();
           
              FileInputStream fis= new FileInputStream("Bookings.txt");
        ObjectInputStream dsi= new ObjectInputStream(fis);
   System.out.println(dsi.readObject());
     
         
                   try
        {
           
            System.out.println(tt.get(3)); 
        
        }     
        catch(Exception e)
        {
          System.out.println ("Exception happened!, get(3) means fourth index which is empty, try get(2)");
         }
          dsi.close();
        fis.close();
        
         ArrayList <Driver> dr = new ArrayList <Driver> ();
     dr.add( new Driver ("101",500,12));
     dr.add( new Driver ("102",700,13));
     dr.add( new Driver ("103",800,14));
     dr.add( new Driver ("104",800,14));
     
     
       FileOutputStream f = new FileOutputStream("Driver.txt");
        ObjectOutputStream o = new ObjectOutputStream(f);
        o.writeObject(dr);
        o.close();
        f.close();


        FileInputStream fiso = new FileInputStream("Driver.txt");
        ObjectInputStream ois = new ObjectInputStream(fiso);
        System.out.println(ois.readObject());
        ois.close();
        fiso.close();
        
    
        // Booked Tickets file
         FileInputStream faccess = new FileInputStream("Access.txt");
        ObjectInputStream oaccess = new ObjectInputStream(faccess);
        System.out.println(oaccess.readObject());
        ois.close();
        fis.close();
         
       
         

    }
    
      

   

    
}

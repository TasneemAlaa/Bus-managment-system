/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import java.util.*;
import javax.swing.JOptionPane;

public class Admin extends Person{

    Account A;
    
    Trip tri = new Trip();
     int nop,  tick;
     double fare;
     
     
    List<Trip>  tripInfo=new ArrayList<>();
    Scanner input = new Scanner(System.in);

    List<Bus> list1 = new ArrayList<Bus>();

    List<Account> list = new ArrayList<Account>();
    public Admin(){
        
    }
     
    public Admin(int cardnumber,int phone) {
super(cardnumber,phone);
    }

    public Admin(String username, String password, String address, String email,int phone,int cardnumber) {
super(cardnumber,phone);
        this.A = new Account(username, password, address, email);

    }
    public Passenger DisplayRating(String r) {
       
        Passenger p = new Passenger(0,0);
        for (int i = 0; i < list1.size(); i++) {
            if ((list1.get(i).d.getD_id()).equals(r)) {
                p.RateDriver();
                int rt = list1.get(i).d.getRatings();
                System.out.println(rt);
            } else
                System.out.println("Invalid Rating");
           
        }
        return null;
    }
    

    public void createBus() {
        Trip P = new Trip();
        Bus b = new Bus();

        int busno;

        System.out.println("Enter the number of added busses: ");

        busno = input.nextInt();

        String i, rt, o, d, d_id;

        int km;

        double salary, workinghrs;

        for (int x = 0; x < busno; x++) {

            System.out.println("Please enter the bus' information: ");

            System.out.println("Enter ID: ");

            i = input.next();

            System.out.println("Enter Origin: ");

            o = input.next();

            System.out.println("Enter destination: ");

            d = input.next();

            System.out.println("Enter running time: ");

            rt = input.next();

            System.out.println("Enter bus driver's ID");

            d_id = input.next();

            System.out.println("Enter the distance between origin and destination in kilometers");

            km = input.nextInt();

            P.assignFares(km);

            System.out.println("Enter driver salary");

            salary = input.nextDouble();

            System.out.println("Enter working hours");

            workinghrs = input.nextDouble();
            

            b = new Bus(i,d_id, o, d, rt, km, salary, workinghrs);
            P= new Trip(o,d,km);

            list1.add(b);
            

        }

    }

    public void searchBus(String n) {

        for (int i = 0; i < list1.size(); i++) {

            if ((list1.get(i).getId()).equals(n)) {

                System.out.println("Found");

                System.out.println(list1.get(i).toString());
                break;

            } else {

                System.out.println("Not Found");
                break;

            }

        }

    }

    public void removeBus() {

        System.out.println("Enter the ID of the bus you would like to remove");

        String sid;

        sid = input.next();

        for (int i = 0; i < list1.size(); i++) {

            if ((list1.get(i).getId()).equals(sid)) {

                list1.remove(i);

                System.out.println("Bus has been removed successfuly");
                break;

            } else {

                System.out.println("Bus ID not found");
                break;

            }

        }

    }

    public void updateBus() {

        String i, rt, o = "", d = "", d_id;

        int z, n;

        boolean e;

        System.out.println("Enter the ID of the bus you would like to update");

        String sid;

        sid = input.next();

        for (int j = 0; j < list1.size(); j++) {

            if ((list1.get(j).getId()).equals(sid)) {

                System.out.println("Press 1 for ID, 2 for Origin, 3 for destination, 4 for running time and 5 for driver's ID: ");

                int y = input.nextInt();

                switch (y) {

                    case 1:

                        System.out.println("Enter ID: ");

                        i = input.next();

                        list1.get(j).setId(i);

                        System.out.println(list1);

                        break;

                    case 2:

                        System.out.println("Enter Origin: ");

                        o = input.next();

                        list1.get(j).setOrigin(o);


                        break;

                    case 3:

                        System.out.println("Enter destination: ");

                        d = input.next();

                        list1.get(j).setDestination(d);


                        break;

                    case 4:

                        System.out.println("Enter running time: ");

                        rt = input.next();

                        list1.get(j).setRunningTimes(rt);

                        System.out.println(list1);

                        break;

                    case 5:

                        System.out.println("Enter bus driver's ID");

                        d_id = input.next();

                        list1.get(j).setD_id(d_id);

                        System.out.println(list1);

                        break;

                }
                break;

            } else {

                System.out.println("Bus ID not found");
                break;

            }

        }

    }
    
    public void displayTripinfo(String origin, String destination){
        JOptionPane.showMessageDialog(null, "or ");
             if("Cairo".equalsIgnoreCase(origin)){
                // JOptionPane.showMessageDialog(null, "or " + origin);
                 // JOptionPane.showMessageDialog(null, "or " + destination);
            if("Alex".equalsIgnoreCase(destination)||"alexaderia".equalsIgnoreCase(destination)){
               // JOptionPane.showMessageDialog(null, "2ndor ");
              nop=Trip.getCacounter();
              //JOptionPane.showMessageDialog(null, "total pass  " + nop);
             tick= tri.setFare(origin, destination);
             //JOptionPane.showMessageDialog(null, "total  " + tick);
             fare=tick* Trip.getCacounter();
             //JOptionPane.showMessageDialog(null, "list" + nop +  " "+  tick +" "+ fare);
             Trip trp=new Trip(origin, destination,fare,nop);
             tripInfo.add(trp);
            
              JOptionPane.showMessageDialog(null,"the list" + tripInfo);
             
            }
             
            else if ("Luxor".equalsIgnoreCase(destination)){
                
                nop=Trip.Clcounter;
             tick= tri.setFare(origin, destination);
             fare=tick* Trip.Clcounter;
              Trip t=new Trip(origin, destination,fare,nop);
             tripInfo.add(t);
              JOptionPane.showMessageDialog(null, tripInfo);
            }
            else if("Hurghada".equalsIgnoreCase(destination)){
             nop=Trip.Chcounter;
             tick= tri.setFare(origin, destination);
             fare=tick* Trip.Chcounter;
              Trip ti=new Trip(origin, destination,fare,nop);
             tripInfo.add(ti);
              JOptionPane.showMessageDialog(null,tripInfo);
        }
            
             }
        else if("Cairo".equalsIgnoreCase(destination)){
              if("Alex".equalsIgnoreCase(origin)||"alexaderia".equalsIgnoreCase(origin)){
                nop=Trip.Accounter;
             tick= tri.setFare(origin, destination);
             fare=tick* Trip.Accounter;
              Trip ty=new Trip(origin, destination,fare,nop);
             tripInfo.add(ty);
           
              JOptionPane.showMessageDialog(null, tripInfo);
            }
            else if ("Luxor".equalsIgnoreCase(origin)){
                 nop=Trip.Lccounter;
             tick= tri.setFare(origin, destination);
             fare=tick* Trip.Lccounter;
            }
            else if("Hurghada".equalsIgnoreCase(origin)){
            
             nop=Trip.Hccounter;
             tick= tri.setFare(origin, destination);
             fare=tick* Trip.Hccounter;
              Trip t=new Trip(origin, destination,fare,nop);
             tripInfo.add(t);
        }
        }
       

          //   return tripInfo;
    
    }

 public boolean createAccount(String un, String P, String e, String ad) {

        boolean x = false;
        String username = "", password, email, address;

        do {

            if (un.endsWith("A") == true) {

                username = un;
                x = true;

            } else {

                x = false;
                break;

            }

        } while (un.endsWith("A") == false);

        if (x == true) {
            password = P;

            email = e;

            address = ad;

            Account a = new Account(username, password, address, email);

            list.add(a);
        }
        return x;

    }


    public void manageAccount() {

        boolean check = true;

        System.out.println("Enter 1 if you would like to remove an account or 2 if you would like to update it");

        int x = input.nextInt();

        if (x == 1) {

            do {

                System.out.println("Enter the username of the admin you would like to remove");

                String auser;

                auser = input.next();

                for (int i = 0; i < list.size(); i++) {

                    if ((list.get(i).getUsername()).equals(auser)) {

                        list.remove(i);

                        check = true;

                        System.out.println("Admin account deleted!");

                    } else {

                        System.out.println("Admin username not found");

                        check = false;

                    }

                }

            } while (check == false);

        } else if (x == 2) {

            System.out.println("Enter the admin information you would like to update:"
                    + "press (1) for username, (2) for password, "
                    + "(3) for email, and (4) for address");

            int y = input.nextInt();

            String newname = "", newpass = "", newadd = "", newemail = "";

            switch (y) {

                case 1:

                    System.out.println("Enter the old username you would like to change: ");

                    String name = input.next();

                    for (int i = 0; i < list.size(); i++) {

                        if ((list.get(i).getUsername()).equals(name)) {

                            System.out.println("Enter the new username for the admin: ");

                            String c;

                            do {

                                c = input.next();

                                if (c.endsWith("A") == true) {

                                    newname = c;

                                } else {

                                    System.out.println("Unvalid username");

                                }

                            } while (c.endsWith("A") == false);

                            list.get(i).setUsername(newname);

                            System.out.println(list);

                        } else {

                            System.out.println("Username not found");

                        }

                    }

                    break;

                case 2:

                    System.out.println("Enter the old password you would like to change then the new one");

                    String pass = input.next();

                    for (int i = 0; i < list.size(); i++) {

                        if ((list.get(i).getPassword()).equals(pass)) {

                            newpass = input.next();

                            list.get(i).setPassword(newpass);

                            System.out.println(list);

                        }

                    }

                    break;

                case 3:

                    System.out.println("Enter the old email you would like to change then the new one");

                    String em = input.next();

                    for (int i = 0; i < list.size(); i++) {

                        if ((list.get(i).getEmail()).equals(em)) {

                            newemail = input.next();

                            list.get(i).setEmail(newemail);

                            System.out.println(list);

                        }

                    }

                    break;

                case 4:

                    System.out.println("Enter the old address you would like to change then the new one");

                    String addr = input.next();

                    for (int i = 0; i < list.size(); i++) {

                        if ((list.get(i).getAddress()).equals(addr)) {

                            newadd = input.next();

                            list.get(i).setAddress(newadd);

                            System.out.println(list);

                        }

                    }

            }

        }

    }

   

    @Override
    public String toString() {
        return "Admin{" + "A=" + A + ", input=" + input + '}';
    }

}

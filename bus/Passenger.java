/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import java.awt.FlowLayout;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import static java.lang.System.out;
import java.util.*;
import javax.swing.*;

public class Passenger extends Person implements Serializable {

    Account pass;
    Trip Psngr;
    Ticket Ps;
    Bus B;

    private int ticket;
    private static int TicketsAvailable = 36;
    private static int Counter = 0;
    Queue<Integer> q = new LinkedList<>();
    Queue<Integer> s = new LinkedList<>();
    Queue<Integer> Tri = new LinkedList<>();
    ArrayList<Trip> T = new ArrayList<>();
    ArrayList<Passenger> info = new ArrayList<>();

    public Passenger() {

    }

    public Passenger(int cardnumber, int phone) {
        super(cardnumber, phone);
    }

    public Passenger(String username, String password, String address, String email) {

        this.pass = new Account(username, password, address, email);

    }

    public Passenger(String origin, String destination, int ticket, int Counter) {
        this.Psngr = new Trip(origin, destination);
        this.ticket = ticket;
        this.Counter = Counter;

    }

    public static int getCounter() {
        return Counter;
    }

    public static void setCounter(int Counter) {
        Passenger.Counter = Counter;
    }

    public boolean ManageUsername(Account acc, String olduser, String newuser) {
        if (olduser.equals(newuser) || !newuser.endsWith("p")) {

            return false;
        } else {
            acc.setUsername(newuser);
        }
        return true;
    }

    public boolean ManagerPassword(Account acc, String oldpass, String newpass1, String newpass2) {

        if (newpass1.equals(newpass2) && !oldpass.equals(newpass1)) {
            acc.setPassword(newpass2);
            return true;

        } else {
            return false;
        }

    }

    public boolean ManagerEmail(Account acc, String oldemail, String newemail) {

        if (!oldemail.equals(newemail) && newemail.contains("@") && newemail.endsWith(".com")) {
            return true;
        } else {
            return false;
        }
    }

    public void bookTicket(String Origin, String Destination, String Date, int Tno) {

        // Scanner in = new Scanner(System.in);
        boolean valid = false;
        Trip tp = new Trip();

        //  System.out.println("Please enter your Origin");
        // String Origin = in.nextLine();
        tp.setOrigin(Origin);
        //System.out.println("Please enter your destination ");
        //String Destination = in.nextLine();
        tp.setDestination(Destination);

        /*   for (int i = 0; i < T.size(); i++) {

            Trip tick = (Trip) T.get(i);

            if (tick.getOrigin().equals(Origin) && tick.getDestination().equals(Destination)) {

                JOptionPane.showMessageDialog(null, "Your route is available");

            } else {

                JOptionPane.showMessageDialog(null, "Sorrry unavailable route");

            }
            break;
        }*/
        Ticket tk = new Ticket();
        Trip II = new Trip();
        for (int i = 0; i < 36; i++) {
            q.add(i + 101);
        }
        for (int i = 0; i < 36; i++) {
            s.add(i + 1);
        }
        for (int i = 0; i < 36; i++) {
            Tri.add(100 + i);
        }
        boolean check = true;

        //Scanner sc = new Scanner(System.in);
        // System.out.println("Please Enter the time of booking ");
        // String ticketTime = sc.nextLine();
        // System.out.println("Please Enter the date of booking ");
        //String ticketDate = sc.nextLine();
        tk.setTicketDate(Date);

        /* System.out.println("Please choose a ticket level :");
        System.out.println(" Press A for Gold booking :");
        System.out.println(" Press B for Silver booking :");
        System.out.println(" Press C for Platinum booking :");
        char ticketLevel = sc.next().charAt(0);
        switch (ticketLevel) {
            case 'A':

                System.out.println(" You're Gold ticket is now saved ");
                break;
            case 'B':
                System.out.println(" You're Silver booking is now saved ");
                break;
            case 'C':
                System.out.println(" You're Platinum booking is now saved ");
                break;
            default:
                System.out.println("Invalid booking");
                break;
        }
        System.out.println("How many tickets do you want ? ");*/
        // int ticketno = sc.nextInt();
        if (Tno <= q.size()) {
            for (int i = 0; i < Tno; i++) {
                int k = q.poll();
                int y = s.poll();

                JOptionPane.showMessageDialog(null, "Now you booked ticket of id " + k + " of seat " + y);

                Trip t = new Trip(Origin, Destination, Date, k, y);
                T.add(t);

            }

            Counter += Tno;

            int h = Tri.poll();
            JOptionPane.showMessageDialog(null, "Your Trip id is " + h);
            II.setTripid(h);
            // JOptionPane.showMessageDialog(null,"You booked " + Tno + " ticket(s).");
            //    int fare1 = fareCalculated(Tno);
            JOptionPane.showMessageDialog(null, "You booked " + Tno + " ticket(s).");

        } else {
            JOptionPane.showMessageDialog(null, "There's no enough tickets for this trip");
        }

        /* System.out.println("Do you want edit your booking?");
        String reply = sc.next();
        if ("Yes".equals(reply) || "yes".equals(reply)) {
            manageBooking();
        } else {
            System.out.println("Thank you for using our App");
        }*/
        //JOptionPane.showMessageDialog(null,"T size "+ T.size());
    }

    public void addTicket(int addT, String origin, String dest, String date) {
        //  Scanner o = new Scanner(System.in);
        //int option;
        Admin a = new Admin();

        Trip TT = new Trip();

        // System.out.println("Press 1 to add more tickets \nPress 2 to remove booked tickets \nPress 3 if you want to change seats");
        // option = o.nextInt();
        //    switch (option) {
        //      case 1:
        //  System.out.println("How many tickets do you want to add");
        //  int addT = o.nextInt();
        // System.out.println("Enter the Origin and Destination for the ticket you want to add \n Orgin:\n ");
        //String origin = o.next();
        TT.setOrigin(origin);

        // System.out.println("Destination:\n");
        //String dest = o.next();
        TT.setDestination(dest);

        // System.out.println("enter date");
        //  String datet= o.next();
        // JOptionPane.showMessageDialog(null, "t size  "+T.size());

        /*   for (int i = 0; i < T.size(); i++) {

                    Trip tick = (Trip) T.get(i);

                    if (tick.getOrigin().equals(origin) && tick.getDestination().equals(dest)) {

                          JOptionPane.showMessageDialog(null,"Your route is available");

                    } else {

                           JOptionPane.showMessageDialog(null,"Sorrry unavailable route");

                    }

                    break;

                }*/
        Counter += addT;
        // JOptionPane.showMessageDialog(null, "counter " + Counter);
        //   if (addT <= q.size()) {
        //  JOptionPane.showMessageDialog(null, "no" + addT);
        JOptionPane.showMessageDialog(null, "You booked " + addT + " ticket(s).");
        for (int i = 0; i < addT; i++) {
            //  JOptionPane.showMessageDialog(null, "for " + addT);
            int c = q.poll();
            // JOptionPane.showMessageDialog(null, "c " + c);
            int u = s.poll();
            // JOptionPane.showMessageDialog(null, "u" + u);
            JOptionPane.showMessageDialog(null, "Now you booked ticket of id " + c + " and seat " + u);

            Trip tr = new Trip(origin, dest, date, c, u);

            T.add(tr);

        }

        int l = Tri.poll();

        JOptionPane.showMessageDialog(null, "Your Trip id is " + l);

        TT.setTripid(l);

        //   int fare2 = fareCalculated(Counter);
        // JOptionPane.showMessageDialog(null, "You booked " + addT + " ticket(s)." );
    }
    //  break;

    /*  case 2:

                System.out.println("How many tickets do you want to remove");

                int j = o.nextInt();*/
    public int removeTicket(int numt) {

        for (int i = 0; i < numt; i++) {

            q.add(i + 301);

            s.add(i + 51);

        }
        for (int i = 0; i < T.size(); i++) {
            Trip t = T.get(i);
            if (t.Tripid == numt) {

                T.remove(i);
                Counter -= numt;
                // JOptionPane.showMessageDialog(null, "Ticket removed." + T.remove(i));
                JOptionPane.showMessageDialog(null, "You have sucessfully cancelled your booking.");
            }
        }
        return Counter;

    }

    //    int fare3 = fareCalculated(Counter);
    //  JOptionPane.showMessageDialog(null,"Now your fare equals " + fare3);
    /*  break;

            case 3:*/
    public void changeSeat(int ns, int cs) {
        // System.out.println("Seats Available are " + s);
        // System.out.println("Enter number of seats to be changed");
        // int ns=o.nextInt();

        // System.out.println("Enter seats numbers to be changed");
        for (int i = 0; i < ns; i++) {
            // int cs= o.nextInt();
            s.add(cs);

        }
        System.out.println("Your seats are changed into ");
        for (int i = 0; i < ns; i++) {
            int bs = s.poll();
            System.out.println("Now you changed seat " + (i + 1) + " to " + bs);
        }

        /* break;

            default:

                System.out.println("Please press from the selected options");

                break;*/
    }

    public int fareCalculated(int co, String origin, String destination) {
        JOptionPane.showMessageDialog(null, "faree");
        // p.setFare(origin, destination);
        int i = Psngr.setFare(origin, destination);
        JOptionPane.showMessageDialog(null, "setfare");

        int fare = i * co;
        /* int ee=p.getCcounter();
        int uu= ee+p.getFirstt();
         
         int far=p.getFare();
         int total= uu * far;
          JOptionPane.showMessageDialog(null, "fare = " + total);
        return total;*/

 /* Trip r = new Trip();
        int x = r.assignFares(0);
        int finalPrice = x * counter;
        return finalPrice;*/
        JOptionPane.showMessageDialog(null, "fare = " + fare);
        return fare;
    }

    public Trip accessTicket(int Tid) {

        boolean isfound = false;

        // Scanner value = new Scanner(System.in);
        // boolean x = true;
        if (!isfound) {

            //  System.out.println("Enter your Ticket ID that you want to Access it ");
            //int Tid = value.nextInt();
          // JOptionPane.showMessageDialog(null, "Found");
            for (int i = 0; i < T.size(); i++) {

                Trip r = T.get(i);

                if (r.Tripid == Tid) {
                    //  System.out.println("Tid=" + Tid);

                    //  System.out.println("Tsize=" + T.size());
                    //  System.out.println("Found");
                   // JOptionPane.showMessageDialog(null, T.get(i));

                    isfound = true;
                    return r;
                 
                    

                }

            }
        } 
        else{
            isfound=false;
        }
            return null;

           // JOptionPane.showMessageDialog(null, "Not Found");

        

        /*System.out.println("if you want to access another ticket press yes");

            Scanner val = new Scanner(System.in);

            String ch = val.next();

            if (ch.equals("yes") || ch.equals("Yes")) {

                x = true;

                isfound = false;

            } else {

                x = false;

            }

         */
      
    }

    public int RateDriver() {

        Driver d = new Driver(0, 0);
        Scanner sc = new Scanner(System.in);
        System.out.println(" Based on your last trip , rate the driver please press from 1 to 5 ");
        int rate = sc.nextInt();
        d.setRatings(rate);
        if (rate <= 3) {
            System.out.println("Sorry for your inconvience");
        } else {
            System.out.println("Hope you're glad with our program");
        }

        return rate;
    }

    @Override
    public String toString() {
        return "Passenger{" + "pass=" + pass + ", Psngr=" + Psngr + ", Ps=" + Ps + ", B=" + B + ", ticket=" + ticket + ", q=" + q + ", s=" + s + ", Tri=" + Tri + ", T=" + T + ", info=" + info + '}';
    }

}

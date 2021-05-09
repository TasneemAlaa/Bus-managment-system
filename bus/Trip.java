/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import java.io.Serializable;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class Trip implements Serializable {
    ArrayList<Trip> info= new ArrayList<>(); 

   String origin;

    String destination;

    String tripStart;

    String tripEnd;

    Ticket Tr;
    int firstt;
    int kilometers;

    int Tripid;
    int ticket;
   
    double totalFare;
    int passTrip;
   static int counter;
   static int Cacounter=0;
   static int Clcounter=0;
   static int Chcounter=0;
   static int Accounter=0;
   static int Lccounter=0;
   static int Hccounter=0;
    public int getFirstt() {
        return firstt;
    }

    public void setFirstt(int firstt) {
        this.firstt = firstt;
    }

  
     int SearchObject(int tid, int x,String o,String d){
       JOptionPane.showMessageDialog(null, "search");
       int ss = 0;
        for(int i=0; i<info.size();i++){
           Trip p;
            p=(Trip) info.get(i);
            if(p.getTripid()==tid)
            {
                
                
                int y=x+p.getCcounter();
                info.remove(i);
        Trip tr= new Trip(o,d,tid,y);
        info.add(tr);
        tr.setFare(o,d);
        p.setCcounter(y);
        ss= p.getCcounter();
        }
        }
    return ss;    
    }

    public Trip(String origin, String destination, int Tripid, int counter) {
        this.origin = origin;
        this.destination = destination;
        this.Tripid=Tripid;
        this.counter = counter;
    }

    public Trip(String origin, String destination, double totalFare, int passTrip) {
        this.origin = origin;
        this.destination = destination;
        this.totalFare = totalFare;
        this.passTrip = passTrip;
    }

 

    
    static public int getCcounter() {
        return counter;
    }

    static public void setCcounter(int counter) {
        Trip.counter = counter;
    }
    
    int setFare(String o,String d){
       // this.ticket=ticket;
        if("Cairo".equals(o)||"cairo".equals(o)){
            if("Alex".equals(d)||"alex".equals(d)||"alexaderia".equals(d)){
                ticket=150;
                Cacounter++;
                JOptionPane.showMessageDialog(null, "or" + Cacounter);
            }
            else if ("Luxor".equals(d)||"luxor".equals(d)){
                ticket =350;
                Clcounter++;
            }
            else if("Hurghada".equals(d)||"hurghada".equals(d)){
            ticket =250;
            Chcounter++;
        }
            
        }
        else if("Cairo".equals(d)||"cairo".equals(d)){
              if("Alex".equals(o)||"alex".equals(o)||"alexaderia".equals(o)){
                ticket=150;
                Accounter++;
            }
            else if ("Luxor".equals(o)||"luxor".equals(o)){
                ticket =350;
                Lccounter++;
            }
            else if("Hurghada".equals(o)||"hurghada".equals(o)){
            ticket =250;
            Hccounter++;
        }
        }
        return ticket;
    }
    
    
    
    
    int getFare(){
        return ticket;
    }
 

    public Trip(int Tripid) {

        this.Tripid = Tripid;

    }

    public Trip() {
       firstt=0;
    }

    public Trip(String origin, String destination, String ticketDate, int Tripid, int Seatno) {
        this.origin = origin;
        this.destination = destination;
        this.Tr = new Ticket(ticketDate);
        this.Tr=new Ticket(Seatno);
        this.Tripid = Tripid;
    }

    public Trip(String origin, String destination) {
        this.origin = origin;
        this.destination = destination;
    }

  

    public Trip(String origin, String destination, String tripStart, String tripEnd) {

        this.destination = destination;

        this.origin = origin;

        this.tripStart = tripStart;

        this.tripEnd = tripEnd;


    }

    public Trip(String origin, String destination, int kilometers) {

        this.destination = destination;

        this.origin = origin;

        this.kilometers = kilometers;

    }

    public Trip(String origin, String destination, String tripStart, String tripEnd, int Tripid) {

        this.destination = destination;

        this.origin = origin;

        this.tripStart = tripStart;

        this.tripEnd = tripEnd;

        this.Tripid = Tripid;

    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    public String getOrigin() {
        return origin;
    }

    public String getTripStart() {

        return tripStart;

    }

    public void setTripStart(String tripStart) {

        this.tripStart = tripStart;

    }

    public String getTripEnd() {

        return tripEnd;

    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTripid() {
        return Tripid;
    }

    public void setTripid(int Tripid) {
        this.Tripid = Tripid;
    }

    public void setTripEnd(String tripEnd) {

        this.tripEnd = tripEnd;

    }

//from here
    public void setOrigin(String origin) {

        this.origin = origin;

    }

    public Trip(int Tripid, String origin, String destination) {
        this.origin = origin;
        this.destination = destination;
        this.Tr = new Ticket(Tripid);

    }

    public Trip(int Seatno, String origin, String destination, String ticketDate, int Tripid) {

        this.origin = origin;
        this.destination = destination;
        this.kilometers= kilometers;
        this.Tr = new Ticket(Seatno, ticketDate);

    }

    public int assignFares(int ww) {

        Scanner input = new Scanner(System.in);

       
       
        int ticket;
        if (ww <= 100 && ww >= 1) {
            ticket = 150;

        } else if (ww >= 101 && ww <= 200) {
            ticket = 250;

        } else {
            ticket = 350;

        }
        return ticket;
    }

    public static int getCacounter() {
        return Cacounter;
    }

   

    public static int getClcounter() {
        return Clcounter;
    }

    public static void setCacounter(int Cacounter) {
        Trip.Cacounter = Cacounter;
    }

    public static void setClcounter(int Clcounter) {
        Trip.Clcounter = Clcounter;
    }

    public static void setChcounter(int Chcounter) {
        Trip.Chcounter = Chcounter;
    }

    public static void setAccounter(int Accounter) {
        Trip.Accounter = Accounter;
    }

    public static void setLccounter(int Lccounter) {
        Trip.Lccounter = Lccounter;
    }

    public static void setHccounter(int Hccounter) {
        Trip.Hccounter = Hccounter;
    }

   

    public static int getChcounter() {
        return Chcounter;
    }

   

    public static int getLccounter() {
        return Lccounter;
    }

    

    public static int getHccounter() {
        return Hccounter;
    }

 
    

    @Override
    public String toString() {
        return "Trip{" + "origin=" + origin + ", destination=" + destination + ",  Tr=" + Tr + ", Ticketid=" + Tripid + '}';
    }

    void ObjectWrite(String origin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}

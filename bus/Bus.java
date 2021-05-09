/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import java.util.*;

public class Bus {

    private String id;

    Driver d;
 
   

    Trip root;
    List<Bus> listbus = new ArrayList<Bus>(); //added
    private String runningTimes;

    Scanner input = new Scanner(System.in);

    public Bus() {
    

    }

//String D_id, double salary, double workingHrs, double rating
    public Bus(String id, String D_id, double salary, double workingHrs, double rating, String origin, String destination, String tripStart, String tripEnd, String Tripid, String runningTimes) {

        this.id = id;

        this.d = new Driver(D_id, salary, workingHrs);

        this.root = new Trip(origin, destination, tripStart, tripEnd);

        this.runningTimes = runningTimes;

        listbus.add(this);
        System.out.println(listbus);

    }

    public int getKilometers() {

        return root.getKilometers();

    }

    public void setKilometers(int kilometers) {

        root.setKilometers(kilometers);

    }

    public Bus(String id, String D_id, String origin, String destination, String runningTimes, int kilometers, double workinghours, double salary) {

        this.id = id;

        this.d = new Driver(D_id, workinghours, salary);

        this.root = new Trip(origin, destination, kilometers);

        this.runningTimes = runningTimes;

        listbus.add(this);

    }


    public void setOrigin(String Origin) {

        root.setOrigin(Origin);

    }

    public String getOrigin() { // added
        return root.getOrigin();
    }

    public String getDestination() {
        return root.getDestination();
    }

    public void setDestination(String Destination) {

        root.setDestination(Destination);

    }

    public void setD_id(String D_id) {

        d.setD_id(D_id);

    }

    public void setId(String id) {

        this.id = id;

    }

    public String getId() {

        return id;

    }

    public String getRunningTimes() {

        return runningTimes;

    }

    public void setRunningTimes(String runningTimes) {

        this.runningTimes = runningTimes;

    }

    public String searchBus(String n, String m) {

        String y = "";
        for (int i = 0; i < listbus.size(); i++) {

            if (((listbus.get(i).getOrigin()).equals(n)) && ((listbus.get(i).getDestination()).equals(m))) {

                System.out.println("Found");
                y = listbus.get(i).getId();

                System.out.println(listbus.get(i).toString());

                break;

            } else {

                System.out.println("Not Found");
                y = "Not Found";
                break;

            }

        }
        return y;
    }

    @Override

    public String toString() {

        return "Bus{" + "id=" + id + ", d=" + d + ", root=" + root + ", runningTimes=" + runningTimes + ", input=" + input + '}';

    }

}

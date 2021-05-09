package bus;

import java.util.*;

public class Driver extends Person {

    private String D_id;
    private double salary;
    private double workingHrs;
    private int ratings;
    Account Driv;

    public Driver() {
    }

    public Driver(String D_id) {
       
        this.D_id = D_id;
    }

    public Driver(int cardnumber,int phone) {
        super(cardnumber,phone);
    }



    public Driver(String D_id, double salary, double workingHrs, int ratings, int age,String username, String password, String address, String email) {
        
        this.D_id = D_id;
        this.salary = salary;
        this.workingHrs = workingHrs;
        this.ratings = ratings;
        
       
    }
   public Driver(String username,String password,String address,String email){
      
        this.Driv = new Account(username, password, address, email);
       
   }

 

    public double getSalary() {

        return salary;

    }

    public void setSalary(double salary) {

        this.salary = salary;

    }

    public double getWorkingHrs() {

        return workingHrs;

    }

    public void setD_id(String D_id) {

        this.D_id = D_id;

    }

    public String getD_id() {

        return D_id;

    }

    public void setWorkingHrs(double workingHrs) {

        this.workingHrs = workingHrs;

    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    public Driver(String D_id, double salary, double workingHrs) {
        this.D_id = D_id;
        this.salary = salary;
        this.workingHrs = workingHrs;
    }

    @Override
    public String toString() {
        return "Driver{" + "D_id=" + D_id + ", salary=" + salary + ", workingHrs=" + workingHrs + ", ratings=" + ratings + ", Driv=" + Driv + '}';
    }

  

}

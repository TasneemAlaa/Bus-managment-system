package bus;

import java.util.*;

/**
 *
 *
 *
 * @author admin
 *
 */
public class Account {

    private String username;

    private String password;

    private String address;

    private String email;

    List<Passenger> list2 = new ArrayList<Passenger>();

    List<Driver> list3 = new ArrayList<Driver>();

    Scanner input = new Scanner(System.in);

    public Account() {

        username = " ";

        password = " ";

        address = " ";

        email = " ";

    }

    public Account(String username, String password, String address, String email) {

        this.username = username;

        this.password = password;

        this.address = address;

        this.email = email;

    }

    public String getUsername() {

        return username;

    }

    public void setUsername(String username) {

        this.username = username;

    }

    public String getPassword() {

        return password;

    }

    public void setPassword(String password) {

        this.password = password;

    }

    public String getAddress() {

        return address;

    }

    public void setAddress(String address) {

        this.address = address;

    }

    public String getEmail() {

        return email;

    }

    public void setEmail(String email) {

        this.email = email;

    }

      public boolean createAccountp(String un, String P, String e, String ad) {
        
           boolean x= false;
           
        do {
            if (un.endsWith("p") == true) {
                username = un;
                x=true;
            }
            
            else {
                x=false;
                break;
            }

        } while (un.endsWith("p") == false);

        if (x==true){
            password = P;
            email = e;
            address = ad;

        Passenger a = new Passenger(username, password, address, email);

        list2.add(a);
        }
        return x;

    }

    public boolean createAccountd(String un, String P, String e, String ad) {

         boolean x= false;
     
         do {
            if (un.endsWith("d") == true) {

                username = un;
                x=true;

            } else {

                x=false;
                break;

            }

        } while (un.endsWith("d") == false);

       if (x==true){
            password = P;
            email = e;
            address = ad;

        Driver a = new Driver(username, password, address, email);

        list3.add(a);
       }
       return x;
    }


    @Override

    public String toString() {

        return "Account{" + "username=" + username + ", password=" + password + ", address=" + address + ", email=" + email + ", input=" + input + '}';

    }

}

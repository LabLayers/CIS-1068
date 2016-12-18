/**
 * Main
 * @author Victor Lourng
 * @version	2016
 */
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    // User
    User Nick = new User("Nick Smith","nick@example.com","nsmith","P@$$w0rd");
    System.out.println(Nick.toString());
    System.out.println(Nick.GetJoinDate()); // today's date
    System.out.println(Nick.ValidateCredentials("nsmith","password1")); // false
    System.out.println(Nick.ValidateCredentials("nsmith","P@$$w0rd")); // true
    System.out.println(Nick.UpdatePassword("nsmith","P@$$w0rd","password1")); // true
    System.out.println(Nick.ValidateCredentials("nsmith","P@$$w0rd")); // false
    System.out.println(Nick.ValidateCredentials("nsmith","password1")); // true
    System.out.println(Nick.UpdateEmail("nsmith","password1","nick@gmail.com")); // true
    Nick.ToggleHandicapped();
    System.out.println(Nick.toString());
    System.out.println(Nick.isDriver()); // false
    Nick.HireDriver();
    System.out.println(Nick.isDriver()); // true
    Nick.FireDriver();
    System.out.println(Nick.isDriver()); // false
    User Kate = new User("Kate Smith","kate@example.com","ksmith","pwd1234");
    System.out.println(Kate.toString());
    System.out.println(Nick.equals(Kate)); // false

    // Address
    Address NickHome = new Address("Nick's Home", "1234 Market Street", "Unit 701", "Philadelphia", "PA", "19107", "USA");
    Nick.SetAddress("home",NickHome); // memory reference
    System.out.println(Nick.home.toString());
    System.out.println(NickHome.toString());
    Nick.home.SetNickName("Nick's Mansion");
    System.out.println(NickHome.toString());
    Address NickSchool = new Address("Temple", "1800 N Broad Street", "Philadelphia", "PA", "19132", "USA");
    Nick.SetAddress("school",NickSchool); // memory reference
    System.out.println(Nick.school.toString());
    System.out.println(Nick.school.equals(Nick.home)); // false

    // Car
    Car NickMustang = new Car(Nick, "Ford", "Mustang", 2016, "Red", "CAR1234");
    System.out.println(NickMustang.toString());
    System.out.println(NickMustang.GetPlate()); // CAR1234
    System.out.println(NickMustang.GetOwner()); // Nick Smith
    NickMustang.SetOwner(Kate);
    System.out.println(NickMustang.GetOwner()); // Kate Smith

  }
}
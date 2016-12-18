/**
 * User
 * @author Victor Lourng
 * @version	2016
 */
import java.util.Date;
import java.text.SimpleDateFormat;
import java.math.BigDecimal;

public class User {
  private String fullName;
  private String username;
  private String email;
  public Address home;
  public Address school;
  public Address work;
  private boolean isDriver = false;
  private boolean handicapped = false;
  private Date joined = new Date();
  // private CreditCard[] payment = new CreditCard[1];
  private String password;
  
  public String toString() {
    return GetUserData();
  }
  public boolean ValidateCredentials(String username, String password) {
    return (this.username == username) && (this.password == password);
  }
  public boolean UpdatePassword(String username, String oldPassword, String newPassword) {
    if ((this.username == username) && (this.password == oldPassword)) {
      this.password = newPassword;
      return true;
    } else {
      return false;
    }
  }
  public boolean UpdateEmail(String username, String password, String newEmail) {
    if ((this.username == username) && (this.password == password)) {
      this.email = newEmail;
      return true;
    } else {
      return false;
    }
  }
  public void ToggleHandicapped() {
    if (this.handicapped == false) {
      this.handicapped = true; 
    } else {
      this.handicapped = false;
    }
  }
  public void SetAddress(String type, Address address) {
    if (type == "work") {
      this.work = address;
    }
    else if (type == "school") {
      this.school = address;
    }
    else {
      this.home = address;
    }
  }
  public String GetJoinDate() {
    SimpleDateFormat d8 = new SimpleDateFormat("MM/dd/yyyy");
    String joinDate = d8.format(joined);
    return joinDate;
  }
  public String GetUserData() {
    return new String("Full Name: "+this.fullName+"\nUsername: "+this.username+"\nEmail: "+this.email+"\nMember Since: "+GetJoinDate()+"\nHandicapped: "+this.handicapped);
  }
  public String GetName() {
    return fullName;
  }
  public boolean isDriver() {
    return this.isDriver;
  }
  public void HireDriver() {
    this.isDriver = true;
  }
  public void FireDriver() {
    this.isDriver = false;
  }
  public boolean equals(User that) {
    return this.fullName == that.fullName && this.email == that.email;
  }
  
  public User(String fullName, String email, String username, String password) {
    this.fullName = fullName;
    this.email = email;
    this.username = username;
    this.password = password;
  }
}
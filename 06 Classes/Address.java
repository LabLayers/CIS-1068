/**
 * Address
 * @author Victor Lourng
 * @version	2016
 */
import java.math.BigDecimal;

public class Address {
  private String nickname;
  private String street;
  private String unit;
  private String city;
  private String state;
  private String postal; // can have letters outside of USAs
  private String country = "USA";
  private BigDecimal x;
  private BigDecimal y;
  
  public String toString() {
    return new String(street+" "+unit+"\n"+city+", "+state+" "+postal+" "+country);
  }
  public String GetCoordinates() {
    return this.x+","+this.y;
  }
  public BigDecimal GetXCoordinates() {
    return this.x;
  }
  public BigDecimal GetYCoordinates() {
    return this.y;
  }
  public String GetNickName() {
    return this.nickname;
  }
  public void SetNickName(String nickname) {
    this.nickname = nickname;
  }
  public boolean equals(Address that) {
    return this.street == that.street && 
      this.unit == that.unit && 
      this.city == that.city && 
      this.state == that.state && 
      this.postal == that.postal && 
      this.country == that.country;
  }
  
  public Address(String nickname, String street, String unit, String city, String state, String postal, String country) {
    this.nickname = nickname;
    this.street = street;
    this.unit = unit;
    this.city = city;
    this.state = state;
    this.postal = postal;
    this.country = country;
    // this.x = SomeExternalGeocoderAPI.ToXCoordinates(street+" "+city+" "+state+" "+postal+" "+country);
    // this.y = SomeExternalGeocoderAPI.ToYCoordinates(street+" "+city+" "+state+" "+postal+" "+country);
  }
  public Address(String nickname, String street, String city, String state, String postal, String country) {
    this.nickname = nickname;
    this.street = street;
    this.unit = "";
    this.city = city;
    this.state = state;
    this.postal = postal;
    this.country = country;
    // this.x = SomeExternalGeocoderAPI.ToXCoordinates(street+" "+city+" "+state+" "+postal+" "+country);
    // this.y = SomeExternalGeocoderAPI.ToYCoordinates(street+" "+city+" "+state+" "+postal+" "+country);
  }
}
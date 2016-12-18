import java.util.Random; 
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

public class PasswordGrid {
  
  private int pwdlength;
  private int pwdheight;
  private int pwdsalt = 0;
  int [][] intgrid;
  char [][] chargrid;
  
  PasswordGrid(int pl, int ph, int ps) {
    this.pwdlength = pl;
    this.pwdheight = ph;
    this.pwdsalt = ps;
    generateGrid();
  }
  
  PasswordGrid() {
    this.pwdlength = (int)(Math.random()*91)+10;
    this.pwdheight = (int)(Math.random()*17)+8;
    this.pwdsalt = (int)(Math.random()*21)+0;
    generateGrid();
  }
  
  public void generateGrid() {
    intgrid = new int[pwdheight][pwdlength];
    chargrid = new char[pwdheight][pwdlength];
    for(int i = 0; i< intgrid.length; i++){
      for (int j = 0; j < intgrid[i].length; j++){
        intgrid[i][j] = (int)(Math.random() * 94) + 14 + pwdsalt;
        chargrid[i][j] = (char)intgrid[i][j];
      }
    }
  }
  
  public void writeFile() throws FileNotFoundException {
    String fileName = "output.txt";
    PrintWriter output = new PrintWriter(fileName);
    try {
      output = new PrintWriter(fileName); }
    catch(FileNotFoundException e) {
      System.out.println("Error opening the file " + fileName); }
    output.print(toString());
    output.close();
  }

  public String toString() {
    String o = "";
    for(int i = 0; i< chargrid.length; i++){
      for (int j = 0; j < chargrid[i].length; j++){
        o += chargrid[i][j];
      }
      o += "\n";
    }
    return o;
  }

}
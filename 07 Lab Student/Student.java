/**
 * Student
 * @author Victor Lourng
 * @version	2016
 */
import java.util.Scanner;
import java.util.Calendar;

public class Student {
  // Vars
  private String Name;
  private String Major;
  private int Year;
  private int Expected_Grad_Year;
  private int[] Major_Courses = new int[5];
  private int[] Grades = new int[5];

  // Required methods
  public void setAllGrades() {
    Scanner kbd = new Scanner(System.in);
    for (int i = 0; i < Major_Courses.length; i++) {
      System.out.println("Enter grade for course "+Major_Courses[i]+":");
      Grades [i] = kbd.nextInt();
    }
    System.out.println("Your grades have been entered!");
  }
  public double getAverage() {
    double sum = 0.0;
    for (int x : Grades) {
      sum = sum + x;
    }
    return sum / Grades.length;
  }
  public int switchCourse(int oldCourse, int newCourse) {
    for (int i = 0; i < Major_Courses.length; i++) {
      if (Major_Courses[i] == oldCourse) {
        Major_Courses[i] = newCourse;
        return 1;
      }
    }
    return -1;
  }
  public String toString() {
    return new String("Student "+this.Name+" is majoring in "+this.Major+" and has an average grade of "+getAverage());
  }
  
  // Setters & getters
  public void setName(String n) {
    this.Name = n;
  }
  public String getName() {
    return this.Name;
  }
  public void setMajor(String n) {
    this.Major = n;
    if (Major.equals("Computer Science")) {
      int[] y = {1068,1166,2107,2168,2166};
      setMajor_Courses(y);
      // this.Major_Courses[0] = 1068;
      // this.Major_Courses[1] = 1166;
      // this.Major_Courses[2] = 2107;
      // this.Major_Courses[3] = 2168;
      // this.Major_Courses[4] = 2166;
    } else {
      int[] z = {1000,1500,2000,2500,3000};
      setMajor_Courses(z);
      // this.Major_Courses[0] = 1000;
      // this.Major_Courses[1] = 1500;
      // this.Major_Courses[2] = 2000;
      // this.Major_Courses[3] = 2500;
      // this.Major_Courses[4] = 3000;
    }
  }
  public String getMajor() {
    return this.Major;
  }
  public void setYear(int i) {
    this.Year = i;
  }
  public int getYear() {
    return this.Year;
  }
  public void setExpected_Grad_Year(int i) {
    this.Expected_Grad_Year = i;
  }
  public int getExpected_Grad_Year() {
    int Current_Year = Calendar.getInstance().get(Calendar.YEAR);
    setYear(Expected_Grad_Year - Current_Year);
    return this.Expected_Grad_Year;
  }
  public void setMajor_Course(int index, int value) {
    this.Major_Courses[index] = value;
  }
  public int getMajor_Course(int index) {
    return this.Major_Courses[index];
  }
  public void setGrade(int index, int value) {
    this.Grades[index] = value;
  }
  public int getGrade(int index) {
    return this.Grades[index];
  }
  public void setAllMajor_Courses(int[] j) {
    this.Major_Courses = j;
  }
  public int[] getAllMajor_Courses() {
    return this.Major_Courses;
  }
  public void setAllGrades(int[] j) {
    this.Grades = j;
  }
  public int[] getAllGrades() {
    return this.Grades;
  }

  
  // Constructor
  public Student(String Name, String Major, int Expected_Grad_Year) {
    setName(Name);
    setMajor(Major);
    setExpected_Grad_Year(Expected_Grad_Year);
  }
  
}
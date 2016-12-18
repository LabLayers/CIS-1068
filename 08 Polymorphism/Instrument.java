/**
 * Instrument
 * @author Victor Lourng
 * @version	2016
 */

public class Instrument {
  
  private String Owner;
  public String Family;
  private int NoteRange;
  
  public Instrument() {
    Owner = "";
    Family = "";
    NoteRange = 0;
  }
  public Instrument(String f, int nr) {
    Family = f;
    NoteRange = nr;
  }
  public Instrument(String o, String f, int nr) {
    Owner = o;
    Family = f;
    NoteRange = nr;
  }
  
  public void setOwner(String o) {
    this.Owner = o;
  }
  public String getOwner() {
    return this.Owner;
  }
  public void setFamily(String f) {
    this.Family = f;
  }
  public String getFamily() {
    return this.Family;
  }
  public void setNoteRange(int nr) {
    this.NoteRange = nr;
  }
  public int getNoteRange() {
    return this.NoteRange;
  }
  
  public String toString() {
    return "Instrument owned by " + Owner + " with a family of " + Family + " has " + NoteRange + " NoteRange. ";
  }
  public boolean equals(Instrument other) {
    return (this.Owner==other.Owner && this.Family==other.Family && this.NoteRange==other.NoteRange);
  }
  
}
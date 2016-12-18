/**
 * Guitar
 * @author Victor Lourng
 * @version	2016
 */

public class Guitar extends Instrument implements Playable {
  
  private static int NoteRange = 126;
  private static String Family = "String";
  private static int Strings = 6;
  private static int Frets = 21;

  public Guitar() {
    super(Family, NoteRange);
  }
  public Guitar(String Owner) {
    super(Owner, Family, NoteRange);
  }
  public Guitar(String Owner, int Strings, int Frets) {
    super(Owner, Family, Strings*Frets);
    this.NoteRange = Strings*Frets;
    this.Strings = Strings;
    this.Frets = Frets;
  }
  
  
  public void setStrings(int s) {
    this.Strings = s;
  }
  public int getStrings() {
    return this.Strings;
  }  
  public void setFrets(int f) {
    this.Frets = f;
  }
  public int getFrets() {
    return this.Frets;
  }
  
  public String toString() {
    return (super.toString() + "\nIt's a Guitar! (In this case, NoteRange = # of Strings*Frets.) It has " + Strings + " Strings and " + Frets + " Frets. ");
  }
  public boolean equals(Guitar other) {
    return (super.equals((Instrument)other) &&this.Strings==other.Strings&&this.Frets==other.Frets);
  }
  
  public void downloadSong(String WebSource){};
  public void uploadSong(String SongTitle, String WebDestination){};
  public void loadSong(String SongTitle){};
  public void recordSong(String SongTitle){};
  public void saveSong(String SongTitle){};
  public void startPlaying(){};
  public void stopPlaying(){};
}
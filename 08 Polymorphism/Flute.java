/**
 * Flute
 * @author Victor Lourng
 * @version	2016
 */

public class Flute extends Instrument implements Playable {
  
  private static int NoteRange = 6;
  private static String Family = "Woodwind";
  private static int Holes = 6;

  public Flute() {
    super(Family, NoteRange);
  }
  public Flute(String Owner) {
    super(Owner, Family, NoteRange);
  }
  public Flute(String Owner, int Holes) {
    super(Owner, Family, Holes);
    this.Holes = Holes;
    this.NoteRange = Holes;
  }
  
  public void setHoles(int h) {
    this.Holes = h;
  }
  public int getHoles() {
    return this.Holes;
  }
  
  public String toString() {
    return (super.toString() + "\nIt's a Flute! (In this case, NoteRange = # of Holes.) It has " + Holes + " Holes. ");
  }
  public boolean equals(Flute other) {
    return (super.equals((Instrument)other) &&this.Holes==other.Holes);
  }
  
  public void downloadSong(String WebSource){};
  public void uploadSong(String SongTitle, String WebDestination){};
  public void loadSong(String SongTitle){};
  public void recordSong(String SongTitle){};
  public void saveSong(String SongTitle){};
  public void startPlaying(){};
  public void stopPlaying(){};
}
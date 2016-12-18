/**
 * Piano
 * @author Victor Lourng
 * @version	2016
 */

public class Piano extends Instrument implements Playable {
  
  private static int NoteRange = 88;
  private static String Family = "Keyboard";
  private double LowestHz = 4186.01;
  private double HighestHz = 27.5;
  
  public Piano() {
    super(Family, NoteRange);
  }
  public Piano(String Owner) {
    super(Owner, Family, NoteRange);
  }
  public Piano(String Owner, double LowestHz, double HighestHz) {
    super(Owner, Family, NoteRange);
    this.LowestHz = LowestHz;
    this.HighestHz = HighestHz;
  }
  
  public void setLowestHz(double hz) {
    this.LowestHz = hz;
  }
  public double getLowestHz() {
    return this.LowestHz;
  }
  public void setHighestHz(double hz) {
    this.HighestHz = hz;
  }
  public double getHighestHz() {
    return this.HighestHz;
  }

  public String toString() {
    return (super.toString() + "\nIt's a Piano! (In this case, NoteRange = # of keys.) LowestHz is " + LowestHz + ". "+ "HighestHz is " + HighestHz + ". ");
  }
  public boolean equals(Piano other) {
    return (super.equals((Instrument)other) &&this.LowestHz==other.LowestHz&&this.HighestHz==other.HighestHz);
  }
  
  public void downloadSong(String WebSource){};
  public void uploadSong(String SongTitle, String WebDestination){};
  public void loadSong(String SongTitle){};
  public void recordSong(String SongTitle){};
  public void saveSong(String SongTitle){};
  public void startPlaying(){};
  public void stopPlaying(){};
}
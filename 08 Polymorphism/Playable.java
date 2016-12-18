/**
 * Playable
 * @author Victor Lourng
 * @version	2016
 */

public interface Playable {
  
  public void downloadSong(String WebSource);
  public void uploadSong(String SongTitle, String WebDestination);
  public void loadSong(String SongTitle);
  public void recordSong(String SongTitle);
  public void saveSong(String SongTitle);
  public void startPlaying();
  public void stopPlaying();
  
}
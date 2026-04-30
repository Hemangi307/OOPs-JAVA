import java.util.LinkedList;
public class Practical48 {
    public static void main(String[] args) {
        System.out.println("Name: Hemangi Chavda");
        System.out.println("Enrollment Number: 240390107011\n");
        // Create LinkedList
        LinkedList<String> playlist = new LinkedList<String>();
        // Add songs
        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");
        playlist.add("Song D");
        playlist.add("Song E");
        // Display full playlist
        System.out.println("Full Playlist:");
        System.out.println(playlist);
        // Play first song
        String firstSong = playlist.removeFirst();
        System.out.println("\nPlaying First Song: " + firstSong);
        // Display updated playlist
        System.out.println("Playlist after playing first song:");
        System.out.println(playlist);
        // Skip last song
        String lastSong = playlist.removeLast();
        System.out.println("\nSkipping Last Song: " + lastSong);
        // Display updated playlist
        System.out.println("Playlist after skipping last song:");
        System.out.println(playlist);
    }
}

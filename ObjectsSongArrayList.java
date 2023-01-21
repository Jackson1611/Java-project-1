import java.util.ArrayList;



public class ObjectsSongArrayList {
	public static void main(String[] args) {
		ArrayList<Song> songList = new ArrayList<Song>();
		songList.add(new Song("Easy on Me", "Adele", 2021));
		songList.add(new Song("Shivers", "Ed Sheeran", 2021));
		songList.add(new Song("Holy Ghost Fire", "Larkin Poe", 2020));
		System.out.println("=== List of songs ===");
		for (int i = 0; i < songList.size(); i++) {
			 System.out.println(songList.get(i));
			}
		
	}
}
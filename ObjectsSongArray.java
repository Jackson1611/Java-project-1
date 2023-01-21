
class Song {
	String name;
	String artist;
	int year;

	Song(String name, String artist, int year) {
		this.name = name;
		this.artist = artist;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public String getArtist() {
		return artist;
	}

	public int getYear() {
		return year;
	}

	public String toString() {
		return artist + ": " + name + " (" + year + ")";
	}
}

public class ObjectsSongArray {
	public static void main(String[] args) {
		Song[] songArray = {new Song("Easy on Me", "Adele", 2021),
							new Song("Shivers", "Ed Sheeran", 2021),
							new Song("Holy Ghost Fire", "Larkin Poe", 2020) };
		System.out.println("=== List of songs ===");
		for (Song songObject : songArray) {
			System.out.println(songObject);
		}

	}
}
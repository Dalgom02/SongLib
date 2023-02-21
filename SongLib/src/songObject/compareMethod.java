// Dhruv Dinesh
// Jaqueline Carreon

package songObject;
import java.util.Comparator;


public class compareMethod implements Comparator<Song> {

	 @Override
	    public int compare(Song s1, Song s2) {
	        int titleCompare = s1.getTitle().toLowerCase().compareTo(s2.getTitle().toLowerCase());
	        if (titleCompare == 0) {
	            int artistCompare = s1.getArtist().toLowerCase().compareTo(s2.getArtist().toLowerCase());
	            if (artistCompare == 0) {
	                // If both songs have the same title and artist, compare by album
	                return s1.getAlbum().toLowerCase().compareTo(s2.getAlbum().toLowerCase());
	            } else {
	                // If songs have the same title but different artist, compare by artist
	                return artistCompare;
	            }
	        }
	        // If songs have different titles, compare by title
	        return titleCompare;
	    }
	}

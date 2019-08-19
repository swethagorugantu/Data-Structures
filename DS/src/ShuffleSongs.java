import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ShuffleSongs {
	
	public static void main(String[] args) {

        List<String> songs = new ArrayList<String>();
        songs.add("Song1");
        songs.add("Song2");
        songs.add("Song3");
        songs.add("Song4");
        songs.add("Song5");
        /*playList.add("Song6");
        playList.add("Song7");
        playList.add("Song8");
        playList.add("Song9");
        playList.add("Song10");
        playList.add("Song11");
        playList.add("Song12");
        playList.add("Song13");
        playList.add("Song14");
        playList.add("Song15");
        playList.add("Song16");
        playList.add("Song17");
        playList.add("Song18");
        playList.add("Song19");
        playList.add("Song20");
        playList.add("Song21");*/

        // shuffle the playlist
        for (int i=1; i<songs.size(); i++) {
            Random rand = new Random();
            int temp = rand.nextInt(songs.size()-i)+i;
            System.out.println(temp);
                        Collections.swap(songs, i, temp);
        }

        // print the shuffled playlist
        for(int j = 0; j < songs.size(); j++) {
            System.out.println(songs.get(j));
        }

	}
}

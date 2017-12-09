package exam;

import java.util.Arrays;

public class B2 {
    public int nMegaStars(Song[] songs) {
        int count = 0;
        for (Song s : songs) {
            if (s.getArtist().getNTopTenHits() >= 10)
                count++;
        }
        return count;

    }
}

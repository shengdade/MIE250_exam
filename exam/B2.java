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

    public int nMegaStars2(Song[] songs) {
        return (int) Arrays.stream(songs).filter(s -> s.getArtist().getNTopTenHits() >= 10).count();
    }
}

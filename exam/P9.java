package exam;


public class P9 {
    public static void main(String[] args) {

        Artist A1 = new Artist("Marry Banilow", "1943-06-17", "Barry Manilow", 11);
        Artist A2 = new Artist("Mick Jagger", "1943-07-26", "Around and Around", 23);
        Artist A3 = new Artist("Marilyn Manson", "1969-01-05", "Portait of an American Family", 8);
        Song[] mySongs = new Song[4];
        for (int i = 0; i < 4; i++) mySongs[i] = new Song();
        mySongs[0].init(A1, "Copacabana", 1978);
        mySongs[1].init(A2, "Satisfaction", 1965);
        mySongs[2].init(A3, "Rock is dead", 1999);
        mySongs[0].setArtistName("Barry Manilow");
        for (Song S : mySongs) {
            char c = S.getArtistName().charAt(0);
            System.out.print(c);
        }

    }
}

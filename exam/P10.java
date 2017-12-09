package exam;


public class P10 {
    public static void main(String[] args) {

        Song[] mySongs = new Song[2];
        for (int i = 0; i < 2; i++) mySongs[i] = new Song();
        Artist A = new Artist("ABC", "1111-22-33", "UAIOE", 2);
        mySongs[0].init(A, "Nihil", 1995);
        A.init("XYZ", "4444-55-66", "MDFMK", 0);
        mySongs[1].init(A, "Now", 2000);
        mySongs[0].setArtistName("AHA");
        for (int i = 0; i < 2; i++) System.out.print(mySongs[i].getArtistName());

    }
}

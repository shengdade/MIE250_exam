package exam;


public class P8 {
    public static void main(String[] args) {

        Artist A = new Artist("X", "1957-01-23", "Z", 0);
        Song S = new Song(A, "Y", 1979);
        S.print();

    }
}

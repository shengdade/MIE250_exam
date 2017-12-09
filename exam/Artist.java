package exam;

import java.io.*;

public class Artist extends Person {
    private String firstAlbum;
    private int nTopTenHits;

    public Artist() {
        super();
        this.init("n/a", 0);
    }

    public Artist(String s1, String s2, String s3, int n) {
        this.init(s1, s2, s3, n);
    }

    public void init(String s, int n) {
        this.setFirstAlbum(s);
        this.setNTopTenHits(n);
    }

    public void init(String s1, String s2, String s3, int n) {
        super.init(s1, s2);
        this.setFirstAlbum(s3);
        this.setNTopTenHits(n);
    }

    public String getFirstAlbum() {
        return this.firstAlbum;
    }

    public int getNTopTenHits() {
        return this.nTopTenHits;
    }

    public void setFirstAlbum(String s) {
        this.firstAlbum = s;
    }

    public void setNTopTenHits(int n) {
        this.nTopTenHits = n;
    }

    @Override
    public void userEdit() throws IOException, NumberFormatException {
        BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
        super.userEdit();
        System.out.print("First album: ");
        this.setName(cin.readLine());
        System.out.print("# top 10 hits: ");
        this.setNTopTenHits(Integer.parseInt(cin.readLine()));
    }

    @Override
    public void print() {
        System.out.format("%s: %s (%d)", this.getName(), this.firstAlbum, this.nTopTenHits);
    }
}

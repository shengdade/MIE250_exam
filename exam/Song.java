package exam;

import java.io.*;

public class Song {
    private Artist artist;
    private String title;
    private int year;
    private boolean oldie;

    public Song() {
        this.init(new Artist(), "n/a", -1);
    }

    public Song(Artist A, String s, int x) {
        this.init(A, s, x);
    }

    public void init(Artist A, String title, int year) {
        this.setArtist(A);
        this.setTitle(title);
        this.setYear(year);
    }

    public Artist getArtist() {
        return this.artist;
    }

    public String getArtistName() {
        return this.artist.getName();
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

    public boolean isOldie() {
        return this.oldie;
    }

    public void setArtist(Artist A) {
        this.artist = A;
    }

    public void setArtistName(String s) {
        this.artist.setName(s);
    }

    public void setTitle(String s) {
        this.title = s;
    }

    public void setYear(int x) {
        this.year = x;
        if (this.year > 0 && this.year <= 1980) this.setOldie(true);
        else this.setOldie(false);
    }

    private void setOldie(boolean b) {
        this.oldie = b;
    }

    public void userEdit() throws IOException, NumberFormatException {
        BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
        this.artist.userEdit();
        System.out.print("Song title: ");
        this.setTitle(cin.readLine());
        System.out.print("Song year: ");
        this.setYear(Integer.parseInt(cin.readLine()));
    }

    public void print() {
        String s = this.isOldie() ? " (oldie)" : "";
        System.out.format("%s by %s (%d)%s", title, artist.getName(), year, s);
    }

    public boolean isInDecade(int decade) {
        return (this.year >= decade && this.year < decade + 10);
    }
}


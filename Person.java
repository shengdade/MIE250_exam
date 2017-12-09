package exam;

import java.io.*;
import java.util.Calendar;

public class Person {
    private String name;
    private String birthdate; // stored as yyyy-mm-dd

    public Person() {
        this.init("n/a", "1900-01-01");
    }

    public Person(String s1, String s2) {
        this.init(s1, s2);
    }

    public void init(String s1, String s2) {
        this.setName(s1);
        this.setBirthdate(s2);
    }

    public String getName() {
        return this.name;
    }

    public String getBirthdate() {
        return this.birthdate;
    }

    public void setName(String s) {
        this.name = s;
    }

    public void setBirthdate(String s) {
        this.birthdate = s;
    }

    public int age() {
        Calendar now = Calendar.getInstance();
        int curYear = now.get(Calendar.YEAR);
        int curMonth = now.get(Calendar.MONTH) + 1;
        int curDay = now.get(Calendar.DAY_OF_MONTH); // current day
        String[] temp = this.birthdate.split("-");
        int myYear = Integer.parseInt(temp[0]);
        int myMonth = Integer.parseInt(temp[1]);
        int myDay = Integer.parseInt(temp[2]);
        int age = curYear - myYear;
        // if the birthday hasn’t happened yet, the age is one year younger
        if (curMonth < myMonth || (curMonth == myMonth && curDay < myDay))
            age--;
        return age;
    }

    public void userEdit() throws IOException {
        BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Person name: ");
        this.setName(cin.readLine());
        System.out.print("Birthdate (yyyy-mm-dd): ");
        this.setBirthdate(cin.readLine());
    }

    public void print() {
        System.out.format("%s (%d)", this.name, this.age());
    }

    public boolean isTeen() {
        int a = this.age();
        if (a >= 13 && a <= 19) {
            return true;
        } else {
            return false;
        }
    }
}
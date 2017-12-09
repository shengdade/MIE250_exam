package exam;

import java.util.ArrayList;

public class P1 {
    public static void main(String[] args) {

        ArrayList<String[]> S = new ArrayList<String[]>();
        String[] t = {"You", "Are", "My"};
        S.add(t);
        t = new String[5];
        t[0] = "Fire";
        t[1] = "My";
        t[2] = "One";
        t[3] = "Desire";
        S.add(t);
        t = new String[2];
        t[0] = "That";
        t[1] = "Way";
        S.add(t);
        int count = 0;
        S.remove(2);
        for (int i = 0; i < S.size(); i++) {
            for (int j = count; j < S.get(i).length; j += 2) System.out.print(S.get(i)[j]);
            count = 1 - count;
        }

    }
}

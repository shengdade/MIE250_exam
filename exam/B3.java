package exam;

import java.io.IOException;
import java.util.ArrayList;

public class B3 {
    public static void main(String[] args) throws IOException {

        ArrayList<TeenyBopper> T = new ArrayList<TeenyBopper>();
        for (int i = 0; i < 100; i++) {
            TeenyBopper temp = new TeenyBopper();
            T.add(temp);
            T.get(i).userEdit();
        }
        // list all legal guardians
        for (TeenyBopper temp : T) {
            if (temp.isValid()) // check if teeny bopper is actually a teenager
                System.out.println(temp.getLegalGuardian());
        }

    }
}

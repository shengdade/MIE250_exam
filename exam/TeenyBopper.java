package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeenyBopper extends Artist {
    private String guardian;

    public TeenyBopper() {
        super();
        this.init("n/a");
    }

    public void init(String guardian) {
        this.setLegalGuardian(guardian);
    }

    public String getLegalGuardian() {
        return this.guardian;
    }

    public void setLegalGuardian(String guardian) {
        this.guardian = guardian;
    }

    @Override
    public void userEdit() throws IOException {
        BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
        super.userEdit();
        System.out.print("Legal Guardian: ");
        this.setLegalGuardian(cin.readLine());
    }

    public boolean isValid() {
        return this.isTeen();
    }
}

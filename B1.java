package exam;

public class B1 extends Person {
    public boolean isTeen() {
        int a = this.age();
        if (a >= 13 && a <= 19) {
            return true;
        } else {
            return false;
        }
    }
}

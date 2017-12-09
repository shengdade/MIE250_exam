package exam;

public class P2 {
    public static void main(String[] args) {

        int j = 5, k = -2;
        while (j > 0) {
            j += (k--);
        }
        System.out.print(j + "," + k);

    }
}

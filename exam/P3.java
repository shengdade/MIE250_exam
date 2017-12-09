package exam;

public class P3 {
    public static void main(String[] args) {

        int[] y = {1, 3, 5, 7};
        int[] x = {2, 4, 6, 8};
        x[2] = 17;
        y = x;
        y[2] = 10;
        x[1] = 9;
        for (int i = 0; i < x.length; i++)
            System.out.print(x[i] + ",");

    }
}

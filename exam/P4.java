package exam;


public class P4 {
    public static void main(String[] args) {

        int fibs[] = {1, 1};
        int nFibNums = 4;
        System.out.format("%d %d", fibs[0], fibs[1]);
        for (int f = 0; f < nFibNums; f++) {
            int fib = fibs[0] + fibs[1];
            fibs[0] = fibs[1];
            fibs[1] = fib;
            System.out.format(" %d", fibs[1]);
        }

    }
}

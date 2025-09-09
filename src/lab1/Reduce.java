package lab1;

public class Reduce {

    public static void main(String[] args) {

        int start = 100;
        int steps = reducing(start);
        System.out.println("Steps it took to reach 0 from " + start + ":" + steps);

    }

    public static int reducing(int n) {

        int count = 0;

        while (n != 0) {

            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n -= 1;
            }
            count++;
        }
        return count;
    }

}

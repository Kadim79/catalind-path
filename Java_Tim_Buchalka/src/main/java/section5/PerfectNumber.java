package section5;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {

        int divisorSum = 0;

        if (number < 1)
            return false;
        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                divisorSum += i;
        }

        return number == divisorSum ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(PerfectNumber.isPerfectNumber(6));
        System.out.println(PerfectNumber.isPerfectNumber(28));
        System.out.println(PerfectNumber.isPerfectNumber(5));
        System.out.println(PerfectNumber.isPerfectNumber(-1));
    }
}

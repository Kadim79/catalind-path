package section5;

public class Greatest_Common_Divider {

    public static int getGreatestCommonDivisor(int a,int b){

        int gcd = 1;

        if(a<10 || b<10)
            return -1;

        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(49,14));
    }
}

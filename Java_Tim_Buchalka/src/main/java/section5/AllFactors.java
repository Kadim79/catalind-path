package section5;

public class AllFactors {

    public static void printFactors(int number) {

        if (number < 1)
            System.out.println("Invalid Value");

        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        AllFactors.printFactors(6);
        AllFactors.printFactors(32);
        AllFactors.printFactors(10);
        AllFactors.printFactors(-1);
    }

    
}

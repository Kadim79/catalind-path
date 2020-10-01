package section5;

public class NumberToWordsMyWay {

    static String[] array = new String[]{"Zero","Unu","Doi","Trei","Patru","Cinci","Sase","Sapte","Opt","Noua"};

    public static int getDigitCount(int number){
        return Integer.toString(number).length();
    }

    public static String reverseNumber(int number){
        String s =Integer.toString(number);
        String reversed = "";

        for (int i = s.length()-1; i >=0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }

    public static void numberToWords(int number) {

        String reversedNumber = reverseNumber(number);
        System.out.println(reversedNumber);

        for (int i = 0; i < reversedNumber.length(); i++) {

            int index = Integer.valueOf(Character.toString(reversedNumber.charAt(i)));
            System.out.print(array[index] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        numberToWords(20023);
        numberToWords(100);
        numberToWords(11023);
    }
}

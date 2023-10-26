import java.util.Random;

public class Homework5 {
    public static void main(String[] args) {
        int variable1 = 10;
        int[] numbers = {5, 9, 4, 2, 6};

        //exercitiul1
        int sumOfNumbers = sumOfArrayNumbers(numbers);
        System.out.println("Total sum from array is = " + sumOfNumbers);

        //exercitiul2
        int oddnumbers = oddNumbersFind(numbers);
        System.out.println("Odd numbers are = " + oddnumbers);

        //exercitiul3
        int biggerNumbers = biggerNumberFind(numbers, variable1);
        System.out.println("We have got " + biggerNumbers+ " bigger numbers then " + variable1);

        //exercitiul4
        int desiredAmount = 1000;
        int maxNumberOfDonations = 50;
        getDonations(desiredAmount, maxNumberOfDonations);

        //exercitiul5
        String myString = "Edward.merge.la.petrecere";
        stringArraySeparate(myString);

    }

    private static void getDonations(int desiredAmount, int maxNumberOfDonations) {
        Random random = new Random();
        int currentAmount = 0;
        int numberOfDonations = 0;

        while (currentAmount < desiredAmount && numberOfDonations < maxNumberOfDonations) {
            int donation = random.nextInt();
            currentAmount += donation;
            numberOfDonations++;

            System.out.println("Donațion " + numberOfDonations + ": " + donation + " ron. Current amount: " + currentAmount + " ron");

            if (currentAmount >= desiredAmount) {
                System.out.println("Desired amount " + desiredAmount + " ron has been reached!");
            }
        }

        if (numberOfDonations >= maxNumberOfDonations) {
            System.out.println("End");
        }

    }

    public static int sumOfArrayNumbers(int[] a) {
        int total = 0;

        for (int number : a) {
            total += number;
        }

        return total;
    }

    public static int oddNumbersFind(int[] oddNumbers1) {
        int oddNumber1 = 0;

        for (int number : oddNumbers1) {
            if (number % 2 != 0) {
                oddNumber1++;
            }
        }

        return oddNumber1;
    }
    public static int biggerNumberFind(int[] number1, int number2) {
        int biggernumber = 0;

        for (int numarX : number1) {
            if (number2 < numarX) {
                biggernumber++;
            }
        }
        return biggernumber;
    }
    public static void stringArraySeparate(String phrase) {
        String[] phrases = phrase.split("\\.");

        for (String a : phrases) {
            a = a.trim();
            System.out.println(a);
        }
    }
}

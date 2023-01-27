package NestedLoops;

import java.util.Scanner;

public class SumPrimeNonNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumPrimeNumbers = 0;
        int sumNonPrimeNumbers = 0;
        String input = scanner.nextLine();

        while (!input.equals("stop")) {
            int currentNumber = Integer.parseInt(input);

            if (currentNumber < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            int countNumber = 1;
            for (int i = 2; i <= currentNumber; i++) {
                if (currentNumber % i == 0) {
                    countNumber++;
                }


            }

            if (countNumber > 2) {
                sumNonPrimeNumbers += currentNumber;
            } else {
                sumPrimeNumbers += currentNumber;
            }

            input = scanner.nextLine();


        }

        System.out.printf("Sum of all prime numbers is: %d%n", sumPrimeNumbers);
        System.out.printf("Sum of all non prime numbers is: %d", sumNonPrimeNumbers);

    }
}

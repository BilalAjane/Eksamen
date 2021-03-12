package primenumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {

    boolean primeNumber = true;


    public int prime(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primeNumber = false;
                break;
            }
        }

        if (primeNumber) {
            System.out.println("Nummer " + num + " er et primitivt tal");
            System.out.println();
        } else {
            System.out.println("Nummer " + num + " er ikke et primitivt tal");
            System.out.println();
        }
        return num;
    }


    public List<Integer> factor(int num) {
        ArrayList<Integer> factorList = new ArrayList<>();

        System.out.println("Faktor numre for " + num + ": ");

    for (int i = 2; i <= num; i++) {
            while (num % i == 0 ) {
                factorList.add(i);
                num /= i;
            }
        }
        System.out.println(factorList);
        return factorList;

    }
}
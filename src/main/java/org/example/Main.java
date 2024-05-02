package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Bic2Dec(scanner.next());
    }

    public static int Bic2Dec(String number){
        int num = 1, sum = 0;
        for (int i = number.length() - 1; i >= 0; i--) {
            if (number.charAt(i) == '1')
                sum += num;
            num *= 2;
        }
       return sum;
    }
}
1.Write a program to print whether a number is even or odd, also take input from the user.
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        switch (num % 2) {
            case 0:
                System.out.println("Even Number");
                break;

            case 1:
            case -1:
                System.out.println("Odd Number");
                break;
        }

        sc.close();
    }
}
output:
Enter a number: 9
Odd Number

2.Take name as input and print a greeting message for that particular name.
import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Hello, " + name + "! Welcome.");

        sc.close();
    }
}
output:
Enter your name: manoj
Hello, manoj! Welcome.

3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal (P): ");
        double p = sc.nextDouble();

        System.out.print("Enter Time (T): ");
        double t = sc.nextDouble();

        System.out.print("Enter Rate (R): ");
        double r = sc.nextDouble();

        double si = (p * t * r) / 100;

        System.out.println("Simple Interest = " + si);

        sc.close();
    }
}
output:
Enter Principal (P): 5
Enter Time (T): 10
Enter Rate (R): 2
Simple Interest = 1.0

4.Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        if (op == '+') {
            System.out.println("Result = " + (num1 + num2));
        }

        if (op == '-') {
            System.out.println("Result = " + (num1 - num2));
        }

        if (op == '*') {
            System.out.println("Result = " + (num1 * num2));
        }

        if (op == '/') {
            if (num2 != 0) {
                System.out.println("Result = " + (num1 / num2));
            }

            if (num2 == 0) {
                System.out.println("Division by zero is not allowed.");
            }
        }

        sc.close();
    }
}
output :
Enter first number: 1
Enter second number: 2
Enter operator (+, -, *, /): 3

5.Take 2 numbers as input and print the largest number.
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("Largest number = " + num1);
        } else {
            System.out.println("Largest number = " + num2);
        }

        sc.close();
    }
}
output :
Enter first number: 2
Enter second number: 3
Largest number = 3
6. Input currency in rupees and output in USD.
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount in Rupees: ");
        double rupees = sc.nextDouble();

        double usd = rupees / 87.0;

        System.out.println("Amount in USD = " + usd);

        sc.close();
    }
}
output:
Enter amount in Rupees: 1
Amount in USD = 0.011494252873563218

7. import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }

        sc.close();
    }
}
output :
Enter the number of terms: 5
Fibonacci Series:
0 1 1 2 3 

8.To find out whether the given String is Palindrome or not.
import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}
output :
Enter a string: 1
Palindrome
9.To find Armstrong Number between two given number.
import java.util.Scanner;

public class ArmstrongRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");

        for (int num = start; num <= end; num++) {
            int temp = num;
            int sum = 0;
            int digits = String.valueOf(num).length();

            while (temp != 0) {
                int rem = temp % 10;
                sum += Math.pow(rem, digits);
                temp /= 10;
            }

            if (sum == num) {
                System.out.println(num);
            }
        }

        sc.close();
    }
}
output:
Enter starting number: 2
Enter ending number: 3
Armstrong numbers between 2 and 3 are:
2
3



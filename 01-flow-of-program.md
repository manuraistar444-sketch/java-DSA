Input a year and find whether it is a leap year or not.
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        boolean leap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);

        switch (String.valueOf(leap)) {
            case "true" -> System.out.println("Leap Year");
            case "false" -> System.out.println("Not a Leap Year");
        }

        sc.close();
    }
}
out put:
Enter year: 2000
Leap Year

2.Take two numbers and print the sum of both.
import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("Sum = " + sum);

        sc.close();
    }
}
output :
Enter first number: 5
Enter second number: 7
Sum = 12

3. Take a number as input and print the multiplication table for it.
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        sc.close();
    }
}
output :
Enter a number: 2
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20

4.Take 2 numbers as inputs and find their HCF and LCM.
import java.util.Scanner;

public class HCFLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int x = a;
        int y = b;

        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        int hcf = x;
        int lcm = (a * b) / hcf;

        System.out.println("HCF = " + hcf);
        System.out.println("LCM = " + lcm);

        sc.close();
    }
}
output:
Enter first number: 5
Enter second number: 10
HCF = 5
LCM = 10
5.Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
import java.util.Scanner;

public class SumUntilX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("Enter a number (or x to stop): ");
            String input = sc.next();

            switch (input) {
                case "x":
                case "X":
                    System.out.println("Sum = " + sum);
                    sc.close();
                    return;

                default:
                    sum += Integer.parseInt(input);
            }
        }
    }
}
output :
Enter a number (or x to stop): 6
Enter a number (or x to stop): 9
Enter a number (or x to stop): 3
Enter a number (or x to stop): x
Sum = 18

/*
Question : Write a program to add two complex numbers.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double real1,imaginary1,real2,imaginary2,sum,sum2;
        System.out.println("First enter the real number than imaginary number :");
        real1 = sc.nextDouble();
        imaginary1 = sc.nextDouble();
        System.out.println("Secondly, enter the real number and than imaginary number again :");
        real2 = sc.nextDouble();
        imaginary2 = sc.nextDouble();
        sum = real1 + real2;
        sum2 = imaginary1 + imaginary2;
        System.out.println("Printing the real number value : " + sum);
        System.out.println("Printing the imaginary value : " + sum2);

    }
}
/*
Case 1 (Simple Test Case):

Enter the real part and imaginary part of the first complex number
4
6
Enter the real part and imaginary part of the second complex number
-5
2
The first complex number is 4.0 + i(6.0)
The second complex number is -5.0 + i(2.0)
The sum of the two complex numbers is -1.0 + i(8.0)
 */
public class Program18{
    public static void main(String[] args) {

        // 1. Print from 1 to 10 numbers
        /*
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        */

        // 2. Print from 10 to 1 numbers
        /*
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        */

        // 3. Print from 1 to 10 even numbers
        /*
        for (int i = 2; i <= 10; i ++) {
        if(i % 2 == 0){
            System.out.print(i + " ");
            }
        }
        */

        // 4. Print from 10 to 1 odd numbers
        /*
        for (int i = 10; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        */

        // 5. Print sum of first 10 natural numbers
        /*
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
        */

        // 6. Print the Fibonacci series (first 10 terms)
        /*
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < 10; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        */

        // 7. Check if a number is palindrome or not
        /*
        int number = 121;
        int original = number;
        int reversed = 0;

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        if (original == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
        */

        // 8. Check if a string is palindrome or not
        /*
        String str = "madam";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        if (str.equals(reversed)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
        */

        // 9. Find the sum of the digits
        /*
        int num = 1234;
        int sumOfDigits = 0;
        int temp = num;

        while (temp > 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }

        System.out.println("Sum of digits of " + num + ": " + sumOfDigits);
        */

        // 10. Count the digits
        /*
        int n = 123456;
        int count = 0;
        int tempNum = n;

        while (tempNum != 0) {
            tempNum /= 10;
            count++;
        }

        System.out.println("Number of digits in " + n + ": " + count);
        */
    }
}
 

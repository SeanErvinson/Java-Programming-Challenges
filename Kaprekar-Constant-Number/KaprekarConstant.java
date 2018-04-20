
/**
 * KaprekarConstant
 */
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class KaprekarConstant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputNumber;
        char[] digits;

        System.out.print("Enter four digit number: ");
        try {
            inputNumber = scan.nextInt();
            if (checkLength(inputNumber))
                throw new Exception();

            Kaprekar(inputNumber);

        } catch (InputMismatchException e) {
            System.out.println("Not a number");
        } catch (Exception ex) {
            System.out.println("Number must have four digits");
        } finally {
            scan.close();
        }
    }

    public static void Kaprekar(int target) {
        int maximum = 0, minimum = 0, result = 0;
        Integer[] digits = new Integer[4];

        if (target == 6174)
            return;

        int i = 0;
        while (i < 4) {
            digits[i] = target % 10;
            target /= 10;
            i++;
        }

        Arrays.sort(digits);
        minimum = toInt(digits);

        Arrays.sort(digits, Collections.reverseOrder());
        maximum = toInt(digits);

        result = maximum - minimum;

        System.out.println(String.format("%d - %d = %d", maximum, minimum, result));
        Kaprekar(result);
    }

    public static boolean checkLength(int number) {
        if (String.valueOf(number).length() < 5 && String.valueOf(number).length() > 3)
            return false;
        return true;
    }

    public static int toInt(Integer[] digits) {
        int number = 0;
        for (int digit : digits) {
            number *= 10;
            number += digit;
        }
        return number;
    }
}
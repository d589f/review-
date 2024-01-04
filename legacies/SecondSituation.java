package legacies;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSituation extends MainLegac {

    public void GoSSit() {
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 чисел: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите число номер " + (i + 1) + ": ");
            int num = scanner.nextInt();
            array[i] = num;
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Минимальное число: " + max);
    }
}
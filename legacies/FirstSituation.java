package legacies;

import java.util.Arrays;
import java.util.Scanner;

public class FirstSituation extends MainLegac {

    public void GoFSit() {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 10 чисел: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите число номер " + (i + 1) + ": ");
            int num = scanner.nextInt();
            array[i] = num;
        }

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Минимальное число: " + min);
    }
}
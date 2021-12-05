package ru.ereshchenko.JavaCore2021.lesson02;

import java.util.Arrays;

/*
1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    С помощью цикла и условия заменить 0 на 1, 1 на 0;
2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
**5. Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
**6. Написать метод, в который передается не пустой одномерный целочисленный массив,
    метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
    Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
    граница показана символами ||, эти символы в массив не входят.
****7. Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
    или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
    Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) ->
    [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
 */

public class Lesson2 {

    public static void main(String[] args) {

        System.out.println("Первое задание");
        // Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;

        int[] arr1 = {1, 0, 1, 0, 1, 0, 1, 0, 1, 0};
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (arr1[i] == 0) ? 1 : 0;
            System.out.print(arr1[i] + " ");
        }

        System.out.println("\nВторое задание");
        // Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

        int[] arr2 = new int[8];
        int j = 0;
        for (int i = 0; i < arr2.length; i++, j = j + 3) {
            arr2[i] = j;
            System.out.printf(j + " ");
        }

        System.out.println("\nТретье задание");
        // Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
            System.out.printf(arr3[i] + " ");
        }

        System.out.println("\nЧетвертое задание");
        //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        int x = 5;
        int[][] arr4 = new int[x][x];
        fillDiagonal1(arr4);
        printDiagonal(arr4);

        System.out.println("\nПятое задание");
        //Задать одномерный массив и найти в нем минимальный и максимальный элементы
        int[] arr5 = {3, 6, 13, 99, 2, 67, 32};
        System.out.println("Задан массив: " + Arrays.toString(arr5));
        System.out.printf("Наибольшее значение: %d. Наименьшее значение: %d.\n\n", findMax(arr5), findMin(arr5));

        System.out.println("\nШестое задание");
        //Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
        // если в массиве есть место, в котором сумма левой и правой части массива равны.

        int[] balanceArr6 = {4, 2, 3, 1, 5, 2, 3 };;
        System.out.println(Arrays.toString(balanceArr6));
        System.out.println(checkbalance(balanceArr6));

        System.out.println("\nСедьмое задание");
        //Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
        // или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
        // Элементы смещаются циклично.
        modifyArray(new int[] {1, 2, 3, 4, 5,}, -2);
    }

    private static void fillDiagonal1(int[][] arr4) {
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0, z = arr4.length - 1; j < arr4.length; j++, z--) {
                if (i == j || i == z) {
                    arr4[i][j] = 1;
                } else {
                    arr4[i][j] = 0;
                }
            }
        }
    }

    private static void printDiagonal(int[][] arr4) {
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static int findMax(int[] arr5) {
        int max = arr5[0];

        for (int i : arr5) {
            if (i > max) {
                max = i;
            }
        }
        return max;

    }

    private static int findMin(int[] arr5) {
        int min = arr5[0];

        for (int i : arr5) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    private static boolean checkbalance(int[] balanceArr6) {

        int leftSum = 0;
        for(int i = 0; i < balanceArr6.length; i++){
            leftSum += balanceArr6[i];
            int rightSum = 0;
            for (int j = 0; j < balanceArr6.length; j++){
                rightSum += (j > i)? balanceArr6[j] : 0;
            }
            if(leftSum == rightSum){
                return true;
            }
        }
        return false;
    }

    private static void modifyArray(int[] arr9, int n) {
        System.out.print("Было:   ");
        for (int i : arr9) {
            System.out.print(i + " ");
        }

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                // Вправо
                int tmp = arr9[arr9.length - 1];
                for (int j = arr9.length - 1; j > 0; j--) {
                    arr9[j] = arr9[j - 1];
                }
                arr9[0] = tmp;
            }
        } else if (n < 0) {
            for (int i = 0; i < n * (-1); i++) {
                // Влево
                int tmp = arr9[0];
                for (int j = 0; j < arr9.length - 1; j++) {
                    arr9[j] = arr9[j + 1];
                }
                arr9[arr9.length - 1] = tmp;
            }
        }

        System.out.print("\nСтало:  ");
        for (int i : arr9) {
            System.out.print(i + " ");
        }
    }
}
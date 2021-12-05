package ru.ereshchenko.lesson2;

public class Simple2 {

    public static void main(String[] args) {

        System.out.println("\nСедьмое задание");


        int[] shiftArr = new int[] {1, 2, 3, 4, 5};

        System.out.println("Было:");
        for(int i = 0; i < shiftArr.length; i++)
            System.out.printf("%d\t", shiftArr[i]);
        System.out.println();

        shift(shiftArr, -2);

        System.out.println("Стало:");
        for(int i = 0; i < shiftArr.length; i++)
            System.out.printf("%d\t", shiftArr[i]);
        System.out.println();
    }

    static void shift(int[] arr, int n) {
        int shift = (arr.length + n % arr.length) % arr.length; // Вычисляем реальное смещение
        for (int i = 0; i < shift; i++) { // Выполним цикл смещения по одному элементу в соответствии со значением реального смещения (переменная shift)
            int temp = arr[arr.length - 1]; // Сохраняем значение ПОСЛЕДНЕГО элемента массива
            for (int j = arr.length - 1; j > 0 ; j--) { // Пройдем по всем элементам массива с конца в начало, заменим значение текущего элемента массива значением элемента, предшествующего текущему
                arr[j] = arr[j - 1];
            }
            arr[0] = temp; // А как быть с самым первым элементом? Вот как раз из переменной temp мы и получим недостающее значение
        }
    }
}

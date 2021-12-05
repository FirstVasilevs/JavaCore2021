package ru.ereshchenko.lesson2;

public class Simple1 {

    public static void main(String[] args) {
        int[] someArr = new int[]{2, 3, 4, 1, 8, 14, 5, 10, 13};
        shift(someArr, -2);
//        createArray();
    }

    static void shift(int[] arr, int n) {

        int shift = (arr.length + n % arr.length) % arr.length; // Вычисляем реальное смещение
        System.out.println(arr);
        for (int i = 0; i < shift; i++) { // Выполним цикл смещения по одному элементу в соответствии с значенимем реального смещения (переменная shift)
            int temp = arr[arr.length - 1]; // Сохраняем значение ПОСЛЕДНЕГО элемента массива
            for (int j = arr.length - 1; j > 0 ; j--) { // Пройдем по всем элементам массива с конца в начало, заменим значение текущего элемента массива значением элемента, предшествующего текущему
                arr[j] = arr[j - 1];
            }
            arr[0] = temp; // А как быть с самым первым элементом? Вот как раз из переменной temp мы и получим недостающее значение
        }
        System.out.println(arr + " ");



//    private static void createArray() {
//
//        int[] arr1 = new int[7];
//        int j = 5;
//        for (int i = 0; i < arr1.length; i++) {
//            arr1[i] = j;
//            System.out.print("[ " + arr1[0] + " ]");
//        }
//    }
    }


}

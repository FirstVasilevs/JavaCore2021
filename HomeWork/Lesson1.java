package ru.ereshchenko.JavaCore2021.lesson01;

/*
Домашнее задание
1. Создать пустой проект в IntelliJ IDEA и прописать метод main().
2. Создать переменные всех пройденных типов данных и инициализировать их значения.
3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    где a, b, c, d – аргументы этого метода, имеющие тип float.
4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
    в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать
    в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем
    положительным числом.
6. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
    если число отрицательное, и вернуть false если положительное.
7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
*8. Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

 */
public class Lesson1 {

    public static void main(String[] args) {

        byte first = -32; // от -128 до 127
        short second = 345; // от -32768 до 32767
        int third = 354212; // от -2147483648 до 2147483647
        long fourth = -445432456743l; // от -9223372036854775808 до 9223372036854775807
        float fifth = 12.12f; // число с плавающей запятой одинарной точности
        double sixth = -232.433; // число с плавающей запятой двойной точности
        char seventh = 'r'; // символы в кодировке Unicode
        boolean eighth = true; // логический
        String name = "Vasil"; // строковый


        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
        System.out.println(fifth);
        System.out.println(sixth);
        System.out.println(seventh);
        System.out.println(eighth);

        System.out.println(method3(first,second,third,third));
        System.out.println(method4(2,3));
        method5(third);
        System.out.println(method6(third));
        method7(name);
        method8(2021);
    }


    public static int method3(int a, int b, int c, int d) {
        int res = a * (b + (c / d));
        return res;
    }

    public static boolean method4(int a, int b) {
        if(a + b < 10 || a + b > 20) {
            return false;
        }
        return true;
    }
    public static void method5(int i) {
        if(i < 0) {
            System.out.println("Число отрицательное");
        }
        else {
            System.out.println("Число положительное");
        }
    }

    public static boolean method6(int a) {
        if(a < 0) {
            return true;
        } else {
            return false;
        }
    }

    private static void method7(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static void method8(int year) {
        if(year%4 == 0 && year%100 !=0 || year%400 == 0) {
            System.out.println("Год высокосный");
        }
        else {
            System.out.println("Год не высокосный");
        }
    }
}
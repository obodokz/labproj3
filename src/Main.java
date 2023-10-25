import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 2;

        for (int a = 1; a <= 100; a++) {
            for (int b = 1; b <= 100; b++) {
                for (int c = 1; c <= 100; c++) {
                    if ( a > 0 && b > 0 && c > 0) {
                        double leftSide = Math.pow(a, n) + Math.pow(b, n);
                        double rightSide = Math.pow(c, n);
                        if (leftSide == rightSide) {
                            System.out.println("Решение найдено: a = " + a + ", b = " + b + ", c = " + c + ", n = " + n);
                        }
                    }
                }
            }
        }

        System.out.println("По теореме Ферма, таких решений нет для n > 2."); // Подобное решение дает не корректный ответ, для чисел превышающих 8 байт...
     } // сменить кодировку на utf-16
}
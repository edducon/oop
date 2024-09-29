import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Вычисление гипотенузы");
        System.out.println("Введите первый катет:");
        double a = in.nextDouble();
        System.out.println("Введите второй катет:");
        double b = in.nextDouble();
        double result_hypotenuse = hypotenuse_calc(a, b);
        System.out.printf("Длина гипотенузы (форм. вывод): %.2f%n", result_hypotenuse);
        double result_hypotenuse_round = Math.round(result_hypotenuse * 100.0) / 100.0;
        System.out.println("Длина гипотенузы (через метод Math.round):" + result_hypotenuse_round);
    }

    public static double hypotenuse_calc(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }
}


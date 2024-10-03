import java.util.Scanner;

public class Main {

    public static double hypotenuse_calculate(double a, double b){
        return Math.sqrt(a * a + b * b);
    }

    public static double calc_distance(double x1, double x2, double y1, double y2){
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public static int generateRandomInteger(int min, int max){
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Введите длину катета (a): ");
        double a = in.nextDouble();
        System.out.println("Введите длину катета (b): ");
        double b = in.nextDouble();


        double hypotenuse = hypotenuse_calculate(a, b);
        System.out.printf("Длина гипотенузы (форматированный вывод): %.2f%n", hypotenuse);
        double roundedHypotenuse = Math.round(hypotenuse * 100.0) / 100.0;
        System.out.println("Длина гипотенузы (Math.round()): " + roundedHypotenuse);



        System.out.println("\n\nВведите координату x1"); // \n\n - для красоты выводы (чтобы текст не сливался в 1 целое)
        double x1 = in.nextDouble();
        System.out.println("Введите координату y1");
        double y1 = in.nextDouble();
        System.out.println("Введите координату x2");
        double x2 = in.nextDouble();
        System.out.println("Введите координату y2");
        double y2 = in.nextDouble();

        double distance = calc_distance(x1, x2, y1, y2);
        System.out.printf("Расстояние между точками: %.2f%n", distance);



        System.out.println("\n\nВведите левую границу диапазона (целое число)");
        int min = in.nextInt();
        System.out.println("Введите правую границу диапазона (целое число)");
        int max = in.nextInt();

        int randomNumber = generateRandomInteger(min, max);
        System.out.println("Случайное число из диапазона [" + min + ", " + max + "]: " + randomNumber);
    }
}
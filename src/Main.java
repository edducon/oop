import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Введите длину катета (a): ");
        double a = in.nextDouble();
        System.out.println("Введите длину катета (b): ");
        double b = in.nextDouble();

        double squareA = a * a;
        double squareB = b * b;
        double hypotenuse_calculate = Math.sqrt(squareA + squareB); //Метод вычисления длины гипотенузы

        double result_1 = ((int)(hypotenuse_calculate * 100)) / 100.0; //Форматированный вывод
        System.out.println("Длина гипотенузы (форм. вывод) = " + result_1);
        double result_2 = (double) Math.round(hypotenuse_calculate * 100) / 100; //Метод Math.Round
        System.out.println(" Длина гипотенузы (Math.round) = " + result_2);



        System.out.println("\n\nВведите координату x1"); // \n\n - для красоты выводы (чтобы текст не сливался в 1 целое)
        double x1 = in.nextDouble();
        System.out.println("Введите координату y1");
        double y1 = in.nextDouble();
        System.out.println("Введите координату x2");
        double x2 = in.nextDouble();
        System.out.println("Введите координату y2");
        double y2 = in.nextDouble();

        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        double distance = Math.sqrt(deltaX * deltaX + deltaY * deltaY);

        double distanceResult_1 = ((int)(distance * 100)) / 100.0;
        System.out.println("Расстояние между двумя точками (форм. вывод) = " + distanceResult_1);
        double distanceResult_2 = (double) Math.round(distance * 100) / 100;
        System.out.println("Расстояние между двумя точками (Math.round) = " + distanceResult_2);



        System.out.println("\n\nВведите левую границу диапазона (целое число)");
        int min = in.nextInt();
        System.out.println("Введите правую границу диапазона (целое число)");
        int max = in.nextInt();

        if (min > max) {
            int temp_number = min;
            min = max;
            max = temp_number;
        }

        int randomNum = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println("Случайное число из диапазона [" + min + ", " + max + "] = " + randomNum);

    }
}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\nВыберите задание.\nДля выбора введите номер задания");
            System.out.println("[1] - Сортировка трех введенных чисел");
            System.out.println("[2] - Нахождение корней квадратного уравнения");
            System.out.println("[3] - Поиск среднего арифметического числа");
            System.out.println("[4] - Вывод максимального количества элементов");
            System.out.println("[5] - Вывод максильмного кол-ва идущих подряд элементов");
            System.out.println("\n[0] - Выход\n");

            choice = in.nextInt();

            switch (choice) {
                case 1:
                    sortThreeNumbers(in);
                    break;
                case 2:
                    quadraticEquation(in);
                    break;
                case 3:
                    averageEvenNumbers(in);
                    break;
                case 4:
                    findMaxNumbers(in);
                    break;
                /*case 5:
                    findMaxConsecutive(in);
                    break;*/
                case 0:
                    System.out.println("Выход из программы.");
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        } while (choice != 0);
    }

    public static void sortThreeNumbers(Scanner in){

        System.out.println("Введите 3 числа ( подряд без точек и запятых ): ");

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int temp_number;

        if (a > b){
            temp_number = a;
            a = b;
            b = temp_number;
        } if (b > c){
            temp_number = b;
            b = c;
            c = temp_number;
        } if (a > b) {
            temp_number = a;
            a = b;
            b = temp_number;
        }
        System.out.println("Отсортированные числа: " + a + ", " + b + ", " + c);
    }

    public static void quadraticEquation(Scanner in){

        System.out.println("Введите корни уравнения (3 корня) ( подряд без точек и запятых ): ");

        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        double discriminatn = b * b - (4 * a * c);

        if (discriminatn > 0){

            double root_1 = (-b + Math.sqrt(discriminatn)) / (2 * a);
            double root_2 = (-b - Math.sqrt(discriminatn)) / (2 * a);

            System.out.println("Корни уравнения: " + root_1 + "," +root_2);
        } else if (discriminatn == 0) {

            double root_1 = -b / (2 * a);

            System.out.println("Корень уравнения: " +root_1);
        } else {
            System.out.println("Действительных корней нет");
        }
    }

    public static void averageEvenNumbers(Scanner in) {
        int sum = 0, count = 0, number;

        System.out.println("Введите числа (для завершения введите 0):");
        do {
            number = in.nextInt();
            if (number != 0 && number % 2 == 0) {
                sum += number;
                count++;
            }
        } while (number != 0);

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Среднее арифметическое чётных чисел: " + average);
        } else {
            System.out.println("Четные числа не были получены.");
        }
    }

    public static void findMaxNumbers(Scanner in) {

        System.out.println("Введите числа (для завершения введите 0): ");

        int max = Integer.MIN_VALUE;
        int count = 0;
        int number;

        do {
            number = in.nextInt();

            if (number == 0) {
                break;
            } if (number > max) {
                max = number;
                count = 1;
            } else if (number == max) {
                count++;
            }
        } while (true);

        if (max != Integer.MIN_VALUE){

            System.out.println("Максимальное число " +max+ " встречается " +count+ "раз");

        } else {
            System.out.println("Не получено число");
        }
    }
}
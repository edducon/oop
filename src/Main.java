import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int choice;

        do {
            System.out.println("Выберите задание.\nДля выбора введите номер задания");
            System.out.println("[1] - Сортировка трех введенных чисел");
            System.out.println("[2] - Нахождение корней квадратного уравнения");
            System.out.println("[3] - Поиск среднего арифметического числа");
            System.out.println("[4] - Вывод максимального количества элементов");
            System.out.println("[5] - Вывод максильмного кол-ва идущих подряд элементов");
            System.out.println("\n[0] - Выход");

            choice = in.nextInt();

            switch (choice) {
                case 1:
                    sortThreeNumbers(in);
                    break;
                case 2:
                    quadraticRoots(in);
                    break;
                case 3:
                    averageEvenNumbers(in);
                    break;
                case 4:
                    findMaxNumbers(in);
                    break;
                case 5:
                    findMaxConsecutive(in);
                    break;
                case 0:
                    System.out.println("Выход из программы.");
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        } while (choice != 6);
    }
}
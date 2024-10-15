import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nВыберите задание.\nДля выбора введите номер задания");
            System.out.println("[1] - Найти позицию первого нуля в последовательности");
            System.out.println("[2] - Число элементов, больших предыдущего");
            System.out.println("[3] - Найти второй по величине элемент");
            System.out.println("[4] - Максимальная длина монотонного участка");
            System.out.println("[5] - Число групп из единиц, разделенных нулями");
            System.out.println("[6] - Число вхождений фрагмента 1, 2, 3, 4, 5, 6");
            System.out.println("[7] - Число вхождений фрагмента 1, 2, 1, 2, 1, 2");
            System.out.println("[8] - Число локальных максимумов");
            System.out.println("\n[0] - Выход\n");

            try {
                choice = in.nextInt();
                in.nextLine();
            } catch (Exception e) {
                System.out.println("Ошибка ввода, попробуйте снова.");
                in.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    findFirstZeroPosition(in);
                    break;
                case 2:
                    countGreaterThanPrevious(in);
                    break;
                case 3:
                    findSecondLargest(in);
                    break;
                case 4:
                    findMaxMonotoneSegment(in);
                    break;
                case 5:
                    countGroupsOfOnes(in);
                    break;
                case 6:
                    countSequence123456(in);
                    break;
                case 7:
                    countSequence121212(in);
                    break;
                case 8:
                    countLocalMaxima(in);
                    break;
                case 0:
                    System.out.println("Выход из программы.");
                    return;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        } while (true);
    }

    public static void findFirstZeroPosition(Scanner in) {
        int position = 1;

        System.out.println("Введите числа, для завершения введите нечисловое значение:");

        do {
            try {
                int num = in.nextInt();
                if (num == 0) {
                    System.out.println("Позиция первого нуля: " + position);
                    in.nextLine();
                    return;
                }
                position++;
            } catch (Exception e) {
                in.nextLine();
                break;
            }
        } while (true);

        System.out.println("0");
    }

    public static void countGreaterThanPrevious(Scanner in) {
        System.out.println("Введите числа, для завершения введите нечисловое значение:");
        int count = 0;
        int isFirst = 1;
        int previous = 0;

        do {
            try {
                int num = in.nextInt();
                if (isFirst == 1) {
                    count++;
                    previous = num;
                    isFirst = 0;
                } else {
                    if (num > previous) {
                        count++;
                    }
                    previous = num;
                }
            } catch (Exception e) {
                in.nextLine();
                break;
            }
        } while (true);

        System.out.println("Число элементов, больших предыдущего: " + count);
    }

    public static void findSecondLargest(Scanner in) {
        System.out.println("Введите числа, для завершения введите нечисловое значение:");
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int countNumbers = 0;

        do {
            try {
                int num = in.nextInt();
                countNumbers++;
                if (num > max) {
                    secondMax = max;
                    max = num;
                } else if (num < max && num > secondMax) {
                    secondMax = num;
                }
            } catch (Exception e) {
                in.nextLine();
                break;
            }
        } while (true);

        if (countNumbers < 2 || secondMax == Integer.MIN_VALUE) {
            System.out.println("нет");
        } else {
            System.out.println("Второй по величине элемент: " + secondMax);
        }
    }

    public static void findMaxMonotoneSegment(Scanner in) {
        System.out.println("Введите числа, для завершения введите нечисловое значение:");
        int maxLength = 1;
        int currentLength = 1;
        int isFirst = 1;
        int previous = 0;

        do {
            try {
                int num = in.nextInt();
                if (isFirst == 1) {
                    previous = num;
                    isFirst = 0;
                } else {
                    if (num >= previous) {
                        currentLength++;
                    } else {
                        if (currentLength > maxLength) {
                            maxLength = currentLength;
                        }
                        currentLength = 1;
                    }
                    previous = num;
                }
            } catch (Exception e) {
                in.nextLine();
                break;
            }
        } while (true);

        if (currentLength > maxLength) {
            maxLength = currentLength;
        }
        System.out.println("Максимальная длина монотонного участка: " + maxLength);
    }

    public static void countGroupsOfOnes(Scanner in) {
        System.out.println("Введите последовательность из нулей и единиц, для завершения введите нечисловое значение:");
        int inGroup = 0;
        int count = 0;

        do {
            try {
                int num = in.nextInt();
                if (num == 1) {
                    if (inGroup == 0) {
                        count++;
                        inGroup = 1;
                    }
                } else if (num == 0) {
                    inGroup = 0;
                }
            } catch (Exception e) {
                in.nextLine();
                break;
            }
        } while (true);

        System.out.println("Число групп из единиц: " + count);
    }

    public static void countSequence123456(Scanner in) {
        System.out.println("Введите числа, для завершения введите нечисловое значение:");
        int count = 0;
        int state = 1;

        do {
            try {
                int num = in.nextInt();
                if (num == state) {
                    state++;
                    if (state == 7) {
                        count++;
                        state = 1;
                    }
                } else if (num == 1) {
                    state = 2;
                } else {
                    state = 1;
                }
            } catch (Exception e) {
                in.nextLine();
                break;
            }
        } while (true);

        System.out.println("Число вхождений фрагмента 1, 2, 3, 4, 5, 6: " + count);
    }

    public static void countSequence121212(Scanner in) {
        System.out.println("Введите числа, для завершения введите нечисловое значение:");
        int count = 0;

        int n1, n2 = -1, n3 = -1, n4 = -1, n5 = -1, n6 = -1;

        do {
            try {
                int num = in.nextInt();

                n1 = n2;
                n2 = n3;
                n3 = n4;
                n4 = n5;
                n5 = n6;
                n6 = num;

                if (n1 == 1 && n2 == 2 && n3 == 1 && n4 == 2 && n5 == 1 && n6 == 2) {
                    count++;
                }
            } catch (Exception e) {
                in.nextLine();
                break;
            }
        } while (true);

        System.out.println("Число вхождений фрагмента 1, 2, 1, 2, 1, 2: " + count);
    }

    public static void countLocalMaxima(Scanner in) {
        System.out.println("Введите числа, для завершения введите нечисловое значение:");
        int previous, current, next;
        int count = 0;

        try {
            previous = in.nextInt();
        } catch (Exception e) {
            in.nextLine();
            System.out.println("0");
            return;
        }

        try {
            current = in.nextInt();
        } catch (Exception e) {
            in.nextLine();
            System.out.println("Число локальных максимумов: 1");
            return;
        }

        if (previous >= current) {
            count++;
        }

        do {
            try {
                next = in.nextInt();

                if (current >= previous && current >= next) {
                    count++;
                }

                previous = current;
                current = next;

            } catch (Exception e) {
                in.nextLine();
                if (current >= previous) {
                    count++;
                }
                break;
            }
        } while (true);

        System.out.println("Число локальных максимумов: " + count);
    }
}

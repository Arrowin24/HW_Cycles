import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        //Task 1.1
        System.out.println("Задание 1.1: ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Task 1.2
        System.out.println("Задание 1.2: ");
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Task 1.3
        System.out.println("Задание 1.3: ");
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) System.out.print(i + " ");
        }
        System.out.println();

        //Task 1.4
        System.out.println("Задание 1.4: ");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Task 2.1
        System.out.println("Задание 2.1: ");
        for (int i = 1904; i < 2097; i++) {
            boolean isLeapYear = (i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0);
            if (isLeapYear) System.out.print(i + " ");
        }
        System.out.println();

        //Task 2.2
        System.out.println("Задание 2.2: ");
        for (int i = 7; i < 100; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Task 2.3
        System.out.println("Задание 2.3: ");
        for (int i = 0; i < 10; i++) {
            System.out.print((int) Math.pow(2, i) + " ");
        }
        System.out.println();

        //Task 3.1
        System.out.println("Задание 3.1: ");
        double salary = 0;
        for (int i = 1; i <= 12; i++) {
            salary += 29_000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + (int) salary + " рублей");
        }

        //Task 3.2
        System.out.println("Задание 3.2: ");
        double salary1 = 0;
        double percent = 0.01;
        for (int i = 1; i <= 12; i++) {
            salary1 += salary1 * percent + 29_000;
            String formattedSalary = new DecimalFormat("#0.00").format(salary1);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + formattedSalary + " рублей");
        }

        //tasks of increased complexity
        System.out.println("\nЗадания повышенной сложности: ");
        //Task 4.1
        System.out.println("Задание 4.1: ");
        for (int i = 1; i <= 30; i++) {
            System.out.print(i + ": ");
            if (i % 3 == 0) System.out.print("ping ");
            if (i % 5 == 0) System.out.print("pong ");
            System.out.println();
        }

        //Task 4.2
        System.out.println("Задание 4.2: ");
        int firstFBN = 0;
        int secondFBN = 1;
        System.out.println("Последовательность Фибоначчи: ");
        System.out.print(firstFBN + " " + secondFBN + " ");
        for (int i = 3; i <= 10; i++) {
            int nextFBN = firstFBN + secondFBN;
            System.out.print(nextFBN + " ");
            firstFBN = secondFBN;
            secondFBN = nextFBN;
        }

    }
}
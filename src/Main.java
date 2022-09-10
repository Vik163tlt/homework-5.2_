public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
    }

    private static void task1() {
        System.out.println("Задание 1 / Задача 1");
        int salary = 29_000;
        int total = 0;
        for (int i = 1; total <= 2_459_000; i++) {
            total += total / 100;
            total += salary;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", i, total);
        }
    }

    private static void task2() {
        System.out.println("Задание 1 / Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.printf("%d ", i);
        }
        System.out.println();

        for (i = 10; i > 0; i--) {
            System.out.printf("%d ", i);
        }
    }

    private static void task3() {
        System.out.println("\nЗадание 1 / Задача 3");
        int y = 12_000_000;

        for (int i = 1; i <= 10; i++) {
            y += y * 17 / 1000 - y * 8 / 1000;
            System.out.printf("Год %d, численность населения составляет %d\n", i, y);
        }
    }

    private static void task4() {
        System.out.println("Задание 2 / Задача 1");
        var accountDeposit = 15_000;
        var percent = 7;
        var i = 1;
        while (accountDeposit < 12_000_000) {
            i++;
            accountDeposit += accountDeposit * percent / 100;
            System.out.printf("Месяц %d, сумма накоплений %d\n", i, accountDeposit);
        }
    }
    private static void task5() {
        System.out.println("Задание 2 / Задача 2");
        var accountDeposit = 15_000;
        var percent = 7;
        var i = 1;
        while (accountDeposit < 12_000_000) {
            i++;
            accountDeposit += accountDeposit * percent / 100;
            if (i % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений %d\n", i, accountDeposit);
            }
        }
    }
    private static void task6() {
        System.out.println("Задание 2 / Задача 3");
        var accountDeposit = 15_000;
        var percent = 7;
        var i = 1;
        while (i <= 12 * 9) {
            i++;
            accountDeposit += accountDeposit * percent / 100;
            if (i % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений %d\n", i, accountDeposit);
            }
        }
    }
    private static void task7() {
        System.out.println("Задание 2 / Задача 4");
        int i = 3;
        System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет\n",i);
        while (i <= 31) {
            i++;
            if ((i -3) % 7 == 0 ) {
                System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет\n", i);
            }
        }
    }
    private static void task8() {
        System.out.println("Задание 3 / Задача 1");
        for (int i = 1817; i < 2117; i = i + 79) {
            if (i>1817) {
                System.out.println(i);
            }
        }
    }
    private static void task9() {
        System.out.println("Задание 3 / Задача 2");
        int b = 2;
        for (int a = 1; a <= 10; a ++) {
            int total = a*b;
            System.out.println(b + "*" + a + "=" + total);
        }
    }
    private static void task10() {
        System.out.println("Задание со звездочкой / Задача 1");
        for (int i=1; i <=30; i++ ) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ":ping pong");}
            else if (i % 3 == 0) {
                    System.out.println(i + ":ping");}
            else if (i % 5 == 0) {
                    System.out.println(i + ":pong");}
            else {
                    System.out.println(i+ ":");}
                }
            }
    private static void task11() {
        System.out.println("Задание со звездочкой / Задача 2");
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        for (int i = 0; i < 9 ; i++) {
            int total = b;
            b = a + b;
            a = total;
            System.out.print(total + " ");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание № 7");
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        System.out.println(" ");
        System.out.println("Задача № 1");
        int count = 0;
        int i = 1;
        while (count < 2459000) {
            count = count * 101 / 100 + 15000;
            System.out.println("Месяц " + i++ + ", сумма накоплений равна " + count + " рублей");
        }
    }

    public static void task2() {
        System.out.println(" ");
        System.out.println("Задача № 2");
        int count = 1;
        while (count <= 10) {
            System.out.print(count++ + " ");
        }
        System.out.println();
        for (int i = 10; i > 0; ) {
            System.out.print(i-- + " ");
        }
    }

    public static void task3() {
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Задача № 3");

        // В стране Y население равно 12 миллионов человек.
        //Рождаемость составляет 17 человек на 1000, смертность — 8 человек.
        // Рассчитайте, какая численность населения будет через 10 лет,
        // если показатели рождаемости и смертности постоянны.
        //В консоль выведите результат операции на каждый год в формате:
        // «Год …, численность населения составляет …».

        int people = 12_000_000;
        int period = 0;
        while (period < 10) {
            period++;
            people = people + people / 1000 * 17 - people / 1000 * 8;
            System.out.println("Год " + period + ", численность населения составляет " + people);
        }
    }

    public static void task4() {
        System.out.println(" ");
        System.out.println("Задача № 4");
        int count = 15000;
        int i = 1;
        while (count < 12000000) {
            count = count * 107 / 100;
            System.out.println("Месяц " + i++ + ", сумма накоплений равна " + count + " рублей");
        }
    }

    public static void task5() {
        System.out.println(" ");
        System.out.println("Задача № 5");
        int count = 15000;
        int i = 0;
        while (count < 12000000) {
            count = count * 107 / 100;
            i++;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + count + " рублей");
            }
        }
    }

    public static void task6() {
        System.out.println(" ");
        System.out.println("Задача № 6");
        int count = 15000;
        int i = 0;
        while (i <= 108) {
            count = count * 107 / 100;
            i++;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + count + " рублей");
            }
        }
    }

    public static void task7() {
        System.out.println(" ");
        System.out.println("Задача № 7");
        int friday = 1;
        for (; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }
    }

    public static void task8() {
        System.out.println(" ");
        System.out.println("Задача № 8");
        int year = 2023;
        int startYear = year - 200;
        int endYear = year + 100;
        for (int i = 0; i <= endYear; i = i + 79) {
            if (i >= startYear) {
                System.out.println(i);
            }
        }
        
        }
    }


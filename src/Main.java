//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int goal = 2_459_000;
        int savings = 15_000;
        int savingsNow = 0;
        int months = 0;
        while (savingsNow < goal) {
            months++;
            savingsNow += savings;
            System.out.println("Месяц " + months + " сумма накоплений равна " + savingsNow + " рублей");
        }

        System.out.println("Задача 2");
        int number = 1;
        while (number <= 10) {
            if (number < 10) {
                System.out.print(number + " ");
            } else {
                System.out.print(number);
            }
            number++;
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            if (i > 1) {
                System.out.print(i + " ");
            } else {
                System.out.print(i);
            }
        }

        System.out.println();
        System.out.println("Задача 3");
        int allPeople = 12_000_000;
        int birth = 17;
        int death = 8;
        for (int year = 1; year < 10; year++) {
            allPeople += allPeople * (birth - death) / 1000;
            System.out.println("Год " + year + " - численность населения состовляет " + allPeople + " человек");
        }

        System.out.println("Задача 4");
        double savings2 = 15_000;
        int start = 0;
        double prosent = 0.07;
        int goal2 = 12_000_000;
        while (savings2 < goal2) {
            start = start + 1;
            savings2 = savings2 + savings2 * prosent;
            System.out.println("Сумма " + savings2 + ", количество месяцев " + start);
        }

        System.out.println("Задача 5");
        double savings3 = 15_000;
        double prosent3 = 0.07;
        int goal3 = 12_000_000;
        int report = 6;
        for (int i = 0; savings3 < goal3; i++) {
            savings3 = savings3 + savings3 * prosent3;
            if (i % report == 0) {
                System.out.println("Сумма " + savings3 + " , количество месяцев " + i);
            }
        }

            System.out.println("Задача 6");
            double money = 15000;
            int period = 6;
            int years = 9;
            int allMonth = years * 12;
            double prosentBank = 0.07;
            for (int x = 0; x <= allMonth; x++) {
                money = money + money * prosentBank;
                if (x % period == 0) {
                    System.out.println("Сумма " + money + " , количество месяцев " + x);
                }
            }

            System.out.println("Задача 7");
            for (int friday = 3; friday < 30; friday += 7) {
                System.out.println("Сегодня пятница " + friday + " необходимо подготовить отчет");
            }

            System.out.println("Задача 8");
            int currentYear = 2023;
            for (int y = 0; y < currentYear + 100; y += 79) {
                if (y > currentYear - 200) {
                    System.out.println(y);
                }
            }
        }
    }
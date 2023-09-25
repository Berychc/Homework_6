public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
//        task9();
//        task10();
    } public static void task1() {
        for (int i = 1; i<=10; i++) {
        System.out.println(i);
        }
    } public static void task2() {
        for (int i = 10; i>=1; i--) {
            System.out.println(i);
        }
    } public static void task3() {
        for (int i = 0; i<=17; i=i+2){
            System.out.println(i);
        }
    } public static void task4() {
        for (int i = 10; i>=-10; i--) {
            System.out.println(i);
        }
    } public static void task5() {
        for (int year = 1904; year<=2096;year=year+4){
            System.out.printf("%d год является високосным \n", year);
        }
    } public static void task6() {
        for (int i = 7; i<=98; i=i+7) {
            System.out.println(i);
        }
    } public static void task7() {
        for (int i = 1; i<=512; i=i*2) {
            System.out.println(i);
        }
    } public static void task8() {
        int total = 0;
        for (int month = 1; month<=12; month++) {
            total += 29000;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n",month,total);
        }
    } public static void task9() {
        int deposit = 10000;
        double interestRate = 0.12;
        for (int month = 1; month<=12; month++) {
            deposit += deposit * interestRate / 12;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n",month,deposit);
        }
    } public static void task10() {
        int firstNum = 2;
        for (int i = 1; i<=10; i++) {
            System.out.printf("%d * %d = "+ (firstNum * i) + "\n",firstNum,i);
        }
    }
}
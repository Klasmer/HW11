public class Main {

    public static void printIsLeapYearResult(int year) {
        if (year > 1584 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " " + " год високосный");
        } else {
            System.out.println(year + " " + " не является високосный");
        }
    }

    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = 2105;
        printIsLeapYearResult(year);

    }
}
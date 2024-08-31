public class Main {

    public static void printIsLeapYearResult(int year) {
        if (year > 1584 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " " + " год високосный");
        } else {
            System.out.println(year + " " + " не является високосный");
        }
    }

    public static void printClientOsDeviceYear(int clientOs, int clientDeviceYear) {
        if (clientOs == 0)
            if (clientDeviceYear < 2015) {
                System.out.println("Устоновите облегченную версию приложения для iOS по ссылке ");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        else if (clientOs == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Устоновите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения Android по ссылке");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = 2105;
        printIsLeapYearResult(year);

        System.out.println("Задача 2");
        int clientDeviceYear = 2012;
        byte clientOs = 1;
        printClientOsDeviceYear(clientOs, clientDeviceYear);


    }

}


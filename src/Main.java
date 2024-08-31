public class Main {

    public static void printIsLeapYearResult(int year) {
        if (year > 1584 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " " + " год високосный");
        } else {
            System.out.println(year + " " + " не является високосный");
        }
    }

    public static void printClientIosDeviceYear(int clientOs, int clientDeviceYear) {
        if (clientOs == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Устоновите облегченную версию приложения для iOS по ссылке ");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
    }

    public static void printClientAndroidDeviceYear(int clientOs, int clientDeviceYear) {
        if (clientOs == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Устоновите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения Android по ссылке");
            }
        }
    }

    public static int distanceTime(int km) {
        if (km <= 20) {
            return 1;
        } else if (km > 20 && km < 60) {
            return 2;
        } else if (km >= 60 && km < 100) {
            return 3;
        } else {
            return 0;
        }
    }


    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = 2105;
        printIsLeapYearResult(year);

        System.out.println("Задача 2");
        int clientDeviceYear = 2016;
        byte clientOs = 0;
        printClientIosDeviceYear(clientOs, clientDeviceYear);
        printClientAndroidDeviceYear(clientOs, clientDeviceYear);

        System.out.println("Задача 3");
        int deliveryDistance = 95;
        int days = distanceTime(deliveryDistance);
        if (days > 0) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставки нет.");
        }
    }


}




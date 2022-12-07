import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какое задание проверяем:" +
                "\n1 - вискосный год\n2 - версия телефона\n3 - доставка");
        int switchTask = scanner.nextInt();
        switch (switchTask) {
            case 1:
                System.out.println("Введите год для проверки:");
                int year = scanner.nextInt();
                checkLeapYear(year);
                break;
            case 2:
                System.out.println("Платформа вашего телефона:\n0 - IOS\n1 - Android");
                int phoneOs = scanner.nextInt();
                System.out.println("Год выпуска вашего телефона:");
                int phoneYear = scanner.nextInt();
                checkVersion(phoneOs, phoneYear);
                break;
            case 3:
                System.out.println("Введите дистанцию до клиента:");
                int distance = scanner.nextInt();
                System.out.println("Потребуется дней для доставки: " + calculateDeliveryTime(distance));
                break;
            default:
                System.out.println("Taкого заадния нет");
                break;
        }
        scanner.close();
    }

    public static void checkLeapYear(int year) {
        if (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0)) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    public static void checkVersion(int clientOS, int clientDeviceYear) {
        if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static int calculateDeliveryTime(int deliveryDistance){
        return deliveryDistance/40 + 1;
    }
}
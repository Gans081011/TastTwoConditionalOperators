
// Задание 1
public class TaskTwoConditionalOperators {
    public static void main(String[] args) {
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("«Установите версию приложения для iOS по ссылке».");
        }
        if (clientOS == 1) {
            System.out.println("«Установите версию приложения для Android по ссылке».");
        }
        System.out.println(" ");
        // Задание 2
        int clientDeviceYear = 2015; // телефон произведен после 2015 года
        boolean phoneOS = true && clientDeviceYear >= 2015; // версия iOS стандартаная

        if (phoneOS && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (phoneOS && clientDeviceYear < 2015) {
            System.out.println("Вам следует установить более облегченную версию iOS приложения");

        } else if (!phoneOS && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для android по ссылке");

        } else if (!phoneOS && clientDeviceYear < 2015)
            System.out.println("Вам следует установить более облегченную версию iOS приложения");
        System.out.println(" ");
        // Задание 3
        int year = 1943;
        int a = 4;
        int b = 100;
        int c = 400;
        if (year % a == 0 || year % c == 0 && year != b) {
            System.out.println(year + " год високосный");

        } else {
            System.out.println(year + " Этот год не високосный");
        }
        System.out.println(" ");
        // Задание 4
        int deliveryDistance = 95;
        int leftDays = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней:" + leftDays);
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней:" + (leftDays + leftDays));
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней:" + (leftDays + 2));
        }
        System.out.println(" ");
        // Задание 5
        int monthNumber = 6;
        if (monthNumber > 0 && monthNumber <= 12) {

            switch (monthNumber) {
                case 1, 2, 12:
                    System.out.println("Это время года зима");
                    break;
                case 3, 4, 5:
                    System.out.println("это время года весна");
                    break;
                case 6, 7, 8:
                    System.out.println("это время года лето");
                    break;
                case 9, 10, 11:
                    System.out.println("это время года осень ");
                    break;

            }
        } else
            System.out.println("Всего 12 времен года, числа 0 и числа больше 12 недопустимы ");

    }
}


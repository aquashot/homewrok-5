public class Main {
    public static void main(String[] args) {
        System.out.println("задача 1");
        char clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по сслылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("задача 2");
        char clientDeviceYearr = 2013;
        if (clientDeviceYearr >= 2015) {
            System.out.println("Установите  версию приложения для IOS по ссылке");
        } else if (clientDeviceYearr < 2015) {
            System.out.println("Установите облегченную версию для IOS по ссылке");
            if (clientDeviceYearr >= 2015) {
                System.out.println("Установите версию приложения для Android");
            } else if (clientDeviceYearr < 2015) {
                System.out.println("Установите облегченную версию приложения для Android");
            }
        }
        System.out.println("задача 3");
        int year=2024;
                if(year%4==0 && year%100 !=0 || year%400==0) {
                    System.out.println("Год является високосным");
                }else {
                    System.out.println("Год не является високосным");
                }
                System.out.println("задача 4");
                int deliverydistance=96;
                if (deliverydistance <=20 ) {
                    System.out.println("Доставка в пределах 20 км  занимает сутки");
                }else if  (deliverydistance >20 && deliverydistance <60){
                    System.out.println("доставка от 20 до 60 км занимает 2 суток");
                }if (deliverydistance >60 && deliverydistance <100){
                    System.out.println("доставка занимает 3 дня");
                }else if (deliverydistance>100){
                    System.out.println("доставки нет");
            }
                System.out.println("задача 5");
                int mounthnumber=12;
                switch (mounthnumber){
                    case 12:
                    case 1:
                    case 2:
                        System.out.println("зима");
                        break;
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("весна");
                    break;
                    case 6:
                    case 7:
                    case 8:
                        System.out.println("лето");
                        break;
                    case 9:
                    case 10:
                    case 11:
                        System.out.println("осень");
                        break;
                    default:
                        System.out.println("не существует");


                }
                }
    }






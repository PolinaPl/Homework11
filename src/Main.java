import java.time.Instant;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        checkYear (2011);
        defineVersion (1, 2023);
        printDeliveryDay (50);


    }
private static void checkYear (int year) {
    if (year >= 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
        System.out.println("Год высокосный.");
    } else {
        System.out.println("Год не высокосный.");
    }
}
private static void defineVersion (int mobileOs, int mobileYear) {
        String mobileOsName;
        switch (mobileOs){
            case 0:
                mobileOsName = "iOS";
                break;
            case 1:
                mobileOsName = "Android";
                break;
            default:
                mobileOsName = "неизвестная ОС";
        }
     int currentYear = LocalDate.now().getYear();
        if (mobileYear != currentYear) {
            System.out.println("Для ОС " + mobileOsName + " установите lite - версию.");
        } else {
            System.out.println("Для ОС " + mobileOsName + " установите обычную версию.");
        }
}
private static int calkDeliveryDay (int distans) {
    if (distans <= 20) {
        return 1;
    } else if (distans <= 60) {
        return 2;
    } else if (distans <= 100) {
        return 3;
    } else {
        return -1;
    }
}

private static void printDeliveryDay (int distans){
        int days = calkDeliveryDay(distans);
        if (days >0){
            System.out.println("Потребуется дней: " + days);
        }else {
            System.out.println("Доставка не осуществляется.");
        }

}
}
import com.sun.org.apache.xpath.internal.objects.XString;
import java.util.GregorianCalendar;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println("This is homework 2:");
        System.out.println("1. " + checkSum(5, 15));
        System.out.println("2. " + checkNumberS(5));
        System.out.println("3. " + checkNumberB(5));
        Repeater("Hello world!", 5);

        System.out.println("5*. 1900 - " + isLeapYear(1900));
        System.out.println("5*. 2000 - " + isLeapYear(2000));
        System.out.println("5*. 2001 - " + isLeapYear(2001));
        System.out.println("5*. 2004 - " + isLeapYear(2004));
    }

    // 1. Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно),
    // если да – вернуть true, в противном случае – false.
    public static boolean checkSum(int a, int b) {
        int sum = a + b;
        if ((sum > 10) && (sum <=20)) return true;
        else return false;
    }

    // 2. Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.
    public static String checkNumberS(int a) {
        if (a < 0) return "Negative";
        else return "Positive";
    }

    // 3. Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean checkNumberB(int a) {
        if (a < 0) return true;
        else return false;
    }

    // 4. Написать метод, которому в качестве аргументов передается строка и число,
    // метод должен отпечатать в консоль указанную строку, указанное количество раз.
    public static void Repeater(String s, int n) {
        for (int i = 0; i < n; i++)
        {
            System.out.println("4." + i + " " + s);
        }
    }

    // Попробовала этот синтаксический сахар, хоть очень не люблю его :)
    // Но смотрится, признаться, лучше, чем куча if'ов.
    public static boolean isLeapYear(int y) {
        return (y % 100 == 0) ? (y % 400 == 0) : (y % 4 == 0);
    }
}

package TeachMeSkills;
import java.util.Scanner;

public class LambdaTestClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int enteredData = sc.nextInt();


        // если в консоль введена цифра 1, то:
        // использования интерфейса со строковым типом и передать в метод интерфейса логику реверса строки(вывода строки в обратном порядке).


        if (enteredData == 1) {

            TestFunctionalInterface<String> case1 = (x) -> {
                StringBuilder sb = new StringBuilder(x);
                sb.reverse();
                return String.valueOf(sb);
            };
        }


        // если в консоль введена цифра 2, то:
        // использования интерфейса с целочисленным типом и передать в метод интерфейса логику нахождения факториала числа.


        if (enteredData == 2) {

            TestFunctionalInterface<Integer> case2 = (x) -> {
                for (int y = 1; y <= x; y++) {
                    x = x * y;
                }
                return x;
            };

        }
    }
}




import java.util.Scanner;

/**
 * Created by GLARM on 06.09.2016.
 */
public class MrHey {

    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Input a, b: ");
        int a = ss.nextInt();
        int b = ss.nextInt();
        mymethod(a, b);
    }
    public static void mymethod(int a, int b) {
        if (a - b == 2)
            System.out.println("a > b na 2");
        else System.out.println("Неправильное значение");

    }

}
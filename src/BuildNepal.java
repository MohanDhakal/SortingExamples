import java.util.ArrayList;
import java.util.Scanner;

public class BuildNepal {
    static ArrayList<String> value;

    public static void main(String[] args) {
        value = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Test Cases");
        int testCase = sc.nextInt();
        System.out.println("input 2 values");
        for (int i = 0; i < testCase; i++) {
            value.add(sc.next());
        }
        for (String a : value) {
            char[] charArray = a.toCharArray();
            char[] temp = new char[30];
            int i = -1;
            for (char c : charArray) {
                if (c == 'n') {
                    temp[++i] = c;

                } else if (c == 'e') {
                    temp[++i] = c;

                } else if (c == 'p') {
                    temp[++i] = c;

                } else if (c == 'a') {
                    temp[++i] = c;

                } else if (c == 'l') {
                    temp[++i] = c;

                }

            }
            if (isNepal(temp)){
                System.out.println("Ma banauchu nepal lai!!");
            }
            else {
                System.out.println("Hami Banauchau Nepal Li!!");
            }
        }
    }

    public static boolean isNepal(char[] temp) {
        boolean value = false;
        for (char am : temp) {
            if (am == 'n' || am == 'e' || am == 'a' || am == 'l' || am == 'p') {
                   value=true;
            }
        }
        return value;
    }
}

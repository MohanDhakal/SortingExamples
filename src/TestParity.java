import java.util.HashMap;
import java.util.Set;

public class TestParity {

    public static void countDuplicates(String str) {
        HashMap<Character, Integer> myHash = new HashMap<Character, Integer>();
        char[] charArray = str.toLowerCase().toCharArray();
        for (char c : charArray) {
            if (myHash.containsKey(c)) {
                myHash.put(c, myHash.get(c) + 1);
            } else myHash.put(c, 1);
        }
        Set<Character> charSet = myHash.keySet();
        int count = 0, count1 = 0;
        for (char c : charSet) {
            if (isEven(c)) {
                count = 1;
            } else if (isOdd(c)) {
                count1 = 1;
            }
        }
        if (count1 == 1 && count == 1) {
            System.out.println(2);
        }
        else if (count == 1) {
            System.out.println("0");
        }else if (count1 == 1) {
            System.out.println("1");

        }
    }

    public static boolean isEven(int c) {
        if (c % 2 == 0) {
            return true;
        } else return false;
    }

    public static boolean isOdd(int c) {
        if (c % 2 != 0) {
            return true;
        } else return false;
    }


    public static void main(String[] args) {
        countDuplicates("myhoaaitax");
    }
}

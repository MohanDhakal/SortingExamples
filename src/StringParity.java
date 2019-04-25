import java.util.HashMap;
import java.util.HashMap;
import java.util.Set;

public class StringParity {

    public static void countDuplicate(String str) {
        HashMap<Character, Integer> myHashString = new HashMap<Character, Integer>();
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            if (myHashString.containsKey(c)) {
                myHashString.put(c, myHashString.get(c) + 1);
            } else {
                myHashString.put(c, 1);
            }
        }
        System.out.println("Dupliactes counts");
        Set<Character> myCharSet = myHashString.keySet();
        int count = 0,count1=0;
        for (char c : myCharSet) {
            if (isEven(myHashString.get(c)) ) {
                count=1;
            }
            else if (isOdd(myHashString.get(c))){
                count1=1;
            }
        }
        if (count==1&&count1==1){
            System.out.println("2");
        }
        else if (count==1){
            System.out.println("0");

        }
        else if (count1==1){
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
        countDuplicate("coachesarefun");
    }
}

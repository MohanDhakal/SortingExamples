public class Random {
    public static void main(String[] args) {
        //finding the sum of the integer from 1 to 100
        int a[] = {1, 3, 4, 5, 2, 7, 6,8,9};
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            temp += a[i];
        }
        System.out.println(temp);
        //can find the one missing element
        int sum = (a.length * (a.length + 1)) / 2;
        System.out.println(sum);
        String name="mOhan";
        System.out.println(name.toUpperCase());

    }
    //sorting elements using bubble sort

}

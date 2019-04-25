

//inplace algorithm
public class MergeSort {
    static int index = 0;

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        mergeSort(intArray, 0, intArray.length);
        for (int a : intArray) {
            System.out.println(a);
        }
    }

    public static void mergeSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int mid = (start + end) / 2;
        //sorts left elements
        mergeSort(input, start, mid);
        //sorts right elements
        mergeSort(input, mid, end);
        //merges the left and the right array
        merge(input, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end) {
        if (input[mid - 1] <= input[mid]) {
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }
        //copies any remaining element in the left array
        //here 55 is in it's correct position mid-i=0,hence this function has no work to do
        //if there was 55 instead of 35 in the left array this function would work
        //and copies 55 to the last index of input array
        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        //copies all temp array back to original array
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}

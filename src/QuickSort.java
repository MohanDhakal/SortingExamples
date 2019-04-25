public class QuickSort {
    public static void main(String[] args) {
        int[] intArray = {-38, -22, -15, 7, 55, 1, -17, -16, 7, 9, 11, 35};
        QuickSort(intArray, 0, intArray.length);
        System.out.println(intArray.length);
        for (int pass :
                intArray) {
            System.out.println(pass);
        }

    }

    public static void QuickSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }
        //returns the position of pivotIndex
        int pivotIndex = partition(input, start, end);
        //left subarray
        QuickSort(input, start, pivotIndex);
        //right subarray
        QuickSort(input, pivotIndex + 1, end);

    }

    public static int partition(int[] input, int start, int end) {
        //taking first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;
        while (i < j) {
            //just skips until found greater than pivot and moves once found less than pivot
            while (i < j && input[--j] >= pivot) ;
            //optimization because when equal don't need to copy
            if (i < j) {
                input[i] = input[j];
            }
            //just skips until found less than pivot and moves once found greater to the right
            while (i < j && input[++i] <= pivot) ;

            if (i < j) {
                input[j] = input[i];
            }

        }
        input[j] = pivot;
        return j;
    }

}

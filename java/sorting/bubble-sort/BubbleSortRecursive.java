import java.util.Arrays;

class BubbleSortRecursive {
  public static void main(String [] args) {
    int arr[] = new int[] {4, 12, 3, 75, 2, 48, 3, 27, 19};
    System.out.println(Arrays.toString(arr));
    bubbleSortRecursive(arr, arr.length);
    System.out.println(Arrays.toString(arr));
    int arrSorted[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
    bubbleSortRecursive(arrSorted, arrSorted.length);
    System.out.println(Arrays.toString(arrSorted));
  }

  public static void bubbleSortRecursive(int[] arr, int n) {
    if (n == 1) {
      return;
    }

    int swaps = 0;
    for (int curIndex = 0; curIndex < n - 1; curIndex ++) {
      if (arr[curIndex] > arr[curIndex + 1]) {
        int firstVal = arr[curIndex];
        arr[curIndex] = arr[curIndex + 1];
        arr[curIndex + 1] = firstVal;
        swaps++;
      }
    }

    if (swaps == 0) {
      return;
    }

    bubbleSortRecursive(arr, n - 1);
  }
}

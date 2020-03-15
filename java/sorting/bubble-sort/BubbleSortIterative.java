import java.util.Arrays;

class BubbleSortIterative {
  public static void main(String [] args) {
    int arr[] = new int[] {4, 12, 3, 75, 2, 48, 3, 27, 19};
    System.out.println(Arrays.toString(arr));
    bubbleSortIterative(arr);
    System.out.println(Arrays.toString(arr));
  }

  public static void bubbleSortIterative(int[] arr) {
    for (int step = 0; step < arr.length - 1; step++) {
      for (int curIndex = 0; curIndex < arr.length - 1 - step; curIndex++) {
        if (arr[curIndex] > arr[curIndex + 1]) {
          int firstVal = arr[curIndex];
          arr[curIndex] = arr[curIndex + 1];
          arr[curIndex + 1] = firstVal;
        }
      }
    }
  }
}

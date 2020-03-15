import java.util.Arrays;

class BubbleSortIterative {
  public static void main(String [] args) {
    int arr[] = new int[] {4, 12, 3, 75, 2, 48, 3, 27, 19};
    System.out.println(Arrays.toString(arr));
    bubbleSortIterative(arr);
    System.out.println(Arrays.toString(arr));
  }

  public static void bubbleSortIterative(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int k = 0; k < arr.length - 1 - i; k ++) {
        if (arr[k] > arr[k + 1]) {
          int firstVal = arr[k];
          arr[k] = arr[k + 1];
          arr[k + 1] = firstVal;
        }
      }
    }
  }
}

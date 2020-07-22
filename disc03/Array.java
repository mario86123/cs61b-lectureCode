public class Array {
    public static int[] insert(int[] arr, int item, int position) {
        int[] tmp = new int[arr.length + 1];
        for (int i = 0; i < position; i += 1) {
            tmp[i] = arr[i];
        }
        tmp[position] = item;
        for (int i = position; i < arr.length; i += 1) {
            tmp[i + 1] = arr[i];
        }
        return tmp;
    }
    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2 - 1; i += 1) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i];
        }
    }
    public static int[] replicate(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i += 1) {
            sum += arr[i];
        }
        int[] tmp = new int[sum];
        sum = 0;
        for (int i = 0; i < arr.length; i += 1) {
            for (int j = 0; j < arr[i]; j += 1) {
                tmp[sum + j] = arr[i];
            }
            sum += arr[i];
        }
        return tmp;
    }
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i += 1) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] x = new int[]{5, 9, 14, 15};
        printArr(x);
        x = insert(x, 6, 2);
        printArr(x);
        reverse(x);
        printArr(x);
        int[] y = new int[]{3, 2, 5, 4};
        y = replicate(y);
        printArr(y);
    }
}
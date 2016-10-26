package cw07;

/**
 * Created by Evgeniy on 26.10.2016.
 */
public class Test {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
//        arr[5] = 60;
        System.out.println(arr[4] + arr[3]);

        int[] array1 = new int[]{12, 6, -15, 6, 10};
        int[] array2 = {12, 6, -15, 6, 10};

        printArray(arr);
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

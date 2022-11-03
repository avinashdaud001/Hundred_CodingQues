import java.util.Scanner;
public class CounterSpecificNo {
    public static void main(String[] args) {
        System.out.println("enter array size");
        Scanner avi = new Scanner(System.in);
        int size = avi.nextInt();
        int arr[] = new int[size];
        System.out.println("emter array value");
        for (int i = 0; i < size; i++) {
            arr[i] = avi.nextInt();

        }
        System.out.println("enter No which you want to count frequency");
        int key = avi.nextInt();
        int count = 0;


        for (int i = 0; i < size; i++) {

            if (arr[i] == key) {
                System.out.println();
                count++;

            }
            System.out.println("frequency=" + arr[i] + " " + count);
        }
    }
}


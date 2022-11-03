import java.util.Scanner;
public class CountFrequency {
    public static void main(String[] args) {
        Scanner avi =new Scanner(System.in);
        System.out.println("enter array Size");
        int size=avi.nextInt();
        int arr[]=new int[size];
        int arrb[]=new int [size];
        int c=0;
        System.out.println("enter array value");
        for(int i=0;i<size;i++){
            arr[i]= avi.nextInt();
        }
        for(int i=0;i<size;i++){
            c=1;
            if(arr[i]!=-1){
                for(int j=i+1;j<size;j++){
                    if(arr[i]==arr[j]){
                        c=c+1;
                        arr[j]=-1;
                    }
                }
                arrb[i]=c;
            }

        }
        for(int i=0;i<size;i++){
            if(arr[i]!=-1){
                System.out.println(arr[i]+" "+arrb[i]);
            }
        }
    }
}

import java.util.*;
class Maxmin{
    public static void main(String[] args){
        // int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int arr[] = new int[10];
        System.out.println("Enter the elements of the array");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
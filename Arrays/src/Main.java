import java.util.Scanner;
import java.util.Arrays;




public class Main {

    static boolean search(int[] arr, int item){

        for(int i=0; i<arr.length; i++){
            if(arr[i] == item){
                System.out.println(item + " is at " + i);
                return true;
            }
        }
        return false;
    }

    static int[] insertAtEnd(int[] arr, int item){
        int[] newArr = new int[arr.length + 1];

        for(int i=0; i<arr.length; i++){
            newArr[i] = arr[i];
        }
        newArr[newArr.length-1] = item;

        return newArr;
    }


    public static void main(String[] args) {

        int[] arr = {18, 34, 12, 56, 23};
//        search(arr, 34);

        System.out.println("Old Array: " + java.util.Arrays.toString(arr));
        System.out.println("New Array: "+ java.util.Arrays.toString(insertAtEnd(arr, 100)));
    }
}
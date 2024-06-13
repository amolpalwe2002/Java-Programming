public class isSorted {

    static int isArraySorted(int[] arr){
        
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                return 0;
            }           
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] arr = {3,6,9,12,15};
        System.out.println(isArraySorted(arr));
        
    }
    
}

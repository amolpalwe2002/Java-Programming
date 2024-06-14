public class twoSum {

    static int[] twoSumFunc(int[] nums, int target) {
        int[] arr = new int[2];

        for(int i =0; i<nums.length-1;i++){
            for(int j=i+1; j<nums.length; j++){
                if((nums[i]+nums[j]==target)){
                    arr[0]=i;
                    arr[1]=j;
                    break;
                    
                }
            }
        }
        return arr;
        
    }
    

    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(twoSumFunc(new int[]{2,7,11,15}, 9)));
    }
}

public class secondLargest {

    static int[] getSecondOrderElements(int n, int []a) {
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int secMax= max;
        int secMin = min;
// Method 02
        for(int i=0; i<a.length;i++){
            max = Math.max(max, a[i]);
            min = Math.min(min, a[i]);
        }

        for(int i=0; i<a.length;i++){
            if(secMax < a[i] && max != a[i]) secMax = a[i];
            if(secMin > a[i] && min != a[i]) secMin = a[i];
        }

// Method 01
//        for(int i=0; i<a.length; i++){
//            if(max<a[i]){
//                secMax = max;
//                max= a[i];
//
//            }
//            else if(secMax<a[i]){
//                secMax=a[i];
//            }
//        }
//
//        for(int i=0; i<a.length; i++){
//            if(min>a[i]){
//                secMin = min;
//                min= a[i];
//            }
//            else if(secMin>a[i]){
//                secMin=a[i];
//            }
//        }

        int[] arr = {secMax, secMin};
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7, 6 };
        System.out.println(java.util.Arrays.toString(getSecondOrderElements(arr.length, arr)));

    }
}

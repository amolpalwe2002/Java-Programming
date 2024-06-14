import java.util.ArrayList;

public class removeDuplicates {

    static int removeDuplicatesFunc(ArrayList<Integer> arr,int n) {
		// Write your code here.

		// HashSet<Integer> set = new HashSet<>();

		// for(int i=0; i<arr.size(); i++){
		// 	set.add(arr.get(i));
		// }

		// return set.size();

		for(int i=0; i<arr.size()-1; i++){
			for(int j=i+1; j<arr.size(); j++){
				if(arr.get(i) == arr.get(j)) arr.remove(j);
			}
		}
        System.out.println(arr);

		return arr.size();
	}

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(4);
        arr.add(5);
        arr.add(5);
        arr.add(5);
        arr.add(6);
        arr.add(6);

        System.out.println(arr);
        System.out.println(removeDuplicatesFunc(arr, arr.size()));
        
    }
    
}

package assignment5;
import java.util.HashMap;

public class ArrayMode {

	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int [] arr = new int[] {3,3,2,3,4,3,2,5,6,4,7,4,3};
		
		int mode = 0;
		int index = -1;
		for(int i = 0; i < arr.length; i++) {
			int key = arr[i];
			if(map.containsKey(arr[i])) {
				map.put(key, map.get(key) + 1);
			}else {
			map.put(key, 1);
			}
			if(map.get(arr[i]) > mode) {
				mode = map.get(arr[i]);
				index = i;
			}
		}
		System.out.println("Mode of arr is : "+mode+" of value is : "+arr[index]);

	}

}

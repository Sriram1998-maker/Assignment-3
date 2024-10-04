package homeassignment2;

import java.util.Arrays;
import java.util.List;

public class SecondLargest {

	    public static void main(String[] args) {
	        int[] array = {3, 2, 11, 4, 6, 7};
	        List<Integer> list = Arrays.asList(3, 2, 11, 4, 6, 7);
	        list.sort(Integer::compareTo);
	        int secondLargest = list.get(list.size()-2);
	        System.out.println("The second largest number is: " + secondLargest);
	    }
	}

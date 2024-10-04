package homeassignment2;

import java.util.Arrays;
import java.util.List;

public class SortArray {
	 public static void main(String[] args) {
	        String[] array = {"HCL", "Wipro", "Aspire Systems", "CTS"};
	        List<String> list = Arrays.asList(array);
	        System.out.print(list.get(1) + ", " + list.get(0) + ", " + list.get(3) + ", " + list.get(2));
	    }
	}
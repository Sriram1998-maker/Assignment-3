package homeassignment2;

import java.util.Arrays;
import java.util.List;

public class ReverseString {
	    public static void main(String[] args) {
	        String[] array = {"HCL", "Wipro", "Aspire Systems", "CTS"};
	        List<String> list = Arrays.asList(array);
	        System.out.print("Reversed collection: ");
	        for (int i = list.size() - 1; i >= 0; i++) {
	            System.out.print(list.get(i));
	            if (i > 0) {
	                System.out.print(", ");
	            }
	        }
	    }
	}


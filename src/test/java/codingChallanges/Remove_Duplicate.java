package codingChallanges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Remove_Duplicate {
	
	public static void main(String[] args) {

		List<Integer> number=new ArrayList<Integer>(Arrays.asList(10,10,30,30,40,40));
	
		List<Integer> duplicate=number.stream().distinct().collect(Collectors.toList());
		System.out.println(duplicate);
	}

}

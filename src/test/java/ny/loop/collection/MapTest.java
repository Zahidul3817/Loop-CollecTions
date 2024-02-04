package ny.loop.collection;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	
	public static void main(String[] args) {
		
		Map<String,Integer> test= new HashMap<String,Integer>();
		
		test.put("Anik", 350);
		test.put("Hassibull", 250);
		test.put("Fahim", 250);
		test.put("Hassibull", 250);
		test.put(null, null);
		test.put(null, null);
		System.out.println(test);
		
		
		
		
	
	HashMap<Integer,String> map=new HashMap<>();
	map.put(1, "car");
	map.put(2, "bus");
	map.put(3, null);
	map.put(null, null);
	System.out.println(map);
}
}
package codingChallanges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class Duplicate_FindOut_from_Arry {
	
	@Test
	public static void getDuplicateElement() {
		/*String[] value = { "Java", "Selenium", "Maven", "TestNG", "Cucumber", "Java" };
		
		System.out.println(Arrays.toString(value));
		
		HashSet<String> store = new HashSet<>();
		
		for (String duplicate : value) {
			
			if (store.add(duplicate) == false) {
				
				System.out.println("This is my duplicate value : " + duplicate);
			}
		}
	}*/
		String[] value = { "Java", "Selenium", "Maven", "TestNG", "Cucumber", "Java" , "Selenium"};
		
		HashSet<String> store=new HashSet<>();
		for(String dup:value) {
			if(store.add(dup)==false) {
				//System.out.println(dup);
				
			}
		}
		
		// How to find out the duplicate from the array?
		// First, I have to initialize the array.
		
				String[] names = { "Selenium", "java", "java", "Phython" };
				
				// Then I have to create the nested loop to compare the data.
				for (int i = 0; i < names.length; i++) {
					for (int j = i + 1; j < names.length; j++) {
						
					// Then I have to use the condition. If there is any duplicate value found
					// it will catch 
						if (names[i]==(names[j])) {
							
							//System.out.println(names[i]);		
						}
						
					}
					
				}
				
				
				
				// How to remove duplicate using Stream api?
				
				
				

				}
	
			}

		
				
			
	
	

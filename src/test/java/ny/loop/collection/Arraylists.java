package ny.loop.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Arraylists {
	public static void main(String[] args) {
		
		ArrayList<Integer> list= new ArrayList<>();
		
		list.add(100000);
		list.add(200000);
		list.add(300000);
		list.add(null);
		list.add(null);
		list.add(null);
		list.add(300000);
		System.out.println(list);
		
		
	}
}

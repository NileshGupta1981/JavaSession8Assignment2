import java.util.HashSet;
import java.util.Iterator;

public class Session8Assignment2{
	
	public static void main (String args[]){
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("asd");
		hs.add("zxc");
		hs.add("qwe");
		hs.add("bnm");
		
		Iterator<String> itr = hs.iterator();
		
		System.out.println ("Traversing the hashset");
		
		while (itr.hasNext()){
			
			System.out.println (itr.next());
			
		}
		
		
		
		
	}
	
	
}
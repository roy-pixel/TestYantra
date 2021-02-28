package ProgramForTestYantra;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Remove_____DuplicateCharacterInString {      // i have created a branch for the practical session

	public static void main(String[] args) {	
		String x= "Welcome to Test Yantra";		
		char y[] = x.toCharArray();
		int size = x.length();		
		Map<Character,Integer>   map   = new LinkedHashMap<>();		
		int i =0;
		while(i!= size) {
			if(map.containsKey(y[i])== false) {		
			map.put(y[i], 1);
			}
			else {			
				int oldvalue = map.get(y[i]);
				int newvalue = oldvalue +1;
				map.put(y[i], newvalue);
			}
			i++;
		}		
		Set<Map.Entry<Character,Integer>>     lhmap   =   map.entrySet();		
		String res = "";
		for (Map.Entry<Character, Integer> data : lhmap) {			
		res = res + data.getKey();
		}
		System.out.println(res);
	}
}

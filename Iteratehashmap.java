import java.util.HashMap;
import java.util.Map;


public class Iteratehashmap {
public static void main(String[] args){
	
	Map<String,String> map=new HashMap<String,String>();
	map.put("1", "raj");
	map.put("2", "ch");
	
	for(Map.Entry<String, String> entry:map.entrySet())
	System.out.println(entry.getKey()+ "="+entry.getValue());
	
}
}



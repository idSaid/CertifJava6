package generecite;

import java.util.ArrayList;
import java.util.Collection;

public class G1 {

	public void takeList(java.util.List<? extends String> list){
		
		Object o = list;
		String s=list.get(0);
		list = new ArrayList<String>();
		
//		list= new ArrayList<Object>();		// impossible car object n'herite pas de String
//		String arg0;	
//		list.add(arg0);		add ne marche pas "list en lecture seule"
		
	}
}

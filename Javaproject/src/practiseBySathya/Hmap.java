package practiseBySathya;

import java.util.HashMap;
import java.util.Map;

public class Hmap {
	
	Object [] [] data = {
			{"John"},
			{"90040"},
			{"No:19"},
			{"60016"},
						
	};
	
	@dataprovider
	public Object[][] DP(){
		
		
	}
	
	
    @Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Name, Mobile, Address, pincode

		John, 83993993, Address,689002
		Abdul,83999300, Address2, 3783930
		Sham,83993990,Address3,83883*/

		
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("Name", "John");
		map.put("Mobile", "9003035995");
		map.put("Address", "No:19");
		map.put("pincode", "600016");
		System.out.println(map);

	}
	

}

//WAP to create a map using Wrapper class as key and value same as keys� data type
//WAP to count the number of key-value (size) mappings in a map.
package HashMapAssignments;

import java.util.HashMap;

public class Assign_04 
{
	HashMap<Integer, Integer>mapI;
	HashMap<Float, Float>mapF;
	HashMap<Double,Double>mapD;
	HashMap<Character, Character>mapC;
	public void creatMap()
	{
		mapI=new HashMap<>();
		mapI.put(11, 100);
		mapI.put(2, 200);
		mapI.put(4, 200);
		
		mapF=new HashMap<>();
		mapF.put(0.89f, 56.89f);
		mapF.put(0.2f, 0.89f);
		
		mapD=new HashMap<>();
		mapD.put(0.9, 45.987);
		mapD.put(8.9,123.5);
		mapD.put(8.9,234.5);		
		
		mapC=new HashMap<>();
		mapC.put('A', '2');
		mapC.put('b', '%');
		mapC.put('S', 'W');
		mapC.put('T', '*');
		
		System.out.println("Float      type HashMap size   "+mapF.size()+"  HashMap "+mapF);
		System.out.println("Integer    type HashMap size   "+mapI.size()+"  HashMap "+mapI);
		System.out.println("Double     type HashMap size   "+mapD.size()+"  HashMap "+mapD);
		System.out.println("Character  type HashMap size   "+mapC.size()+"  HashMap "+mapC);
	}
	public static void main(String[] args) {
		Assign_04 as= new Assign_04();
		as.creatMap();
	}

}

package intf.cls.demo.copy;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Deque;
import java.util.LinkedList;

public class InterfaceAndClass {
	//encapsulation
	private List <String> names = List.of("Frodo", "Bilbo", "Samwise", "Aragorn", "Arwen");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create an object and then call the run method on the object
		InterfaceAndClass iac = new InterfaceAndClass();
		iac.run();
		
		//new InterfaceAndClass().run();

	}

	private void run() {
//		// TODO Auto-generated method stub
//		List <String> something = new ArrayList<>();
//		//something.addAll(names);
//		manage(something);
//		
//		
//		
//	}
//
//	private void manage(List<String> something) {
//		// TODO Auto-generated method stub
//		something.addAll(names);
//		System.out.println(something.size());
		
		//how to create a set with the list of names
		//1. addAll
		Set<String> nameSet = new HashSet<>(names);
		nameSet.addAll(names);
		
		//2. Constructor
		Set<String> newNames = new HashSet <> (names);
		
		System.out.println(nameSet);
		System.out.println(newNames);
		
		//3. Loop
		Set<String> loopSet = new HashSet <>();
		
		for(String name : names) {
			loopSet.add(name);
		}
		
		System.out.println(loopSet);
		
		//4. Functional stuff
		Set<String> streamSet = names.stream().collect(Collectors.toSet());
		
		System.out.println(streamSet);
		
		/*
		 *Primitive 		Wrapper
		 *byte				Byte
		 *short				Short
		 *int				Integer
		 *long				Long
		 *float				Float
		 *double			Double	
		 *char				Character
		 *boolean			Boolean 
		 */
		
		//5. Map
		Map <String, Integer> nameLength = new HashMap<>();
		
		for (String name: names) {
			nameLength.put(name, name.length());
		}
		System.out.println(nameLength.keySet());
		System.out.println(nameLength.values());
		
		Deque<String> nameList = new LinkedList<>(names);
		System.out.println(nameList);
		System.out.println(nameList.getFirst());
		System.out.println(nameList.getLast());
		for(int i = 0; i<names.size(); i ++) {
			System.out.println(names.get(i));
		}
		
	}
	

}

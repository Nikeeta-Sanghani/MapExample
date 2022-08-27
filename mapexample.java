package mapexample;

import java.util.*;  

public class mapexample {

    static HashMap<Integer,String> map;
    
    public  mapexample() {
	//constructor
	
	map=new HashMap<Integer,String>();//Creating HashMap 
	
	
    }
      
     public static void main(String args[])
    
     {  
       
	 
	 new mapexample();
	 puthasmap();
	 printhasmap();
	conditionalput();
	removeitem();
	whileiteratorexample();
	lamdatraverseexample();
	sortexample();

     } // end of main  
   

    private static void sortexample() {
	
	map.clear(); // we clear map to create non sorted entries
	map.put(12,"Bhavin");
	map.put(9,"Nandita");
	map.put(1,"Nikeeta");
	map.put(15,"Dhairya");
	Iterator <Integer> it = map.keySet().iterator();         
	System.out.println("Before Sorting");  
	while(it.hasNext())  
	{  
	int key=(int)it.next();  
	System.out.println("Roll no:  "+key+"     name:   "+map.get(key));  
	}  
	System.out.println("This would give sorted map iteration using lamda");
	map.forEach((k,v) -> System.out.println("Key: "+ k + ", Value: " + v)); 
	
	System.out.println("Iterating through FOREACH Style also gives sorted on key \n");
	
	for(Map.Entry  m:map.entrySet())
	
	{
	    System.out.println("Key -->"+ m.getKey()+"  Value --->"+m.getValue());
	};
	
	
	System.out.println(" Example of Tree Map also gives sorted results \n");
	TreeMap<Integer,String> tm=new  TreeMap<Integer,String> (map);  
	Iterator itr=tm.keySet().iterator();               
	while(itr.hasNext())    
	{    
	int key=(int)itr.next();  
	System.out.println("Roll no:  "+key+"     name:   "+map.get(key));  
	}    
	
	
	
	
	// TODO Auto-generated method stub
	
    } // end of sort eample

    private static void lamdatraverseexample() {
	System.out.println("Now iterating using lamda function \n");
	map.forEach((k,v) -> System.out.println("Key: "+ k + ", Value: " + v));   
	
	// TODO Auto-generated method stub
	
    }

    private static void whileiteratorexample() {
	Iterator <Integer> it = map.keySet().iterator();       //keyset is a method
	while (it.hasNext())
	{
	    int key=it.next();
	    System.out.println("Key --->"+key+"  Value is --->"+map.get(key));
	}
	
	// TODO Auto-generated method stub
	
    } // end of method

    private static void removeitem() {
	
	map.remove(5);
	System.out.println("Printtingi aftter removing \n ");
	printhasmap();
	// TODO Auto-generated method stub
	
    }

    private static void conditionalput() {
	
	map.putIfAbsent(5,"Nikeeta children");
	System.out.println("Printtingi aftter adding conditional key value pair \n ");
	printhasmap(); 
	// TODO Auto-generated method stub
	
    }

    private static void printhasmap() {
	// TODO Auto-generated method stub
	 System.out.println("Iterating Hashmap...");  
	 for(Map.Entry<Integer,String> m : map.entrySet()){   // it is better practice to put Integer and String if not put still it will work.    
	     System.out.println(m.getKey()+" "+m.getValue());    
	 } // end of for each
    } // end of method printhasmap

    private static void puthasmap() {
	
	
		map.put(1,"Bhavin");  //Put elements in Map  
		map.put(2,"Nandita");    
		map.put(3,"Nikeeta");   
		map.put(4,"Dhairya");   
	
	// TODO Auto-generated method stub
	
    }
    
    
    
} //end of class;

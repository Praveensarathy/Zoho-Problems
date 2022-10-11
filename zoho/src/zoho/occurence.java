package zoho;

import java.util.*;
import java.util.Map.Entry;

public class occurence {

	public static void main(String[] args) {
		int arr[]={14, 7 ,14, 6 ,1 ,11 ,3 ,16 ,16 ,8 ,7, 4, 11 ,15 ,17 ,6 ,1 ,13};
		int n = arr.length;
	      HashMap<Integer,Integer>  hash = new HashMap<Integer,Integer>();
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        int count  = 0;
	        for(int i=0;i<n;i++){
	            count =1;
	            if(!(hash.containsKey(arr[i])))
	                hash.put(arr[i],count);
	            else{
	                for(Entry<Integer,Integer> entry : hash.entrySet() ) {
	            		if(entry.getValue()== hash.get(arr[i])){
	            			hash.put(arr[i],entry.getValue()+1); 
	            			break;
	            		}
	            	}
	            }
	        }
	        for(Entry<Integer,Integer> entry : hash.entrySet() ) {
	        	
	       		if(entry.getValue()!=1){
	       			System.out.println(entry.getKey() +" = "+ entry.getValue());
	       		    list.add(entry.getKey());
	        	}
	        }
	        Collections.sort(list);
	        if(list.size()==0){
	            list.add(-1);
	        }
	        
	            
	        System.out.println(list);
}
}

package codingpractice;

import java.util.Map;
import java.util.TreeMap;

public class Programs {
	
	
	//Merge two sorted arrays.
	public static void main(String[] args) {

   int a[]= { 1, 3, 4, 5};
   int b[]= {2, 4, 6, 8};
   
   Map<Integer,Boolean> map = new TreeMap<Integer,Boolean>();
   for(int i=0;i<a.length;i++)
   {
	   map.put(a[i],true);
   }
   for(int i=0;i<b.length;i++)
   {
	   map.put(b[i],true);
   }
   for(Map.Entry<Integer,Boolean> me : map.entrySet())
   {
	   System.out.print(me.getKey() + " ");
   }
   
		//: Using Maps (O(nlog(n) + mlog(m)) Time and O(N) Extra Space) 
}

}

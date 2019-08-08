package ex1;
import java.util.Arrays;
import java.util.HashMap;

public class Class2 {
	public void smallest(int [] arr) {

        Arrays.sort(arr);
         var min = arr[0];
         for (int i = 1; i < arr.length; i++)
         {
             int number = arr[i];
             if (number < min)
             {
                 min = number;
             }
         }
         System.out.print(min);
         System.out.printf("%n");
	}
	public void hashM() {
		HashMap<String, String> lastNames = new HashMap<String, String>();
		lastNames.put("Mariana", "Sandoval");
		lastNames.put("Luis", "Osuna");
		lastNames.put("Pepe", "Loco");
		lastNames.put("Jose", "Sanchez");
	    
	    for (String i : lastNames.keySet()) {
	    	System.out.println("key Name: " + i + ", value Last Name: " + lastNames.get(i));
	    }
	  }

}

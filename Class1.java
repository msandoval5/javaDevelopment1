package ex1;
import java.io.Console;
import java.util.Arrays;
import java.util.Collections; 

public class Class1 {
	
	public static String compare(String a, String b) {
		for (int i = 0; i <a.length() ; i++) {
            if(a.charAt(i)!=b.charAt(i))
            	System.out.println("Not equal");
        }
		System.out.println("Equal");
		return null;
	}
	public static boolean biggestNumber(int[] array) {
		int max = array[0];
        for (int j = 1; j < array.length; j++)
        {
            if (array[j] > max)
            {
                max = array[j];
            }
        }
        System.out.println("The biggest number is: " +max);
        
		return false;
		
	}
	public static void sorting(String[] sorted) {
		String str;
		int ArrLength = sorted.length;
		
		Arrays.sort(sorted);
		for(int i=0; i< ArrLength; i++) {
			str = sorted[i];
			System.out.println(str);
		}
        Arrays.sort(sorted, Collections.reverseOrder());
        for(int i=0; i< ArrLength; i++) {
			str = sorted[i];
			System.out.println(str);
		}
	}
	public static int count(String word) {
		int l = 0;
		for(int i=0;i<=word.length(); i++) {
			l = i;
		}
		System.out.print(l);
		System.out.printf("%n");
		return 0;
	}
	 public static void main(String[] args) {
		
		 compare("perrito","perrito");
		 biggestNumber(new int[] {2,5,1,3});
		 sorting(new String[] {"hey","good","morning"});
		 count("Oso");
		 Class2 dos = new Class2();
		 dos.smallest(new int[] {9,2,3,6,1});
		 dos.hashM();
		 
	 }

}

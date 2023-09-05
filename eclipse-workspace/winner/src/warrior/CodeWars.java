package warrior;
import java.util.*;

public class CodeWars {
	//Does my number look big in this? �������!
	//�������������� �������.
	/*
	interface NumberUtils {
  		static boolean isNarcissistic(int n) {
    		return (n + "").chars().map(c -> (int) Math.pow(c - 48, (int) Math.log10(n) + 1)).sum() == n;
  		}
	}
	*/
	public static boolean isNarcissistic(int number) {
      int count = 0;
      int num = number;
      //algorithm for finding the number of digits in a number
      while (num > 0) {
        count++;
        num/=10;
      }
      
      num = number;
      //
      int otvet = 0;
      int digit = 0;
      for (int i = count;i > 0;i--) {
        if(num < 0) {
        	otvet += Math.pow(num,count);
        }
    	int d = (int)Math.pow(10 , i - 1);
        digit = num / d;
        
        // ������ �����, ����� �������� � ������� i � ����������� ������� �������� �� ������� � �����, � ��������� � ������ ��� ��������.
        System.out.println(digit);
        
        num -= digit*d;
        otvet += Math.pow(digit,count);
      }
      if (otvet == number){
        return true;
      }
      return false;
    }
	//Credit Card Mask
	//������������.������!
	/*
	 public static String maskify(String str) {
        return str.replaceAll(".(?=.{4})", "#");
     }
	  */
	
	public static String maskify(String str) {
        //throw new UnsupportedOperationException("Unimplemented");
      int len = str.length();
      String otvet = "";
      for (int i = 0;i < len - 4 ;i++) {
    	  otvet+="#";
      }
      return otvet + str.substring(len - 4);
    }
	
	public static String reverse(String s) {
		String otvet = "";
		for (int i = s.length() - 1;i > -1;i--) {
			otvet += s.charAt(i);
		}
		return otvet;	
	}
	
	public static boolean isValid(char[] walk) {
	    // Insert brilliant code here
		System.out.println(walk.length);
		if (walk.length == 10) {
	    	System.out.println(walk.length);
	    	return true;
	    }
	    return false;
	 }
	public static boolean comp(int[] a, int[] b) {
	    int lenA = a.length;
	    int count = 0;
	    for (int i = 0;i < lenA;i++) {
	      for (int j = 0;j < lenA;j++) {
	        if (a[i] * a[i] == b[j]) {
	          System.out.println("a = " + a[i] +"  b = " + b[j]);
	          count++;
	          break;
	        } 
	      }
	    }
	    if (count == lenA) {
	      return true;
	    }
	    return false;
	  }
	//���������� ������
	//������������.������!
	/*
	  public static String disemvowel(String Z) {
        return Z.replaceAll("(?i)[aeiou]" , "");
    }
	 */
	public static String disemvowel(String str) {
	     String [] strM = str.split("");
	     System.out.println(Arrays.toString(strM));
	     String [] mas = {"a","e", "i", "o", "u", "A", "E", "I", "O", "U"};
	     System.out.println(Arrays.toString(mas));
	     for (int i = 0;i < strM.length;i++) {
	          
	        for (int j = 0;j < mas.length ;j++) {
	        	
	        	if (strM[i].equals(mas[j])){
	        		strM[i] ="";
	        		System.out.print("BAG!");
	            }
	        }
	     }
	     return String.join("",strM);
	}
	
	/*public static char findMissingLetter(char[] array)
	  {
	    char [] slovL = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	    char [] slovU = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	    String ar = Character.toString(array[0]);
	    boolean upper = ar.equals(ar.toUpperCase());
	    
	    if (upper == true) {
	    	for (int i = 0;i < array.length;i++) {
	    		for (int j = 0 ;j < slovU.length; j++) {
	    			if () {
	    				
	    			}
	    		}
	    	}
	    }
	    
	    else {
	    	
	    }
	    return ' ';
	  }*/
	
	//���������� ����������.
	public static void polindrom() {
        // put your code here
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        int len = line.length();
        
        if (len % 2 == 0){
            String firs = line.substring(0,len / 2);
            String sec = line.substring(len/2,len);
            String sek =  new StringBuilder(sec).reverse().toString();
            System.out.print(firs + "  " + sek);
            if(firs.equals(sek)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
        else{
            String firs = line.substring(0,len / 2 );
            
            String sec = line.substring(len/2+1,len);
            
            String sek =  new StringBuilder(sec).reverse().toString();
            //System.out.println(firs + "  " + sek);
            if(firs.equals(sek)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
	
	public static void obrez() {
        // put your code here
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        for (int i = 0;i < count;i++){
        	
        }
    }
	
	/*
	 * */
	public static int[] sortArray(int[] array) {
	    int min = -1;
	    int count = 0;
	    int prom = 0;
	    int sh = 0;
	    
	    for (int h = 0;h < array.length;h++){
	    	if (array[h]%2 != 0) {
	    		sh++;
	    	}
	    }
	    
	    for (int j = 0;j < sh ;j++){
	    	for (int i = 0 ;i < array.length ;i++) { 
	    	  if (array[i] % 2 != 0){
	    		  if (min == -1){
	    			  min = array[i];
	    			  count = i;
	    			  continue;
	    		  }
	    		  else{
	    			  System.out.println("!!!");
	    			  if (array[i] < array[count]) {
	    				  //System.out.println(min);
	    				  min = array[i];
	    				  prom = array[count];
	    				  array[count] = array[i];
	    				  array[i] = prom;
	    			  }  
	    		  }
	    	  }
	      }
	    }
	    System.out.println(array[count]);
	    return array;
	  }
	
	public static List<String> number(List<String> lines) {
	      int siz = lines.size();
	      List otv = new ArrayList(siz);
	      for (int i = 0;i < siz;i++){
	        String num = ""+i;
	        otv.add(num + ": " + lines.get(i));
	      }
	      return otv;
	}
	
	
	public static List<Integer> shit(String expr) {
		String[] arr = expr.split(" ");
		List <Integer> mass = new ArrayList(); 
		for (int i = 0 ;i < arr.length;i++) {
			mass.add(Integer.parseInt(arr[i]));
		}
		return mass;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String expr = sc.nextLine();

                String[] arr = expr.split(" ");
		List <Integer> mass = new ArrayList(); 
		for (int i = 0 ;i < arr.length;i++) {
			mass.add(Integer.parseInt(arr[i]));
		}

	        if (mass.get(0) == 0){
	            String x = "" + 0;
	            String y = "" + (60 - mass.get(1));
	            System.out.println(x + " " + y);
	        }
	        if (mass.get(1) == 0){
	            String x = "" + (12 - mass.get(0));
	            String y = "" + 0 ;
	            System.out.println(x + " " + y);
	        }
	        else{
	            String x = "" + (12 - mass.get(0));
	            String y = "" + (60 - mass.get(1));
	            System.out.println(x + " " + y);
	        }
	}
}

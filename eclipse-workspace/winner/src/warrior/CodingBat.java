package warrior;

public class CodingBat {
	/*The parameter weekday is true if it is a weekday, and the 
	  parameter vacation is true if we are on vacation. We sleep in 
	  if it is not a weekday or we're on vacation. Return true if we sleep in.

	sleepIn(false, false) → true
	sleepIn(true, false) → false
	sleepIn(false, true) → true*/
	public static boolean sleepIn(boolean weekday, boolean vacation) {
		  return weekday == vacation || weekday == false ? true : false;
	}
	/*We have two monkeys, a and b, and the parameters aSmile and bSmile 
	  indicate if each is smiling. We are in trouble if they are both smiling 
	  or if neither of them is smiling. Return true if we are in trouble.

	monkeyTrouble(true, true) → true
	monkeyTrouble(false, false) → true
	monkeyTrouble(true, false) → false*/
	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		   return  aSmile == bSmile? true : false;
	}
	/*Given two int values, return their sum. Unless the two values are the 
	  same, then return double their sum.

	sumDouble(1, 2) → 3
	sumDouble(3, 2) → 5
	sumDouble(2, 2) → 8*/
	public static int sumDouble(int a, int b) {
		  return a != b? a+b : 2*(a+b);
	}
	/*Given a string and a non-negative int n, return a larger string that 
	 * is n copies of the original string.

	stringTimes("Hi", 2) → "HiHi"
	stringTimes("Hi", 3) → "HiHiHi"
	stringTimes("Hi", 1) → "Hi"*/
	public String stringTimes(String str, int n) {
		  int i = 0;
		  String otvet = "";
		  while (i < n){
		    otvet += str;
		    i ++;
		    
		  } 
		  return otvet;
	}
	/*Given a string and a non-negative int n, we'll say that the front of
	 the string is the first 3 chars, or whatever is there if the 
	 string is less than length 3. Return n copies of the front;

	frontTimes("Chocolate", 2) → "ChoCho"
	frontTimes("Chocolate", 3) → "ChoChoCho"
	frontTimes("Abc", 3) → "AbcAbcAbc"*/
	public String frontTimes(String str, int n) {
		  if (str.length() <= 3){
		    return stringTimes(str,n);
		  }
		  String vod = str.substring(0,3);
		  return stringTimes(vod,n);
	}
	//Main
	public static void main(String[] args) {
		System.out.print("Haalo Coding Combat");

	}

}

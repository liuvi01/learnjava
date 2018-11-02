package learnjava;


import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class CodeWar87 {
	
	/**
	 * Sum all numbers in a array except the smallest and biggest one
	 *  handle exceptions including NULL, less than 2 elements etc. 
	 */
	  public static int sumMid(int[] numbers) {
		  int s, b, sum=0;
		  if (numbers==null|| numbers.length<3)
			  return 0;
		  s=b=numbers[0];
		  for (int i=0; i < numbers.length; i++) {
			  int j = numbers[i];
			  sum+=j;
			  s=s > j? j:s;
			  b= b >j? b:j;
		  }
		  return sum-s-b;
	  }

	  /**
	   * check to see if the input string has same amount of 'X's and 'O's, ignore case 
	   * @param str
	   * @return
	   */
	  public static boolean getXO (String str) {
		    
		    // Good Luck!!
		  int x=0, o=0;
		  for (int i=0; i<str.length();i++) {
			  char c=str.charAt(i);
			  if (c=='X'|| c=='x')
				  x++;
			  if (c=='O'|| c=='o')
				  o++;
		  }
		  return x==o;
		    
	  }
	  
	  /**
	   * the array is either all even numbers or odd numbers except 1, find out that one
	   * @param integers - big array with at least 3 elements
	   * @return
	   */
	  public static int findOutlier(int[] integers){
		  int odd=0, even=0;
		  int co=0, ce=0;
		  
		  for (int i=0; i<integers.length;i++) {
			  int j=integers[i];
			  if (j%2==0) {//even
				  ce++;
				  even=j;
			  }
			  else {
				  co++;
				  odd=j;
			  }	
			  /* 
			   * we should avoid counting more than we need to, so break after 
			   * both odd and even numbers are found, and one type of number is more than 1
			   */
			  if (co*ce > 1)
				  break;
		  }
		
		  return co<ce? odd:even;
	  }
	  
	  /**
	   * convert number to reversed array of digits, eg 256 to [6,5,2]
	   * @param n
	   * @return
	   */
	  public static int[] digitize(long n) {
		    // Code here

		  int[] ret=new int[100];
		  int cnt=0;
		  
		  while (true) {
			  if (n>0) {
				long l=n%10;
				ret[cnt++]=(int)l;
				n=(n-n%10)/10;
			  }
			  else {
				 int[] fRet=new int[cnt];
				 for (int i=0; i<cnt; i++)
					 fRet[i]=ret[i];
				 return fRet;
			  }
				  
		  }
		
	}
}

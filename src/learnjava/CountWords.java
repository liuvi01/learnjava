/**
 * 
 */
package learnjava;

import java.util.*;
import java.io.*;

/**
 * @author liuyu. @ count words occurence frequency in a file, and output the
 * top 10 words that occur most of the times.
 */
public class CountWords {

	public static void main(String[] argv) {
	
		Set<String> words = new HashSet<>(); // HashSet implements Set
		long totalTime = 0;

		try {
			File  f=new File(argv[0]);
			
		    Scanner in = new Scanner(new FileInputStream(f));
		    
			while (in.hasNext()) {
				String word = in.next();
				long callTime = System.currentTimeMillis();
				words.add(word);
				callTime = System.currentTimeMillis() - callTime;
				totalTime += callTime;
			}
		}
		catch (IOException e) {
			System.out.println(e);
				
			
		}

		Iterator<String> iter = words.iterator();
		for (int i = 1; i <= 20 && iter.hasNext(); i++)
			System.out.println(iter.next());
		System.out.println(". . .");
		System.out.println(words.size() + " distinct words. " + totalTime + " milliseconds.");

	}

}

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
	
		Map<String, Integer> words = new TreeMap<String, Integer>(); // TreeMap for fast location
		long totalTime = 0;

		try {
			File  f=new File(argv[0]);
			
		    Scanner in = new Scanner(new FileInputStream(f));
		    
			while (in.hasNext()) {
				String word = in.next();
				long callTime = System.currentTimeMillis();
				if (words.containsKey(word))
					words.put(word, words.get(word)+1);
				else
					words.put(word, 1);
				callTime = System.currentTimeMillis() - callTime;
				totalTime += callTime;
			}
		}
		catch (IOException e) {
			System.out.println(e);
				
			
		}

		Iterator iter = words.entrySet().iterator();
		for (int i = 1; i <= 20 && iter.hasNext(); i++)
			System.out.println(iter.next());
		System.out.println(". . .");
		System.out.println(words.size() + " distinct words. " + totalTime + " milliseconds.");
		
		
		/*
		 * Print the first 20 most frequent words and their counts 
		 */
		TreeSet<WordCntEntry>  freqWords=new TreeSet<WordCntEntry>();
		for(String key : words.keySet()) {
			freqWords.add(new WordCntEntry(key, words.get(key)));
		}
		
	    iter = freqWords.iterator();
		for (int i = 1; i <= 20 && iter.hasNext(); i++)	{
			WordCntEntry en= (WordCntEntry)iter.next();
			System.out.println("Word " +en.getWord()+ " ,"+en.getCnt()+" times." );
		}


	}
	

	}




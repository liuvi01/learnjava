/**
 * 
 */
package learnjava;

/**
 * @author liuyu
 *
 * Helper class for countwords class. Implement comparable interface
 */
public class WordCntEntry implements Comparable<WordCntEntry>{
	private String word;
	private int cnt;

	
	@Override
	public int compareTo(WordCntEntry e) {
		if (this.cnt > e.getCnt())
			return -1;
		else if (this.cnt == e.getCnt())
			return 0;
		return 1;
	}
	
	public WordCntEntry(String word, int cnt) {
		this.word=word;
		this.cnt=cnt;
	}
	
	public int getCnt() {
		return cnt;
	}
	
	public String getWord() {
		return word;
	}
}
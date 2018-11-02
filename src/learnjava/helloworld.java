package learnjava;
import  java.util.Arrays;
import learnjava.ClassScore;

public class helloworld {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world 2");
		int[] orig= {89 , -23 , 64 , 91 , 119 , 52 , 73}; 
		int[] t3;
		ClassScore sss = new ClassScore();
		sss.setscore(orig);
		t3 = sss.gettop3();
		System.out.println(Arrays.toString(t3 ) );
	}

}

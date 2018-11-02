package learnjava;



/*
 * 编程练习

小伙伴们，请根据所学知识，编写一个 JAVA 程序，实现输出考试成绩的前三名

要求：

1、 考试成绩已保存在数组 scores 中，数组元素依次为 89 , -23 , 64 , 91 , 119 , 52 , 73

2、 要求通过自定义方法来实现成绩排名并输出操作，将成绩数组作为参数传入

3、 要求判断成绩的有效性（ 0—100 ），如果成绩无效，则忽略此成绩

运行效果：

任务

一、 定义一个包含整型数组参数的方法，用来接收成绩数组，进行成绩排序并输出前三名

提示：
 1、 在方法中使用 Arrays 类的 sort( ) 方法对数组进行排序，默认按升序排列，注意 Arrays 类的使用需要导入 java.util.Arrays
 2、 由于只需要输出考试成绩的前三名，所以定义一个变量，统计有效成绩的前三名的数量
 3、 使用 for 循环遍历数组中的元素，由于要输出的是前三名成绩，所以从后往前遍历，即倒序遍历 如 for ( int i = scores.length - 1; i >= 0; i-- ) { }
 4、 判断成绩的有效性，如果成绩小于 0 或大于 100 ，则使用 continue 忽略此成绩
 5、 如果成绩有效，则有效成绩数加 1 。判断有效成绩的个数，如果有效成绩数大于 3 ，则结束循环，只输出成绩的前三名

二、 完成 main 方法

提示：
 1、 定义一个成绩数组 scores ，保存预定的考试成绩 89 , -23 , 64 , 91 , 119 , 52 , 73
 2、 调用自定义方法，传入成绩数组，完成功能

 

 */
import java.util.Arrays;

public class ClassScore {
	
	private int[] scores;
	
	public void ClassScore() {
		return;
	}
	public void setscore(int[] s) {
		scores = s;
	}
	public int[] getscore() {
		return scores;
	}
	public int[]  gettop3()
	{
		int[] ret=new int[3];
		int count=0;
		Arrays.sort(scores);
		for (int i=scores.length-1;i>=0; i--)
		{
			if (scores[i]>100 || scores[i]<0)
				continue;
			ret[count]= scores[i];
			count++;
			if (count == 3)
				break;
		}
		return ret;
	}
	
}


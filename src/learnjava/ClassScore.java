package learnjava;



/*
 * �����ϰ

С����ǣ��������ѧ֪ʶ����дһ�� JAVA ����ʵ��������Գɼ���ǰ����

Ҫ��

1�� ���Գɼ��ѱ��������� scores �У�����Ԫ������Ϊ 89 , -23 , 64 , 91 , 119 , 52 , 73

2�� Ҫ��ͨ���Զ��巽����ʵ�ֳɼ�������������������ɼ�������Ϊ��������

3�� Ҫ���жϳɼ�����Ч�ԣ� 0��100 ��������ɼ���Ч������Դ˳ɼ�

����Ч����

����

һ�� ����һ������������������ķ������������ճɼ����飬���гɼ��������ǰ����

��ʾ��
 1�� �ڷ�����ʹ�� Arrays ��� sort( ) �����������������Ĭ�ϰ��������У�ע�� Arrays ���ʹ����Ҫ���� java.util.Arrays
 2�� ����ֻ��Ҫ������Գɼ���ǰ���������Զ���һ��������ͳ����Ч�ɼ���ǰ����������
 3�� ʹ�� for ѭ�����������е�Ԫ�أ�����Ҫ�������ǰ�����ɼ������ԴӺ���ǰ��������������� �� for ( int i = scores.length - 1; i >= 0; i-- ) { }
 4�� �жϳɼ�����Ч�ԣ�����ɼ�С�� 0 ����� 100 ����ʹ�� continue ���Դ˳ɼ�
 5�� ����ɼ���Ч������Ч�ɼ����� 1 ���ж���Ч�ɼ��ĸ����������Ч�ɼ������� 3 �������ѭ����ֻ����ɼ���ǰ����

���� ��� main ����

��ʾ��
 1�� ����һ���ɼ����� scores ������Ԥ���Ŀ��Գɼ� 89 , -23 , 64 , 91 , 119 , 52 , 73
 2�� �����Զ��巽��������ɼ����飬��ɹ���

 

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


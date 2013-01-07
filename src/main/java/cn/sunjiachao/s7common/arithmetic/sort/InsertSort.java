package cn.sunjiachao.s7common.arithmetic.sort;

/**
 * 插入排序思路：<br/>
 * 1.从第二索引开始，将这个数据放在temp中，并逐一与左侧数值比较大小，左侧数据依然比temp大的则一次右翼，否则就找到了插入的位置<br/>
 * 2.继续第二次循环插入
 * 
 * @author jiachao.sun
 * 
 */
public class InsertSort {

	public static void main(String[] args) {

		int[] a = { 8, 5, 76, 9, 34, 4, 23, -139, 2 };

		int in, out, temp;

		for (out = 1; out < a.length; out++) {
			in = out;
			temp = a[out];
			while (in > 0 && a[in - 1] > temp) {
				a[in] = a[in - 1];
				in--;
			}
			a[in] = temp;
		}

		for (int n : a) {
			System.out.print(n + " ");
		}

	}

}

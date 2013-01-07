package cn.sunjiachao.s7common.arithmetic.sort;

public class BubbleSort {

	public static void main(String[] args) {

		int[] a = { 8, 5, 76, 9, 34, 4, 23, -139, 2 };

		int in, out, temp;

		for (out = a.length - 1; out > 0; out--) {
			for (in = 0; in < out; in++) {
				if (a[in] > a[out]) {
					temp = a[out];
					a[out] = a[in];
					a[in] = temp;
				}
			}
		}

		for (int n : a) {
			System.out.print(n + " ");
		}

	}

}

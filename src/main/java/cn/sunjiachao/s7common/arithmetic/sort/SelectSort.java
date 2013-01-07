package cn.sunjiachao.s7common.arithmetic.sort;

/**
 * 选择排序思路 <br/>
 * 1.外层从0开始，首先将最小值假设为0<br/>
 * 2.开始内层循环，索引从外层索引+1处，逐个与a[min]比较，符合条件则将min更新为当前最小值，否则继续内层循环<br/>
 * 3.内层循环结束，swap即可<br/>
 * 
 * @author jiachao.sun
 * 
 */
public class SelectSort {

	public static void main(String[] args) {

		int a[] = { 1, 5, 3, 7, 4, -7, 9, 465, 234, 23 };

		int in, out, min, temp;

		for (out = 0; out < a.length - 1; out++) {
			min = out;
			for (in = out + 1; in < a.length; in++) {
				if (a[in] < a[min]) {
					// 如果in小于min，只代表当前位置的值小于min，并不代表右侧没有更小的值
					min = in;
				}
				temp = a[out];
				a[out] = a[min];
				a[min] = temp;
			}
		}

		for (int n : a) {
			System.out.print(n + " ");
		}

	}
}

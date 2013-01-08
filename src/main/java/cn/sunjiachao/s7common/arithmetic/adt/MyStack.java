package cn.sunjiachao.s7common.arithmetic.adt;

public class MyStack {

	public int max;
	public int top;
	public int[] a;

	public MyStack(int max) {
		a = new int[max];
		top = -1;
	}

	public void push(int value) {
		a[++top] = value;
	}

	public int pop() {
		return a[top--];
	}

	public boolean isFull() {
		return (top == max - 1);
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public static void main(String[] args) {
		MyStack ms = new MyStack(10);
		ms.push(100);
		ms.push(80);
		ms.push(60);

		while (!ms.isEmpty()) {
			int value = ms.pop();
			System.out.print(value + " ");
		}

	}

}
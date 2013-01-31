package cn.sunjiachao.s7common.arithmetic.adt;

public class MyQueue {

	public int[] a;
	public int head = -1;
	public int rear = -1;
	public int max;
	public int num = 0;

	public void insert(int value) {

		if (isFull()) {
			System.out.println("满啦");
		} else {
			if (rear == max - 1) {
				rear = -1;
			}
			a[++rear] = value;
			num++;
		}

	}

	public int remove() {
		if (head == max - 1) {
			head = -1;
		}
		num--;
		return a[++head];
	}

	public boolean isEmpty() {
		return num == 0;
	}

	public boolean isFull() {
		return num == (max);
	}

	public static void main(String[] args) {
		MyQueue mq = new MyQueue();
		mq.max = 5;
		mq.a = new int[mq.max];
		mq.insert(1);
		mq.insert(2);
		mq.insert(3);
		mq.insert(4);

		mq.remove();

		mq.insert(5);
		mq.insert(6);
		mq.insert(7);

		while (!mq.isEmpty()) {
			System.out.print(mq.remove() + " ");
		}
	}

}

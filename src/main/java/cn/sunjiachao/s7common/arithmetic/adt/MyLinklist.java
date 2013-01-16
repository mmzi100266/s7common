package cn.sunjiachao.s7common.arithmetic.adt;

public class MyLinklist {

	public Link first;

	//构造函数初始化使头节点为空
	public MyLinklist() {
		first = null;
	}
	
	//判断头节点是否为空
	public boolean ifEmpty() {
		return first == null;
	}

	//从头节点插入，取得原来头节点指向的节点并赋值给插入的节点next域
	//之后再将插入的节点引用赋值给first完成头插入
	public void insertFirst(int data1, long data2) {
		Link newLink = new Link(data1, data2);
		newLink.next = first;
		first = newLink;
	}

	//将头节点中next域指向的下一个节点引用，赋值给头节点完成头删除
	public Link deleteFirst() {
		Link temp = first;
		first = first.next;
		return temp;
	}

	//遍历单向链表，取得头节点的临时变量
	//并在循环中每次把临时节点的引用赋值为自身的next完成遍历
	public void displayLinklist() {
		Link current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
	}

	public static void main(String[] args) {
		MyLinklist mll = new MyLinklist();
		mll.insertFirst(1, 1);
		mll.insertFirst(2, 2);
		mll.deleteFirst();
		mll.insertFirst(0, 0);
		mll.displayLinklist();
	}

}

// 表示链表中的一个节点
class Link {

	public int data1;
	public long data2;
	public Link next;

	public Link(int data1, long data2) {
		this.data1 = data1;
		this.data2 = data2;
	}

	public void displayLink() {
		System.out.println("{ " + data1 + " , " + data2 + " }");
	}

}

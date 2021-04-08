package datastructure.test;


import datastructure.list.LinkedList;

import java.util.List;

public class LinkedListTest {
	public static void main(String[] args) throws Exception {

		List<String> ll = new java.util.LinkedList<>();
		ll.add(1+"");
		int a = 1;
		int b= 101;

		 System.out.println("~~"+1%6);
		System.out.println("~~"+2%6);
		System.out.println("~~"+3%6);
		System.out.println("~~"+4%6);
		System.out.println("~~"+5%6);
		System.out.println("~~"+6%6);
		System.out.println("~~"+7%6);
		System.out.println("~~"+8%6);


		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("B");
		list1.add("E");
		list1.add("C");
		list1.add(list1.getEndK(2));



		System.out.println("原链表：");
		list1.print();
		System.out.println();


		System.out.println("判断链表是否有环：");
		System.out.println(list1.hasLoop());
		list1.print();

		//list1.remove();
		System.out.println("删除尾节点后的链表：");
		list1.print();

		System.out.println();

	//	list1.removeDuplicateNodes();
		System.out.println("删除重复点后的链表：");
		list1.print();
		System.out.println();

		System.out.println("打印倒数第K个节点：");
	//	System.out.println(list1.getEndK(3));
		System.out.println();

		list1.reverseLinkedList();
		System.out.println("反转链表：");
		list1.print();
		list1.reverseLinkedList();
		list1.print();
		System.out.println();

		System.out.println("倒序打印链表：");
		list1.reversePrint(list1.getHead());
		System.out.println();
		System.out.println();

		System.out.println("打印链表中间节点：");
		list1.printMiddleNodes();
		System.out.println();


		LinkedList<String> list2 = new LinkedList<>();
		list2.add("书呆子");
		list2.add(list1.getEndK(2));
		System.out.println("判断两链表是否相交：");
		list1.print();
		list2.print();
		System.out.println(list1.size() + " : " + list2.size());
		System.out.println("是否相交 : " + list1.isIntersect(list2));
		System.out.println("交点是 ： " + list1.getIntersectionPoint(list2));
		System.out.println();

		list1.deleteNodeWithoutHead(list1.getEndK(2));
		System.out.println("打印删除特定节点后的链表：");
		list1.print();



	}
}

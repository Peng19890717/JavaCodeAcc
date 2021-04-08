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



		System.out.println("ԭ����");
		list1.print();
		System.out.println();


		System.out.println("�ж������Ƿ��л���");
		System.out.println(list1.hasLoop());
		list1.print();

		//list1.remove();
		System.out.println("ɾ��β�ڵ�������");
		list1.print();

		System.out.println();

	//	list1.removeDuplicateNodes();
		System.out.println("ɾ���ظ���������");
		list1.print();
		System.out.println();

		System.out.println("��ӡ������K���ڵ㣺");
	//	System.out.println(list1.getEndK(3));
		System.out.println();

		list1.reverseLinkedList();
		System.out.println("��ת����");
		list1.print();
		list1.reverseLinkedList();
		list1.print();
		System.out.println();

		System.out.println("�����ӡ����");
		list1.reversePrint(list1.getHead());
		System.out.println();
		System.out.println();

		System.out.println("��ӡ�����м�ڵ㣺");
		list1.printMiddleNodes();
		System.out.println();


		LinkedList<String> list2 = new LinkedList<>();
		list2.add("�����");
		list2.add(list1.getEndK(2));
		System.out.println("�ж��������Ƿ��ཻ��");
		list1.print();
		list2.print();
		System.out.println(list1.size() + " : " + list2.size());
		System.out.println("�Ƿ��ཻ : " + list1.isIntersect(list2));
		System.out.println("������ �� " + list1.getIntersectionPoint(list2));
		System.out.println();

		list1.deleteNodeWithoutHead(list1.getEndK(2));
		System.out.println("��ӡɾ���ض��ڵ�������");
		list1.print();



	}
}

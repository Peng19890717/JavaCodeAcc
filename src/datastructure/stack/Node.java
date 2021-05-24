package datastructure.stack;

/**
 * Title: ����� 
 * Description: �����Ļ���Ԫ��
 * 
 * @author rico
 * @created 2017��4��6�� ����9:55:58
 */
 public class Node<T> {
	//���ɼ���
	Node<T> next;   
	T data;

	/**
	 * ���캯��
	 * 
	 * @description ����һ���½ڵ�
	 * @author rico
	 * @created 2017��4��6�� ����9:56:56
	 * @param data
	 * ��Ԫ����
	 * ��Ԫ����������Ͻڵ�
	 */
	public Node(T data) { 
		this.data = data;
	}

	public T getData() {
		return data;
	}
	
	@Override
	public String toString() {
		return data.toString();
	}

	public Node<T> getNext() {
		return next;
	}

}
package exercise_fflowerroot.js.p604_Stack과_Queue;

import java.util.EmptyStackException;
import java.util.Vector;

public class Mystack extends Vector {
	public Object push(Object item) {
		addElement(item);
//	    public synchronized void addElement(E obj) {
//	        modCount++;
//	        add(obj, elementData, elementCount);
//	    }
//	    private void add(E e, Object[] elementData, int s) {
//	        if (s == elementData.length)
//	            elementData = grow();
//	        elementData[s] = e;
//	        elementCount = s + 1;
//	    }
		return item;
	}

	public Object pop() {
		Object o = peek();
		removeElementAt(size() - 1);
		return o;
	}

	public Object peek() {
		int len = size();
		if (len == 0)
			throw new EmptyStackException();
		return elementAt(len - 1);

	}

	public boolean empty() {
		return size() == 0;
	}

//    public synchronized int size() {
//        return elementCount;
//    }
	public int search(Object o) { // 마지막인덱스부터 객체를 찾음
		int i = lastIndexOf(o);
//		 public synchronized int lastIndexOf(Object o) {
//		        return lastIndexOf(o, elementCount-1);
//		    }
//	    public synchronized int lastIndexOf(Object o, int index) {
//	        if (index >= elementCount)
//	            throw new IndexOutOfBoundsException(index + " >= "+ elementCount);
//
//	        if (o == null) {
//	            for (int i = index; i >= 0; i--)
//	                if (elementData[i]==null)
//	                    return i;
//	        } else {
//	            for (int i = index; i >= 0; i--)
//	                if (o.equals(elementData[i]))
//	                    return i;
//	        }
//	        return -1;
//	    }
		if (i >= 0) {
			return size() - i;
		}
		return -1;
	}

	public static void main(String[] args) {
		Mystack ms = new Mystack();
		System.out.println(ms.search(22));
		System.out.println(ms.empty());
		if (!ms.empty()) {
			System.out.println(ms.peek());
		} else {
			ms.push(ms);
			ms.push(ms);
			ms.push(1);
			ms.push("a");
			ms.push(ms);
		}
		System.out.println(ms.pop()); // pop되는게 객체이면 남아있는것들을 리턴하고
									  // pop되는게 객체가 아니면? pop된 것을 리턴. 왜??
		
		ms.push(1);
		ms.push("a");
		System.out.println(ms.pop());
		
	}

}

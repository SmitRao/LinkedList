package nodes;
import lists.LinkedList;

public class LinkedNode {
	public Object value;
	public LinkedNode next;
	
	public LinkedNode(Object value) {
		this.value = value;
		this.next = null;
	}
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList("Hi!");
		System.out.println("Front = " + list.front.value + "... Next = " + list.front.next + "...size = " + list.size + "...Back = " + list.back.value);
		list.prepend("New prepend");
		System.out.println("Front = " + list.front.value + "... Next = " + list.front.next.value + "...size = " + list.size + "...Back = " + list.back.value);
		list.append("New append");
		System.out.println("Front = " + list.front.value + "... Next = " + list.front.next.value + "...size = " + list.size + "...Back = " + list.back.value);
		
	}
}

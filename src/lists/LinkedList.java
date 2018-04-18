package lists;
import nodes.LinkedNode;

public class LinkedList {
	public LinkedNode front;
	public LinkedNode back;
	public int size;
	
	public LinkedList(Object first) {
		this.front = new LinkedNode(first);
		this.back = this.front;
		this.size = 1;
	}
	
	public LinkedList() {
		this.front = this.back = null;
		this.size = 0;
	}
	
	public void append(Object item) {
		if(this.size == 0) {
			this.back = this.front = new LinkedNode(item);
			this.size++;
		} else {
			this.back.next = new LinkedNode(item);
			this.back = (LinkedNode) this.back.next;
			this.size++;
		}
	}
	
	public void prepend(Object item) {
		if(this.size == 0) {
			this.back = this.front = new LinkedNode(item);
			this.size++;
		} else {
			LinkedNode prependNode = new LinkedNode(item);
			prependNode.next = this.front;
			this.front = prependNode;
			this.size++;
		}
	}
	
	public void removeIndex(int index) throws IndexOutOfBoundsException {
		/* Remove LinkedNode at given index. 
		 * Precondition: index is at least zero. */
		
		if(!(index < this.size)) {
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds!");
		}
		
		LinkedNode reference = this.front;
		for(int i = 1; i < index; i++) {
			reference = reference.next;
		}
		reference.next = reference.next.next;
		this.size--;
	}
	
	public static void main(String[] args) {
		
		LinkedList friendNames = new LinkedList();
		friendNames.append(4);
		friendNames.prepend(3);
		friendNames.append(5);
		friendNames.prepend(2);
		friendNames.prepend(1);
		
		LinkedNode temp = friendNames.front;
		for(int i = 0; i < friendNames.size; i++) {
			System.out.println(temp.value + " at index " + i);
			temp = temp.next;
		}

		System.out.print("\n\n" + friendNames.front.value + " " + friendNames.back.value + "\n\n");
		
		friendNames.removeIndex(2);
		
		LinkedNode temp2 = friendNames.front;
		for(int i = 0; i < friendNames.size; i++) {
			System.out.println(temp2.value + " at index " + i);
			temp2 = temp2.next;
		}
		
		System.out.print("\n\n" + friendNames.front.value + " " + friendNames.back.value + "\n\n");

	}
}

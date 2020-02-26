package facebook;

/**
 * Contains the methods related to LinkedList
 * 
 * @author chitsimrangill
 *
 */
public class LinkedList 
{
	private static int SizeCounter; // variable used for counting the size of the LinkedList
	private Node head; // refers to the head of the LinkedList
 
	/**
	 * Constructor of the class
	 */
	public LinkedList() 
	{
 
	}
 
	/**
	 * Adds a person the end of the linked list.
	 * Takes the person that needs tobe added as parameter
	 * 
	 * @param p - person that needs to be added
	 */
	public void add(Person p) 
	{
		if (head == null) // CASE: the list is empty
		{
			head = new Node(p);
		}
 
		Node Temp = new Node(p);
		Node Current = head;
 
		if (Current != null) 
		{
			while (Current.getNext() != null) // Iterates over the list till reaches the end of the list
			{
				Current = Current.getNext();
			}
 
			Current.setNext(Temp); // sets the next node of the last node equal to the node that needs to be inserted
		}
 
		SizeCounter++; // increases the size counter
	}
 
	/**
	 * Deletes a node from the linked list
	 * 
	 * @param key - key of the node that needs to be deleted
	 */
	public void deleteNode(int key)
	{
		Node temp = head;
		Node prev = null;
		
		if (temp != null && temp.getPerson().getScore() == key) // if head is the node that needs to be deleted
		{
			head = temp.getNext();
			return;
		}
		
		while (temp!=null && temp.getPerson().getScore()!=key) // searches for the node in the list
		{
			prev = temp;
			temp = temp.getNext();
		}
		if (temp==null) // node was not found
		{
			return;
		}
		prev.setNext(temp.getNext());
		SizeCounter--;
	}
 
	/**
	 * Prints the list
	 */
	public String toString() 
	{
		String print = "";
 
		if (head != null) 
		{
			Node Current = head.getNext();
			while (Current != null) {
				print += Current.getPerson().getName() + "\n";
				Current = Current.getNext();
			}
 
		}
		return print;
	}
	
	/**
	 * Searches a Person in the linked list
	 * Takes the person that needs to be searched as parameter
	 * 
	 * @param P - the person that needs to be searched
	 * @return - the node that was found
	 */
	public boolean Search(Person P)
	{
		Node Current = head;
		int i = 0;
		while (i<SizeCounter)
		{
			if (Current.getPerson().getScore() == P.getScore())
			{
				i++;
				return true;
			}
			i++;
			Current = Current.getNext();
		}
		return false;
	}
	
	

}

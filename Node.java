package facebook;

/**
 * Contains the constructor for creating a node and also contains all the setter-getter methods of a node
 * 
 * @author chitsimrangill
 *
 */
public class Node 
{
	private int key; // instance variable of key of a node
	private Person p; // instance variable of a person that is stored in a node
	private Node next; // refers to the next node in the list
	
	/**
	 * Constructor of the class
	 * It constructs node with a Person and key as its attribute
	 * This constructor is used for creating a node for HashTable
	 * 
	 * @param key - Score of the person's name
	 * @param p - Person that needs to be stored in the node
	 */
	Node(int key, Person p)
	{
		this.key = p.getScore();
		this.p = p;
		this.next = null;
	}
	
	/**
	 * Second Constructor of the class
	 * This constructor is used for creating a node for LinkedList
	 * 
	 * @param P - Person that will be stored in the node
	 */
	Node(Person P)
	{
		this.p = P;
	}

	/**
	 * Gets the key of a node
	 * 
	 * @return - key of a person node which is the score of a person's name
	 */
	public int getKey()
	{
		return key;
	}
	
	/**
	 * Gets the person that is stored in the node
	 * 
	 * @return - Person that is stored in the node
	 */
	public Person getPerson()
	{
		return p;
	}
	
	/**
	 * Gets the next node in the list
	 * 
	 * @return - next node in the list
	 */
	public Node getNext()
	{
		return next;
	}
	
	/**
	 * Allows the user to set the next node of any node
	 * 
	 * @param next - node that needs to set as the new next node of a node
	 */
	public void setNext(Node next)
	{
		this.next = next;
	}
}

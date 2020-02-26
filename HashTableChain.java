package facebook;

/**
 * Contains the all the methods related to hashTable
 * 
 * @author chitsimrangill
 *
 */
public class HashTableChain 
{
	
	private int size = 11; // Size of the table
	private int arraySize = size+1; // Size 
	
	/**
	 * Constructor of the class
	 */
	public HashTableChain()
	{
	}
	
	/**
	 * Sets all the values of table to null.
	 * This method is used during construction of table in order to initialize 
	 * 
	 * @param t - table that needs to be initialized
	 */
	public void genList(Node[] t)
	{
		for (int i = 0; i<12; i++)
		{
			t[i] = null;
		}
	}
	
	/**
	 * Creates the key at which a Person is inserted in the table.
	 * It uses division method to create the hashKey
	 * 
	 * @param Score - Score of a person's name
	 * @return - hashKey at which a person is inserted in the table
	 */
	public int generateHashKey(int Score)
	{
		int hashKey = Score%size;
		return hashKey;
	}
	
	/**
	 * Inserts a Person into the hashTable
	 * It takes the person that needs to be inserted and the table in which it needs to inserted as parameter
	 * 
	 * @param p - Person that needs to inserted
	 * @param table - hashTable in which person needs to inserted
	 */
	public void insert(Person p, Node[] table)
	{
		int key = generateHashKey(p.getScore()); // creates the hashkey for person
		
		if (table[key] == null) // CASE: if the table is empty at that hashkey
		{
			table[key] = new Node(key,p);
			System.out.println("Inserted " + p.getName()+ " at key: "+ key);
		}
		else
		{
			Node head = table[key]; // Sets the head to the first link in the list
			Node root = new Node(key, p); // creates new node
			root.setNext(head); // Sets the next of the root now to the head
			table[key] = root; // Sets the new object as the head of list
			System.out.println("Inserted " + p.getName()+ " after collison at key: "+ key);
		}
	}
	
	/**
	 * Searches a Person in a HashTable using its name's score
	 * 
	 * @param score - Score of the name of the person that needs to be searched
	 * @param table - hashTable in which the person needs to searched
	 * @return - node that was found
	 */
	public Person search(int score, Node[] table)
	{
		int key = generateHashKey(score); // generates the hashkey of the Person using it's score of it's name
		
		Person temp = new Person("Null");
		
		if (table[key] == null) // CASE: if the table is empty at that key
		{
			return temp; 
		}
		else
		{
			Node root = table[key]; // Creates a new root object and initializes it to the first link in the list
			while(root!=null) // Iterates over the list and compares the score of all the nodes
			{
				if(root.getPerson().getScore()==score)
				{
					return root.getPerson();
				}
				else
				{
					root = root.getNext();
				}
			}
		}
		return temp;
	}
	
	
	/**
	 * Prints the HashTable
	 * 
	 * @param table - takes the table that needs to printed as parameter
	 */
	public void print(Node[] table)
	{
		System.out.println("List of People with their key ");
		for (int i = 0; i<arraySize; i++)
		{
			if(table[i] != null)
			{
				Node current = table[i];
				while(current != null)
				{
					Person temp = current.getPerson();
					System.out.print(i+", ");
					System.out.println(temp.getName());
					current = current.getNext();
				}
			}
		}
	}
}

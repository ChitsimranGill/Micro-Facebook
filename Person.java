package facebook;
import java.util.*;

/**
 * This class contains contains the constructor of Person object and has all the getter-setter methods 
 * 
 * This class is used to create Person object who has their own LinkedList of friends
 * @author chitsimrangill
 *
 */
public class Person 
{
	private String name; // instance variable of name of a person
	private int randScore; // instance variable of score of a person's name
	public LinkedList list; // instance variable of list of a person's friends

	/**
	 * Person constructor
	 * 
	 * It creates a person object which has its name and LinkedList of friends as its attributes
	 * @param name
	 */
	Person(String name)
	{
		this.name = name;
		this.randScore = generatingScore(name);
		list = new LinkedList();
	}
	
	/**
	 * Gets the score of a person's name
	 * 
	 * @return - the score of a person's name
	 */
	public int getScore()
	{
		return randScore;
	}
	
	/**
	 * Gets the name of a person
	 * 
	 * @return - name of a person
	 */
	public String getName()
	{
		return name;
	}
	
	
	/**
	 * Gets the LinkedList of a person's friends
	 * 
	 * @return - LinkedLinst of friends
	 */
	public LinkedList getList()
	{
		return list;
	}
	
	/**
	 * Creates a score for the name of a person using ascii code.
	 * Takes the name of person as a parameter
	 * 
	 * @param s - Name of the person
	 * @return - Returns the score of person's name
	 */
	public int generatingScore(String s)
	{
		char[] ascii = s.toCharArray();
		int i = 0;
		int j = 0;
		for(char ch: ascii)
		{
			i = (int)ch + j;
			j++;
		}
		return i;
	}
	
}

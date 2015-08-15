package xml;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Person {
	private String firstName;
	private String secondName;
	private List<String> favorites=new ArrayList<String>();
	private Map<String,String> friends=new HashMap<String,String>();

	public Person(String s1, String s2) {
		firstName = s1;
		secondName = s2;
	}

	public Person() {
	}
	
	public void display()
	{
		System.out.println("I'm "+firstName+" "+secondName);
	}
	
	public void displayFavorites()
	{
		System.out.println("here is my favorites:");
		for(String s:favorites)
			System.out.print(" "+s);
		System.out.println();
	}
	
	public void displayFriends()
	{
		System.out.println("here is my friends:");
		for(Entry<String, String> entry:friends.entrySet())
		  System.out.println(entry.getKey()+" "+entry.getValue());
	}
	
	public List<String> getFavorites() {
		return favorites;
	}

	public void setFavorites(List<String> favorites) {
		this.favorites = favorites;
	}

	public Map<String, String> getFriends() {
		return friends;
	}

	public void setFriends(Map<String, String> friends) {
		this.friends = friends;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

}

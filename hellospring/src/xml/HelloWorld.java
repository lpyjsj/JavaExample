package xml;

public class HelloWorld {
	
	private String message;
	private Person person;



	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String sayHello()
	{
	   return  message+" "+person.getFirstName()+" "+person.getSecondName();	
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}

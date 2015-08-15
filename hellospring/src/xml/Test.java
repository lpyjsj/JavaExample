package xml;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

       System.out.println( obj.sayHello());
       
       Person person= (Person) context.getBean("person-construct");
       person.display();
       
       person=(Person)context.getBean("person-p");
       person.display();
       
       person= (Person) context.getBean("person-collection");
       person.display();
       person.displayFavorites();
       person.displayFriends();
       
       person= (Person) context.getBean("person-util");
       person.display();
       person.displayFavorites();
       person.displayFriends();
  }
}
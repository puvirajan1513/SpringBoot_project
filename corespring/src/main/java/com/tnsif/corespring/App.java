package com.tnsif.corespring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("documentconfig.xml");

        // Get bean
        Document doc = (Document) context.getBean("documentBean");
        doc.display();
    }
}

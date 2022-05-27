package filterListener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Application Lifecycle Listener implementation class MyListener2
 *
 */
@WebListener
public class MyListener2 implements HttpSessionAttributeListener {

    /**
     * Default constructor. 
     */
    public MyListener2() {
        // TODO Auto-generated constructor stub
    	System.out.println("MyListener2 implements HttpSessionAttributeListener...생성");
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent se)  { 
         // TODO Auto-generated method stub
    	System.out.println("MyListener2 implements HttpSessionAttributeListener...attributeAdded");
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent se)  { 
         // TODO Auto-generated method stub
    	System.out.println("MyListener2 implements HttpSessionAttributeListener...attributeRemoved");
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent se)  { 
         // TODO Auto-generated method stub
    	System.out.println("MyListener2 implements HttpSessionAttributeListener...attributeReplaced");
    }
	
}

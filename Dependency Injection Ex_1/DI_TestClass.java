package ketan.blogsot.examples;
/**
 * @author Ketan Vishwakarma
 * Mar 1, 2015 12:31:08 AM
 * BlogCodes : ketan.blogsot.examples
 **/
public class DI_TestClass {
	
	public static void main(String []args){
		
		MessageBean msg=new MessageBean();
		msg.setMessage("De-Coupled Message");
		System.out.println("First Message: "+msg.getMessage());
		msg.setMessage("Thanks to DI now we can have any message");
		System.out.println("Second Message: "+msg.getMessage());
		
	}
}

class MessageBean {
	
	private String message;

	public String getMessage() {
		return message;
	}
	/*
	 * Setter Injection
	 * */
	public void setMessage(String message) {
		this.message = message;
	}
}
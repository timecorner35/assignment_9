package assignment_9;

public class Q11 {

	public static void main(String[] args) {
	String a = "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programming and problem solving}";
	String sender = a.substring(a.indexOf("<")+1,a.indexOf(">"));
	String phone = a.substring(a.indexOf("[")+1,a.indexOf("]"));
	String message = a.substring(a.indexOf("{")+1,a.indexOf("}"));
	System.out.println("Sender: "+sender+"\nPhone number: "+phone+"\nMessage body: "+message);

	}

}

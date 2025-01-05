package StringAssignment;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String s="df343$65n latin 4545 v#45 string fn45%345";
		
		s=s.replaceAll("[^a-zA-Z0-9]","");
		
		System.out.println(s);
		
		

	}

}

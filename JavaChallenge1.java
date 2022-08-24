package Trial.mytrial;

public class JavaChallenge1 {
	static char[] c;

	public static void main(String[] args) {
		String s="I am learning Java ";
		String[] temp=s.split(" ");
		for(int i=0;i<temp.length;i++) {
		if(i==temp.length-1) {
		   c =temp[i].toCharArray();
		   
		}
	}
		System.out.println(c.length);

}
}

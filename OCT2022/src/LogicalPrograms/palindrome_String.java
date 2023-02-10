package LogicalPrograms;

public class palindrome_String {

	public static void main(String[] args) {
		String str = "madam";
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		
		System.out.println("Original String:"+str);//madam
		System.out.println("Reverse String:"+rev);//madam
		
		if(str.equals(rev)) {
			System.out.println("string is palindrome");
		}else {
			System.out.println("string is not palindrome");
		}
		
		
	}
}

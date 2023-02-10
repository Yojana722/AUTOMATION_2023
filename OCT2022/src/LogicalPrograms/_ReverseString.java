package LogicalPrograms;

public class _ReverseString {

	public static void main(String[] args) {
		String str = "quantum academy";
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		
		System.out.println("Original String:"+str);//quantum academy
		System.out.println("Reverse String:"+rev);//ymedaca mutnauq
	}
}

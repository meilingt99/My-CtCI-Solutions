import java.util.Scanner;
class Prob5 {
	public static void main( String[] args ){
		Scanner in = new Scanner(System.in);
		String str1 = in.nextLine();
		String str2 = in.nextLine();
		int str1Len = str1.length();
		int str2Len = str2.length();
		boolean oneEdit = false;
		int offset = 0;
		if( str1Len == str2Len ) {
			for( int i = 0; i < str1Len; i++ ) {
				if( str1.charAt(i) != str2.charAt(i) ) {
					if( oneEdit ) {
						System.out.println("False");
						System.exit(0);
					}
					else {
						oneEdit = true;
					}
				}
			}
		}
		else if( Math.abs(str1Len - str2Len) == 1) {
			if( str1Len < str2Len ) {
				String hold = str1;
				str1 = str2;
				str2 = hold;
			}
			for( int i = 0; i < str2.length(); i++ ) {
				if( str1.charAt(i+offset) != str2.charAt(i)) {
					if( oneEdit ) {
						System.out.println("False");
						System.exit(0);
					}
					else {
						oneEdit = true;
						offset = 1;
					}
				}
			}
		}
		else {
			System.out.println("False");
			System.exit(0);
		}
		System.out.println("True");
	}
}
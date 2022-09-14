package java1011;

public class isPalindrome {
	 static boolean isPalindrome(String str) {
	        String result = "";
	        for (int i = str.length() - 1; i >= 0; i--) {
	            result += str.charAt(i);
	        }

	        if (str.equals(result))
	            return true;
	        else
	            return false;
	    }

	public static void main(String[] args) {
		System.out.println(isPalindrome("aloha"));

	}

}

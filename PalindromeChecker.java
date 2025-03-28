import java.util.Scanner;

class PalindromeChecker {
    public static boolean isPalindrome(String text) {
        text = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return text.equals(new StringBuilder(text).reverse().toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("🔄 Enter text to check for palindrome: ");
        String input = sc.nextLine();
        
        if (isPalindrome(input)) {
            System.out.println("✅ It's a palindrome!");
        } else {
            System.out.println("❌ Not a palindrome.");
        }
        
        sc.close();
    }
}

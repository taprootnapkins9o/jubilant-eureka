import java.util.HashMap;
import java.util.Scanner;

class ContactBook {
    public static void main(String[] args) {
        HashMap<String, String> contacts = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n📖 Contact Book");
            System.out.println("1️⃣ Add Contact");
            System.out.println("2️⃣ View Contacts");
            System.out.println("3️⃣ Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            
            if (choice == 1) {
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                System.out.print("Enter phone number: ");
                String phone = sc.nextLine();
                contacts.put(name, phone);
                System.out.println("✅ Contact added!");
            } else if (choice == 2) {
                System.out.println("\n📋 Your Contacts:");
                contacts.forEach((name, phone) -> System.out.println(name + " 📞 " + phone));
            } else if (choice == 3) {
                System.out.println("👋 Goodbye!");
                break;
            } else {
                System.out.println("❌ Invalid choice, try again.");
            }
        }
        sc.close();
    }
}

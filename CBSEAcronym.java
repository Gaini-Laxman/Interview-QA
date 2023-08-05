import java.util.Scanner;

public class CBSEAcronym {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Word: ");
        String s= sc.nextLine();
        sc.close();

        // Split the input string into words based on spaces

        String[] words = s.split(" ");

        // Create an acronym by concatenating the first character of each word

        StringBuilder sb= new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                sb.append(word.charAt(0));
            }
        }	

        System.out.println("Print First Latter sb :" + sb);
    }
}

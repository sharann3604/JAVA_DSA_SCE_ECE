package Module8;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "Sharan Nanjnundeshwara";
        String[] words = str.split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }

        System.out.println(result.toString().trim());
    }
}
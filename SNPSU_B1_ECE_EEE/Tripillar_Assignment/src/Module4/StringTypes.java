package Module4;

public class StringTypes {
    public static void main(String[] args) {

        String s = "Hello";
        s.concat(" World");
        System.out.println("String: " + s);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder: " + sb);

        StringBuffer sf = new StringBuffer("Hello");
        sf.append(" World");
        System.out.println("StringBuffer: " + sf);
    }
}
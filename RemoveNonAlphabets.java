public class RemoveNonAlphabets {
    public static String removeNonAlpha(String str) {
        return str.replaceAll("[^a-zA-Z]", "");
    }

    public static void main(String[] args) {
        String str = "Hello123 World!";
        System.out.println("String after removing non-alphabetic characters: " + removeNonAlpha(str));
    }
}


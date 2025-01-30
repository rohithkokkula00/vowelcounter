public class VowelCounter {
    public static void main(String[] args) {
        String str = "hello world";
        int count = 0;

        for (char ch : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) {
                count++;
            }
        }

        System.out.println("Number of vowels: " + count);
    }
}

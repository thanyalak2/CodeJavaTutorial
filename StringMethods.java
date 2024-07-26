public class StringMethods {
    public static void main(String[] args) {
        String message = "Java is Great Fun";
        String upper = message.toUpperCase();
        String lower = message.toLowerCase();
        int stringSize = message.length();
        char letter = message.charAt(2);
        

        System.out.println(upper); 
        System.out.println(lower); 
        System.out.println(stringSize);
        System.out.println(letter); 
        
    }
}

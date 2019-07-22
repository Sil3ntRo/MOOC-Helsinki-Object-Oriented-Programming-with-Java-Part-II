
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }
    
    private static void printWithSmileys(String characterString) {
        printUpperRow(length(characterString));
        printMiddleRow(characterString);
        printUpperRow(length(characterString));
    }
    
    private static int length(String characterString) {
        int length = 0;
        if(odd(characterString)) {
            length = (characterString.length()-1 + 7) / 2;
        }
        else if(!odd(characterString)) {
            length = (characterString.length()-1 + 6) / 2;
        }
        
        return length;
    }
    
    private static void printUpperRow(int times) {
        
        int count = 0;
        while(count <= times) {
            System.out.print(":)");
            count++;
        }
        System.out.print("\n");
    }
    
    private static void printMiddleRow(String characterString) {
        if(odd(characterString)) {
            System.out.println(":) " + characterString + "  :)");
        }
        else if(!odd(characterString)) {
            System.out.println(":) " + characterString + " :)");
        } 
    }
    
    private static boolean odd(String characterString) {
        boolean result = false;
        if(characterString.length() % 2 == 1) {
            result = true;
        }
        
        return result;
    }

}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write test code here
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Give a string: ");
        String str = sc.nextLine();
        
        if(clockTime(str)) {
            System.out.println("The form is fine.");
        }
        else {
            System.out.println("The form is wrong.");
        }
    }
    
    public static boolean isAWeekDay(String string) {
       
        
        if(string.matches("mon|tue|wed|thu|fri|sat|sun")) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public static boolean allVowels(String string) {
        return string.matches("[aeiouäö]*");
        
    }
    
    public static boolean clockTime(String string) {
        return string.matches("([01][0-9]|2[0-3])(:[0-5][0-9]){2}");
    }
}

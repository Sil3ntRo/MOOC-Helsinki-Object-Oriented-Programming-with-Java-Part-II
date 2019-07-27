public class Main {
    public static void main(String[] args) {
        // Test your code here!
        CivilService civil = new CivilService();
        System.out.println(civil.getDaysLeft());
        
        MilitaryService milit = new MilitaryService(60);
        System.out.println(milit.getDaysLeft());
    }
}

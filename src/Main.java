// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("=======================================");
        Programmer programmer = new Programmer("Nurkamil", "Student", "Peaksoft");
        Singer singer = new Singer("Nurlan", "Yrchy", "Ak - keme");
        Dancer dancer = new Dancer("Aichurok", "Ak kuu", "Azem tobu");
        System.out.print(programmer+"\n"+"What are you doing: "+programmer.coding());
        programmer.learn();programmer.walk();programmer.eat();
        System.out.println("========================================");
        System.out.print(singer+"\n"+"What are you doing?  " +singer.singing());
        singer.learn();singer.walk();singer.eat();
        System.out.println("""
                ========================================
                """);
        System.out.print(dancer+"\n"+"What are you doing?  " +dancer.dansing());
        dancer.learn();dancer.walk();dancer.eat();
        System.out.println("""
                ========================================
                """);


    }
}
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double boy, kilo, endeks;
        System.out.println("Boyunuzu Girin(m): ");
        boy = input.nextDouble();
        System.out.println("Kilonuzu Girin(kg)");
        kilo = input.nextDouble();
        endeks = kilo / (boy * boy);
        System.out.println("Vücut Kitle Endeksiniz: " + endeks);
    }
}
import java.util.Scanner;
public class PemilihanPercobaan119 {
    
    public static void main (String[]args){
        
        Scanner input19 = new Scanner (System.in);

        System.out.println("Masukkan angka : ");
        int angka = input19.nextInt();

        String bilangan = (angka % 2 == 0) ? "bilangan genap" : "bilangan ganjil";
        System.out.println(angka+ " adalah "+ bilangan);
    }
}

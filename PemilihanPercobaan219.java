import java.util.Scanner;
public class PemilihanPercobaan219 {
    
    public static void main(String[]args){
        Scanner input19 = new Scanner(System.in);

        System.out.print("Nilai UAS    : ");
        float uas = input19.nextFloat();
        System.out.print("Nilai UTS    : ");
        float uts = input19.nextFloat();
        System.out.print("Nilai KUIS   : ");
        float kuis = input19.nextFloat();
        System.out.print("Nilai TUGAS  : ");
        float tugas = input19.nextFloat();

        float total = (uas * 0.4f) + (uts * 0.3f) + (kuis * 0.1f) + (tugas * 0.2f);

        String message = total < 65 ? "Remidi" : "Tidak Remidi";

        System.out.println("Nilai akhir = " + total + " Sehingga "+message);

        if (total >= 80){
            System.out. println("Nilai A");
        }else if (total > 73){
            System.out. println("Nilai B+");
        }else if (total < 65){
            System.out. println("Nilai B");
        }else if (total > 60){
            System.out. println("Nilai C+");
        }else if (total > 50){
            System.out. println("Nilai C");
        }else if (total > 39){
            System.out. println("Nilai D");
        }else {
            System.out. println("Nilai E");
        }
    }
}

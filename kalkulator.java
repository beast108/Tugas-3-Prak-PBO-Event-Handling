import java.util.Scanner;
public class kalkulator123190148 {
    static float total=0, angka1=1, angka2=1; //global

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    while(angka2!=0 && angka1!=0) {
        System.out.println("Kalkulator - 123190148");
        System.out.println("1.Penjumlahan");
        System.out.println("2.Pengurangan");
        System.out.println("3.Perkalian");
        System.out.println("4.Pembagian");
        int pilih = input.nextInt();

        System.out.print("Masukkan angka ke-1 : ");
        angka1 = input.nextFloat();
        System.out.print("Masukkan angka ke-2 : ");
        angka2 = input.nextFloat();

        switch(pilih) {
            case 1:
            System.out.println( + angka1 + " + " + angka2);
            System.out.println("Hasilnya = ");
            total=angka1+angka2;
            break;
            case 2:
            System.out.println( + angka1 + " - " + angka2);
            System.out.println("Hasilnya = ");
            total=angka1-angka2;
            break;
            case 3:
            System.out.println( + angka1 + " * " + angka2);
            System.out.println("Hasilnya = ");
            total=angka1*angka2;
            break;
            case 4:
            System.out.println( + angka1 + " : " + angka2);
            System.out.println("Hasilnya = ");
            total=angka1/angka2;
            break;
            default:
            System.out.println("Isi terlebih dahulu angka yang akan dihitung!");
        }
        System.out.println(total);
    }
    }
}
import java.util.Scanner;

public class Konversi{
    // Global Variable
        static int bilDes; // variable
      //BINER
public static void Biner(int n)
{
    if(n>1)
        {
            Biner(n/2);
        }
    System.out.print(n%2);
}
public static void inputDes()
{
    System.out.print("Masukkan Bilangan Desimal = ");
    Scanner inputan = new Scanner(System.in);
    bilDes = inputan.nextInt();
    // return bilDes;
}

public static void tampilBiner()
{
    inputDes();
    System.out.print("Binernya Adalah ");
    Biner(bilDes);
}
public static void tampilHexa()
{
    inputDes();
    System.out.print("Hexanya Adalah ");
    Hexa(bilDes);
}
public static void tampilOktal()
{
    inputDes();
    System.out.print("Oktalnya Adalah ");
    Oktal(bilDes);
}
public static int inpBil()
{
        System.out.println("=================================="
        + "\nSelamat Datang ");
        System.out.println("Silahkan memilih Menu Konversi "
        + "Bilangan ke: " +
        "\n1.Biner \n2.Hexa \n3.Oktal \n4.Exit");
        System.out.print("Masukkan Angka Menu = ");
        Scanner inputan = new Scanner(System.in);
        int pilMenu = inputan.nextInt();
        return pilMenu;
}

public static void menU(int pil)
{
    System.out.println("\033"); // Clear Screen
    switch(pil)
        {
            case 1: tampilBiner(); break;
            case 2: tampilHexa(); break;
            case 3: tampilOktal(); break;
            case 4: System.out.println("====   Terima Kasih  ====");
            System.exit(0); break; // Memberikan Kondisi False
            default : System.out.println("(Maaf. Pilih Angka 1 - 4 Saja)"); break;
        }
    System.out.println("\033"); // clear screen
}

public static void main(String aKU[]) // Guna Static -> Tidak Perlu Pembentukan Objek
{

// terus mengulang menu jika bukan angka 4
do
{
menU(inpBil()); // atau KonversiBilangan.menU(inpBil());
}
while(true);
}
}
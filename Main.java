//import java.util.*(semua) biar bisa make scanner lur
import java.util.*;

//classnya bisa sembarang si
class AksiBos{
    public static void main(String[] args) {
        Scanner pertama = new Scanner(System.in);
        //variable integer buat operator matematika dan pilihannya        
        int pilihan;
        int angka1;
        int angka2;
        int aksi;
        //pake do karna ekspresi boolean belakangan
        do{
            System.out.println("+-----------------------------------------------------------+");
            System.out.println("|                      KALKULATOR JAVA                      |");
            System.out.println("+-----------------------------------------------------------+");
            System.out.println("|1. Pertambahan                                             |");
            System.out.println("|2. Perkalian                                               |");
            System.out.println("|3. Pengurangan                                             |");
            System.out.println("|4. Pembagian                                               |");
            System.out.println("|5. Keluar                                                  |");
            System.out.println("+-----------------------------------------------------------+");
            System.out.print("Pilih Operator Gan: "); 
            pilihan = pertama.nextInt(); //nerima inputan user, trus dimasukin ke variable pilihan
            //make switch biar bisa laksanain inputan user (misal: Pilih Operator Gan: 1) maka akan laksanain/execute case 1 di switch
            switch (pilihan) {
                //pilihan 1
                case 1:
                    System.out.print("Masukkan Angka Pertama: ");
                    angka1 = pertama.nextInt();
                    System.out.print("Masukkan Angka Kedua: ");
                    angka2 = pertama.nextInt();
                    aksi = angka1 + angka2; // variable aksi executing sesuai operator 
                    System.out.print("Hasil dari " + angka1 + " + " + angka2 + " = " + aksi + "\n"); //hasil dari executing antara variable angka1 dan angka2
                    break;
                //pilihan 2
                case 2:
                    System.out.print("Masukkan Angka Pertama: ");
                    angka1 = pertama.nextInt();
                    System.out.print("Masukkan Angka Kedua: ");
                    angka2 = pertama.nextInt();
                    aksi = angka1 * angka2; // variable aksi executing sesuai operator
                    System.out.print("Hasil dari " + angka1 + " * " + angka2 + " = " + aksi + "\n"); //hasil dari executing antara variable angka1 dan angka2
                    break;
                //pilihan 3
                case 3:
                    System.out.print("Masukkan Angka Pertama: ");
                    angka1 = pertama.nextInt();
                    System.out.print("Masukkan Angka Kedua: ");
                    angka2 = pertama.nextInt();
                    aksi = angka1 - angka2; // variable aksi executing sesuai operator
                    System.out.print("Hasil dari " + angka1 + " - " + angka2 + " = " + aksi + "\n"); //hasil dari executing antara variable angka1 dan angka2
                    break;
                //pilihan 4
                case 4:
                    System.out.print("Masukkan Angka Pertama: ");
                    angka1 = pertama.nextInt();
                    System.out.print("Masukkan Angka Kedua: ");
                    angka2 = pertama.nextInt();
                    aksi = angka1 / angka2; // variable aksi executing sesuai operator
                    System.out.print("Hasil dari " + angka1 + " / " + angka2 + " = " + aksi + "\n"); //hasil dari executing antara variable angka1 dan angka2
                    break;
            }
            //pilihan 5 itu boolean
        }while(pilihan!=5);
        //closing scanner biar ga bocor lur
        pertama.close();
    }
}
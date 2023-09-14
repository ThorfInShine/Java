package Latihan8;

public class Main {
    public static void main(String[] args) {
        /* UNARY = OPERASI YANG DILAKUKAN PADA SUATU VARIABEL */

        /* UNARY + DAN - */
        int angka=10;
        System.out.printf("unary '+', %d menjadi %d \n",angka, +angka);

        int angka2=10;
        System.out.printf("unary '-', %d menjadi %d \n",angka2,-angka2);

        /* UNARY DECREMENT DAN INCREMENT */
        int angka3=10;
        angka3++;
        System.out.println("nilai dengan '++' mendajadi = " + angka3);

        int angka4=10;
        angka4--;
        System.out.println("nilai dengan '-- menjadi = " + angka4);

        /* VARIASI LAIN UNARY DECREMENT DAN INCREMENT */
        int angka5=10;
        System.out.printf("nilai dengan '++' menjadi = %d \n",++angka5);

        /* angka6++ (POSTFIX) berarti dia mencetak terlebih dahulu baru di hitung, jadi jika ingin lihat hasilnya harus ditambahkan sout lagi di bawah 
        atau bisa juga di deklarasi terlebih dahulu seperti diatas */
        int angka6=10;
        System.out.printf("nilai dengan '++' menjadi = %d \n",angka6++);
        System.out.printf("nilai dengan '++' menjadi = %d \n",angka6);

        /* PREFIX */
        int angka7=10;
        System.out.printf("nilai dengan '--' menjadi = %d \n",++angka7);

        /* UNARY BOOLEAN DENGAN ! UNTUK NEGASI */
        boolean rimuru=(4+1) > (1+1);
        System.out.println("nilai boolean = " + rimuru);
        System.out.println("nilai boolean = " + !rimuru);
        

    }
}

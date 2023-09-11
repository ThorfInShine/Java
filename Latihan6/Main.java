package Latihan6;

public class Main {
    public static void main(String[] args) {
        
        /* Operasi Aritmatika */
        int variabel1=10;
        int variabel2=3;

        int hasil;

        /* 1. Penjumlahan */
        hasil=variabel1 + variabel2;
        System.out.println(variabel1 + " + " + variabel2 + " = "+ hasil);

        /* 2. Pengurangan */
        hasil=variabel1 - variabel2;
        System.out.printf("%d - %d = %d \n",variabel1,variabel2,hasil);

        /* 3. Perkalian */
        hasil=variabel1 * variabel2;
        System.out.printf("%d x %d = %d \n",variabel1,variabel2,hasil);

        /* 4. Pembagian (Karena disini menggunakan tipe data integer maka tidak bisa menampilkan koma (,))*/
        hasil=variabel1 / variabel2;
        System.out.printf("%d / %d = %d \n",variabel1,variabel2,hasil);
        /* Jika ingin mengugnakan koma maka harus menggunakan tipe data double atau float */
        float pembagian1=10f;
        float pembagian2=6f;

        float hasilfloat;
        hasilfloat=pembagian1 / pembagian2;
        System.out.println(pembagian1 + " / " + pembagian2 + " = " + hasilfloat);

        /* 5. Modulus */
        hasil=variabel1 % variabel2;
        System.out.printf("%d %% %d = %d \n",variabel1,variabel2,hasil);
    }
}

package Latihan7;

public class Main {
    public static void main(String[] args) {
        /* KONVERSI TIPE DATA NUMERIK */
        int nilaiint=450;
        System.out.println("nilai integer = " + nilaiint);

        /* MEMPERLUAS RENTANG KE TIPE DATA YANG LEBIH BESAR */
        long nilailong=nilaiint;
        System.out.println("nilai long = " + nilailong);

        /* MEMPERKECIL RENTANG KE TIP0E DATA YANG LEBIH KECIL */
        byte nilaibyte=(byte)nilaiint;
        System.out.println("nilai byte = " + nilaibyte);

        /* CASTING PEMBAGIAN YANG HASILNYA SALAH */
        int a=10;
        int b=4;

        float c=a/b;
        System.out.printf("%d / %d = %f \n",a,b,c);

        /* CASTING PEMBAGIAN YANG BENAR */
        int x=10;
        int y=4;

        float z=(float)x/y;
        System.out.printf("%d / %d = %f \n",x,y,z);


    }
}

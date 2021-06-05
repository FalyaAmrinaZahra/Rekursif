/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rekursif;

/**
 *
 * @author falya amrina zahra
 */
public class Rekursif {

    public static void main(String[] args) {
         //Hapus Tanda Komen untuk menjalankan

        //NO. 1
        System.out.println(pangkat(8, 2));

        //NO. 2
        for (int i = 0; i < 25; i++) {
            System.out.println((i + 1) + " : " + fibonacci(i));
        }

        //NO. 3
        System.out.println(deret(1));

        //NO. 4
        System.out.println(nameRepeat("Falya Amrina Zahra", 1));
    }

    public static int pangkat(int angka, int eksponen) {
        int repeatTime = eksponen - 1;
        if (repeatTime == 0 ) {
            return angka;
        } else {
            return angka * pangkat(angka, eksponen - 1);
        }

    }

    public static int fibonacci(int n) {
        if ( n == 0 ) {
            return 0;
        }

        if ( n == 1) {
            return 1;
        }

        if ( n == 2 ) {
            return 1;
        }

        return (fibonacci(n - 1) + fibonacci(n - 2));

    }

    public static int deret(int n) {
        System.out.println(n);

        if (n > 100) {
            return n;
        } else {
            return deret(n + 2);
        }

    }

    public static String nameRepeat(String nama, int n) {
        System.out.println(nama);
        if (n == 99) {
            return nama;
        } else {
            return nameRepeat(nama, n + 1);
        }
    }
}
    
    


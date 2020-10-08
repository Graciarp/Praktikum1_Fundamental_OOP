package com.Gracia.modul1;

//ini merupakan kelas
public class kelas {
    //ini merupakan identifier di luar main
    private static String nama = "Paiman";

    //ini merupakan sebuah function
    private static int setMinute(){
        int minute = 10;
        return minute;
    }

    //ini adalah program utama
    public static void main(String[] args) {
        System.out.println("Nama \t\t: "+nama);
        System.out.println("Set Minute \t:"+setMinute());
    }
}

/*
    class pada java dapat dibuat dalam 1 file.
    Namun pada konsep OOP lebih baik class yang lebih dari 1 diletakkan di file yang berbeda,
    namun tetap terhubung supaya lebih terstruktur

    Untuk menghubungkan antar class dapat menggunakan Object
 */


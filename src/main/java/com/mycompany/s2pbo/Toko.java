package com.mycompany.s2pbo;

import com.mycompany.s2pbo.Penunjuk;
import java.util.Scanner;

public class Toko {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Penunjuk p = new Penunjuk();
        Transaks1 t = new Transaks1();
        Pelanggan pl = new Pelanggan();
        System.out.println("Pilih profil pelanggan");
        System.out.println("No\tNama pelanggan\t\tAlamat\t\tJenis kelamin\tSaldo (Rp.)");
        for (int o = 0; o < pl.getJumlahPlg(); o++) {
            System.out.println(o + 1 + "\t" + pl.namaPlg.get(o) + "\t\t" + pl.alamat.get(o) + "\t\t" + pl.jenisKelamin.get(o) + "\t" + pl.saldo.get(o));
        }
        System.out.println("Pilih id pelanggan : ");
        int ppg = scan.nextInt();

        System.out.println("");
        System.out.println("Daftar barang : ");
        System.out.println("No\tNama barang\tHarga\tStok");
        for (int i = 0; i < p.getJumlahBarang(); i++) {
            System.out.println(i + 1 + "\t" + p.namaBarang.get(i) + "\t\t" + p.harga.get(i) + "\t" + p.stok.get(i));
        }
        System.out.println("Pilih jenis barang yang dibeli ");
        int pilJen = scan.nextInt();
        System.out.println("Jumlah barang yang dibeli ");
        t.setJumlahBeli(scan.nextInt());

        int total = p.totalBarang(t.getJumlahBeli(), p.harga.get(pilJen - 1));
        System.out.println("Total pembelian : Rp." + total);
        int sisastok = p.sisaStok(p.stok.get(pilJen - 1), t.getJumlahBeli());
        int sisasaldo = pl.sisaSaldo(pl.saldo.get(ppg - 1), total);
        System.out.println("Sisa saldo : Rp." + sisasaldo);
        System.out.println("Stok sisa : " + p.namaBarang.get(pilJen - 1) + " " + sisastok);
    }
}

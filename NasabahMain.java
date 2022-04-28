/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package praktikum2;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class NasabahMain {
public static void menu(){
        System.out.println("Pilih Menu : ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Antrian Keluar");
        System.out.println("4. Cek Antrian terdepan");
        System.out.println("5. Cek dari belakang");
        System.out.println("------------");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int pilih;
        Scanner sc = new Scanner (System.in);
        System.out.print("Maukkan Kapasitas queue :");
        int jumlah = sc.nextInt();
        Nasabah antri = new Nasabah(jumlah);
        
        do{
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch(pilih) {
                case 1:
                    System.out.print("No Rekening: ");
                    String norek = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Alamat: ");
                    String alamat = sc.nextLine();
                    System.out.print("Umur: ");
                    int umur = sc.nextInt();
                    System.out.print("Saldo: ");
                    double saldo = sc.nextDouble();
                    Nasabah nb = new Nasabah(norek, nama, alamat, umur, saldo);
                    sc.nextLine();
                    antri.Enqueue(nb);
                    break;
                case 2:
                    Nasabah data = antri.Dequeue();
                    if(!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat)
                            && data.umur != 0 && data.saldo != 0) {
                        System.out.println("Antrian yang keluar: " + data.norek + " " +  data.nama
                            + " " + data.alamat + " " + data.umur + " " + data.saldo);
                        break;
                    }   
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                    
                case 5:
                    antri.peekRear();
                    break;
  
            }
        }while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4|| pilih == 5);
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas2;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class QueueMahasiswa {
    public static void menu(){
        System.out.println("Masukkan operasi yang akan diinginkan : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Tampilkan Data Mahasiswa");
        System.out.println("4. Tampilkan Data Mahasiswa Paling Depan");
        System.out.println("5. Tampilkan Data Mahasiswa Paling Belakang");
        System.out.println("6. Tampilkan Posisi Anntrian Data Mahasiswa");
        System.out.println("7. Tampilkan Data Mahasiswa Dalam Antrian");
        System.out.println("------------");
    }
    public static void main(String[] args) {
        // TODO code application logic here
         int pilih;
        Scanner sc = new Scanner (System.in);
        System.out.print("Maukkan Kapasitas queue :");
        int jumlah = sc.nextInt();
        Mahasiswa antri = new Mahasiswa(jumlah);
        
        do{
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch(pilih) {
                case 1:
                    System.out.print("NIM Mahasiswa: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Absen Mahasiswa: ");
                    int absen = sc.nextInt();
                    System.out.print("IPK Mahasiswa: ");
                    double ipk = sc.nextDouble();
                    Mahasiswa nb = new Mahasiswa (nim, nama, absen, ipk);
                    sc.nextLine();
                    antri.Enqueue(nb);
                    break;
                case 2:
                    Mahasiswa data = antri.Dequeue();
                    if(!"".equals(data.nim) && !"".equals(data.nama) && !"".equals(data.absen)
                            && data.ipk != 0) {
                        System.out.println("Antrian yang keluar: " + data.nim + " " +  data.nama
                            + " " + data.absen + " " + data.ipk);
                        break;
                    }   
                case 3:
                    antri.print();
                    break;
                case 4:
                    antri.peek();
                    break;
                case 5:
                    antri.peekRear();
                    break;
                case 6:
                    System.out.print("Masukkan NIM Mahasiswa yang ingin dicari : ");
                    String Data = sc.nextLine();
                    antri.peekPosition(Data);
                    break;
               case 7:
                    System.out.print("Masukkan Posisi yang ingin dicari : ");
                    int Posisi = sc.nextInt();
                    antri.printMahasiswa(Posisi);
                    break;
  
            }
        }while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4|| pilih == 5|| pilih == 6|| pilih == 7);
    }
    
}

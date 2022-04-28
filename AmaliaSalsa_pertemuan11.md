8.2.3	Pertanyaan
1.	Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size bernilai 0? 
Pada konstruktor, nilai awal atribut front dan rear bernilai -1, Karena jika bernilai 0 maka pada queue akan langsung terpanggil, sehingga diinisialisasikan dengan -1 agar tidak memanggil indeks manapun.

2.	Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut!
 
kegunaan dari potongan kode berikut adalah sebuah kondisi dari enqueue yang mana ketika data rear berada pada indeks terakhir, maka rear selanjutnya berada di indeks 0.

3.	Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!
 
kegunaan dari potongan kode berikut adalah sebuah kondisi dari dequeue yang mana ketika data front berada pada indeks terakhir, maka front selanjutnya berada di indeks 0.

4.	Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0), melainkan int i=front?
Karena indeks ke-0 tidak selalu menjadi front, dan yang baru masuk bisa jadi tidak terletak pada indeks ke-0, karena pada queue ini yang lebih dulu masuk akan lebih dulu keluar, dan mendahulukan posisi front.

5.	Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut!
 
Maksud dari kode diatas adalah jika i+1 tidak = max maka I akan tetap (i+1), dan jika sudah sampai angka (i+1) nilainya = max, maka nilai tersebut di% dengan nilai max yang menghasilkan 0 dan akan dikembalikan ke 0

6.	Tunjukkan potongan kode program yang merupakan queue overflow!
if (IsFull ()){
        System.out.println("Queue sudah penuh");

7.	 Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi queue overflow dan queue underflow, program dihentikan!

    public void Enqueue (int dt){
    if (IsFull ()){
        System.out.println("Queue sudah penuh");
        System.exit(0);
    }else {
        if (IsEmpty()){
            front = rear = 0;
        } else {
            if (rear ==max -1){
                rear = 0;
            } else {
                rear++;
            }
        }
        data[rear] = dt;
        size++;
    }
    }
    
    public int Dequeue(){
        int dt = 0;
        if (IsEmpty()){
        System.out.println("Queue masih kosong");
        System.exit(0);
        }else {
            dt = data[front];
            size--;
            if (IsEmpty()){
                front = rear = -1;
            }else {
                if (front == max -1){
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

8.3.3 Pertanyaan
1. Pada class QueueMain, jelaskan fungsi IF pada potongan kode program berikut!
 
fungsi IF pada potongan kode program di atas berfungsi untuk mengecek apakah queue sudah terisi dan tidak kosong

2. Lakukan modifikasi program dengan menambahkan method baru bernama peekRear pada class Queue yang digunakan untuk mengecek antrian yang berada di posisi belakang! Tambahkan pula daftar menu 5. Cek Antrian paling belakang pada class QueueMain sehingga method peekRear dapat dipanggil!
 #Class Nasabah
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package praktikum2;

/**
 *
 * @author Hp
 */
public class Nasabah {
    String norek;
    String nama;
    String alamat;
    int umur;
    double saldo;
    
    Nasabah(String norek, String nama, String alamat, int umur, double saldo){
        this.norek = norek;
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
        this.saldo = saldo;
    }
    Nasabah[] data;
    int front;
    int rear;
    int size;
    int max;
    
    
    public Nasabah (int n){
        max = n;
        data = new Nasabah [max];
        size = 0;
        front = rear = -1;
    }
     Nasabah(){
     }   
    public boolean IsEmpty(){
        if (size ==0){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean IsFull(){
        if (size == max){
            return true;
        } else {
            return false;
        }
    }
    
    public void peek(){
        if (!IsEmpty()){
            System.out.println("Elemen terdepan :" + data[front].norek + " " + data[front].nama + " " + 
                    data[front].alamat + " " +data[front].umur + " " + data[front].saldo);
        } else{
            System.out.println("Queue masih Kosong");
        }
    }
    
    public void print(){
    if (IsEmpty()){
        System.out.println("Queue masih Kosong");
    } else {
        int i = front;
        while (i !=rear){
            System.out.println(data[i].norek + "" + data[i].nama + "" + 
                    data[i].alamat + "" + data[i].umur + ""+ data[i].saldo);
            i = (i + 1)% max;
            System.out.println(data[i].norek + "" + data[i].nama + "" + data[i].alamat + "" + data[i].umur + ""+ data[i].saldo);
            System.out.println("Jumlah elemen = " +size);
        }
    }
    }
    
    public void clear(){
        if (!IsEmpty()){
        front = rear = -1;
        size = 0;
        System.out.println("Queue berhasil dikosongkan");
        }else {
            System.out.println("Queue masih koaong");
        }
    }
    
    public void Enqueue (Nasabah dt){
    if (IsFull ()){
        System.out.println("Queue sudah penuh");
    }else {
        if (IsEmpty()){
            front = rear = 0;
        } else {
            if (rear ==max -1){
                rear = 0;
            } else {
                rear++;
            }
        }
        data[rear] = dt;
        size++;
    }
    }
    
    public Nasabah Dequeue(){
        Nasabah dt = new Nasabah();
        if (IsEmpty()){
        System.out.println("Queue masih kosong");
        }else {
            dt = data[front];
            size--;
            if (IsEmpty()){
                front = rear = -1;
            }else {
                if (front == max -1){
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }
    public void peekRear(){
        if(!IsEmpty()){
            System.out.println("Elemen paling belakang : " + data[rear].nama + " " + data[rear].norek + " " + data[rear].nama + 
                    " " + data[rear].alamat + " " + data[rear].umur + " " + data[rear].saldo);
        }else {
            System.out.println("Queue masih kosong");
        }
    }
    
}




Class NasabahMain
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

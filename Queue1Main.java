/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas1;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class Queue1Main {

        public static void menu(){
        System.out.println("Masukkan operasi yang akan diinginkan : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. print");
        System.out.println("4. peek");
        System.out.println("5. clear");
        System.out.println("6. peek Position");
        System.out.println("7. peek At");
        System.out.println("------------");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        System.out.print("Maukkan Kapasitas queue :");
        int n = sc.nextInt();
        Queue1 Q = new Queue1(n);
        
        int pilih;
        do{
            menu();
            pilih = sc.nextInt();
            switch (pilih){
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = sc.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if(dataKeluar !=0){
                        System.out.println("Data yang dikeluarkan : +dataKeluar");
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5 : 
                    Q.clear();
                    break;
                case 6 :
                    System.out.print("Masukkan data yang ingin dicari : ");
                    int cari = sc.nextInt();
                    Q.peekPosition(cari);
                    break;
                case 7 :
                    System.out.print("Masukkan data yang ingin dicari : ");
                    int indeks = sc.nextInt();
                    Q.peekAt(indeks);
                    break;
                    
            }
        } while (pilih == 1 || pilih == 2 ||  pilih ==3 || pilih == 4 || pilih == 5|| pilih == 6|| pilih == 7);
    }
    
}

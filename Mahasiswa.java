/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas2;

public class Mahasiswa {
    String nim;
    String nama;
    int absen;
    double ipk;
    
    Mahasiswa(String nim, String nama, int absen, double ipk){
        this.nim = nim;
        this.nama = nama;
        this.absen = absen;
        this.ipk = ipk;
    }
    Mahasiswa[] antrian;
    int front;
    int rear;
    int size;
    int max;
    
    
    public Mahasiswa (int n){
        max = n;
        antrian = new Mahasiswa [max];
        size = 0;
        front = rear = -1;
    }
    Mahasiswa(){
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
            System.out.println("Elemen terdepan :" + antrian[front].nim + " " + antrian[front].nama + " " + 
                    antrian[front].absen + " " +antrian[front].ipk);
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
            System.out.println(antrian[i].nim + " " + antrian[i].nama + " " + 
                    antrian[i].absen + " " + antrian[i].ipk);
            i = (i + 1)% max;
            System.out.println(antrian[i].nim + " " + antrian[i].nama + " " + antrian[i].absen + " " + antrian[i].ipk);
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
    
    public void Enqueue (Mahasiswa dt){
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
        antrian[rear] = dt;
        size++;
    }
    }
    
    public Mahasiswa Dequeue(){
        Mahasiswa dt = new Mahasiswa();
        if (IsEmpty()){
        System.out.println("Queue masih kosong");
        }else {
            dt = antrian[front];
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
            System.out.println("Elemen paling belakang : " + antrian[rear].nim + " " + antrian[rear].nama +  
                    " " + antrian[rear].absen + " " + antrian[rear].ipk);
        }else {
            System.out.println("Queue masih kosong");
        }
    }
   public void peekPosition(String data){
        if(!IsEmpty()){
            for (int i = 0; i < (front+size); i++){
                if(antrian[i].nim.equals(data)){
                    System.out.println("Mahasiswa dengan NIM " + data + "berada pada indeks ke-" + i);
                    break;
                }
            }
        }else{
            System.out.println("Queue masih kosong");
        }
    }
   public void printMahasiswa(int posisi){
        if(!IsEmpty()){
            for(int i = 0; i < antrian.length; i++){
                if(posisi == i){
                    System.out.println(antrian[i].nim + " " + antrian[i].nama + " " + antrian[i].absen + " " + antrian[i].ipk);
                }
            }
        }else{
            System.out.println("Queue masih kosong");
        }
    }   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas1;

/**
 *
 * @author Hp
 */
public class Queue1 {
     int[] data;
    int front;
    int rear;
    int size;
    int max;
    
    public Queue1 (int n){
        max = n;
        data = new int [max];
        size = 0;
        front = rear = -1;
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
            System.out.println("Elemen terdepan :" + data[front]);
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
            System.out.println(data[i] + "");
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
    
    public void Enqueue (int dt){
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
    
    public int Dequeue(){
        int dt = 0;
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

   public void peekPosition(int n) {
               if(! IsEmpty()){
            for(int i = 0; i< data.length; i++){
                if(n == data[i]){
                    System.out.println("Elemen : " + data[i] + " = indeks ke-" + i);
                }
            }
        }else{
            System.out.println("Queue masih kosong");
       }
    }

   public void peekAt(int n) {
        if(IsEmpty()){
            for(int i = 0; i< data.length; i++){
                if(n == i){
                System.out.println("Indeks : " + i + " = data ke-" + data[i]);
                }
            }
        }else{
           System.out.println("Queue masih kosong");
       }
    }

    
}

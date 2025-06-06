package P1Jobsheet10;

public class Queque {
    int[] data;
    int front, rear, size, max;

    public Queque(int n) {
        max = n;
        data = new int[max];
        front = rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false; 
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false; 
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + data[front]);
        } else {
            System.out.println("Queue masih Kosong");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue masih Kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        }
        else {
            System.out.println("Queue masih Kosong");
        }
    }

    public void enqueue(int dt) {
        if (isFull()) {
            System.out.println("Queue sudah Penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public int dequeue() {
        int dt = 0;
        if (isEmpty()) {
            System.out.println("Queue masih Kosong");
        } else {
            dt = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
            
        }
        return dt;
    }
}

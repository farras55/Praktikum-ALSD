package Praktikum11;

public class SingleLinkedList12 {
    Node12 head, tail;

    public Boolean isEmpty() {
        return head == null;
    }
    public void print () {
        if (!isEmpty()) {
            Node12 tmp = head;
            System.out.println("Isi Linked List\t");
            while (tmp != null) {
                tmp.data.tampilinformasi();
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("Linked List Kosong");
        }
    }
    public void addFirst(Mahasiswa12 input) {
        Node12 ndInput = new Node12(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }
    public void addLast(Mahasiswa12 input) {
        Node12 ndInput = new Node12(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    public void insertAfter(String key, Mahasiswa12 input) {
        Node12 ndInput = new Node12(input, null);
        Node12 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }
    public void insertAt(int index, Mahasiswa12 input) {
        if (index < 0) {
            System.out.println("Indeks Salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node12 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node12(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
    public void getData(int index) {
        Node12 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.data.tampilinformasi();
    }
    public int indexOf(String key) {
        Node12 tmp = head;
        int index = 0;
        while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {
            return -1;
        } else {
            return index;   
        }
    }
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
    }
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node12 tmp = head;
            while (tmp.next != tail) {
                tmp = tmp.next;
            }
            tmp.next = null;
            tail = tmp;
        }
    }
    public void remove(String key) {
        if (isEmpty()) {
            System.out.println("Linked List Kosong, tidak dapat dihapus!");
        } else {
            Node12 temp = head;
            while (temp != null) {
                if ((temp.data.nama.equalsIgnoreCase(key)) && (temp == head)) {
                    this.removeFirst();
                    break;
                } else if (temp.data.nama.equalsIgnoreCase(key)) {
                temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        } 
    }
    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node12 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}

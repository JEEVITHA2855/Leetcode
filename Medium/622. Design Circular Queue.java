class MyCircularQueue {
        int size;
        int cap;
        int a[];
        int rear; 
        int front;
    public MyCircularQueue(int k) {
        this.cap = k;
        a = new int[cap];
        size=0;
        rear=-1;
        front=0;
    }
    
    public boolean enQueue(int value) {
        if(isFull())
            return false;
        rear = (rear+1)%cap;
        a[rear] = value;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty())
            return false;
        int value = a[front];
        front = (front+1)%cap;
        size--;
        return true;
    }
    
    public int Front() {
        if(isEmpty())
            return -1;
        return a[front];
    }
    
    public int Rear() {
        if(isEmpty())
            return -1;
        return a[rear];
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size==cap;
    }
}

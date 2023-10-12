public class LinkedGL<E> implements MyList<E> {

    class Node{
        E value;
        Node next;

        public Node(E value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    Node front;
    int size;

    public LinkedGL(E[] contents) {
        // Fill in this constructor
        if(contents.length == 0){
            return;
        } else {

            this.front = new Node(null, null);
            Node temp = this.front;

            for (int i = 0; i < contents.length; i++){
                temp.next = new Node(contents[i], null);
                temp = temp.next;
                size++;
            }
        }

    }

    // Fill in all methods

    public E[] toArray() {
        E[] arr = (E[]) new Object[this.size];
        Node temp = this.front;

        for(int i = 0; i < this.size; i++) {
            arr[i] = temp.value;
            temp = temp.next;
        }
    }

    public void transformAll(MyTransformer mt){
        if (this.size == 0){
            return;
        }

        Node temp = this.front;

        while (temp.next != null) {
            E newValue = mt.transformElement(temp.value)
            temp.value = newValue;
            temp = temp.next;
        }

    }

    public void chooseAll(MyChooser mc){

    }

    public boolean isEmpty(){
        if (this.size == 0) {
            return true;
        }

        return false;
    }

}
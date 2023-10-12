public class ArrayGL<E> implements MyList<E> {

    E[] elements;
    int size;

    public ArrayGL(E[] initialElements) {
        this.elements = initialElements;
        this.size = initialElements.length;
    }

    // Fill in all required methods here
    @Override
    public E[] toArray(){
        return elements;
    }

    @Override
    public void transformAll(MyTransformer mt){
        for(int i = 0; i < elements.length; i++){
            elements[i] = mt.transformElement(elements[i]);
        }
    }
    @Override
    public void chooseAll(MyChooser mc){

    }
    @Override
    public boolean isEmpty(){
        if (this.size == 0){
            return true;
        }

        return false;

    }
}
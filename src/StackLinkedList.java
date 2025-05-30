public class StackLinkedList<T> implements Stack<T>{

    StackItem<T> top;
    @Override
    public void push(T item) {
        StackItem<T> newBox = new StackItem<>(item);
        StackItem<T> previousTop = top;
        top = newBox;
        top.setNext(previousTop);
    }

    public void displayStack(){
        if(this.top == null){
            System.out.println("This is stack is empty.");
        }else{
            StackItem<T> tempNode = top;
            while (tempNode != null){
                System.out.println(tempNode.getData());
                tempNode = tempNode.getNext();
            }
        }
    }
    @Override
    public T pop() throws MyEmptyStackException {
        if(this.top == null){
            throw new MyEmptyStackException("Stack is Empty, you can't pop anything from an empty stack.");
        }
        T tempData = top.getData();
        top = top.getNext();
        return tempData;
    }

    @Override
    public void peek() {
        System.out.println("The top is "
        + this.top.getData());
    }
    @Override
    public boolean isEmpty() {
        return this.top == null;
    }
}

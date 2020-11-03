package examen2.company;

public class QueueOrden<T extends Comparable<T>> {
    public Node<T> end;
    private int size = 0;

    public QueueOrden(Node<T> end) {
        this.end = end;
        size++;
    }

    public QueueOrden(T value) {
        this.end = new Node<T>(value, 0, 0, 0);
        size++;
    }

    public QueueOrden() {
    }

    public void Enqueue(Node<T> _new) {
        // Node<T> _new = new Node(value);
        if (size != 0) {
            if (_new.getPriority() >= this.end.getPriority()) {
                _new.setNext(this.end);
                this.end = _new;
            } else {
                Node<T> temp = this.end;
                while (_new.getPriority() < temp.getPriority()) {
                    Node<T> aux = temp.getNext();
                    if (aux == null) {
                        temp.setNext(_new);
                        break;
                    }
                    if (_new.getPriority() > (aux.getPriority()) && (_new.getPriority() < (temp.getPriority()))) {
                        _new.setNext(aux);
                        temp.setNext(_new);
                    }
                    temp = aux;
                }
            }
        } else {
            this.end = _new;
        }

        size++;
    }

    public T Dequeue() throws Exception {
        if (size == 0) {
            throw new EmptyQueueException();
        }

        if (size == 1) {
            T value = this.end.getValue();
            this.end = null;
            size--;
            return value;
        }
        Node<T> temp = this.end;
        for (int i = 1; i < size - 1; i++) {
            temp = temp.getNext();
        }
        T value = (T) temp.getNext().getValue();
        temp.setNext(null);
        size--;
        return value;
    }

    public T Peek(int elements) {
        Node<T> temp = this.end;
        for (int i = 0; i < elements; i++) {
            temp = temp.getNext();
        }
        return temp.getValue();
    }

    public int totalRuntime(Node<T> nodo, int TIME) {
        int time = TIME;
        while (nodo != null) {
            time += nodo.getCPU();
            nodo = nodo.getNext();
            totalRuntime(nodo, time);
        }
        return time;
    }

    public Node<T> buscar(){
        Node<T> aux= this.end;
        int i=0;
        Node<T> temp= aux;
        do{
            if(aux.getLlegada()==i){
                i++;
                aux.setCPU(aux.getCPU()-1);
                while(temp.getPrev().getLlegada()<=i){
                    temp=temp.getPrev();

                }
                if(temp.getPrev().getLlegada()>i){
                 //temp.llegada es mayor a i, osea ciclo actual   
                }

            }
            else
                aux= aux.getNext()
        }

    public void escheduler() {
        int RUNTIME = totalRuntime(this.end, 0);
        int ciclos = 0;
        int menor = 0;
        int aux1;
        int aux2;
        for (int i = 0; i < RUNTIME; i++) {

        }

    }

}

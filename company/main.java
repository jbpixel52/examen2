package com.company;


public class main {

    public static void main(String[] args) {
        QueueOrden<String> tasks = new QueueOrden<String>();
        Node<String> nodo0 = new Node<String>("WINDOWS", 0, 3, 5);
        Node<String> nodo1 = new Node<String>("CHROME", 1, 0, 4);
        Node<String> nodo2 = new Node<String>("Messenger",2,2,2);

        
        tasks.Enqueue(nodo0);
        tasks.Enqueue(nodo1);
        tasks.Enqueue(nodo2);

        System.out.println(tasks.end.getValue());
       System.out.println("BITCOOOONNEEECCT!");

    }
    

}
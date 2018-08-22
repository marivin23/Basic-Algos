package com.company;

class LinkedList {

    private Node head = null;
    private Node tail = null;

    LinkedList(){

        scanList();

    }

    private void addToStart(Node head, String nume, String prenume, int varsta){

        if( head != null ){
            Node next = head;
            this.head = new Node(next, nume, prenume, varsta);
        } else {
            this.head = new Node(null, nume, prenume, varsta);
            //this.tail = this.head;
        }

    }

    private void addToEnd(Node tail, String nume, String prenume, int varsta){

        if( tail != null ){
            tail.next = new Node(null,  nume, prenume, varsta);
            this.tail = tail.next;
        } else {
            head = new Node(null,  nume, prenume, varsta);
            this.tail = this.head;
        }

    }

    private void addAfterPosition(String cheie, String nume, String prenume, int varsta){

        Node scanner = head;

        while( scanner != null ){
            if( scanner.nume.equals(cheie)) break;
            scanner = scanner.next;
        }

        if( scanner.next != null ) {
            Node temp = scanner.next;
            scanner.next = new Node(temp, nume, prenume, varsta);
        } else addToEnd(tail, nume, prenume, varsta);

    }

    private void addBeforePosition(String cheie, String nume, String prenume, int varsta){

        Node scanner = head;

        while( scanner != null ){
            if( scanner.nume.equals(cheie)) break;
            scanner = scanner.next;
        }
        if( scanner.next != null ) {
            Node temp = scanner.next;
            scanner.next = new Node(temp, nume, prenume, varsta);
        } else addToEnd(tail, nume, prenume, varsta);

    }

    private void removeStart(){
        head = head.next;
    }

    private void removeEnd(){

        Node scanner = head;
        while( scanner.next.next == null ){
            scanner = scanner.next;
        }
        tail = scanner;
        tail.next = null;

    }

    private void removeByKey(String cheie){

        Node scanner = head;

        while(scanner.next.next != null){
            if(scanner.next.nume.equals(cheie)){
                scanner.next = scanner.next.next;
            }
            scanner = scanner.next;
        }

    }

    private void searchByKey(String nume){

        Node scanner = head;

        while( scanner != null ){
            if( scanner.nume.equals(nume) ){
                System.out.println("Found at address " + scanner);
                break;
            }
            scanner = scanner.next;
        }

    }

    private void deleteList(){
        head = null;
    }

    private void scanList(){

        Node scanner = head;

        while( scanner != null ){
            System.out.println(scanner.nume + ", " + scanner.prenume + ", " + scanner.varsta);
            scanner = scanner.next;
        }

    }

}

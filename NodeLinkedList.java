package com.company;

class Node {
    Node next;
    String nume;
    String prenume;
    int varsta;

    Node(Node next, String nume, String prenume, int varsta){
        this.next = next;
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }
}

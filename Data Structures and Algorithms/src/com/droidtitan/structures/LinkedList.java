package com.droidtitan.structures;

public class LinkedList<T>
{
    Node<T> head;
    Node<T> tail;
    int size;

    public LinkedList()
    {
	super();
	this.head = null;
	this.tail = null;
	this.size = 0;
    }

}

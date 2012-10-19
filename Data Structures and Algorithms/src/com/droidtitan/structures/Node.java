package com.droidtitan.structures;

public class Node<T>
{
    T data;
    Node<T> next;

    public Node(T data, Node<T> next)
    {
	super();
	this.data = data;
	this.next = next;
    }

}

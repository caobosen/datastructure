package queues;

public class ArrayQueue<E> implements Queue<E>{
	
	public static final int CAPACITY=100;
	//instance variables
	private E[] data;  //generic array used for storage
	private int f=0;  //index of the front element
	private int sz=0; //current number
	
	// constructors
	public ArrayQueue(){
		this(CAPACITY);
	}
	
	public ArrayQueue(int capacity){
		data=(E[])new Object[capacity];
	}
	
	//methods
	/** Return the number of elements in the queue*/
	public int size(){return sz;}
	
	//Tests whether the queue is empty.
	public boolean isEmpty(){
		return sz==0;
	}
	
	/*Inserts an element at the rear of the queue*/
	public void enqueue(E e) throws IllegalStateException{
		if(sz==data.length) throw new IllegalStateException("Queue is full");
		int avail = (f+sz)%data.length;
		data[avail]=e;
		sz++;
	}
	
	/** Return. but does not remove, the first element of the queue (null if empty).*/
	public E first(){
		if(isEmpty()) return null;
		return data[f];
	}
	
	/** Removes and return the first element of the queue (null if empty).*/
	public E dequeue(){
		if(isEmpty()) return null;
		E answer = data[f];
		data[f]=null;
		f=(f+1)%data.length;
		sz--;
		return answer;
	}
	
	
	
	
	
	

}


package listanditerator;

public class ArrayList<E> implements List<E>{
	// instance variables
	public static final int CAPACITY=16;
	
	private E[] data;
	private int size = 0;
	
	//constructors
	public ArrayList() {this(CAPACITY);}
	
	public ArrayList(int capacity){
		data = (E[])new Object[capacity];
	}
	
	//public methods
	/**Return the number of elements in the array list */
	public int size(){ return size;}
	
	/** Return whether the array list is empty */
	public boolean isEmpty(){return size==0; }
	
	/** Return (but does not remove) the element at index i */
	public E get(int i) throws IndexOutOfBoundsException{
		checkIndex(i,size);
		return data[i];
	}
	
	/**
	 * Replace the element at index i with e, and return the replaced element
	 */
	public E set(int i, E e) throws IndexOutOfBoundsException{
		checkIndex(i,size);
		E temp = data[i];
		data[i]=e;
		return temp;
	}
	
	/**
	 * Insrts element e to be at index i, shifting all subsequent elements later
	 */
	public void add(int i, E e) throws IndexOutOfBoundsException, IllegalStateException{
		checkIndex(i, size+1);
		
		//not enough capacity
		if(size==data.length) throw new IllegalStateException("Array is full");
		
		//start by shifting rightmost
		for(int k=size-1; k>=i; k--){
			data[k+1] = data[k];
		}
		
		//ready to place the new element
		data[i] = e;
		size++;
	}
	
	/**
	 * Removes and returns the element at index i, shifting subsequent elements earlier
	 */
	public E remove(int i) throws IndexOutOfBoundsException{
		checkIndex(i, size);
		E temp = data[i];
		for (int k=i; k<size-1;k++){
			data[k]=data[k+1];
		}
		data[size-1] = null;
		size--;
		return temp;
		
	}
	
	// utility method
	/** Checks whether the given index is in the range[0,n-1] */
	protected void checkIndex(int i, int n) throws IndexOutOfBoundsException{
		if(i<0 || i>=n) throw new IndexOutOfBoundsException("Illegal index: "+ i);
	}
	
}

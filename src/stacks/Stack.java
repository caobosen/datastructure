package stacks;

public interface Stack<E> {
	
	
	/**
	 * Return the number of element in the stack 
	 * @return number of elements in the stack
	 */
	 int size();
	 
	/**
	 * Tests whether the stack is empty.
	 * @return true if stack is empty, false otherwise
	 */
	boolean isEmpty();
	
	/**
	 * Inserts an element at the top of the stack.
	 * @param e the element to be inserted
	 */
	void push(E e);
	
	/**
	 *Return, but dose not remove, the element at the top of the stack.
	 *@return top element in the stack (or null if empty)
	 */
	E top();
	
	/** 
	 * Removes and return the top element from the stack.
	 * @return element removed (or null if empty)
	 */
	E pop();
	

}

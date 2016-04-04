//Team ____ Shanjeed ALi and Gabriel Marks
//APCS2 pd10
//HW25 -- Brits Do Not Wait In Line
//2016-04-05

/*****************************************************
 * class LLQueue
 * uses a linked list to implement a QUEUE
 * (a collection with FIFO property)
 *
 *       -------------------------------
 *   end |  --->   Q U E U E   --->    | front
 *       -------------------------------
 *
 ******************************************************/

import java.util.NoSuchElementException;
//import java.util.RuntimException;

public class LLQueue<T> implements Queue<T> {

    private LLNode<T> _front, _end;

    // default constructor creates an empty queue
    public LLQueue()
	{ 
	    _end = new LLNode(null, null);
	    _front = new LLNode(null, _end);
	    
    }

    // means of adding a thing to the collection
    public void enqueue( T enQVal ) 
    {
	if (isEmpty()){
	    _front.setNext(new LLNode(enQVal, _end));
	    return;
	}
	LLNode tmp = _front;
	while (tmp.getNext() != _end){
	    tmp = tmp.getNext();
	}
	
	tmp.setNext( new LLNode(enQVal, _end));
    }//O(?)


    // means of removing a thing from the collection
    // remove and return thing at front of queue
    // assume _queue ! empty
    public T dequeue() 
    {
	if (isEmpty()){
	    throw new NoSuchElementException();
	}
	T ret = _front.getNext().getValue();
	_front.setNext(_front.getNext().getNext());
	return ret;
    }//O(?)


    // means of peeking at thing next in line for removal
    public T peekFront() 
    {
	T ret = _front.getNext().getValue();
	return ret;
    }//O(?)


    public boolean isEmpty() 
    {
	return (_front.getNext().equals(_end));
    }//O(?)


    // print each node, separated by spaces
    public String toString() 
    { 
	String ret = "";
	LLNode tmp = _front;
	while(tmp.getNext() != _end){
	    tmp=tmp.getNext();
	    ret += tmp.getValue();
	    ret += "  ";
	}
	return ret;

    }//O(?)



    public static void main( String[] args ) {


	Queue<String> LLQueuelJ = new LLQueue<String>();

	System.out.println("\nnow enqueuing thrice..."); 
	LLQueuelJ.enqueue("James");
	LLQueuelJ.enqueue("Todd");
	LLQueuelJ.enqueue("Smith");

	System.out.println("\nnow testing toString()..."); 
	System.out.println( LLQueuelJ ); //for testing toString()...

	System.out.println("\nnow dequeuing thrice..."); 
	System.out.println( LLQueuelJ.dequeue() );
	System.out.println( LLQueuelJ.dequeue() );
	System.out.println( LLQueuelJ.dequeue() );

	System.out.println("\nDequeuing from empty queue should yield error..."); 
	System.out.println( LLQueuelJ.dequeue() );
	/*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
	  ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

    }//end main

}//end class LLQueue

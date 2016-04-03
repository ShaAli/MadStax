//Team MadStax -- Shanjeed Ali and Gabriel Marks
//APCS2 pd10
//HW23 -- Leon Leonwood Stack
//2016-04-04

/*****************************************************
 * class LLStack
 * Implements ADT Stack, generically typed.
 * Uses an ArrayList as underlying container.
 *****************************************************/

import java.util.LinkedList;


public class LLStack<T> implements Stack<T> {

    private LinkedList<T> _stack;
    private int _stackSize;

    //constructor
    public LLStack() { 
	_stack = new LinkedList<T>();
	_stackSize = 0;
    }

    /*************************************************
Should we have another constructor?????????????
    *************************************************/
    /*  public LLStack( int size ) { 
	_stack = new LinkedList<T>(size);
	}*/


    //means of insertion
    public void push( T s ) {  
	_stack.add(s);
	_stackSize++;
}


    //means of viewing top element without removing
    public T peek( ) { 
	T retVal = null;
	if ( isEmpty() )  return null;
	retVal = _stack.get( _stackSize-1 );
	return retVal;
    }


    //means of removal
    public T pop( ) { 
	T retVal = null;
	if ( isEmpty() )  return null;
	retVal = _stack.remove( _stackSize-1 );
	_stackSize--;
	return retVal;
    }


    //chk for emptiness
    public boolean isEmpty() { 	return _stackSize == 0;  }


    //main method for testing
    public static void main( String[] args ) {

	Stack<String> tastyStack = new LLStack<String>();

	tastyStack.push("aoo");
	tastyStack.push("boo");
	tastyStack.push("coo");
	tastyStack.push("doo");
	tastyStack.push("eoo");
	tastyStack.push("foo");
	tastyStack.push("goo");
	tastyStack.push("hoo");
	tastyStack.push("ioo");
	tastyStack.push("joo");
	tastyStack.push("coocoo");
	tastyStack.push("cachoo");

	//cachoo
	System.out.println( "peek: " + tastyStack.peek() );
	System.out.println( "pop: " + tastyStack.pop() );
	//coocoo
	System.out.println( "peek: " + tastyStack.peek() );
	System.out.println( "pop: " + tastyStack.pop() );
	//joo
	System.out.println( "peek: " + tastyStack.peek() );
	System.out.println( "pop: " + tastyStack.pop() );
	//ioo
	System.out.println( "peek: " + tastyStack.peek() );
	System.out.println( "pop: " + tastyStack.pop() );
	//hoo
	System.out.println( "peek: " + tastyStack.peek() );
	System.out.println( "pop: " + tastyStack.pop() );
	//goo
	System.out.println( "peek: " + tastyStack.peek() );
	System.out.println( "pop: " + tastyStack.pop() );
	//foo
	System.out.println( "peek: " + tastyStack.peek() );
	System.out.println( "pop: " + tastyStack.pop() );
	//eoo
	System.out.println( "peek: " + tastyStack.peek() );
	System.out.println( "pop: " + tastyStack.pop() );
	//doo
	System.out.println( "peek: " + tastyStack.peek() );
	System.out.println( "pop: " + tastyStack.pop() );
	//coo
	System.out.println( "peek: " + tastyStack.peek() );
	System.out.println( "pop: " + tastyStack.pop() );
	//boo
	System.out.println( "peek: " + tastyStack.peek() );
	System.out.println( "pop: " + tastyStack.pop() );
	//aoo
	System.out.println( "peek: " + tastyStack.peek() );
	System.out.println( "pop: " + tastyStack.pop() );

	//stack empty by now; SOP(null)
	System.out.println( "peek: " + tastyStack.peek() );
	System.out.println( "pop: " + tastyStack.pop() );
	System.out.println( tastyStack.pop() );
    }

}//end class LLStack
<<<<<<< HEAD
/*****************************************************
 * class ALStack
 * Implements ADT Stack, generically typed.
 * Uses an ArrayList as underlying container.
 *****************************************************/

import java.util.ArrayList;
=======
//Team MadStax -- Shanjeed Ali and Gabriel Marks
//APCS2 pd10
//HW22 -- Standardization
//2016-03-31

import java.util.ArrayList;

public class ALStack<T> implements Stack<T>{
>>>>>>> f2b602a8c117c24f64102ffdefe9ab7167d5944e

    private ArrayList<T> _stack;
    private int _stackSize;

public class ALStack<T> implements Stack<T> {

    private ArrayList<T> _stack;

    //constructor
    public ALStack() { 
<<<<<<< HEAD
	_stack = new ArrayList<T>();
    }

    public ALStack( int size ) { 
	_stack = new ArrayList<T>(size);
    }


    //means of insertion
    public void push( T s ) {  _stack.add(s);  }


    //means of viewing top element without removing
    public T peek( ) { 
	T retVal = null;
	if ( isEmpty() )  return null;
	retVal = _stack.get( _stack.size()-1 );
	return retVal;
    }


    //means of removal
    public T pop( ) { 
	T retVal = null;
	if ( isEmpty() )  return null;
	retVal = _stack.remove( _stack.size()-1 );
	return retVal;
=======
	_stack = new ArrayList<T>(42); 
    }


    //overloaded constructor allows for intial capacity declaration
    public ALStack( int size ) { 
	_stack = new ArrayList<T>(size);
    }

    //insert
    public void push( T s){
	_stack.add(s);
	_stackSize++;
>>>>>>> f2b602a8c117c24f64102ffdefe9ab7167d5944e
    }

    //remove
    public T pop(){
	if (isEmpty())
	    return null;
	T ret = _stack.get(_stack.size()-1);
	_stack.remove(_stack.size()-1);
	_stackSize--;
	return ret;
    }

    public T peek(){
	if(isEmpty())
	    return null;
	return _stack.get(_stack.size()-1);
    }

    //chk for emptiness
    public boolean isEmpty() 
    { 
	return _stackSize == 0; 
    }

    //chk for fullness
    public boolean isFull() {
	return _stackSize >= _stack.size(); 
    }

    //chk for emptiness
    public boolean isEmpty() { 	return _stack.size() == 0;  }


    //main method for testing
    public static void main( String[] args ) {

<<<<<<< HEAD
	Stack<String> tastyStack = new ALStack<String>();
=======


	ALStack tastyStack = new ALStack(10);
>>>>>>> f2b602a8c117c24f64102ffdefe9ab7167d5944e

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
<<<<<<< HEAD
    }
=======

	/*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
          ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
    }//end main()
>>>>>>> f2b602a8c117c24f64102ffdefe9ab7167d5944e

}//end class ALStack

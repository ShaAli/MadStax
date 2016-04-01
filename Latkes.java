//Team MadStax -- Shanjeed Ali and Gabriel Marks
//APCS2 pd10
//HW22 -- Standardization
//2016-03-31

/*****************************************************
 * skeleton for class Latkes
 * Implements a stack of Strings using an array as underlying container.
 *****************************************************/

public class Latkes<T> implements Stack<T>{

    private T [] _stack;
    private int _stackSize;


    //constructor
    public Latkes ( int size ) 
    { 
	_stack = (T[])new Object[size];
	_stackSize = 0;
    }

    //means of insertion
    public void push( T s ) 
    { 
	//if necessary, create more storage space
	if ( isFull() ) {
	    T[] temp = (T[])new Object[ _stack.length * 2 ];	
	    for( int i = 0; i < _stack.length; i++ ) {
		temp[i] = _stack[i];
	    }
	    _stack = temp; //old _stack freed by JGC
	}
	//add new element at end of array
	//Q: Why is this more efficient than inserting at front?
	_stack[_stackSize] = s;
	_stackSize++;
    }


    //means of removal
    public T pop( ) 
    { 
	if ( isEmpty() )  return null;
	T retStr = _stack[ _stackSize-- - 1 ];
	return retStr;
    }

    public T peek() {
	if(isEmpty()) return null;
	return _stack[_stackSize - 1];
    }

    //chk for emptiness
    public boolean isEmpty() 
    { 
	return _stackSize == 0; 
    }


    //chk for fullness
    public boolean isFull() 
    {
	return _stackSize >= _stack.length; 
    }


    //main method for testing
    public static void main( String[] args ) {
	
	Latkes<String> tastyStack = new Latkes<String>(10);

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
	System.out.println( tastyStack.pop() );
	//coocoo
	System.out.println( tastyStack.pop() );
	//joo
	System.out.println( tastyStack.pop() );
	//ioo
	System.out.println( tastyStack.pop() );
	//hoo
	System.out.println( tastyStack.pop() );
	//goo
	System.out.println( tastyStack.pop() );
	//foo
	System.out.println( tastyStack.pop() );
	//eoo
	System.out.println( tastyStack.pop() );
	//doo
	System.out.println( tastyStack.pop() );
	//coo
	System.out.println( tastyStack.pop() );
	//boo
	System.out.println( tastyStack.pop() );
	//aoo
	System.out.println( tastyStack.pop() );

	//stack empty by now; SOP(null)
	System.out.println( tastyStack.pop() );
	/*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
	  ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

    }//end main()

}//end class Latkes

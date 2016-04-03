//Team MadStax -- Gabriel Marks and Shanjeed Ali
//APCS2 pd10
//HW24 -- Schemin
//2016-04-04

/******************************************************
 * ALGORITHM for EVALUATING A SCHEME EXPRESSION:
   1)parse turns the string into a stack 
   2)evaluate takes the stack and passes it onto evalHelper
   3)evalHelper breaks the stack into sections, each with a single operation and passes it onto operate 
   4)operate performs the operation and returns the value
 * STACK OF CHOICE: we used the built-in Java Stack (we only used pop, peek and push)
 ******************************************************/

import java.util.Stack;
import java.util.ArrayList;

class Scheme {
    //Adds each element from the expression into the stack, reverse so that top of stack is first element
    public static Stack parse(String scheme) {
	Stack<String> ret = new Stack<String>();
	String[] splote = scheme.split(" "); //splote is past tense of split
	
	for(int i = splote.length - 1; i >= 0; i--) {
	    ret.push(splote[i]);   
	}
	return ret;
    }
    //Evaluates an operation on a list of arguments, assuming arguments are all ints (so inner expressions
    //have to be taken care of first.
    //We could use a stack, but then it would reverse which would be annoying
    public static int operate(String op, ArrayList<Integer> args) {
	//System.out.println("args: ");
	//for(int i : args) System.out.println(i);
	if(op.equals("+")) {
	    int sum = 0;
	    for(int i : args) {
		sum += i;
	    }
	    return sum;
	}
	else if(op.equals("*")) {
	    int product = 1;
	    for(int i : args) {
		product *= i;
	    }
	    return product;
	}
	else if(op.equals("-")) {
	    int difference = args.get(0) * 2; //*2 is because the first int i : args is args.get(0)
	    for(int i : args) {
		difference -= i;
	    }
	    return difference;
	}
	else {
	    //Mostly for testing, else could have been minus because we are assuming valid scheme
	    System.out.println("Invalid operation: " + op);
	    return -1;
	}
    }
    public static int evalHelper(Stack<String> stack) {
	//System.out.println("in helper");
	stack.pop(); //pop off the open paren
	String op = stack.pop(); //op is after open paren
	ArrayList<Integer> args = new ArrayList<Integer>();
	while(!stack.peek().equals(")")) { //if we get to a closed paren, operate it and replace
	    if(stack.peek().equals("(")) { //new expression to be eval'd
		args.add(evalHelper(stack)); //new evalHelper will pop all the stuff and only leave an int, which the next iteration will take care of
	    }
	    else {
		args.add(Integer.parseInt(stack.pop())); 
	    }
	} //we finished the expression, operate on it
	stack.pop(); //first pop off the closed paren
	return operate(op,args);
    }		
		    
    public static int evaluate(String scheme) {
        return evalHelper(parse(scheme));
    }

     //main method for testing
    public static void main( String[] args ) {

	
	String zoo1 = "( + 4 3 )";
	System.out.println(zoo1);
	System.out.println("zoo1 eval'd: " + evaluate(zoo1) );
	//...7

	String zoo2 = "( + 4 ( * 2 5 ) 3 )";
	System.out.println(zoo2);
	System.out.println("zoo2 eval'd: " + evaluate(zoo2) );
	//...17

	String zoo3 = "( + 4 ( * 2 5 ) 6 3 ( - 56 50 ) )";
	System.out.println(zoo3);
	System.out.println("zoo3 eval'd: " + evaluate(zoo3) );
	//...29

	String zoo4 = "( - 1 2 3 )";
	System.out.println(zoo4);
	System.out.println("zoo4 eval'd: " + evaluate(zoo4) );
	//...-4
	/*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
          ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
    }//main
}

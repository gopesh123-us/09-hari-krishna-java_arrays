package live.learnjava.java_arrays.operations;

public class ArrayOperationFailedException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ArrayOperationFailedException(){
		super();
	}
	
	public ArrayOperationFailedException(String message) {
		super(message);
	}	
	
}

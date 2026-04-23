package live.learnjava.java_arrays.growablearray;

import java.util.Arrays;

public class GrowableArrayDemo {


	public GrowableArrayDemo() {

	}

	public boolean isArrayFull(Object[] theArray) {
		boolean isFull = false;

		for (int i = 0; i < theArray.length; i++) {
			if (theArray[i] == null) {
				isFull = false;
				break;
			} else {
				isFull = true;
			}
		}
		return isFull;
	}

    public Object[] add(Object theObj, Object[] obj) {
    	if(!isArrayFull(obj)) {
    		for(int i = 0; i < obj.length; i++) {
    			if(obj[i] == null) {
    				obj[i] = theObj;
    				break;
    			}
    		}
    	} else if(isArrayFull(obj)) {
    		//create a new array of double capacity;
    		Object[] newArray = new Object[obj.length * 2];
    		for(int i = 0; i < obj.length; i++) {
    			newArray[i] = obj[i];
    		}
    		System.out.println("new Array elements: " + Arrays.toString(newArray));
    		obj = newArray;
    		add(theObj, obj);
    		//call add()
    	}
    	return obj;
    }
}

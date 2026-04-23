package live.learnjava.java_arrays.growablearray;

import java.util.Arrays;

public class GrowableArrayDemo2 {
	private Object[] obj;
	private int size;
	
	public GrowableArrayDemo2() {
		obj = new Object[3];
		size = 0;
	}
	public int getSize() {
		return size;
	}
	
	public int getCapacity() {
		return obj.length;
	}
	
	public void add(Object theObj) {
		if(getSize() == getCapacity()) {
			increaseCapacity();
		}
		obj[size] = theObj;
		size++;
	}

	private void increaseCapacity() {
		
		Object[] tmpObjArr = new Object[getCapacity() * 2];
		for(int i = 0; i < this.obj.length; i++) {
			tmpObjArr[i] = obj[i];
		}
		obj = tmpObjArr;
	}
	
	public void printItems() {
		System.out.println(Arrays.toString(obj));
	}
	
//	public boolean contains(Object obj) {
//		for(int i = 0; i< this.getCapacity(); i++) {
//			if(obj.equals(elementData[i])) {
//				return true;
//			}
//		}
//		return false;
//	}
	
}

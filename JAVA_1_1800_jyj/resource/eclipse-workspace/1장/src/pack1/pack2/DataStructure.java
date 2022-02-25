package pack1.pack2;
public class DataStructure {
private final static int SIZE = 15;
private int[] arrayOfOnt = new int[SIZE];
public DataStructure() {
	for(int i=0;i<SIZE;i++) {
		arrayOfOnt[i] =i; 
	}
}
public void printEven() {
	InnerEvenI iterator = this.new InnerEvenI();
	while(iterator.hasNext() ) {
		System.out.println(iterator.getNext()+" ");
	}
}
private class InnerEvenI() {
	private int next =0;
	public boolean hasNext() {
		return (next<=SIZE-1);
	}
	public int getNext() {
		int retValue = arrayOfOnt[next];
		next+=2;
		return retValue;
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BranchB b = new BranchB();
		//BranchC c = new BranchC();
		System.out.println("Hello world! This is the Main file!");
		System.out.println("This message demonstrates rebasing and merging!");
		System.out.print("Incoming message from Branch B: "); BranchB.print(); //b.print();
		System.out.println("This is a message from Branch A!");
		System.out.print("Incoming message from Branch C: "); BranchC.print(); //c.print();
	}

}

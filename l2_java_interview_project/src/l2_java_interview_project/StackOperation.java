package l2_java_interview_project;

public class StackOperation {
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		
		stack.push(7);
		System.err.println("Pushed "+stack.traverse());
		stack.push(10);
		System.err.println("Pushed "+stack.traverse());
		stack.push(111);
		System.err.println("Pushed "+stack.traverse());
		stack.push(113);
		System.err.println("Pushed "+stack.traverse());
		stack.pop();
		System.err.println("Poped "+stack.traverse());
		stack.pop();
		System.err.println("Poped "+stack.traverse());
		stack.pop();
		System.err.println("Poped "+stack.traverse());
		
		System.err.println("final list"+stack.traverse());
	}
}

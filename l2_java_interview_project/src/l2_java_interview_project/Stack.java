package l2_java_interview_project;

import java.util.ArrayList;
import java.util.List;

public class Stack {

	private final ArrayList<Integer> elements = new ArrayList<>();
	
	public void push(Integer num) {
		elements.add(num);
	}
	
	public void pop() {
		if(elements != null && !elements.isEmpty()) {
			elements.remove(elements.size() - 1);
		}
	}
	
	public List<Integer> traverse() {
		return elements;
	}
}

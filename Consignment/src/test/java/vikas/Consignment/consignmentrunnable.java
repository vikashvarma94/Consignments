package vikas.Consignment;

import org.testng.TestNG;

public class consignmentrunnable {
	static TestNG test;
	public static void main(String[] args) {
		
		test = new TestNG();
		test.setTestClasses(new Class[] {consignments.class});
		test.run();		
	}
}

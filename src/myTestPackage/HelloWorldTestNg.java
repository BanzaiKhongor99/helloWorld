package myTestPackage;
import org.testng.annotations.Test;

public class HelloWorldTestNg {
	
	@Test
	public void sampleTest() {
		System.out.print("Hello World Test NG!");
	}
    public void sampleTest2() {
    	System.out.println(5/0);
    }
}

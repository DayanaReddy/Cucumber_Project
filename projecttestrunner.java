package cucumber_Project;


	import static org.junit.Assert.*;

	import org.junit.Test;







	import static org.junit.Assert.*;
	import org.junit.runner.RunWith;

	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;
	import org.junit.Test;
	@RunWith (Cucumber.class)
	@CucumberOptions(features="src/test/resources/SauceDemo/PlaceOrder.feature",glue="cucumber_Project")
	public class projecttestrunner {


}

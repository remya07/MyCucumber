package packageOrange;

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Remya on 12/30/2014.
 */
@RunWith(Cucumber.class)
@Cucumber.Options(
        format = {"pretty","html:target/cucumber"}
//        features="src/test/resources"
)
public class RunTests {

}

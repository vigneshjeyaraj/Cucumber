package steps

import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

/**
 * Created with IntelliJ IDEA.
 * User: vjeyar
 * Date: 2/12/15
 * Time: 3:25 PM
 * To change this template use File | Settings | File Templates.
 */

@Cucumber.Options(
        features = "src/test/Cucumber/feature",
        glue = "src/test/Cucumber/steps",
        format = ["pretty","html:build/reports/cucumber"]
)
@RunWith(Cucumber)
public class Runner {
}

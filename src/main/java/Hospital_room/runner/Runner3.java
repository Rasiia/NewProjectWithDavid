package Hospital_room.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


   @RunWith(Cucumber.class)

    @CucumberOptions(
            features ="",               // resourse content root
            glue ="",        //stepdif  sourse
            dryRun = false,
            tags = "@smoke",
            plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}
    )
    public class Runner3 {
    }



package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/features",
        glue= "src/test/java/stepdefinitions",
        tags="@wip",
        dryRun = false
)

public class Runner {

    // Runner classının bodysine hiçbir kod yazmıyoruz. merhaba seyfullah hocam
    // Bu class için önemli olan kullnacagımız iki adet notasyon var.

        // degişiklik onaylandı


}

package StepDefination;

@RunnerWith(Cucumber.class)
@CucumberOptions(features="Features",glue="StepDefinations",monochrome=true,pluging= {"pretty","html:target/reports.html"})
public class Runnerclass{
}

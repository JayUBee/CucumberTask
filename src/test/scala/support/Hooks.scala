package support

import io.cucumber.scala.{EN, ScalaDsl}
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.{ChromeDriver, ChromeOptions}

class Hooks extends ScalaDsl with EN {

  val options = new ChromeOptions()
  options.addArguments("--headless")


  Before {
    println("Launching browser before scenario...")
    DriverManager.driver = new ChromeDriver()
    DriverManager.driver.manage().window().maximize()
  }

  After {
    println("Closing browser after scenario...")
    DriverManager.driver.quit()
  }

}
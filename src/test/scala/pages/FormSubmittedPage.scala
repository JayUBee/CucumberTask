package pages

import org.openqa.selenium.By
import pages.LoginPage.{getText, getWebElement}
import support.DriverManager.driver
import utils.Assertion
import utils.WaitUtils.waitForElementVisible

object FormSubmittedPage {

  def verifyHeader(header: By, expectedHeader: String): Unit = {
    waitForElementVisible(driver, getWebElement(header), 10)
    Assertion.assert(getText(header), expectedHeader)
  }
}

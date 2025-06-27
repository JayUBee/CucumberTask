package locators

import org.openqa.selenium.By

object FormLocators {

  val firstName: By = By.id("firstName")
  val lastName:By = By.id("lastName")
  val email: By = By.id("userEmail")
  val genderMale: By = By.id("gender-radio-1")
  val mobileNumber: By = By.id("userNumber")
  val dateOfBirth: By = By.id("dateOfBirthInput")
  val hobbyMusic: By = By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label")
  val submit: By = By.id("submit")
  val subject: By = By.id("subjectsInput")
  val currentAddress: By = By.id("currentAddress")
  val stateDropDown: By = By.id("state")
  val cityDropDown: By = By.id("city")
  val chooseFile: By = By.id("uploadPicture")
  val formPageHeader: By = By.tagName("h1")
  val expectedPageHeader: String = "Practice Form"
  //val suggestions: By = By.className("subjects-auto-complete__menu")

}

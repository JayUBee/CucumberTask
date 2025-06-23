package pages

import locators.FormLocators.{chooseFile, currentAddress, dateOfBirth, email, firstName, genderMale, hobbyMusic, lastName, mobileNumber, subject}
import org.openqa.selenium.By
import testdata.Data.dateText
import utils.Dropdown.{clickOption, openDropdown}


object LoginPage extends BasePage {

  // — User Name —

  def inputFirstName(text: String): Unit =
    inputText(firstName, text)

  // — Password —
  def inputLastName(text: String): Unit = {
    inputText(lastName, text)
  }

  def inputEmail(text: String): Unit = {
    inputText(email, text)
  }

  def inputMobileNumber(number: String): Unit = {
    inputText(mobileNumber, number)
  }

  def inputDateOfBirth(): Unit ={
    jsExecutorLaunch().executeScript(s"document.getElementById('dateOfBirthInput').value = '$dateText';")
  }

  def selectGender(genderOptionCssLocator: String): Unit = {
    val genderOption = findByCssSelector(genderOptionCssLocator)
    if(!genderOption.isSelected) genderOption.click()
  }

  def selectHobby(hobbyOptionCssLocator: String): Unit = {
    val hobbyOption = findByCssSelector(hobbyOptionCssLocator)
    jsExecutorLaunch().executeScript("arguments[0].scrollIntoView(true):", hobbyOption)
    if(!hobbyOption.isSelected) hobbyOption.click()
  }

  def inputSubject(partialText: String): Unit = {
    inputText(subject, partialText)
  }

  def uploadFile(path: String): Unit = {
    inputText(chooseFile, path)
  }

  def inputCurrentAddress(text: String): Unit = {
    inputText(currentAddress, text)
  }

  def selectDropdownOption(dropDownLocator: By, optionText: String): Unit = {
    openDropdown(dropDownLocator)
    clickOption(optionText)
  }

  // — Submit Button —
  def buttonSubmit(submitLocator: By): Unit = {
    jsExecutorLaunch().executeScript("arguments[0].scrollIntoView(true);", getWebElement(submitLocator))
    clickOn(submitLocator)
  }

}
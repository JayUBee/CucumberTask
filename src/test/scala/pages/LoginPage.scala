package pages

import locators.LoginLocators.{firstName, lastName, gender, yearsExp, date, profession, autoTools}


object LoginPage extends BasePage {

  // — User Name —

  def inputFirstName(text: String): Unit =
    inputText(firstName, text)

  // — Password —
  def inputLastName(text: String): Unit = {
    inputText(lastName, text)
  }
  def genderMale(): Unit = {
    clickOn(gender)
  }

  // — Submit Button —
  def buttonSubmit(): Unit = {
    clickOn(Submit)
  }

}
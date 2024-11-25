import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Utilities/Registration (6)/Continue as a guest'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Home screen elements/Search'), 0)

Mobile.tap(findTestObject('Object Repository/Home screen elements/Search'), 10)

Mobile.setText(findTestObject('Home screen elements/Search'), GlobalVariable.ZoneName, 10)

Mobile.tap(findTestObject('Home screen elements/SearchResult'), 10)

Mobile.tap(findTestObject('Booking spot screen/Select'), 0)

Mobile.setText(findTestObject('Booking spot screen/User Mobile number'), '111111111', 0)

Mobile.scrollToText('Sign Up', FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Vehicle Objects/FirstNumberVehicle'), 0)

Mobile.setText(findTestObject('Vehicle Objects/FirstNumberVehicle'), '1', 0)

Mobile.setText(findTestObject('Vehicle Objects/FirstCharacterVehicle'), 'A', 0)

Mobile.tap(findTestObject('Booking spot screen/Go to payment'), 0)

Mobile.scrollToText('Credit', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Booking summary screen/Arrow'), 0)

Mobile.tap(findTestObject('Booking summary screen/Add New Card'), 0)

Mobile.tap(findTestObject('Payment card elements/Card Holder Name'), 0)

Mobile.setText(findTestObject('Payment card elements/Card Holder Name'), 'ahmed', 0)

Mobile.tap(findTestObject('Payment card elements/Card Number'), 0)

Mobile.setText(findTestObject('Payment card elements/Card Number'), '4440000009900010', 0)

Mobile.tap(findTestObject('Payment card elements/MM'), 0)

Mobile.setText(findTestObject('Payment card elements/MM'), '01', 0)

Mobile.tap(findTestObject('Payment card elements/YY'), 0)

Mobile.setText(findTestObject('Payment card elements/YY'), '39', 0)

Mobile.tap(findTestObject('Payment card elements/CVV'), 0)

Mobile.setText(findTestObject('Payment card elements/CVV'), '100', 0)

Mobile.tap(findTestObject('Payment card elements/NextAfterAddingCard'), 0)

Mobile.tap(findTestObject('Booking summary screen/ConfirmAfterSuccssfullyAddingCard'), 0)

Mobile.tap(findTestObject('Booking summary screen/Pay'), 0)


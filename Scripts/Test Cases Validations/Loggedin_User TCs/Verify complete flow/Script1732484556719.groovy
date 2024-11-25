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

WebUI.callTestCase(findTestCase('Utilities/Registration (6)/Login'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Home screen elements/Search'), 10)

Mobile.setText(findTestObject('Home screen elements/Search'), GlobalVariable.ZoneName, 10)

Mobile.tap(findTestObject('Home screen elements/SearchResult'), 10)

Mobile.tap(findTestObject('Booking spot screen/Select'), 10)

WebUI.callTestCase(findTestCase('Utilities/Add Vehicle/Add vehicle for loggedin user'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Booking spot screen/Go to payment'), 10)

Mobile.tap(findTestObject('Booking summary screen/Arrow'), 10)

Mobile.tap(findTestObject('Booking summary screen/Add New Card'), 10)

Mobile.tap(findTestObject('Payment card elements/Card Holder Name'), 10)

Mobile.setText(findTestObject('Payment card elements/Card Holder Name'), 'ahmed', 0)

Mobile.tap(findTestObject('Payment card elements/Card Number'), 10)

Mobile.setText(findTestObject('Payment card elements/Card Number'), '4440000009900010', 0)

Mobile.tap(findTestObject('Payment card elements/MM'), 10)

Mobile.setText(findTestObject('Payment card elements/MM'), '01', 0)

Mobile.tap(findTestObject('Payment card elements/YY'), 10)

Mobile.setText(findTestObject('Payment card elements/YY'), '39', 0)

Mobile.tap(findTestObject('Payment card elements/CVV'), 10)

Mobile.setText(findTestObject('Payment card elements/CVV'), '100', 0)

Mobile.tap(findTestObject('Payment card elements/NextAfterAddingCard'), 10)

Mobile.tap(findTestObject('Booking summary screen/ConfirmAfterSuccssfullyAddingCard'), 10)

Mobile.tap(findTestObject('Booking summary screen/Pay'), 10)


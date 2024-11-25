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

WebUI.callTestCase(findTestCase('Utilities/Permission Screen (4)/Permission screen (Not Now)'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Check In screen elements/Sign up'), 0)

Mobile.tap(findTestObject('Check In screen elements/CountryCode'), 0)

Mobile.setText(findTestObject('Home screen elements/Search'), '888', 0)

try {
	// Check for any identifiable elements on the screen
	boolean isAnyElementVisible = Mobile.verifyElementExist(findTestObject('Home screen elements/AnyVisibleElement'), 2, FailureHandling.OPTIONAL)
	
	if (!isAnyElementVisible) {
		println("The screen is blank, no elements or results are displayed.")
	} else {
		println("Unexpected elements are present on the screen. Verify the app behavior.")
	}
} catch (Exception e) {
	println("Exception occurred while verifying the blank screen: " + e.message)
}


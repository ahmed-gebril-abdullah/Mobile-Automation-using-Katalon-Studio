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

Mobile.tap(findTestObject('Check In screen elements/EgyptCode'), 0)

Mobile.setText(findTestObject('Check In screen elements/MobileNumber'), GlobalVariable.BlockedNumberEgyptian, 0)

Mobile.tap(findTestObject('Check In screen elements/Checkbox'), 0)

Mobile.tap(findTestObject('Check In screen elements/Send Code'), 0)

String actualErrorMessage = Mobile.getText(findTestObject('Check In screen elements/ErrorMessage'), 0)

WebUI.comment('Actual error message displayed: ' + actualErrorMessage)

// Verify if the message contains "try again"
if (actualErrorMessage.contains('try again')) {
    WebUI.comment('Error message verification passed: Contains \'try again\'' // Fail the test
        )
} else {
    WebUI.comment('Error message verification failed: Does not contain \'try again\'')

    Mobile.verifyEqual(true, false, FailureHandling.STOP_ON_FAILURE)
}

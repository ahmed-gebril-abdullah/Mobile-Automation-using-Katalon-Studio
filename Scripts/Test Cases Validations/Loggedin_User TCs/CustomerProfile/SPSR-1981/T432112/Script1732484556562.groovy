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
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.WebDriver
import org.openqa.selenium.remote.DesiredCapabilities


DesiredCapabilities capabilities = new DesiredCapabilities()
capabilities.setCapability("chromedriverExecutable", "C:\\Users\\User\\Downloads\\chromedriver-win64")

WebUI.callTestCase(findTestCase('Utilities/Registration (6)/Login'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Home screen elements/My Profile'), 10)

try {
    Mobile.scrollToText('Log out', FailureHandling.STOP_ON_FAILURE)
} catch (Exception e) {
    
    for (int i = 0; i < 5; i++) {
        Mobile.swipe(500, 1500, 500, 500) 
        if (Mobile.verifyElementExist(findTestObject('My Profile/Logout'), 1, FailureHandling.OPTIONAL)) {
            break
        }
    }
}

Mobile.tap(findTestObject('My Profile/ViolationGuide'), 10)



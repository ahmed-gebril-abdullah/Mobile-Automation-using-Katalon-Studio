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

WebUI.callTestCase(findTestCase('Utilities/Search/SearchBy ZoneName'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Home screen elements/SearchResult'), 0)

Mobile.tap(findTestObject('Booking spot screen/Favorite'), 0)

Mobile.tap(findTestObject('Home screen elements/Search'), 0)

Mobile.tap(findTestObject('Home screen elements/Clear'), 0)

Mobile.tap(findTestObject('Home screen elements/My Profile'), 0)

Mobile.tap(findTestObject('My Profile/MyFavorites'), 0)

String x = Mobile.getText(findTestObject('My Favorites/ZoneCost'), 0)

Mobile.verifyEqual(x, GlobalVariable.ZoneCost, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('My Favorites/Favorite'), 0)


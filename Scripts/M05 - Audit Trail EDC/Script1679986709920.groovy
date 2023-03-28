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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/auth/login')

WebUI.setText(findTestObject('Object Repository/Page_LOGINKasikornbank/input_Submit_j_username'), 'kc000003')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_LOGINKasikornbank/input_Submit_j_password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/Page_LOGINKasikornbank/a_Submit'))

WebUI.click(findTestObject('Object Repository/Page_HomeKasikornbank/span_Administrator'))

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/admin/list')

WebUI.click(findTestObject('Object Repository/Page_All UsersKasikornbank/div_Audit Trail EDC'))

WebUI.setText(findTestObject('Object Repository/Page_User ActivitiesKasikornbank/input_Search_search'), 'kd0000')

WebUI.click(findTestObject('Object Repository/Page_User ActivitiesKasikornbank/a_Search'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-05 Audit Trail EDC\\Search Results - username.png')

WebUI.click(findTestObject('Object Repository/Page_Search ResultsKasikornbank/div_Audit Trail EDC'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_User ActivitiesKasikornbank/select_Select OneView Company EDC listView _5eaa6d'), 
    'View Company EDC list', true)

WebUI.click(findTestObject('Object Repository/Page_User ActivitiesKasikornbank/a_Search_1'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-05 Audit Trail EDC\\Search Results - Action.png')

WebUI.click(findTestObject('Object Repository/Page_User ActivitiesKasikornbank/div_Audit Trail EDC'))

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/admin/auditTrailEDC?action=&from=01+Mar+2023&to=')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-05 Audit Trail EDC\\Search Results - Date.png')

WebUI.click(findTestObject('Object Repository/Page_User ActivitiesKasikornbank/a_Export CSV files'))

WebUI.closeBrowser()


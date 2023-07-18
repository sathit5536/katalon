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

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com')

WebUI.setText(findTestObject('Object Repository/Page_LOGINKasikornbank/input_Submit_j_username'), 'prasopchock@digio.co.th')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_LOGINKasikornbank/input_Submit_j_password'), '2301MRzFZB0NVRpbiBsoLw==')

WebUI.click(findTestObject('Object Repository/Page_LOGINKasikornbank/a_Submit'))

WebUI.click(findTestObject('Object Repository/Page_HomeKasikornbank/span_ManageCompany Users'))

WebUI.click(findTestObject('Object Repository/Page_All Company UsersKasikornbank/div_Add a Company User'))

WebUI.click(findTestObject('Object Repository/Page_Add a Company UserKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal mPOS\\M-06 Add a Company user\\Add company user - No input.png')

WebUI.click(findTestObject('Object Repository/Page_Add a Company UserKasikornbank/div_Add a Company User'))

WebUI.setText(findTestObject('Object Repository/Page_Add a Company UserKasikornbank/input_Name_name'), 'Test Automate')

WebUI.setText(findTestObject('Object Repository/Page_Add a Company UserKasikornbank/input_Contact No_contact'), '0900000000')

'Change Every test'
WebUI.setText(findTestObject('Object Repository/Page_Add a Company UserKasikornbank/input_Email Address_email'), 'Test013@automate.test')

WebUI.click(findTestObject('Object Repository/Page_Add a Company UserKasikornbank/div_Quicklinks                             _cc13b1'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal mPOS\\M-06 Add a Company user\\Add company user - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Add a Company UserKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal mPOS\\M-06 Add a Company user\\Add company user - 2.png')

WebUI.click(findTestObject('Object Repository/Page_Add a Company UserKasikornbank/a_Confirm'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal mPOS\\M-06 Add a Company user\\Add company user - 3.png')


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

WebUI.setText(findTestObject('Object Repository/Page_LOGINKasikornbank/input_Submit_j_username'), 'kd000015')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_LOGINKasikornbank/input_Submit_j_password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/Page_LOGINKasikornbank/a_Submit'))

WebUI.click(findTestObject('Object Repository/Page_HomeKasikornbank/span_ManageCompany Users'))

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/companyUser/list')

WebUI.click(findTestObject('Object Repository/Page_All Company UsersKasikornbank/div_Add a Company User'))

WebUI.setText(findTestObject('Object Repository/Page_Add a Company UserKasikornbank/input_Search_search'), 'sdfsdfsdfsd')

WebUI.click(findTestObject('Object Repository/Page_Add a Company UserKasikornbank/a_Search'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-22 Add a Company User\\Add a Company User - No company fround.png')

WebUI.setText(findTestObject('Object Repository/Page_Add a Company UserKasikornbank/input_Search_search'), 'digio')

WebUI.click(findTestObject('Object Repository/Page_Add a Company UserKasikornbank/a_Search'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-22 Add a Company User\\Add a Company User - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Add a Company UserKasikornbank/span_Add a Company User'))

WebUI.click(findTestObject('Object Repository/Page_Add a Company UserKasikornbank/a_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add a Company UserKasikornbank/span_Please enter valid Name'), 
    'Please enter valid Name')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-22 Add a Company User\\Add a Company User - No Input data.png')

WebUI.setText(findTestObject('Object Repository/Page_Add a Company UserKasikornbank/input_Name_name'), 'Test Automate')

WebUI.setText(findTestObject('Page_Add a Company UserKasikornbank/input_Contact No_contact'), '0900000000')

'Change every test'
WebUI.setText(findTestObject('Object Repository/Page_Add a Company UserKasikornbank/input_Email Address_email'), 'test0002@automate.test')

WebUI.click(findTestObject('Object Repository/Page_Add a Company UserKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-22 Add a Company User\\Add a Company User - 2.png')

WebUI.click(findTestObject('Object Repository/Page_Add a Company UserKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-22 Add a Company User\\Add a Company User - 3.png')

WebUI.click(findTestObject('Object Repository/Page_Add a Company UserKasikornbank/a_Confirm'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-22 Add a Company User\\Add a Company User - 4.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add a Company UserKasikornbank/div_Your request is successful'), 
    'Your request is successful')


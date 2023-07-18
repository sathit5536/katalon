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

WebUI.click(findTestObject('Object Repository/Page_All UsersKasikornbank/div_Add a Bank User'))

'Change every time to run\r\n'
WebUI.setText(findTestObject('Object Repository/Page_Add a Bank UserKasikornbank/input_User ID_userId'), 'TestAutomate06')

WebUI.setText(findTestObject('Object Repository/Page_Add a Bank UserKasikornbank/input_Name_name'), 'Test Automate')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Add a Bank UserKasikornbank/select_AdminOper UserViewerITIDReader Provi_37a044'), 
    'Admin', true)

'Change every time to run\r\n'
WebUI.setText(findTestObject('Object Repository/Page_Add a Bank UserKasikornbank/input_Email Address_email'), 'Test06@automate.test')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-03 Add a Bank User\\Add a bank User - 01.png')

WebUI.click(findTestObject('Object Repository/Page_Add a Bank UserKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-03 Add a Bank User\\Add a bank User - 02.png')

WebUI.click(findTestObject('Object Repository/Page_Add a Bank UserKasikornbank/a_Confirm'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-03 Add a Bank User\\Add a bank User - 03.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add a Bank UserKasikornbank/div_Your request is successful'), 
    'Your request is successful')


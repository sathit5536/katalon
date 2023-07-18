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

WebUI.setEncryptedText(findTestObject('Object Repository/Page_LOGINKasikornbank/input_Submit_j_password'), 'hKbjiCWkPb0TKaRNKyn0Hw==')

WebUI.click(findTestObject('Object Repository/Page_LOGINKasikornbank/a_Submit'))

WebUI.click(findTestObject('Object Repository/Page_HomeKasikornbank/span_Settings'))

'Current password'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Change PasswordKasikornbank/input_Current Password_currPass'), 
    'hKbjiCWkPb0TKaRNKyn0Hw==')

'New password\r\n'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Change PasswordKasikornbank/input_New Password_newPass'), 
    '2301MRzFZB0NVRpbiBsoLw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Change PasswordKasikornbank/input_Retype Password_retypePass'), 
    '2301MRzFZB0NVRpbiBsoLw==')

WebUI.click(findTestObject('Object Repository/Page_Change PasswordKasikornbank/div_Quicklinks                             _3a5991_1'))

WebUI.click(findTestObject('Object Repository/Page_Change PasswordKasikornbank/a_Submit'))

WebUI.click(findTestObject('Object Repository/Page_Change PasswordKasikornbank/a_Yes, keep me signed in_fancybox-item fanc_98dba0'))


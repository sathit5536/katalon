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

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/mobileUser/details?itemid=149462')

WebUI.click(findTestObject('Object Repository/Page_Staff DetailsKasikornbank/a_Edit Staff Details'))

WebUI.click(findTestObject('Object Repository/Page_Edit Staff DetailsKasikornbank/input_No available TID_paymentSelected'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-39  Multi Merchant\\Change to 2 group merchant - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Edit Staff DetailsKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-39  Multi Merchant\\Change to 2 group merchant - 2.png')

WebUI.click(findTestObject('Object Repository/Page_Edit Staff DetailsKasikornbank/a_Confirm'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-39  Multi Merchant\\Change to 2 group merchant - 3.png')

WebUI.click(findTestObject('Object Repository/Page_Edit Staff DetailsKasikornbank/a_View StaffDetails'))

WebUI.click(findTestObject('Object Repository/Page_Staff DetailsKasikornbank/a_Edit Staff Details'))

WebUI.click(findTestObject('Object Repository/Page_Edit Staff DetailsKasikornbank/input_No available TID_paymentSelected_1'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-39  Multi Merchant\\Change to 1 group merchant - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Edit Staff DetailsKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-39  Multi Merchant\\Change to 2 group merchant - 2.png')

WebUI.click(findTestObject('Object Repository/Page_Edit Staff DetailsKasikornbank/a_Confirm'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-39  Multi Merchant\\Change to 2 group merchant - 3.png')

WebUI.click(findTestObject('Object Repository/Page_Edit Staff DetailsKasikornbank/a_Confirm_1'))

WebUI.takeScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-39  Multi Merchant\\Change to 2 group merchant - 4.png')

WebUI.doubleClick(findTestObject('Object Repository/Page_Edit Staff DetailsKasikornbank/div_Your request is successful'))


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

WebUI.click(findTestObject('Object Repository/Page_HomeKasikornbank/span_ManageCredit Settlements'))

WebUI.click(findTestObject('Object Repository/Page_All K SHOP SettlementsKasikornbank/div_K SHOP Schedule Force Settlement'))

WebUI.setText(findTestObject('Object Repository/Page_K SHOP Schedule Force SettlementKasikornbank/input_Company_search'), 
    'dasdasd')

WebUI.click(findTestObject('Object Repository/Page_K SHOP Schedule Force SettlementKasikornbank/a_Search'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-36 Ksop Schedule Force Settlement\\No Company.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_K SHOP Schedule Force SettlementKasikornbank/div_Your search entry(dasdasd)does not exist'), 
    'Your search entry (dasdasd) does not exist.')

WebUI.click(findTestObject('Object Repository/Page_K SHOP Schedule Force SettlementKasikornbank/div_K SHOP Schedule Force Settlement'))

WebUI.setText(findTestObject('Object Repository/Page_K SHOP Schedule Force SettlementKasikornbank/input_Company_search'), 
    'Automate')

WebUI.click(findTestObject('Object Repository/Page_K SHOP Schedule Force SettlementKasikornbank/a_Search'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-36 Ksop Schedule Force Settlement\\Ksop Schedule Force Settlement - 1.png')

WebUI.click(findTestObject('Object Repository/Page_K SHOP Schedule Force SettlementKasikornbank/span_Schedule Settlement'))

'Change Every test '
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_K SHOP Schedule Force SettlementKasikornbank/select_0000                        0100    _7debc9'), 
    '04:00', true)

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-36 Ksop Schedule Force Settlement\\Ksop Schedule Force Settlement - 2.png')

WebUI.click(findTestObject('Object Repository/Page_K SHOP Schedule Force SettlementKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-36 Ksop Schedule Force Settlement\\Ksop Schedule Force Settlement - 3.png')

WebUI.click(findTestObject('Object Repository/Page_K SHOP Schedule Force SettlementKasikornbank/a_Confirm'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-36 Ksop Schedule Force Settlement\\Ksop Schedule Force Settlement - 4.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_K SHOP Schedule Force SettlementKasikornbank/div_Your request is successful'), 
    'Your request is successful')


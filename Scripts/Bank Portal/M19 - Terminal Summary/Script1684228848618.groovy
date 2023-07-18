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

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/mobileUser/list')

WebUI.click(findTestObject('Object Repository/Page_All StaffsKasikornbank/div_Terminal Summary'))

WebUI.setText(findTestObject('Object Repository/Page_All TerminalsKasikornbank/input_Search_search'), 'Test')

WebUI.click(findTestObject('Object Repository/Page_All TerminalsKasikornbank/a_Search'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-19 Terminal Summary\\Search\\Search Result - Company name.png')

WebUI.click(findTestObject('Object Repository/Page_Search ResultsKasikornbank/p_Search for aTerminal'))

WebUI.setText(findTestObject('Object Repository/Page_Search ResultsKasikornbank/input_Search_search'), '74734538')

WebUI.click(findTestObject('Object Repository/Page_Search ResultsKasikornbank/a_Search'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-19 Terminal Summary\\Search\\Search Result - TID.png')

WebUI.click(findTestObject('Object Repository/Page_Search ResultsKasikornbank/div_Terminal Summary'))

WebUI.setText(findTestObject('Object Repository/Page_All TerminalsKasikornbank/input_MID_mid'), '00000000000001')

WebUI.click(findTestObject('Object Repository/Page_All TerminalsKasikornbank/a_Search_1'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-19 Terminal Summary\\Search\\Search Result - MID.png')

WebUI.click(findTestObject('Object Repository/Page_All TerminalsKasikornbank/div_Terminal Summary'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_All TerminalsKasikornbank/select_Select OneMatchedUnmatched'), 
    'Matched', true)

WebUI.click(findTestObject('Object Repository/Page_All TerminalsKasikornbank/a_Search_1'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-19 Terminal Summary\\Search\\Search Result - Status.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/terminal/list?mid=&status=&from=01+May+2023&to=01+Jun+2023')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-19 Terminal Summary\\Search\\Search Result - Create date.png')


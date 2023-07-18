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

WebUI.click(findTestObject('Object Repository/Page_HomeKasikornbank/span_Readers'))

WebUI.setText(findTestObject('Object Repository/Page_All ReadersKasikornbank/input_Search_search'), '916')

WebUI.click(findTestObject('Object Repository/Page_All ReadersKasikornbank/a_Search'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal mPOS\\M-07 Reader Summary\\Search\\Search Result - SN Reader.png')

WebUI.click(findTestObject('Object Repository/Page_Search ResultsKasikornbank/div_Reader Summary'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_All ReadersKasikornbank/select_Select OneActiveSuspended'), 
    'Suspended', true)

WebUI.click(findTestObject('Object Repository/Page_All ReadersKasikornbank/a_Search_1'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal mPOS\\M-07 Reader Summary\\Search\\Search Result - Status.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com/reader/list?status=&from=01+Jan+2020&to=')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal mPOS\\M-07 Reader Summary\\Search\\Search Result - Create Date.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com/reader/details?itemid=113245')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal mPOS\\M-07 Reader Summary\\Reader Details.png')

WebUI.click(findTestObject('Object Repository/Page_Reader DetailsKasikornbank/a_Suspend Reader'))

WebUI.setText(findTestObject('Object Repository/Page_Suspend ReaderKasikornbank/textarea_Suspend Reason 1_description'), 
    'Test Suspend Reader by Automate')

WebUI.click(findTestObject('Object Repository/Page_Suspend ReaderKasikornbank/div_Quicklinks                             _69502f'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal mPOS\\M-07 Reader Summary\\Suspend\\Suspend - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Suspend ReaderKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal mPOS\\M-07 Reader Summary\\Suspend\\Suspend - 2.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com/reader/details?itemid=113245')

WebUI.click(findTestObject('Object Repository/Page_Reader DetailsKasikornbank/a_Reinstate Reader'))

WebUI.setText(findTestObject('Object Repository/Page_Reinstate ReaderKasikornbank/textarea_Reinstate Reason 1_description'), 
    'Test Reinstate Reader by Automate')

WebUI.click(findTestObject('Object Repository/Page_Reinstate ReaderKasikornbank/div_Quicklinks                             _69502f'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal mPOS\\M-07 Reader Summary\\Reinstate\\Reinstate - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Reinstate ReaderKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal mPOS\\M-07 Reader Summary\\Reinstate\\Reinstate - 2.png')


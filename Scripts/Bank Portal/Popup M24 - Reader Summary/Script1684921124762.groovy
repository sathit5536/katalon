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

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/reader/details?itemid=123377')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-24 Reader Summary\\Reader Details.png')

// Search
WebUI.click(findTestObject('Object Repository/Page_HomeKasikornbank/span_ManageReaders'))

WebUI.setText(findTestObject('Object Repository/Page_All ReadersKasikornbank/input_Search_search'), '11111')

WebUI.click(findTestObject('Object Repository/Page_All ReadersKasikornbank/a_Search'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-24 Reader Summary\\Search\\Search Result - Reader SN.png')

WebUI.click(findTestObject('Object Repository/Page_Search ResultsKasikornbank/div_Reader Summary'))

WebUI.setText(findTestObject('Object Repository/Page_All ReadersKasikornbank/input_MID_mid'), '111111')

WebUI.click(findTestObject('Object Repository/Page_All ReadersKasikornbank/a_Search_1'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-24 Reader Summary\\Search\\Search Result - MID.png')

WebUI.click(findTestObject('Object Repository/Page_All ReadersKasikornbank/div_Reader Summary'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_All ReadersKasikornbank/select_Select OneActiveSuspendedTerminated'), 
    'Suspended', true)

WebUI.click(findTestObject('Object Repository/Page_All ReadersKasikornbank/a_Search_1'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-24 Reader Summary\\Search\\Search Result - Status.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/reader/list?mid=&status=&from=01+Jan+2023&to=02+Jun+2023')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-24 Reader Summary\\Search\\Search Result - Create Date.png')

// Suspend
WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/reader/details?itemid=123377')

WebUI.click(findTestObject('Object Repository/Page_Reader DetailsKasikornbank/a_Suspend Reader'))

WebUI.setText(findTestObject('Object Repository/Page_Suspend ReaderKasikornbank/textarea_Suspend Reason 1_description'), 
    'Test Suspend by Automate')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-24 Reader Summary\\Suspend\\Suspend - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Suspend ReaderKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-24 Reader Summary\\Suspend\\Suspend - 2.png')

WebUI.doubleClick(findTestObject('Object Repository/Page_Suspend Company User AccessKasikornbank/div_Your request is successful'))

// Reinstate
WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/reader/details?itemid=123377')

WebUI.click(findTestObject('Object Repository/Page_Reader DetailsKasikornbank/a_Reinstate Reader'))

WebUI.setText(findTestObject('Object Repository/Page_Reinstate ReaderKasikornbank/textarea_Reinstate Reason 1_description'), 
    'Test Reinstate By Automate')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-24 Reader Summary\\Reinstate\\Reinstate - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Reinstate ReaderKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-24 Reader Summary\\Reinstate\\Reinstate - 2.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Suspend Company User AccessKasikornbank/div_Your request is successful'), 
    'Your request is successful')

/*

// Reinject
WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/reader/details?itemid=123377')

WebUI.click(findTestObject('Object Repository/Page_Reader DetailsKasikornbank/a_Reinjection HSM key'))

WebUI.takeScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-24 Reader Summary\\Reinject\\Reinject - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Reader DetailsKasikornbank/a_Continue'))

WebUI.takeScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-24 Reader Summary\\Reinject\\Reinject - 2.png')

WebUI.click(findTestObject('Object Repository/Page_Reader DetailsKasikornbank/a_Ok'))

WebUI.takeAreaScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-24 Reader Summary\\Reinject\\Reinject - 3.png')

//Delink 
WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/reader/details?itemid=123377')

WebUI.click(findTestObject('Object Repository/Page_Reader DetailsKasikornbank/a_Delink Reader'))

WebUI.takeAreaScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-24 Reader Summary\\Delink\\Delink - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Reader DetailsKasikornbank/a_Continue (1)'))

WebUI.takeAreaScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-24 Reader Summary\\Delink\\Delink - 2.png')

*/
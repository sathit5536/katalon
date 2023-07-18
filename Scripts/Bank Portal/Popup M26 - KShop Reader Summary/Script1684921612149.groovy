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

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocReader/details?itemid=10028')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-26 Kshop Reader Summary\\Reader Details.png')

// Search
WebUI.click(findTestObject('Object Repository/Page_HomeKasikornbank/span_ManageReaders'))

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/reader/list')

WebUI.click(findTestObject('Object Repository/Page_Search ResultsKasikornbank/div_K SHOP Reader Summary'))

WebUI.setText(findTestObject('Object Repository/Page_All ReadersKasikornbank/input_Search_search'), '1234')

WebUI.click(findTestObject('Object Repository/Page_All ReadersKasikornbank/a_Search'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-26 Kshop Reader Summary\\Search\\Search result - Reader SN.png')

WebUI.click(findTestObject('Object Repository/Page_Search ResultsKasikornbank/div_K SHOP Reader Summary'))

WebUI.setText(findTestObject('Object Repository/Page_All ReadersKasikornbank/input_MID_mid'), '40100')

WebUI.click(findTestObject('Object Repository/Page_All ReadersKasikornbank/a_Search_1'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-26 Kshop Reader Summary\\Search\\Search result - MID.png')

WebUI.click(findTestObject('Object Repository/Page_All ReadersKasikornbank/div_K SHOP Reader Summary'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_All ReadersKasikornbank/select_Select OneActiveSuspendedTerminated'), 
    'Suspended', true)

WebUI.click(findTestObject('Object Repository/Page_All ReadersKasikornbank/a_Search_1'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-26 Kshop Reader Summary\\Search\\Search result - Status.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocReader/list?mid=&status=&from=01+Jan+2023&to=')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-26 Kshop Reader Summary\\Search\\Search result - Create date.png')

// Suspend
WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocReader/details?itemid=10028')

WebUI.click(findTestObject('Object Repository/Page_Reader DetailsKasikornbank/a_Suspend Reader'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-26 Kshop Reader Summary\\Suspend\\Suspend - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Suspend ReaderKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-26 Kshop Reader Summary\\Suspend\\Suspend - 2.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Suspend ReaderKasikornbank/div_SUCCESS'), 'SUCCESS.')

// Reinstate
WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocReader/details?itemid=10028')

WebUI.click(findTestObject('Object Repository/Page_Reader DetailsKasikornbank/a_Reinstate Reader'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-26 Kshop Reader Summary\\Reinstate\\Reinstate - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Reinstate ReaderKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-26 Kshop Reader Summary\\Reinstate\\Reinstate - 2.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Reinstate ReaderKasikornbank/div_SUCCESS'), 'SUCCESS.')

/*

// Delink
WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocReader/details?itemid=10028')

WebUI.click(findTestObject('Object Repository/Page_Reader DetailsKasikornbank/a_Delink Reader'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-26 Kshop Reader Summary\\Delink\\Delink - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Reader DetailsKasikornbank/a_Continue (3)'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-26 Kshop Reader Summary\\Delink\\Delink - 2.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Reader DetailsKasikornbank/p_Response Description  SUCCESS'), 
    'SUCCESS')

WebUI.click(findTestObject('Object Repository/Page_Reader DetailsKasikornbank/a_Ok (1)'))

*/
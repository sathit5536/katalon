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

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocMobileUser/details?itemid=10331')
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-18 Kshop staff Summary\\Staff Details.png')

// Search *********************************************************************************************************************************************

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/mobileUser/list')

WebUI.click(findTestObject('Object Repository/Page_All StaffsKasikornbank/div_K SHOP Staff Summary'))

WebUI.setText(findTestObject('Object Repository/Page_All K SHOP StaffsKasikornbank/input_Search_search'), 'Automate')

WebUI.click(findTestObject('Object Repository/Page_All K SHOP StaffsKasikornbank/a_Search'))
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-18 Kshop staff Summary\\Search\\Search Result - Name.png')

WebUI.click(findTestObject('Object Repository/Page_Search ResultsKasikornbank/div_K SHOP Staff Summary'))

WebUI.setText(findTestObject('Object Repository/Page_All K SHOP StaffsKasikornbank/input_MID_mid'), '40100')

WebUI.click(findTestObject('Object Repository/Page_All K SHOP StaffsKasikornbank/a_Search_1'))
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-18 Kshop staff Summary\\Search\\Search Result - MID.png')

WebUI.click(findTestObject('Object Repository/Page_All K SHOP StaffsKasikornbank/div_K SHOP Staff Summary'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_All K SHOP StaffsKasikornbank/select_Select OneActiveSuspendedTerminated'), 
    'Suspended', true)

WebUI.click(findTestObject('Object Repository/Page_All K SHOP StaffsKasikornbank/a_Search_1'))
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-18 Kshop staff Summary\\Search\\Search Result - Status.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocMobileUser/list?mid=&status=&from=01+May+2023&to=')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-18 Kshop staff Summary\\Search\\Search Result - Create Date.png')

// Suspend *********************************************************************************************************************************************

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocMobileUser/details?itemid=10331')

WebUI.click(findTestObject('Object Repository/Page_K SHOP Staff DetailsKasikornbank/a_Suspend Staff Access'))

WebUI.setText(findTestObject('Object Repository/Page_Suspend Staff AccessKasikornbank/textarea_Suspend Reason 1_description'), 
    'Test Suspend staff by automate')
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-18 Kshop staff Summary\\Suspend\\Suspend - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Suspend Staff AccessKasikornbank/a_Submit'))
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-18 Kshop staff Summary\\Suspend\\Suspend - 2.png')

WebUI.doubleClick(findTestObject('Object Repository/Page_Suspend Staff AccessKasikornbank/div_Your request is successful'))

// Reinstate *********************************************************************************************************************************************

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocMobileUser/details?itemid=10331')
WebUI.click(findTestObject('Object Repository/Page_K SHOP Staff DetailsKasikornbank/a_Reinstate Staff Access'))

WebUI.setText(findTestObject('Object Repository/Page_Reinstate Staff AccessKasikornbank/textarea_Reinstate Reason 1_description'), 
    'Test Reinstate staff by Automate')
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-18 Kshop staff Summary\\Reinstate\\Reinstate - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Reinstate Staff AccessKasikornbank/a_Submit'))
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-18 Kshop staff Summary\\Reinstate\\Reinstate - 2.png')

WebUI.doubleClick(findTestObject('Object Repository/Page_Reinstate Staff AccessKasikornbank/div_Your request is successful'))


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

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com/spoc')

WebUI.setText(findTestObject('Object Repository/Page_LOGINKasikornbank/input_Submit_j_username'), 'test@test.test')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_LOGINKasikornbank/input_Submit_j_password'), '2301MRzFZB0NVRpbiBsoLw==')

WebUI.click(findTestObject('Object Repository/Page_LOGINKasikornbank/a_Submit'))

// Search *********************************************************************************************************************************

WebUI.click(findTestObject('Object Repository/Page_HomeKasikornbank/span_ManageStaffs'))

WebUI.setText(findTestObject('Object Repository/Page_All StaffsKasikornbank/input_Search_search'), 'KB00')

WebUI.click(findTestObject('Object Repository/Page_All StaffsKasikornbank/a_Search'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal KShop\\M-03 Staff Summary\\Search\\Search Result - Name.png')

WebUI.click(findTestObject('Object Repository/Page_Search ResultsKasikornbank/div_Staff Summary'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_All StaffsKasikornbank/select_Select OneActiveSuspended'), 
    'Active', true)

WebUI.click(findTestObject('Object Repository/Page_All StaffsKasikornbank/a_Search_1'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal KShop\\M-03 Staff Summary\\Search\\Search Result - Staus.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com/spoc/mobileUser/list?status=&from=01+Jun+2020&to=')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal KShop\\M-03 Staff Summary\\Search\\Search Result - Create Date.png')

// Suspend *********************************************************************************************************************************

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com/spoc/mobileUser/details?itemid=70')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal KShop\\M-03 Staff Summary\\Staff Details.png')

WebUI.click(findTestObject('Object Repository/Page_Staff DetailsKasikornbank/a_Suspend Staff Access'))

WebUI.setText(findTestObject('Object Repository/Page_Suspend Staff AccessKasikornbank/textarea_Suspend Reason 1_description'), 
    'Test Suspend by automate')

WebUI.click(findTestObject('Object Repository/Page_Reinstate Staff AccessKasikornbank/div_Quicklinks                             _fac4e3'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal KShop\\M-03 Staff Summary\\Suspend\\Suspend - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Suspend Staff AccessKasikornbank/a_Submit'))
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal KShop\\M-03 Staff Summary\\Suspend\\Suspend - 2.png')

// Reinstate *********************************************************************************************************************************

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com/spoc/mobileUser/details?itemid=70')

WebUI.click(findTestObject('Object Repository/Page_Staff DetailsKasikornbank/a_Reinstate Staff Access'))

WebUI.setText(findTestObject('Object Repository/Page_Reinstate Staff AccessKasikornbank/textarea_Reinstate Reason 1_description'), 
    'Test Reinstate by Automate')

WebUI.click(findTestObject('Object Repository/Page_Reinstate Staff AccessKasikornbank/div_Quicklinks                             _fac4e3'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal KShop\\M-03 Staff Summary\\Reinstate\\Reinstate - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Reinstate Staff AccessKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal KShop\\M-03 Staff Summary\\Reinstate\\Reinstate - 2.png')


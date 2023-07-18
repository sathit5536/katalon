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

// Search ******************************************************************************************************


WebUI.click(findTestObject('Object Repository/Page_HomeKasikornbank/span_ManageCompany Users'))

WebUI.setText(findTestObject('Object Repository/Page_All Company UsersKasikornbank/input_Search_search'), 'Automate')

WebUI.click(findTestObject('Object Repository/Page_All Company UsersKasikornbank/a_Search'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal mPOS\\M-05 Company user Summary\\Search\\Search Result - Name.png')

WebUI.click(findTestObject('Object Repository/Page_Search ResultsKasikornbank/div_Company User Summary'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_All Company UsersKasikornbank/select_Select OneActiveSuspended'), 
    'Suspended', true)

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal mPOS\\M-05 Company user Summary\\Search\\Search Result - Status.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com/companyUser/list?status=&from=01+Apr+2023&to=')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal mPOS\\M-05 Company user Summary\\Search\\Search Result - Create Date.png')


// Edit ******************************************************************************************************

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com/companyUser/details?itemid=90841')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal mPOS\\M-05 Company user Summary\\Company User Details.png')

WebUI.click(findTestObject('Object Repository/Page_Company User DetailsKasikornbank/a_Edit Company User Details'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal mPOS\\M-05 Company user Summary\\Edit\\Edit - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Edit Company User DetailsKasikornbank/a_Submit'))
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal mPOS\\M-05 Company user Summary\\Edit\\Edit - 2.png')

WebUI.click(findTestObject('Object Repository/Page_Edit Company User DetailsKasikornbank/a_Confirm'))
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal mPOS\\M-05 Company user Summary\\Edit\\Edit - 3.png')

// Suspend ******************************************************************************************************

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com/companyUser/details?itemid=90841')

WebUI.click(findTestObject('Object Repository/Page_Company User DetailsKasikornbank/a_Suspend Company User Access'))

WebUI.setText(findTestObject('Object Repository/Page_Suspend Company User AccessKasikornbank/textarea_Suspend Authorizer Reason 1_description'), 
    'Test Suspend by Automate')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal mPOS\\M-05 Company user Summary\\Suspend\\Suspend - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Suspend Company User AccessKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal mPOS\\M-05 Company user Summary\\Suspend\\Suspend - 2.png')


// Reinstate ******************************************************************************************************

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com/companyUser/unsuspend?itemid=90841')

WebUI.setText(findTestObject('Object Repository/Page_Reinstate Company User AccessKasikornbank/textarea_Reinstate Authorizer Reason 1_description'), 
    'Test reinstate by Automate')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal mPOS\\M-05 Company user Summary\\Reinstate\\Reinstate - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Reinstate Company User AccessKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal mPOS\\M-05 Company user Summary\\Reinstate\\Reinstate - 2.png')


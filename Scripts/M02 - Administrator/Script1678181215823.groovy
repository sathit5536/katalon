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

WebUI.setText(findTestObject('Object Repository/Page_LOGINKasikornbank/input_Submit_j_username'), 'kc000003')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_LOGINKasikornbank/input_Submit_j_password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/Page_LOGINKasikornbank/a_Submit'))

// View Details *********************************************************************************************************************************************

WebUI.click(findTestObject('Object Repository/Page_HomeKasikornbank/span_Administrator'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_All UsersKasikornbank/select_Select OneView DetailsSuspend Bank U_653ecd'), 
    'details', true)

WebUI.click(findTestObject('Object Repository/Page_All UsersKasikornbank/a_Go'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-02 Administrator\\User Details.png')

//Search *********************************************************************************************************************************************

WebUI.click(findTestObject('Object Repository/Page_HomeKasikornbank/span_Administrator'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-02 Administrator\\All user.png')

WebUI.setText(findTestObject('Object Repository/Page_All UsersKasikornbank/input_Search_search'), 'KD000040')

WebUI.click(findTestObject('Object Repository/Page_All UsersKasikornbank/a_Search'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-02 Administrator\\Search\\Search Results - No Data.png')

WebUI.click(findTestObject('Object Repository/Page_Search ResultsKasikornbank/form_Search if (document.getElementById(sea_ddc9b0'))

WebUI.setText(findTestObject('Object Repository/Page_Search ResultsKasikornbank/input_Search_search'), 'KD0000')

WebUI.click(findTestObject('Object Repository/Page_Search ResultsKasikornbank/a_Search'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-02 Administrator\\Search\\Search Results - Name.png')

WebUI.click(findTestObject('Object Repository/Page_Search ResultsKasikornbank/form_Search if (document.getElementById(sea_ddc9b0'))

WebUI.click(findTestObject('Object Repository/Page_Search ResultsKasikornbank/a_Export CSV files'))

WebUI.click(findTestObject('Object Repository/Page_Search ResultsKasikornbank/div_Manage Bank Users'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_All UsersKasikornbank/select_Select OneAdminOper UserViewerITIDRe_f2f129'), 
    'Admin', true)

WebUI.click(findTestObject('Object Repository/Page_All UsersKasikornbank/a_Search_1'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-02 Administrator\\Search\\Search Results - Role.png')

WebUI.click(findTestObject('Object Repository/Page_All UsersKasikornbank/div_Manage Bank Users'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_All UsersKasikornbank/select_Select OneActiveSuspended'), 
    'Suspended', true)

WebUI.click(findTestObject('Object Repository/Page_All UsersKasikornbank/a_Search_1'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-02 Administrator\\Search\\Search Results - Status.png')

WebUI.click(findTestObject('Object Repository/Page_All UsersKasikornbank/div_Manage Bank Users'))

WebUI.click(findTestObject('Object Repository/Page_All UsersKasikornbank/img_to_ui-datepicker-trigger'))

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/admin/list?role=&status=&from=01+Mar+2022&to=')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-02 Administrator\\Search\\Search Results - Create date.png')

//Edit Bank User  *********************************************************************************************************************************************

WebUI.click(findTestObject('Object Repository/Page_HomeKasikornbank/span_Administrator'))

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/admin/list')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_All UsersKasikornbank/select_Select OneView DetailsSuspend Bank U_653ecd'), 
    'details', true)

WebUI.click(findTestObject('Object Repository/Page_All UsersKasikornbank/a_Go'))

WebUI.click(findTestObject('Object Repository/Page_Bank User DetailsKasikornbank/a_Edit Bank User Details'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-02 Administrator\\Edit\\Edit - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Edit Bank User DetailsKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-02 Administrator\\Edit\\Edit - 2.png')

WebUI.click(findTestObject('Object Repository/Page_Edit Bank User DetailsKasikornbank/a_Confirm'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-02 Administrator\\Edit\\Edit - 3.png')

WebUI.verifyElementText(findTestObject('Page_Edit Bank User DetailsKasikornbank/div_Your request is successful'), 'Your request is successful')

//Suspend *********************************************************************************************************************************************

WebUI.click(findTestObject('Object Repository/Page_HomeKasikornbank/span_Administrator'))

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/admin/list')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_All UsersKasikornbank/select_Select OneView DetailsSuspend Bank U_653ecd'),
	'suspend', true)

WebUI.click(findTestObject('Object Repository/Page_All UsersKasikornbank/a_Go'))

WebUI.setText(findTestObject('Object Repository/Page_Suspend Bank User AccessKasikornbank/textarea_Suspend Reason 1_description'),
	'test autonate suspend')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-02 Administrator\\Suspend\\Suspend - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Suspend Bank User AccessKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-02 Administrator\\Suspend\\Suspend - 2.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Suspend Bank User AccessKasikornbank/div_Your request is successful'),
	'Your request is successful')

//Reinstate *********************************************************************************************************************************************

WebUI.click(findTestObject('Object Repository/Page_Suspend Bank User AccessKasikornbank/span_Administrator'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_All UsersKasikornbank/select_Select OneView DetailsReinstate Bank_f54a73'),
	'unsuspend', true)

WebUI.click(findTestObject('Object Repository/Page_All UsersKasikornbank/a_Go'))

WebUI.setText(findTestObject('Object Repository/Page_Reinstate Bank User AccessKasikornbank/textarea_Reinstate Reason 1_description'),
	'Test automate reinstate')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-02 Administrator\\Reinstate\\Reinstate - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Reinstate Bank User AccessKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-02 Administrator\\Reinstate\\Reinstate - 2.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Reinstate Bank User AccessKasikornbank/div_Your request is successful'),
	'Your request is successful')



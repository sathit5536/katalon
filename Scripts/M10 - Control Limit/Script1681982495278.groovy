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

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/controlLimit/viewDetailsEDC?itemid=53433')
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-10 Control Limit\\Company Details')

// Search *********************************************************************************************************************************************

WebUI.click(findTestObject('Object Repository/Page_HomeKasikornbank/span_ControlLimit'))

WebUI.setText(findTestObject('Object Repository/Page_All Company (EDC)Kasikornbank/input_Search_search'), 'Test')

WebUI.click(findTestObject('Object Repository/Page_All Company (EDC)Kasikornbank/a_Search'))
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-10 Control Limit\\Search\\Search Result - Company Name.png')

WebUI.click(findTestObject('Object Repository/Page_Search ResultsKasikornbank/div_Company Summary(Control Limit)'))

WebUI.click(findTestObject('Object Repository/Page_All Company (EDC)Kasikornbank/input_Search_search'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_All Company (EDC)Kasikornbank/select_Select OneACTIVESUSPENDED'), 
    'SUSPENDED', true)

WebUI.click(findTestObject('Object Repository/Page_All Company (EDC)Kasikornbank/a_Search_1'))
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-10 Control Limit\\Search\\Search Result - Status.png')

WebUI.click(findTestObject('Object Repository/Page_All Company (EDC)Kasikornbank/div_Company Summary(Control Limit)'))

WebUI.click(findTestObject('Object Repository/Page_All Company (EDC)Kasikornbank/input_to_from'))

WebUI.click(findTestObject('Object Repository/Page_All Company (EDC)Kasikornbank/a_1'))

WebUI.click(findTestObject('Object Repository/Page_All Company (EDC)Kasikornbank/input_to_to'))

WebUI.click(findTestObject('Object Repository/Page_All Company (EDC)Kasikornbank/a_21'))

WebUI.click(findTestObject('Object Repository/Page_All Company (EDC)Kasikornbank/a_Search_1'))
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-10 Control Limit\\Search\\Search Result - Create Date.png')


WebUI.click(findTestObject('Object Repository/Page_All Company (EDC)Kasikornbank/a_Export CSV files'))

// Edit *********************************************************************************************************************************************

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/controlLimit/viewDetailsEDC?itemid=53433')

WebUI.click(findTestObject('Object Repository/Page_Company DetailsKasikornbank/a_Edit Company Details'))

WebUI.setText(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/textarea_Remarks_remark'), 'Test Edit by Automate')

WebUI.click(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/a_Submit'))
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-10 Control Limit\\Edit\\Edit Company - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/a_Confirm'))
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-10 Control Limit\\Edit\\Edit Company - 2.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/div_Your request is successful'),
	'Your request is successful')


// Suspend *********************************************************************************************************************************************

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/controlLimit/suspendEDC?itemid=53433')

WebUI.setText(findTestObject('Object Repository/Page_Suspend Company AccessKasikornbank/textarea_concat(Merchant, , s bank account _966b7c'),
	'Test Suspend By Automate')
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-10 Control Limit\\Suspend\\Suspend - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Suspend Company AccessKasikornbank/a_Submit'))
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-10 Control Limit\\Suspend\\Suspend - 2.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Suspend Company AccessKasikornbank/div_Your request is successful'),
	'Your request is successful')


// Reinstate *********************************************************************************************************************************************

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/controlLimit/activateEDC?itemid=53433')

WebUI.setText(findTestObject('Object Repository/Page_Reinstate Company AccessKasikornbank/textarea_concat(Merchant, , s bank account _5b8a53'),
	'Test reinstate by automate')
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-10 Control Limit\\Reinstate\\Reinstate - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Reinstate Company AccessKasikornbank/a_Submit'))
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-10 Control Limit\\Reinstate\\Reinstate - 2.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Reinstate Company AccessKasikornbank/div_Your request is successful'),
	'Your request is successful')




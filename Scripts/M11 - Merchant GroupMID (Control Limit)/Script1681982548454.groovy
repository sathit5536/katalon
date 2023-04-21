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


// Add MID *********************************************************************************************************************************************

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/controlLimit/viewDetailsEDC?itemid=53433')

WebUI.click(findTestObject('Object Repository/Page_Company DetailsKasikornbank/a_Add MID'))

WebUI.click(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/a_Submit'))
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-11 Merchant GroupMID (Control Limit)\\Add MID\\Add MID - No input data.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/span_Please add Merchant ID'),
	'Please add Merchant ID')

WebUI.setText(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/input_Merchant ID (MID)_mid'), '998877688877788')

WebUI.setText(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/input_Merchant Name_midName'), 'Test add MID')

WebUI.setText(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/input_Limit Per TransactionTHB_maxAmountEDC_a062ad'),
	'10000')

WebUI.click(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/input_Limit Per TransactionTHB_maxAmountEDC_a062ad'))

WebUI.setText(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/input_Limit per MonthTHB_maxAmountEDCPerMonth'),
	'100000')

WebUI.click(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/a_Add Merchant ID'))
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-11 Merchant GroupMID (Control Limit)\\Add MID\\Add MID - Duplicate MID.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/span_Duplicate MID'), 'Duplicate MID')

'Change data every run\r\n'
WebUI.setText(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/input_Merchant ID (MID)_mid'), '998877688877701')

WebUI.click(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/a_Add Merchant ID'))

WebUI.click(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/a_Add Merchant ID'))
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-11 Merchant GroupMID (Control Limit)\\Add MID\\Add MID - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/a_Submit'))
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-11 Merchant GroupMID (Control Limit)\\Add MID\\Add MID - 2.png')

WebUI.click(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/a_Confirm'))
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-11 Merchant GroupMID (Control Limit)\\Add MID\\Add MID - 3.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/div_Your request is successful'),
	'Your request is successful')



// Edit Profile *********************************************************************************************************************************************

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/controlLimit/viewDetailsEDC?itemid=53433')

WebUI.click(findTestObject('Object Repository/Page_Company DetailsKasikornbank/a_View Details'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage GroupKasikornbank/select_Select OneEdit profileSuspend MID'),
	'/controlLimit/editMidEDC', true)

WebUI.click(findTestObject('Object Repository/Page_Manage GroupKasikornbank/a_Go'))

WebUI.setText(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/textarea_Remarks_remark'), 'Test Edit by automate')
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-11 Merchant GroupMID (Control Limit)\\Edit\\Edit - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/a_Submit'))
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-11 Merchant GroupMID (Control Limit)\\Edit\\Edit - 2.png')

WebUI.click(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/a_Confirm'))
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-11 Merchant GroupMID (Control Limit)\\Edit\\Edit - 3.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/div_Your request is successful'),
	'Your request is successful')

// Suspend MID *********************************************************************************************************************************************

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/controlLimit/viewManageGroupEDC?itemid=53433')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage GroupKasikornbank/select_Select OneEdit profileSuspend MID'),
	'suspendMid', true)

WebUI.click(findTestObject('Object Repository/Page_Manage GroupKasikornbank/a_Go'))

WebUI.setText(findTestObject('Object Repository/Page_Suspend MIDKasikornbank/textarea_Suspend MID Reason 1_remarks'), 'Test Suspend MID By Automate')
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-11 Merchant GroupMID (Control Limit)\\Suspend\\Suspend - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Suspend MIDKasikornbank/a_Submit'))
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-11 Merchant GroupMID (Control Limit)\\Suspend\\Suspend - 2.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Suspend MIDKasikornbank/div_Your request is successful'),
	'Your request is successful')

// Reinstate MID *********************************************************************************************************************************************

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/controlLimit/viewManageGroupEDC?itemid=53433')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage GroupKasikornbank/select_Select OneEdit profileReinstate MID'),
	'activateMid', true)

WebUI.click(findTestObject('Object Repository/Page_Manage GroupKasikornbank/a_Go'))

WebUI.setText(findTestObject('Object Repository/Page_Activate MIDKasikornbank/textarea_Activate MID Reason 1_remarks'),
	'Test Reinstate MID By Automate')
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-11 Merchant GroupMID (Control Limit)\\Reinstate\\Reinstate - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Activate MIDKasikornbank/a_Submit'))
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-11 Merchant GroupMID (Control Limit)\\Reinstate\\Reinstate - 2.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Reinstate MIDKasikornbank/div_Your request is successful'),
	'Your request is successful')

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

WebUI.click(findTestObject('Object Repository/Page_HomeKasikornbank/span_ControlLimit'))

WebUI.click(findTestObject('Object Repository/Page_All Company (EDC)Kasikornbank/div_Add a Company Control Limit'))

WebUI.click(findTestObject('Object Repository/Page_Add A Company (EDC)Kasikornbank/a_Submit'))
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-12 Add a company Control Limit\\Add A Company (EDC) - No Input.png')

WebUI.refresh()

'Change Every test'
WebUI.setText(findTestObject('Object Repository/Page_Add A Company (EDC)Kasikornbank/input_Company Name_businessName'), 
    'Test Automate 1')

WebUI.setText(findTestObject('Object Repository/Page_Add A Company (EDC)Kasikornbank/input_Company Short Name_businessShortName'), 
    'Automate')

WebUI.setText(findTestObject('Object Repository/Page_Add A Company (EDC)Kasikornbank/input_Type of Business_businessType'), 
    '4353')

WebUI.setText(findTestObject('Object Repository/Page_Add A Company (EDC)Kasikornbank/input_Business Registration Number (BRN)_bu_f5ee2c'), 
    '1231231434566')

WebUI.setText(findTestObject('Object Repository/Page_Add A Company (EDC)Kasikornbank/input_Business Registration Address_address1'), 
    'Test123')

WebUI.setText(findTestObject('Object Repository/Page_Add A Company (EDC)Kasikornbank/input_RegionCity_city'), 'test')

WebUI.setText(findTestObject('Object Repository/Page_Add A Company (EDC)Kasikornbank/input_Postcode_postcode'), '12345')

WebUI.setText(findTestObject('Object Repository/Page_Add A Company (EDC)Kasikornbank/input_Business Contact No_businessContact'), 
    '0000000000')

'Change Every test'
WebUI.setText(findTestObject('Object Repository/Page_Add A Company (EDC)Kasikornbank/input_Merchant ID (MID)_mid'), '998877688877788')

WebUI.setText(findTestObject('Object Repository/Page_Add A Company (EDC)Kasikornbank/input_Merchant Name_midName'), 'test automate')

WebUI.setText(findTestObject('Object Repository/Page_Add A Company (EDC)Kasikornbank/input_Limit Per TransactionTHB_maxAmountEDC_a062ad'), 
    '30000')

WebUI.setText(findTestObject('Object Repository/Page_Add A Company (EDC)Kasikornbank/input_Limit per MonthTHB_maxAmountEDCPerMonth'), 
    '400000')

WebUI.click(findTestObject('Object Repository/Page_Add A Company (EDC)Kasikornbank/a_Add Merchant ID'))
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-12 Add a company Control Limit\\Add A Company (EDC) - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Add A Company (EDC)Kasikornbank/a_Submit'))
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-12 Add a company Control Limit\\Add A Company (EDC) - 2.png')

WebUI.click(findTestObject('Object Repository/Page_Add A Company (EDC)Kasikornbank/a_Confirm'))
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-12 Add a company Control Limit\\Add A Company (EDC) - 3.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NAKasikornbank/div_The following company has been successf_80d380'), 
    'The following company has been successfully added to the system.')


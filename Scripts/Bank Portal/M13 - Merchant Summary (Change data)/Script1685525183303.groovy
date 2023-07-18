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

// Search *********************************************************************************************************************************************
WebUI.click(findTestObject('Object Repository/Page_HomeKasikornbank/span_ControlLimit'))

WebUI.click(findTestObject('Object Repository/Page_All Company (EDC)Kasikornbank/div_Merchant Summary'))

WebUI.setText(findTestObject('Object Repository/Page_Merchant List (EDC)Kasikornbank/input_Search_search'), 'Test')

WebUI.click(findTestObject('Object Repository/Page_Merchant List (EDC)Kasikornbank/a_Search'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-13 Merchant Summary\\Search\\Search Result - Name.png')

WebUI.click(findTestObject('Object Repository/Page_Search ResultsKasikornbank/div_Merchant Summary'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Merchant List (EDC)Kasikornbank/select_Select OneACTIVESUSPENDED'), 
    'SUSPENDED', true)

WebUI.click(findTestObject('Object Repository/Page_Merchant List (EDC)Kasikornbank/a_Search_1'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-13 Merchant Summary\\Search\\Search Result - Status.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/controlLimit/merchantList?status=&from=01+May+2023&to=')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-13 Merchant Summary\\Search\\Search Result - Create date.png')

WebUI.click(findTestObject('Object Repository/Page_Merchant List (EDC)Kasikornbank/a_Export CSV files'))

// Add Temporary Limit  *********************************************************************************************************************************************
WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/controlLimit/addTemporary?itemid=70939')

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/span_Please enter valid Amount'), 
    'Please enter valid Amount')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-13 Merchant Summary\\Add Temporary Limit\\Add Temporary Limit - No input data.png')

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Temporary Limit Per Transaction_tempE_c475cf'), 
    '40000')

WebUI.setText(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Temporary Limit Per Month_tempEDCPerMonth'), 
    '50000')

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/span_Please enter valid Temporary Start Date'), 
    'Please enter valid Temporary Start Date')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-13 Merchant Summary\\Add Temporary Limit\\Add Temporary Limit - No input date.png')

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Temporary Limit Per Transaction_tempE_c475cf'), 
    '40000')

WebUI.setText(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Temporary Limit Per Month_tempEDCPerMonth'), 
    '5000')

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Expire Date Temporary PerTransaction__14d80c'))

'Change every test'
WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_15'))

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Expire Date Temporary PerTransaction__4f87ae'))

'Change every test'
WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_30'))

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Expire Date Temporary Per Month_datep_f111e0'))

'Change every test'
WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_15'))

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Expire Date Temporary Per Month_datep_d5b0b0'))

'Change every test'
WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_30'))

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-13 Merchant Summary\\Add Temporary Limit\\Add Temporary Limit - Amount per tran more than Per month.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/span_Amount per Month must more than Amount_46b8eb'), 
    'Amount per Month must more than Amount per Transaction')

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Temporary Limit Per Transaction_tempE_c475cf'), 
    '10002')

WebUI.setText(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Temporary Limit Per Month_tempEDCPerMonth'), 
    '100002')

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Expire Date Temporary PerTransaction__14d80c'))

'Change every test'
WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_15'))

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Expire Date Temporary PerTransaction__4f87ae'))

'Change every test'
WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_30'))

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Expire Date Temporary Per Month_datep_f111e0'))

'Change every test'
WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_15'))

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Expire Date Temporary Per Month_datep_d5b0b0'))

'Change every test'
WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_30'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-13 Merchant Summary\\Add Temporary Limit\\Add Temporary Limit - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-13 Merchant Summary\\Add Temporary Limit\\Add Temporary Limit - 2.png')

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_Confirm'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-13 Merchant Summary\\Add Temporary Limit\\Add Temporary Limit - 3.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_All CompaniesKasikornbank/div_Your request is successful'), 
    'Your request is successful')

// Add Permanent Limit *********************************************************************************************************************************************
WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/controlLimit/updatePermanent?itemid=70939')

WebUI.click(findTestObject('Object Repository/Page_Update A Permanent LimitKasikornbank/a_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Update A Permanent LimitKasikornbank/span_Please enter valid Amount'), 
    'Please enter valid Amount')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-13 Merchant Summary\\Add Permanent Limit\\Add Permanent Limit - No input.png')

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/Page_Update A Permanent LimitKasikornbank/input_Permanent Limit Per TransactionTHB_ma_59a160'), 
    '20000')

WebUI.setText(findTestObject('Object Repository/Page_Update A Permanent LimitKasikornbank/input_Permanent Limit Per MonthTHB_maxAmoun_ec8cd4'), 
    '1000')

WebUI.click(findTestObject('Object Repository/Page_Update A Permanent LimitKasikornbank/a_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Update A Permanent LimitKasikornbank/span_Amount per Month must more than Amount_46b8eb'), 
    'Amount per Month must more than Amount per Transaction')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-13 Merchant Summary\\Add Permanent Limit\\Add Permanent Limit - Amount per tran more than Per month.png')

WebUI.refresh()

'Change every test'
WebUI.setText(findTestObject('Object Repository/Page_Update A Permanent LimitKasikornbank/input_Permanent Limit Per TransactionTHB_ma_59a160'), 
    '20003')

'Change every test'
WebUI.setText(findTestObject('Object Repository/Page_Update A Permanent LimitKasikornbank/input_Permanent Limit Per MonthTHB_maxAmoun_ec8cd4'), 
    '100003')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-13 Merchant Summary\\Add Permanent Limit\\Add Permanent Limit - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Update A Permanent LimitKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-13 Merchant Summary\\Add Permanent Limit\\Add Permanent Limit - 2.png')

WebUI.click(findTestObject('Object Repository/Page_Update A Permanent LimitKasikornbank/a_Confirm'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-13 Merchant Summary\\Add Permanent Limit\\Add Permanent Limit - 3.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_All CompaniesKasikornbank/div_Your request is successful'), 
    'Your request is successful')


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

WebUI.click(findTestObject('Object Repository/Page_HomeKasikornbank/span_AllCompanies'))

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/company/viewDetails?itemid=90083')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-06 All Company\\Company Details.png')

// Search *********************************************************************************************************************************************

WebUI.click(findTestObject('Object Repository/Page_HomeKasikornbank/span_AllCompanies'))

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/company/list')

WebUI.setText(findTestObject('Object Repository/Page_All CompaniesKasikornbank/input_Search_search'), 'Test')

WebUI.click(findTestObject('Object Repository/Page_All CompaniesKasikornbank/a_Search'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-06 All Company\\Search\\Search Results - Name.png')

WebUI.click(findTestObject('Object Repository/Page_Search ResultsKasikornbank/a_Export CSV files'))

WebUI.click(findTestObject('Object Repository/Page_Search ResultsKasikornbank/div_Company Summary'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_All CompaniesKasikornbank/select_Select OneActiveSuspended'), 
    'Suspended', true)

WebUI.click(findTestObject('Object Repository/Page_All CompaniesKasikornbank/a_Search_1'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-06 All Company\\Search\\Search Results - Status.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/company/list?status=&from=01+Mar+2023&to=')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-06 All Company\\Search\\Search Results - Create Date.png')

//Add Temp limit *********************************************************************************************************************************************

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/company/viewDetails?itemid=90083')

WebUI.click(findTestObject('Object Repository/Page_Company DetailsKasikornbank/span_Add Temporary Limit'))

WebUI.setText(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/textarea_Remarks_remark'), 'Test Automate')

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/span_'), 'กรุณาใส่จำนวนเงินหรือย้อนกลับ')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-06 All Company\\Temp & Permanant\\Add temp\\Add A Temporary Limit - No Input.png')

WebUI.setText(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Temporary Limit Per Transaction_tempPerTran'), 
    '60000')

WebUI.setText(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Temporary Limit Per Month_tempPerMonth'), 
    '110000')

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_Submit'))

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/span_Please enter valid Temporary Start Date'), 
    'Please enter valid Temporary Start Date')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-06 All Company\\Temp & Permanant\\Add temp\\Add A Temporary Limit - No Input Date.png')

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Expire Date Temporary PerTransaction__c9d1ac'))

'change date every test'
WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_29'))

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Expire Date Temporary PerTransaction__d81a18'))

'change date every test'
WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_31'))

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Expire Date Temporary Per Month_tempP_bcd532'))

'change date every test'
WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_29'))

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Expire Date Temporary Per Month_tempP_07af40'))

'change date every test'
WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_31'))

WebUI.setText(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Temporary Limit Per Transaction_tempPerTran'), 
    '100')

WebUI.setText(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Temporary Limit Per Month_tempPerMonth'), 
    '200')

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/span__1'), 'วงเงินชั่วคราวต่อรายการต้องมากกว่าวงเงินถาวรต่อรายการ')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-06 All Company\\Temp & Permanant\\Add temp\\Add A Temporary Limit - amount less than Permanant.png')

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Expire Date Temporary PerTransaction__c9d1ac'))

'change date every test'
WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_29'))

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Expire Date Temporary PerTransaction__d81a18'))

'change date every test'
WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_31'))

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Expire Date Temporary Per Month_tempP_bcd532'))

'change date every test'
WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_29'))

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Expire Date Temporary Per Month_tempP_07af40'))

'change date every test'
WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_31'))

WebUI.setText(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Temporary Limit Per Transaction_tempPerTran'), 
    '100000')

WebUI.setText(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Temporary Limit Per Month_tempPerMonth'), 
    '10000')

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/span__1_2'), 'วงเงินชั่วคราวต่อรายเดือนต้องมากกว่าวงเงินถาวรต่อรายเดือน')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-06 All Company\\Temp & Permanant\\Add temp\\Add A Temporary Limit - Per month less than per trans.png')

WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

'Change every test\r\n'
WebUI.setText(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Temporary Limit Per Transaction_tempPerTran'), 
    '310000')

'Change every test\r\n'
WebUI.setText(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Temporary Limit Per Month_tempPerMonth'), 
    '410000')

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Expire Date Temporary PerTransaction__c9d1ac'))

'change date every test'
WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_29'))

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Expire Date Temporary PerTransaction__d81a18'))

'change date every test'
WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_31'))

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Expire Date Temporary Per Month_tempP_bcd532'))

'change date every test'
WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_29'))

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Expire Date Temporary Per Month_tempP_07af40'))

'change date every test'
WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_31'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-06 All Company\\Temp & Permanant\\Add temp\\Add A Temporary Limit - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-06 All Company\\Temp & Permanant\\Add temp\\Add A Temporary Limit - 2.png')

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_Confirm'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-06 All Company\\Temp & Permanant\\Add temp\\Add A Temporary Limit - 3.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Temporary LimitKasikornbank/div_Your request is successful'), 
    'Your request is successful')

//Add Permanant *********************************************************************************************************************************************

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/company/viewDetails?itemid=90083')

WebUI.click(findTestObject('Object Repository/Page_Company DetailsKasikornbank/span_Add Permanent Limit'))

WebUI.setText(findTestObject('Object Repository/Page_Update A Permanent LimitKasikornbank/textarea_Remarks_remark'), 'Test Automate add permanant')

WebUI.click(findTestObject('Object Repository/Page_Update A Permanent LimitKasikornbank/a_Submit'))
WebUI.verifyElementText(findTestObject('Object Repository/Page_Update A Permanent LimitKasikornbank/span_Please enter valid Amount'),
	'Please enter valid Amount')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-06 All Company\\Temp & Permanant\\Add Permanant\\Add A Permanant Limit - No Input Date.png')

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/Page_Update A Permanent LimitKasikornbank/input_Permanent Transaction LimitTHB_maxAmo_91d331'), 
    '60000')

WebUI.setText(findTestObject('Object Repository/Page_Update A Permanent LimitKasikornbank/input_Permanent Month LimitTHB_maxAmountPerMonth'), 
    '10000')

WebUI.setText(findTestObject('Object Repository/Page_Update A Permanent LimitKasikornbank/textarea_Remarks_remark'), 'Test Automate')

WebUI.click(findTestObject('Object Repository/Page_Update A Permanent LimitKasikornbank/a_Submit'))
WebUI.verifyElementText(findTestObject('Object Repository/Page_Update A Permanent LimitKasikornbank/span_Amount per Month must more than Amount_46b8eb'),
	'Amount per Month must more than Amount per Transaction')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-06 All Company\\Temp & Permanant\\Add Permanant\\Add A Permanant Limit - limit Per tran more than Per month.png')

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/Page_Update A Permanent LimitKasikornbank/input_Permanent Transaction LimitTHB_maxAmo_91d331'), 
    '60000')

WebUI.setText(findTestObject('Object Repository/Page_Update A Permanent LimitKasikornbank/input_Permanent Month LimitTHB_maxAmountPerMonth'), 
    '110000')

WebUI.setText(findTestObject('Object Repository/Page_Update A Permanent LimitKasikornbank/textarea_Remarks_remark'), 'Test automate')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-06 All Company\\Temp & Permanant\\Add Permanant\\Add A Permanant Limit - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Update A Permanent LimitKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-06 All Company\\Temp & Permanant\\Add Permanant\\Add A Permanant Limit - 2.png')

WebUI.click(findTestObject('Object Repository/Page_Update A Permanent LimitKasikornbank/a_Confirm'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-06 All Company\\Temp & Permanant\\Add Permanant\\Add A Permanant Limit - 3.png')

WebUI.verifyElementText(findTestObject('Page_Add PermanentKasikornbank/div_Your request is successful'), 'Your request is successful')

// Edit Company  *********************************************************************************************************************************************

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/company/viewDetails?itemid=90083')

WebUI.click(findTestObject('Object Repository/Page_Company DetailsKasikornbank/a_Edit Company Details'))

WebUI.setText(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/textarea_Remarks_remark'), 'Test Edit by automate')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-06 All Company\\Edit\\Edit company - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/a_Submit'))

WebUI.waitForPageLoad(1)

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-06 All Company\\Edit\\Edit company - 2.png')

WebUI.click(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/a_Confirm'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-06 All Company\\Edit\\Edit company - 3.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/div_Your request is successful'),
	'Your request is successful')

// Suspend *********************************************************************************************************************************************

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/company/viewDetails?itemid=90083')

WebUI.click(findTestObject('Object Repository/Page_Company DetailsKasikornbank/span_Suspend Company Access'))

WebUI.click(findTestObject('Object Repository/Page_Suspend Company AccessKasikornbank/a_Submit'))
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-06 All Company\\Suspend\\Suspend company - 1.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Suspend Company AccessKasikornbank/span_Please enter a short description'),
	'Please enter a short description')

WebUI.setText(findTestObject('Object Repository/Page_Suspend Company AccessKasikornbank/textarea_concat(Merchant, , s bank account _966b7c'),
	'Test Automate suspend')

WebUI.click(findTestObject('Object Repository/Page_Suspend Company AccessKasikornbank/a_Submit'))
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-06 All Company\\Suspend\\Suspend company - 2.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Suspend Company AccessKasikornbank/div_Your request is successful'),
	'Your request is successful')

// Reinstate *********************************************************************************************************************************************

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/company/viewDetails?itemid=90083')

WebUI.click(findTestObject('Object Repository/Page_Company DetailsKasikornbank/span_Reinstate Company Access'))

WebUI.click(findTestObject('Object Repository/Page_Reinstate Company AccessKasikornbank/a_Submit'))
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-06 All Company\\Reinstate\\Reinstate company - 1.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Reinstate Company AccessKasikornbank/span_Please enter a short description'),
	'Please enter a short description')

WebUI.setText(findTestObject('Object Repository/Page_Reinstate Company AccessKasikornbank/textarea_concat(Merchant, , s bank account _5b8a53'),
	'Test Automate Reinstate')

WebUI.click(findTestObject('Object Repository/Page_Reinstate Company AccessKasikornbank/a_Submit'))
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-06 All Company\\Reinstate\\Reinstate company - 2.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Reinstate Company AccessKasikornbank/div_Your request is successful'),
	'Your request is successful')




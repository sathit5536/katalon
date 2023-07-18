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

// Add Permanant amount Per month to 10000 and Per trans 3000 (EDC)
WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/controlLimit/updatePermanent?itemid=70939')

WebUI.setText(findTestObject('Object Repository/Page_Update A Permanent LimitKasikornbank/input_Permanent Limit Per TransactionTHB_ma_59a160'), 
    '4000')

WebUI.setText(findTestObject('Object Repository/Page_Update A Permanent LimitKasikornbank/input_Permanent Limit Per MonthTHB_maxAmoun_ec8cd4'), 
    '20000')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-40 Retest Incident\\Add Permanant amount Per month to 10000 and Per trans 3000 (EDC)\\Add Permanant - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Update A Permanent LimitKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-40 Retest Incident\\Add Permanant amount Per month to 10000 and Per trans 3000 (EDC)\\Add Permanant - 2.png')

WebUI.click(findTestObject('Object Repository/Page_Update A Permanent LimitKasikornbank/a_Confirm'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-40 Retest Incident\\Add Permanant amount Per month to 10000 and Per trans 3000 (EDC)\\Add Permanant - 3.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_All CompaniesKasikornbank/div_Your request is successful'), 
    'Your request is successful')

// Create new company with name .com (Check reg-ex)  (EDC)
WebUI.click(findTestObject('Object Repository/Page_HomeKasikornbank/span_ControlLimit'))

WebUI.click(findTestObject('Object Repository/Page_All Company (EDC)Kasikornbank/div_Add a Company Control Limit'))

'Change Every test'
WebUI.setText(findTestObject('Object Repository/Page_Add A Company (EDC)Kasikornbank/input_Company Name_businessName'), 
    'Test Automate001.com')

WebUI.setText(findTestObject('Object Repository/Page_Add A Company (EDC)Kasikornbank/input_Company Short Name_businessShortName'), 
    'Automate.com')

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
WebUI.setText(findTestObject('Object Repository/Page_Add A Company (EDC)Kasikornbank/input_Merchant ID (MID)_mid'), '998877688875501')

WebUI.setText(findTestObject('Object Repository/Page_Add A Company (EDC)Kasikornbank/input_Merchant Name_midName'), 'test automate')

WebUI.setText(findTestObject('Object Repository/Page_Add A Company (EDC)Kasikornbank/input_Limit Per TransactionTHB_maxAmountEDC_a062ad'), 
    '30000')

WebUI.setText(findTestObject('Object Repository/Page_Add A Company (EDC)Kasikornbank/input_Limit per MonthTHB_maxAmountEDCPerMonth'), 
    '400000')

WebUI.click(findTestObject('Object Repository/Page_Add A Company (EDC)Kasikornbank/a_Add Merchant ID'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-40 Retest Incident\\Create new company with name .com (Check reg-ex)  (EDC)\\Add Cpmpany - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Add A Company (EDC)Kasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-40 Retest Incident\\Create new company with name .com (Check reg-ex)  (EDC)\\Add Cpmpany - 2.png')

WebUI.click(findTestObject('Object Repository/Page_Add A Company (EDC)Kasikornbank/a_Confirm'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-40 Retest Incident\\Create new company with name .com (Check reg-ex)  (EDC)\\Add Cpmpany - 3.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_NAKasikornbank/div_The following company has been successf_80d380'), 
    'The following company has been successfully added to the system.')

// Add temp and set end date to anyday (mpos)
WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocCompany/viewDetails?itemid=1')

WebUI.click(findTestObject('Object Repository/Page_Company DetailsKasikornbank/a_Add Temporary Limit'))

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Expire Date Temporary PerTransaction__c9d1ac'))

'change date every test'
WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_15'))

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Expire Date Temporary PerTransaction__d81a18'))

'change date every test'
WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_27'))

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Expire Date Temporary Per Month_tempP_bcd532'))

'change date every test'
WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_15'))

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Expire Date Temporary Per Month_tempP_07af40'))

'change date every test'
WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_30'))

'change date every test'
WebUI.setText(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Temporary Limit Per Transaction_tempPerTran'), 
    '34000')

'change date every test'
WebUI.setText(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Temporary Limit Per Month_tempPerMonth'), 
    '440000')

WebUI.setText(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/textarea_Remarks_remark'), 'Test Automate')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-40 Retest Incident\\Add temp and set end date to anyday (mpos)\\Add Temp - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-40 Retest Incident\\Add temp and set end date to anyday (mpos)\\Add Temp - 2.png')

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_Confirm'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-40 Retest Incident\\Add temp and set end date to anyday (mpos)\\Add Temp - 3.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Temporary LimitKasikornbank/div_Your request is successful'), 
    'Your request is successful')

// Create new company with name .com (Check reg-ex) (mpos)

WebUI.click(findTestObject('Object Repository/Page_HomeKasikornbank/span_AllCompanies'))

WebUI.click(findTestObject('Object Repository/Page_All CompaniesKasikornbank/div_Add a Company'))

'Change every run test'
WebUI.setText(findTestObject('Object Repository/Page_Add a CompanyKasikornbank/input_Company Name_businessName'), 'TestAutomate06.com')

WebUI.setText(findTestObject('Object Repository/Page_Add a CompanyKasikornbank/input_Company Short Name_businessShortName'), 
    'automate.com')

WebUI.setText(findTestObject('Object Repository/Page_Add a CompanyKasikornbank/input_Type of Business_businessType'), '2342')

WebUI.setText(findTestObject('Object Repository/Page_Add a CompanyKasikornbank/input_Business Registration Number (BRN)_bu_f5ee2c'), 
    '2342342343242344')

WebUI.setText(findTestObject('Object Repository/Page_Add a CompanyKasikornbank/input_Business Registration Address_address1'), 
    '22233')

WebUI.setText(findTestObject('Object Repository/Page_Add a CompanyKasikornbank/input_RegionCity_city'), 'test')

WebUI.setText(findTestObject('Object Repository/Page_Add a CompanyKasikornbank/input_Postcode_postcode'), '23423')

WebUI.setText(findTestObject('Object Repository/Page_Add a CompanyKasikornbank/input_Business Contact No_businessContact'), 
    '0000000000')

WebUI.setText(findTestObject('Object Repository/Page_Add a CompanyKasikornbank/input_Company User Limit_companyUserLimit'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Page_Add a CompanyKasikornbank/input_Name_fullName'), 'Test Automate')

WebUI.setText(findTestObject('Object Repository/Page_Add a CompanyKasikornbank/input_Contact No_contact'), '0110000000')

'Change every run test'
WebUI.setText(findTestObject('Object Repository/Page_Add a CompanyKasikornbank/input_Email Address_email'), 'Testautomate006@test.test')

WebUI.setText(findTestObject('Object Repository/Page_Add a CompanyKasikornbank/input_THB_maxAmountPerTransac'), '50000')

WebUI.setText(findTestObject('Object Repository/Page_Add a CompanyKasikornbank/input_THB_maxAmountPerMonth'), '100000')

WebUI.setText(findTestObject('Object Repository/Page_Add a CompanyKasikornbank/input_Group Name_groupName'), 'Automate')

'Change every run test'
WebUI.setText(findTestObject('Object Repository/Page_Add a CompanyKasikornbank/input_Merchant ID (MID)_mid'), '123564565673303')

WebUI.setText(findTestObject('Object Repository/Page_Add a CompanyKasikornbank/input_Merchant Name_midName'), 'test')

WebUI.click(findTestObject('Object Repository/Page_Add a CompanyKasikornbank/a_Add Merchant ID'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-40 Retest Incident\\Create new company with name .com (Check reg-ex) (mpos)\\Create new company - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Add a CompanyKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-40 Retest Incident\\Create new company with name .com (Check reg-ex) (mpos)\\Create new company - 2.png')

WebUI.click(findTestObject('Object Repository/Page_Add a CompanyKasikornbank/a_Confirm'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-40 Retest Incident\\Create new company with name .com (Check reg-ex) (mpos)\\Create new company - 3.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add a CompanyKasikornbank/div_The following company has been successf_80d380'), 
    'The following company has been successfully added to the system.')

// Edit Company user email to 8 digit after dot(.) (mpos)
WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/company/viewDetails?itemid=90083')

WebUI.click(findTestObject('Object Repository/Page_Company DetailsKasikornbank/a_Edit Company Details'))

WebUI.setText(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/textarea_Remarks_remark'), 'Test Edit by automate')

WebUI.setText(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/input_Email Address_email'), 'testautomate001@test.teseeeet')

WebUI.click(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/div_Quicklinks                             _0bc80a'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-40 Retest Incident\\Edit Company user email to 8 digit after dot(.) (mpos)\\Edit Company user - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-40 Retest Incident\\Edit Company user email to 8 digit after dot(.) (mpos)\\Edit Company user - 2.png')

WebUI.click(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/a_Confirm'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-40 Retest Incident\\Edit Company user email to 8 digit after dot(.) (mpos)\\Edit Company user - 3.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/div_Your request is successful'), 
    'Your request is successful')

// Suspend and reinstate Authoriser (kshop)
WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocCompany/viewDetails?itemid=1')

WebUI.click(findTestObject('Object Repository/Page_Company DetailsKasikornbank/span_Suspend Authoriser'))

WebUI.setText(findTestObject('Object Repository/Page_Suspend AuthoriserKasikornbank/textarea_Suspend Authorizer Reason 1_remarks'), 
    'Test Suspend Authoriser by automate')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-40 Retest Incident\\Suspend and reinstate Authoriser (kshop)\\suspend\\Suspend - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Suspend AuthoriserKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-40 Retest Incident\\Suspend and reinstate Authoriser (kshop)\\suspend\\Suspend - 2.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Suspend AuthoriserKasikornbank/div_Your request is successful'), 
    'Your request is successful')

WebUI.click(findTestObject('Object Repository/Page_Suspend AuthoriserKasikornbank/a_View CompanyDetails'))

WebUI.click(findTestObject('Object Repository/Page_Company DetailsKasikornbank/span_Reinstate Authoriser'))

WebUI.setText(findTestObject('Object Repository/Page_Reinstate AuthoriserKasikornbank/textarea_Reinstate Authorizer Reason 1_remarks'), 
    'Reinstate Authoriser by automate')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-40 Retest Incident\\Suspend and reinstate Authoriser (kshop)\\Reinstate\\Reinstate - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Reinstate AuthoriserKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-40 Retest Incident\\Suspend and reinstate Authoriser (kshop)\\Reinstate\\Reinstate - 2.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Reinstate AuthoriserKasikornbank/div_Your request is successful'), 
    'Your request is successful')


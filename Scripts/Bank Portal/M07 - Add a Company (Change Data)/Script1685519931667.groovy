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

WebUI.click(findTestObject('Object Repository/Page_All CompaniesKasikornbank/div_Add a Company'))

WebUI.click(findTestObject('Object Repository/Page_Add a CompanyKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-07 Add a Company\\Add a company - No data input.png')

'Change every run test'
WebUI.setText(findTestObject('Object Repository/Page_Add a CompanyKasikornbank/input_Company Name_businessName'), 'TestAutomate05')

WebUI.setText(findTestObject('Object Repository/Page_Add a CompanyKasikornbank/input_Company Short Name_businessShortName'), 
    'automate')

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

WebUI.setText(findTestObject('Object Repository/Page_Add a CompanyKasikornbank/input_Contact No_contact'), '0000000000')

'Change every run test'
WebUI.setText(findTestObject('Object Repository/Page_Add a CompanyKasikornbank/input_Email Address_email'), 'Testautomate05@test.test')

WebUI.setText(findTestObject('Object Repository/Page_Add a CompanyKasikornbank/input_THB_maxAmountPerTransac'), '50000')

WebUI.setText(findTestObject('Object Repository/Page_Add a CompanyKasikornbank/input_THB_maxAmountPerMonth'), '100000')

WebUI.setText(findTestObject('Object Repository/Page_Add a CompanyKasikornbank/input_Group Name_groupName'), 'Automate')

'Change every run test'
WebUI.setText(findTestObject('Object Repository/Page_Add a CompanyKasikornbank/input_Merchant ID (MID)_mid'), '123564565673005')

WebUI.setText(findTestObject('Object Repository/Page_Add a CompanyKasikornbank/input_Merchant Name_midName'), 'test')

WebUI.click(findTestObject('Object Repository/Page_Add a CompanyKasikornbank/a_Add Merchant ID'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-07 Add a Company\\Add a company - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Add a CompanyKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-07 Add a Company\\Add a company - 2.png')

WebUI.click(findTestObject('Object Repository/Page_Add a CompanyKasikornbank/a_Confirm'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-07 Add a Company\\Add a company - 3.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add a CompanyKasikornbank/div_The following company has been successf_80d380'), 
    'The following company has been successfully added to the system.')


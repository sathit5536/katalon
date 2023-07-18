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

WebUI.click(findTestObject('Object Repository/Page_All CompaniesKasikornbank/div_K SHOP Company Summary'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-09 KShop Company\\Company List.png')

// Search *********************************************************************************************************************************************
WebUI.setText(findTestObject('Object Repository/Page_All Spoc CompaniesKasikornbank/input_Search_search'), 'Test')

WebUI.click(findTestObject('Object Repository/Page_All Spoc CompaniesKasikornbank/a_Search'))

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocCompany/search?search=Test')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-09 KShop Company\\Search\\Search Result - Company name.png')

WebUI.click(findTestObject('Object Repository/Page_Search ResultsKasikornbank/a_Export CSV files'))

WebUI.click(findTestObject('Object Repository/Page_Search ResultsKasikornbank/div_K SHOP Company Summary'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_All Spoc CompaniesKasikornbank/select_Select OneActiveSuspended'), 
    'Suspended', true)

WebUI.click(findTestObject('Object Repository/Page_All Spoc CompaniesKasikornbank/a_Search_1'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-09 KShop Company\\Search\\Search Result - Status.png')

WebUI.click(findTestObject('Object Repository/Page_All Spoc CompaniesKasikornbank/div_K SHOP Company Summary'))

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocCompany/list?status=&from=01+May+2023&to=')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-09 KShop Company\\Search\\Search Result - Create Date.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocCompany/viewDetails?itemid=1')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-09 KShop Company\\Company Details.png')

// Add Temporary Limit *********************************************************************************************************************************************
WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocCompany/viewDetails?itemid=1')

WebUI.click(findTestObject('Object Repository/Page_Company DetailsKasikornbank/a_Add Temporary Limit'))

WebUI.setText(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/textarea_Remarks_remark'), 'Test Automate')

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/span_'), 'กรุณาใส่จำนวนเงินหรือย้อนกลับ')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-09 KShop Company\\Temp & Permanant\\Add temp\\Add A Temporary Limit - No Input.png')

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Temporary Limit Per Transaction_tempPerTran'), 
    '10000')

WebUI.setText(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Temporary Limit Per Month_tempPerMonth'), 
    '1000')

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Expire Date Temporary PerTransaction__c9d1ac'))

'change date every test'
WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_15'))

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Expire Date Temporary PerTransaction__d81a18'))

'change date every test'
WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_30'))

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Expire Date Temporary Per Month_tempP_bcd532'))

'change date every test'
WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_15'))

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Expire Date Temporary Per Month_tempP_07af40'))

'change date every test'
WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_30'))

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/div_Add Temporary LimitCompany NameTest Aut_b68b49'))

WebUI.setText(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/textarea_Remarks_remark'), 'Test Automate')

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/span__1'), 'วงเงินชั่วคราวต่อรายการต้องมากกว่าวงเงินถาวรต่อรายการ')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-09 KShop Company\\Temp & Permanant\\Add temp\\Add A Temporary Limit - Per month less than per trans.png')

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Expire Date Temporary PerTransaction__c9d1ac'))

'change date every test'
WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_15'))

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Expire Date Temporary PerTransaction__d81a18'))

'change date every test'
WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_30'))

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Expire Date Temporary Per Month_tempP_bcd532'))

'change date every test'
WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_15'))

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Expire Date Temporary Per Month_tempP_07af40'))

'change date every test'
WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_30'))

WebUI.setText(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Temporary Limit Per Transaction_tempPerTran'), 
    '10000')

WebUI.setText(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Temporary Limit Per Month_tempPerMonth'), 
    '20000')

WebUI.setText(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/textarea_Remarks_remark'), 'Test Automate')

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/span__1'), 'วงเงินชั่วคราวต่อรายการต้องมากกว่าวงเงินถาวรต่อรายการ')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-09 KShop Company\\Temp & Permanant\\Add temp\\Add A Temporary Limit - Amount less then Permanant.png')

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Expire Date Temporary PerTransaction__c9d1ac'))

'change date every test'
WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_15'))

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/input_Expire Date Temporary PerTransaction__d81a18'))

'change date every test'
WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_30'))

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

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-09 KShop Company\\Temp & Permanant\\Add temp\\Add A Temporary Limit - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-09 KShop Company\\Temp & Permanant\\Add temp\\Add A Temporary Limit - 2.png')

WebUI.click(findTestObject('Object Repository/Page_Add A Temporary LimitKasikornbank/a_Confirm'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-09 KShop Company\\Temp & Permanant\\Add temp\\Add A Temporary Limit - 3.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add Temporary LimitKasikornbank/div_Your request is successful'), 
    'Your request is successful')

// Add Permanant Limit *********************************************************************************************************************************************
WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocCompany/viewDetails?itemid=1')

WebUI.click(findTestObject('Object Repository/Page_Company DetailsKasikornbank/a_Add Permanent Limit'))

WebUI.click(findTestObject('Object Repository/Page_Update A Permanent LimitKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-09 KShop Company\\Temp & Permanant\\Add Permanant\\Add A Permanant Limit - No Input.png')

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/Page_Update A Permanent LimitKasikornbank/input_Permanent Transaction LimitTHB_maxAmo_91d331'), 
    '30000')

WebUI.setText(findTestObject('Object Repository/Page_Update A Permanent LimitKasikornbank/input_Permanent Month LimitTHB_maxAmountPerMonth'), 
    '4000')

WebUI.click(findTestObject('Object Repository/Page_Update A Permanent LimitKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-09 KShop Company\\Temp & Permanant\\Add Permanant\\Add A Permanant Limit - Per month less than per trans.png')

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/Page_Update A Permanent LimitKasikornbank/input_Permanent Transaction LimitTHB_maxAmo_91d331'), 
    '35000')

WebUI.setText(findTestObject('Object Repository/Page_Update A Permanent LimitKasikornbank/input_Permanent Month LimitTHB_maxAmountPerMonth'), 
    '450000')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-09 KShop Company\\Temp & Permanant\\Add Permanant\\Add A Permanant Limit - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Update A Permanent LimitKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-09 KShop Company\\Temp & Permanant\\Add Permanant\\Add A Permanant Limit - 2.png')

WebUI.click(findTestObject('Object Repository/Page_Update A Permanent LimitKasikornbank/a_Confirm'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-09 KShop Company\\Temp & Permanant\\Add Permanant\\Add A Permanant Limit - 3.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Add PermanentKasikornbank/div_Your request is successful'), 
    'Your request is successful')

// Suspend KShop Company *********************************************************************************************************************************************
WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocCompany/viewDetails?itemid=1')

WebUI.click(findTestObject('Object Repository/Page_Company DetailsKasikornbank/a_Suspend Company Access'))

WebUI.setText(findTestObject('Object Repository/Page_Suspend Company AccessKasikornbank/textarea_concat(Merchant, , s bank account _966b7c'), 
    'Test Automate')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-09 KShop Company\\Suspend\\Suspend company - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Suspend Company AccessKasikornbank/a_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Suspend Company AccessKasikornbank/div_Your request is successful'), 
    'Your request is successful')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-09 KShop Company\\Suspend\\Suspend company - 2.png')

// Reinstate KShop Company *********************************************************************************************************************************************
WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocCompany/viewDetails?itemid=1')

WebUI.click(findTestObject('Object Repository/Page_Company DetailsKasikornbank/a_Reinstate Company Access'))

WebUI.setText(findTestObject('Object Repository/Page_Reinstate Company AccessKasikornbank/textarea_concat(Merchant, , s bank account _5b8a53'), 
    'Test Automate')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-09 KShop Company\\Reinstate\\Reinstate company - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Reinstate Company AccessKasikornbank/a_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Reinstate Company AccessKasikornbank/div_Your request is successful'), 
    'Your request is successful')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-09 KShop Company\\Reinstate\\Reinstate company - 2.png')

// Delink With Mpos Company *********************************************************************************************************************************************
WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocCompany/deLinkWithMposCompany?itemid=34')

WebUI.setText(findTestObject('Object Repository/Page_NAKasikornbank/textarea_Remarks_remark'), 'Test Delink By Automate')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-09 KShop Company\\Link with mPOS\\Delink\\Delink mPOS company - 1.png')

WebUI.click(findTestObject('Object Repository/Page_NAKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-09 KShop Company\\Link with mPOS\\Delink\\Delink mPOS company - 2.png')

WebUI.click(findTestObject('Object Repository/Page_NAKasikornbank/a_Confirm'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_NAKasikornbank/div_Your request is successful'), 'Your request is successful')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-09 KShop Company\\Link with mPOS\\Delink\\Delink mPOS company - 3.png')

// Link With mPOS Company *********************************************************************************************************************************************
WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocCompany/linkWithMposCompany?itemid=34')

WebUI.setText(findTestObject('Object Repository/Page_Link With Mpos CompanyKasikornbank/input_Company Name_companyNameModal'), 
    'digio')

WebUI.click(findTestObject('Object Repository/Page_Link With Mpos CompanyKasikornbank/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Link With Mpos CompanyKasikornbank/div_Select'))

WebUI.setText(findTestObject('Object Repository/Page_Link With Mpos CompanyKasikornbank/textarea_Remarks_remark'), 'Test Link mpos with Automate')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-09 KShop Company\\Link with mPOS\\Link\\Link mPOS company - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Link With Mpos CompanyKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-09 KShop Company\\Link with mPOS\\Link\\Link mPOS company - 2.png')

WebUI.click(findTestObject('Object Repository/Page_Link With Mpos CompanyKasikornbank/a_Confirm'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Link With Mpos CompanyKasikornbank/div_Your request is successful'), 
    'Your request is successful')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-09 KShop Company\\Link with mPOS\\Link\\Link mPOS company - 3.png')

// Quick Link  *********************************************************************************************************************************************
WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocCompany/list')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_All Spoc CompaniesKasikornbank/select_Select OneAdd Temporary LimitAdd Per_d952c4'), 
    'addTemporary', true)

WebUI.click(findTestObject('Object Repository/Page_All Spoc CompaniesKasikornbank/a_Go'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-09 KShop Company\\Quick link\\addTemporary.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocCompany/list')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_All Spoc CompaniesKasikornbank/select_Select OneAdd Temporary LimitAdd Per_d952c4'), 
    'updatePermanent', true)

WebUI.click(findTestObject('Object Repository/Page_All Spoc CompaniesKasikornbank/a_Go'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-09 KShop Company\\Quick link\\updatePermanent.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocCompany/list')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_All Spoc CompaniesKasikornbank/select_Select OneAdd Temporary LimitAdd Per_d952c4'), 
    'linkWithMposCompany', true)

WebUI.click(findTestObject('Object Repository/Page_All Spoc CompaniesKasikornbank/a_Go'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-09 KShop Company\\Quick link\\linkWithMposCompany.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocCompany/list')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_All Spoc CompaniesKasikornbank/select_Select OneAdd Temporary LimitAdd Per_d952c4'), 
    'viewDetails', true)

WebUI.click(findTestObject('Object Repository/Page_All Spoc CompaniesKasikornbank/a_Go'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-09 KShop Company\\Quick link\\viewDetails.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocCompany/list')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_All Spoc CompaniesKasikornbank/select_Select OneAdd Temporary LimitAdd Per_d952c4'), 
    '/spocCompanyUser/company', true)

WebUI.click(findTestObject('Object Repository/Page_All Spoc CompaniesKasikornbank/a_Go'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-09 KShop Company\\Quick link\\spocCompanyUser.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocCompany/list')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_All Spoc CompaniesKasikornbank/select_Select OneAdd Temporary LimitAdd Per_d952c4'), 
    '/spocMobileUser/company', true)

WebUI.click(findTestObject('Object Repository/Page_All Spoc CompaniesKasikornbank/a_Go'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-09 KShop Company\\Quick link\\spocMobileUser.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocCompany/list')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_All Spoc CompaniesKasikornbank/select_Select OneAdd Temporary LimitAdd Per_d952c4'), 
    '/spocTerminal/company', true)

WebUI.click(findTestObject('Object Repository/Page_All Spoc CompaniesKasikornbank/a_Go'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-09 KShop Company\\Quick link\\spocTerminal.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocCompany/list')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_All Spoc CompaniesKasikornbank/select_Select OneAdd Temporary LimitAdd Per_d952c4'), 
    '/spocReader/company', true)

WebUI.click(findTestObject('Object Repository/Page_All Spoc CompaniesKasikornbank/a_Go'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-09 KShop Company\\Quick link\\spocReader.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocCompany/list')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_All Spoc CompaniesKasikornbank/select_Select OneAdd Temporary LimitAdd Per_d952c4'), 
    '/spocTransaction/company', true)

WebUI.click(findTestObject('Object Repository/Page_All Spoc CompaniesKasikornbank/a_Go'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-09 KShop Company\\Quick link\\spocTransaction.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocCompany/list')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_All Spoc CompaniesKasikornbank/select_Select OneAdd Temporary LimitAdd Per_d952c4'), 
    '/spocCreditSettlement/company', true)

WebUI.click(findTestObject('Object Repository/Page_All Spoc CompaniesKasikornbank/a_Go'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-09 KShop Company\\Quick link\\spocCreditSettlement.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocCompany/list')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_All Spoc CompaniesKasikornbank/select_Select OneAdd Temporary LimitAdd Per_d952c4'), 
    '/spocCompany/suspend', true)

WebUI.click(findTestObject('Object Repository/Page_All Spoc CompaniesKasikornbank/a_Go'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-09 KShop Company\\Quick link\\suspend.png')


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

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-37 Download & export\\ test - 1.png')

// mpos company

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/company/list?status=&from=01+Jan+2023&to=26+May+2023')

WebUI.click(findTestObject('Object Repository/Page_All Spoc CompaniesKasikornbank/a_Export CSV files'))

//spoc company

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocCompany/list?status=&from=01+May+2023&to=')

WebUI.click(findTestObject('Object Repository/Page_All CompaniesKasikornbank/a_Export CSV files'))

// EDC Company

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/controlLimit/listEDC?status=&from=01+Jan+2023&to=26+May+2023')

WebUI.click(findTestObject('Object Repository/Page_All Company (EDC)Kasikornbank/a_Export CSV files'))

// EDC Merchant summary

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/controlLimit/merchantList?status=&from=01+Jan+2023&to=26+May+2023')

WebUI.click(findTestObject('Object Repository/Page_Merchant List (EDC)Kasikornbank/a_Export CSV files'))

// mpos staff

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/controlLimit/merchantList?status=&from=01+Jan+2023&to=26+May+2023')

WebUI.click(findTestObject('Object Repository/Page_All StaffsKasikornbank/a_Export CSV files'))

// kshop staff 

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocMobileUser/list?mid=&status=&from=01+Jan+2023&to=')

WebUI.click(findTestObject('Object Repository/Page_All K SHOP StaffsKasikornbank/a_Export CSV files'))

// kshop terminal summary

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocTerminal/list?searchItem=&status=&from=02+Jan+2023&to=')

WebUI.click(findTestObject('Object Repository/Page_All TerminalsKasikornbank/a_Export CSV files'))

// mpos company user

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/companyUser/list?mid=&status=&from=01+Jan+2023&to=')

WebUI.click(findTestObject('Object Repository/Page_All Company UsersKasikornbank/a_Export CSV files'))

// kshop company user 

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocCompanyUser/list?mid=&status=&from=01+Jan+2023&to=26+May+2023')

WebUI.click(findTestObject('Object Repository/Page_All K SHOP Company UsersKasikornbank/a_Export CSV files'))

// mpos reader

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/reader/list?mid=&status=&from=01+Jan+2023&to=')

WebUI.click(findTestObject('Object Repository/Page_All ReadersKasikornbank/a_Export CSV files'))

// kshop reader

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocReader/list?mid=&status=&from=01+Jan+2023&to=')

WebUI.click(findTestObject('Object Repository/Page_All ReadersKasikornbank/a_Export CSV files'))

// mpos transaction

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/transaction/list?mid=&tid=&approvalCode=&status=&amount=&from=01+Aug+2022&to=26+May+2023')

WebUI.click(findTestObject('Object Repository/Page_All TransactionsKasikornbank/a_Export CSV files'))

WebUI.click(findTestObject('Object Repository/Page_All TransactionsKasikornbank/a_Export to Excel'))

// EDC transaction

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/edcTransaction/list?mid=&tid=&approvalCode=&status=&amount=&from=25+May+2023&to=26+May+2023')

WebUI.click(findTestObject('Object Repository/Page_All TransactionsKasikornbank/a_Export CSV files_1'))

WebUI.click(findTestObject('Object Repository/Page_All TransactionsKasikornbank/a_Export to Excel_1'))

// kshop transaction

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocTransaction/list?mid=&tid=&approvalCode=&status=&amount=&from=01+May+2023&to=')

WebUI.click(findTestObject('Object Repository/Page_All Spoc TransactionsKasikornbank/a_Export CSV files'))

WebUI.click(findTestObject('Object Repository/Page_All Spoc TransactionsKasikornbank/a_Export to Excel'))

// un success transaction EDC 

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/edcFailtransaction/list?mid=&tid=&from=25+May+2023&to=26+May+2023')

WebUI.click(findTestObject('Object Repository/Page_Unsuccessful TransactionsKasikornbank/a_Export CSV files'))

// unsuccess transaction mpos

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/failtransaction/list?mid=&mobileUserId=&tid=&from=01+May+2022&to=')

WebUI.click(findTestObject('Object Repository/Page_Unsuccessful TransactionsKasikornbank/a_Export CSV files'))

// Bank user

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/admin/list?role=&status=&from=01+Jan+2023&to=')

WebUI.click(findTestObject('Object Repository/Page_All UsersKasikornbank/a_Export CSV files'))

// Audit trails mpos 

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/admin/auditTrail?action=&from=26+May+2023&to=26+May+2023')

WebUI.click(findTestObject('Object Repository/Page_User ActivitiesKasikornbank/a_Export CSV files'))

// Audit trails EDC 

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/admin/auditTrailEDC?action=&from=26+May+2023&to=26+May+2023')

WebUI.click(findTestObject('Object Repository/Page_User ActivitiesKasikornbank/a_Export CSV files_1'))


// Settlement report mpos

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/creditSettlement/batch?itemid=2985262&batchId=2985262')

WebUI.click(findTestObject('Object Repository/Page_Batch DetailsKasikornbank/a_Download Settlement Report'))

//Settlement report kshop

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocCreditSettlement/batch?itemid=141943&batchId=141943')

WebUI.click(findTestObject('Object Repository/Page_Batch DetailsKasikornbank/a_Download Settlement Report_1'))


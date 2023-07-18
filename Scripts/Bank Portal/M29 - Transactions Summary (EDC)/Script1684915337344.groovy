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

// Search 

WebUI.click(findTestObject('Object Repository/Page_HomeKasikornbank/span_ManageTransactions'))

WebUI.click(findTestObject('Object Repository/Page_All TransactionsKasikornbank/div_Transaction Summary (EDC)'))

WebUI.setText(findTestObject('Object Repository/Page_All TransactionsKasikornbank/input_MID_mid'), '451005440865001')

WebUI.click(findTestObject('Object Repository/Page_All TransactionsKasikornbank/a_Search'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-29 Transactions Summary (EDC)\\Search\\Search Result - MID.png')

WebUI.click(findTestObject('Object Repository/Page_All TransactionsKasikornbank/div_Transaction Summary (EDC)'))

WebUI.setText(findTestObject('Object Repository/Page_All TransactionsKasikornbank/input_Terminal ID (TID)_tid'), '60778238')

WebUI.click(findTestObject('Object Repository/Page_All TransactionsKasikornbank/a_Search'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-29 Transactions Summary (EDC)\\Search\\Search Result - TID.png')

WebUI.click(findTestObject('Object Repository/Page_All TransactionsKasikornbank/div_Transaction Summary (EDC)'))

WebUI.setText(findTestObject('Object Repository/Page_All TransactionsKasikornbank/input_Approval Code_approvalCode'), '000192')

WebUI.click(findTestObject('Object Repository/Page_All TransactionsKasikornbank/a_Search'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-29 Transactions Summary (EDC)\\Search\\Search Result - Approval Code.png')

WebUI.click(findTestObject('Object Repository/Page_All TransactionsKasikornbank/div_Transaction Summary (EDC)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_All TransactionsKasikornbank/select_Select OneApprovedReversedVoidedPend_b2f300'), 
    'Approved', true)

WebUI.click(findTestObject('Object Repository/Page_All TransactionsKasikornbank/a_Search'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-29 Transactions Summary (EDC)\\Search\\Search Result - Status.png')

WebUI.click(findTestObject('Object Repository/Page_All TransactionsKasikornbank/div_Transaction Summary (EDC)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_All TransactionsKasikornbank/select_Select OneBelow THB 999THB 1,000 - 9_a8977a'), 
    'Below THB 999', true)

WebUI.click(findTestObject('Object Repository/Page_All TransactionsKasikornbank/a_Search'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-29 Transactions Summary (EDC)\\Search\\Search Result - Amount.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/edcTransaction/list?mid=&tid=&approvalCode=&status=&amount=&from=01+May+2023&to=02+May+2023')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-29 Transactions Summary (EDC)\\Search\\Search Result - Create date.png')

// Details
WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/edcTransaction/viewDetails?itemid=890841')
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-29 Transactions Summary (EDC)\\Transactions Summary (EDC) - Details.png')

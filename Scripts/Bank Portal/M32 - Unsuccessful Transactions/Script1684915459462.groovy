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

WebUI.click(findTestObject('Object Repository/Page_HomeKasikornbank/span_ManageTransactions'))

WebUI.click(findTestObject('Object Repository/Page_All TransactionsKasikornbank/div_Unsuccessful Transaction'))

WebUI.setText(findTestObject('Object Repository/Page_Unsuccessful TransactionsKasikornbank/input_MID_mid'), '401000781216001')

WebUI.click(findTestObject('Object Repository/Page_Unsuccessful TransactionsKasikornbank/a_Search'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-32 Unsuccess transaction\\Search\\Search Result - MID.png')

WebUI.click(findTestObject('Object Repository/Page_Unsuccessful TransactionsKasikornbank/div_Unsuccessful Transaction'))

WebUI.setText(findTestObject('Object Repository/Page_Unsuccessful TransactionsKasikornbank/input_MID_mid'), 'pice')

WebUI.click(findTestObject('Object Repository/Page_Unsuccessful TransactionsKasikornbank/a_Search'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-32 Unsuccess transaction\\Search\\Search Result - Staff Name.png')

WebUI.click(findTestObject('Object Repository/Page_Unsuccessful TransactionsKasikornbank/div_Unsuccessful Transaction'))

WebUI.setText(findTestObject('Object Repository/Page_Unsuccessful TransactionsKasikornbank/input_Terminal ID (TID)_tid'), 
    '29722981')

WebUI.click(findTestObject('Object Repository/Page_Unsuccessful TransactionsKasikornbank/a_Search'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-32 Unsuccess transaction\\Search\\Search Result - TID.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/failtransaction/list?mid=&mobileUserId=&tid=&from=01+Jan+2023&to=')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-32 Unsuccess transaction\\Search\\Search Result - Create Date.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/failtransaction/viewDetails?itemid=924780')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-32 Unsuccess transaction\\Details.png')



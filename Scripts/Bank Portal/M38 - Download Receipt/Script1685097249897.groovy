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

// Reciept mpos

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/transaction/viewDetails?itemid=4832463')

WebUI.click(findTestObject('Object Repository/Page_Transaction DetailsKasikornbank/h2_Sales Description'))

WebUI.click(findTestObject('Object Repository/Page_Transaction DetailsKasikornbank/h2_Customer Details'))

WebUI.click(findTestObject('Object Repository/Page_Transaction DetailsKasikornbank/h2_Receipt Details'))

WebUI.click(findTestObject('Object Repository/Page_Transaction DetailsKasikornbank/h2_Transaction Details'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-38 Download Receipt\\mPOS\\mpos Reciept.png')

WebUI.click(findTestObject('Object Repository/Page_Transaction DetailsKasikornbank/a_Merchant Receipt (PDF)'))

WebUI.click(findTestObject('Object Repository/Page_Transaction DetailsKasikornbank/a_Customer Receipt (PDF)'))

WebUI.click(findTestObject('Object Repository/Page_Transaction DetailsKasikornbank/a_Void Receipt (PDF)'))

// Reciept kshop

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocTransaction/viewDetails?itemid=186447')

WebUI.click(findTestObject('Object Repository/Page_Transaction DetailsKasikornbank/h2_Sales Description'))

WebUI.click(findTestObject('Object Repository/Page_Transaction DetailsKasikornbank/h2_Customer Details'))

WebUI.click(findTestObject('Object Repository/Page_Transaction DetailsKasikornbank/h2_Receipt Details'))

WebUI.click(findTestObject('Object Repository/Page_Transaction DetailsKasikornbank/h2_Transaction Details'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-38 Download Receipt\\SPoC\\Spoc Reciept.png')

WebUI.click(findTestObject('Object Repository/Page_Transaction DetailsKasikornbank/a_Merchant Receipt (PDF)_1'))

WebUI.click(findTestObject('Object Repository/Page_Transaction DetailsKasikornbank/a_Customer Receipt (PDF)_1'))

WebUI.click(findTestObject('Object Repository/Page_Transaction DetailsKasikornbank/a_Void Receipt (PDF)_1'))
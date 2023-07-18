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

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com')

WebUI.setText(findTestObject('Object Repository/Page_LOGINKasikornbank/input_Submit_j_username'), 'prasopchock@digio.co.th')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_LOGINKasikornbank/input_Submit_j_password'), '2301MRzFZB0NVRpbiBsoLw==')

WebUI.click(findTestObject('Object Repository/Page_LOGINKasikornbank/a_Submit'))


WebUI.navigateToUrl('https://mpostest1.kasikornbank.com/transaction/viewDetails?itemid=4832463')
WebUI.click(findTestObject('Object Repository/Page_Transaction DetailsKasikornbank/h2_Sales Description'))
WebUI.click(findTestObject('Object Repository/Page_Transaction DetailsKasikornbank/h2_Customer Details'))
WebUI.click(findTestObject('Object Repository/Page_Transaction DetailsKasikornbank/h2_Receipt Details'))
WebUI.click(findTestObject('Object Repository/Page_Transaction DetailsKasikornbank/h2_Transaction Details'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal mPOS\\M-08 Transaction Summary\\Transaction Details.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com/transaction/list?tid=29722981&approvalCode=&status=&amount=&from=01+Jun+2022&to=08+Jun+2023')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal mPOS\\M-08 Transaction Summary\\Search\\Search Result - TID.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com/transaction/list?tid=&approvalCode=178340&status=&amount=&from=01+Jun+2022&to=08+Jun+2023')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal mPOS\\M-08 Transaction Summary\\Search\\Search Result - Approval Code.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com/transaction/list?tid=&approvalCode=&status=Voided&amount=&from=01+Jun+2022&to=08+Jun+2023')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal mPOS\\M-08 Transaction Summary\\Search\\Search Result - Status.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com/transaction/list?tid=&approvalCode=&status=&amount=THB+0+-+999&from=01+Jun+2022&to=08+Jun+2023')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal mPOS\\M-08 Transaction Summary\\Search\\Search Result - Amount.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com/transaction/list?tid=&approvalCode=&status=&amount=&from=01+Jun+2022&to=08+Jun+2023')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal mPOS\\M-08 Transaction Summary\\Search\\Search Result - Create date.png')
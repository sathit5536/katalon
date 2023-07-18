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

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com/spoc')

WebUI.setText(findTestObject('Object Repository/Page_LOGINKasikornbank/input_Submit_j_username'), 'test@test.test')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_LOGINKasikornbank/input_Submit_j_password'), '2301MRzFZB0NVRpbiBsoLw==')

WebUI.click(findTestObject('Object Repository/Page_LOGINKasikornbank/a_Submit'))

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com/spoc/transaction/viewDetails?itemid=196449')

WebUI.click(findTestObject('Object Repository/Page_Transaction DetailsKasikornbank/h2_Sales Description'))

WebUI.click(findTestObject('Object Repository/Page_Transaction DetailsKasikornbank/h2_Customer Details'))

WebUI.click(findTestObject('Object Repository/Page_Transaction DetailsKasikornbank/h2_Receipt Details'))

WebUI.click(findTestObject('Object Repository/Page_Transaction DetailsKasikornbank/h2_Transaction Details'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal KShop\\M-07 Transaction Summary\\Transaction Details.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com/spoc/transaction/list?tid=43000071&approvalCode=&status=&amount=&from=01+Jan+2023&to=09+Jun+2023')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal KShop\\M-07 Transaction Summary\\Search\\Search result - TID.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com/spoc/transaction/list?tid=&approvalCode=102520&status=&amount=&from=01+Jan+2023&to=09+Jun+2023')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal KShop\\M-07 Transaction Summary\\Search\\Search result - Approval Code.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com/spoc/transaction/list?tid=&approvalCode=&status=Voided&amount=&from=01+Jan+2023&to=09+Jun+2023')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal KShop\\M-07 Transaction Summary\\Search\\Search result - Status.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com/spoc/transaction/list?tid=&approvalCode=&status=&amount=THB+0+-+999&from=01+Jan+2023&to=09+Jun+2023')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal KShop\\M-07 Transaction Summary\\Search\\Search result - Amount.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com/spoc/transaction/list?tid=&approvalCode=&status=&amount=&from=01+Jan+2023&to=09+Jun+2023')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal KShop\\M-07 Transaction Summary\\Search\\Search result - Create date.png')

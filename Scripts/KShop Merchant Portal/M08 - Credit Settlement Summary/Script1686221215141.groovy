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

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com/spoc/creditSettlement/batch?itemid=151944&batchId=151944')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal KShop\\M-08 Credit Settlement\\Batch Details.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com/spoc/creditSettlement/search?search=000240')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal KShop\\M-08 Credit Settlement\\Search\\Search result - Batch No.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com/spoc/creditSettlement/list?tid=43000071&muid=&status=&from=01+Jan+2023&to=09+Jun+2023')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal KShop\\M-08 Credit Settlement\\Search\\Search result - TID.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com/spoc/creditSettlement/list?tid=&muid=KB000000512534&status=&from=01+Jan+2023&to=09+Jun+2023')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal KShop\\M-08 Credit Settlement\\Search\\Search result - Staff name.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com/spoc/creditSettlement/list?tid=&muid=&status=Successful&from=01+Jan+2023&to=09+Jun+2023')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal KShop\\M-08 Credit Settlement\\Search\\Search result - Status.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com/spoc/creditSettlement/list?tid=&muid=&status=&from=01+Jan+2023&to=')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal KShop\\M-08 Credit Settlement\\Search\\Search result - Create date.png')
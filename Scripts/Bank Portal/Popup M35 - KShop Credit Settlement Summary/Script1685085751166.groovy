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

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocCreditSettlement/batch?itemid=151944&batchId=151944')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-35 Kshop Credit Settlement Summary\\Batch Details.png')

WebUI.click(findTestObject('Object Repository/Page_HomeKasikornbank/span_ManageCredit Settlements'))

WebUI.click(findTestObject('Page_All K SHOP SettlementsKasikornbank/div_K SHOP Settlement Summary'))

WebUI.setText(findTestObject('Object Repository/Page_All K SHOP SettlementsKasikornbank/input_Search_search'), '000238')

WebUI.click(findTestObject('Object Repository/Page_All K SHOP SettlementsKasikornbank/a_Search'))

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocCreditSettlement/list?tid=43000071&muid=&status=&from=01+Jan+2023&to=')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-35 Kshop Credit Settlement Summary\\Search\\Search - TID.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocCreditSettlement/list?tid=&muid=KB000000512534&status=&from=01+Jan+2023&to=02+Jun+2023')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-35 Kshop Credit Settlement Summary\\Search\\Search - Staff name.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocCreditSettlement/list?tid=&muid=&status=Successful&from=01+Jan+2023&to=02+Jun+2023')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-35 Kshop Credit Settlement Summary\\Search\\Search - Status.png')

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/spocCreditSettlement/list?tid=&muid=&status=&from=01+Feb+2023&to=02+Jun+2023')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\M-35 Kshop Credit Settlement Summary\\Search\\Search - Create date.png')

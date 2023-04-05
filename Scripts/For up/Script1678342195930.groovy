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

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/company/viewDetails?itemid=90083')

WebUI.click(findTestObject('Object Repository/Page_Company DetailsKasikornbank/a_View Details'))

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/company/viewManageGroup?itemid=90253')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage GroupKasikornbank/select_Select OneEdit profileSuspend MID'),
	'suspendMid', true)

WebUI.click(findTestObject('Object Repository/Page_Manage GroupKasikornbank/a_Go'))

WebUI.setText(findTestObject('Object Repository/Page_Suspend MIDKasikornbank/textarea_Suspend MID Reason 1_remarks'), 'Test Suspend MID By Automate')
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-08 Merchant GroupMID\\Suspend\\Suspend MID - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Suspend MIDKasikornbank/a_Submit'))
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-08 Merchant GroupMID\\Suspend\\Suspend MID - 2.png')

WebUI.click(findTestObject('Object Repository/Page_Suspend MIDKasikornbank/div_Your request is successful'))

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/company/viewDetails?itemid=90083')

WebUI.click(findTestObject('Object Repository/Page_Company DetailsKasikornbank/a_View Details'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage GroupKasikornbank/select_Select OneEdit profileReinstate MID'), 
    'activateMid', true)

WebUI.click(findTestObject('Object Repository/Page_Manage GroupKasikornbank/a_Go'))

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/company/activateMid?itemid=175141')

WebUI.setText(findTestObject('Object Repository/Page_Activate MIDKasikornbank/textarea_Activate MID Reason 1_remarks'), 
    'Reinstate MID By Automate')
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-08 Merchant GroupMID\\Reinstate\\Reinstate MID - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Activate MIDKasikornbank/a_Submit'))
WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\M-08 Merchant GroupMID\\Reinstate\\Reinstate MID - 2.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Reinstate MIDKasikornbank/div_Your request is successful'), 
    'Your request is successful')


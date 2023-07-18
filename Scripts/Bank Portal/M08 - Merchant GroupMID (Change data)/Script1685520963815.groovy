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

// Add MID *********************************************************************************************************************************************
WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/company/viewDetails?itemid=90083')

WebUI.click(findTestObject('Object Repository/Page_Company DetailsKasikornbank/a_Add MID'))

WebUI.click(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/a_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/span_Please add Merchant ID'), 
    'Please add Merchant ID')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\Bank Potal\\M-08 Merchant GroupMID\\Add MID\\Add MID - No Add Data.png')

WebUI.refresh()

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/company/addMid?itemid=90253')

WebUI.click(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/a_Add Merchant ID_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/div_Please enter valid MID'), 
    'Please enter valid MID')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\Bank Potal\\M-08 Merchant GroupMID\\Add MID\\Add MID - No Input.png')

WebUI.refresh()

WebUI.setText(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/input_Merchant ID (MID)_mid'), '111111111111111')

WebUI.setText(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/input_Merchant Name_midName'), 'Test Automate')

WebUI.click(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/a_Add Merchant ID_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/div_Duplicate MID'), 'Duplicate MID')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\Bank Potal\\M-08 Merchant GroupMID\\Add MID\\Add MID - Duplicate MID.png')

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/div_Merchant ID (MID)Duplicate MIDMerchant _2c50cd'))

'Change Every test'
WebUI.setText(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/input_Merchant ID (MID)_mid'), '123234345234402')

WebUI.setText(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/input_Merchant Name_midName'), 'Test Automate')

WebUI.click(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/a_Add Merchant ID_1'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\Bank Potal\\M-08 Merchant GroupMID\\Add MID\\Add MID - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\Bank Potal\\M-08 Merchant GroupMID\\Add MID\\Add MID - 2.png')

WebUI.click(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/a_Confirm'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\Bank Potal\\M-08 Merchant GroupMID\\Add MID\\Add MID - 3.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/div_Your request is successful'), 
    'Your request is successful')

// Edit Merchant Group *********************************************************************************************************************************************
WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/company/viewDetails?itemid=90083')

WebUI.click(findTestObject('Object Repository/Page_Company DetailsKasikornbank/a_View Details'))

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/company/viewManageGroup?itemid=90253')

WebUI.click(findTestObject('Object Repository/Page_Manage GroupKasikornbank/a_Edit Group Details'))

WebUI.setText(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/textarea_Remarks_remark'), 'Test Edit by Automate')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\Bank Potal\\M-08 Merchant GroupMID\\Edit\\Edit Merchant group\\Edit Merchant group - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\Bank Potal\\M-08 Merchant GroupMID\\Edit\\Edit Merchant group\\Edit Merchant group - 2.png')

WebUI.click(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/a_Confirm'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\Bank Potal\\M-08 Merchant GroupMID\\Edit\\Edit Merchant group\\Edit Merchant group - 3.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/div_Your request is successful'), 
    'Your request is successful')

// Edit Merchant Profile  *********************************************************************************************************************************************
WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/company/viewDetails?itemid=90083')

WebUI.click(findTestObject('Object Repository/Page_Company DetailsKasikornbank/a_View Details'))

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/company/viewManageGroup?itemid=90253')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage GroupKasikornbank/select_Select OneEdit profileSuspend MID'), 
    '/company/editMid', true)

WebUI.click(findTestObject('Object Repository/Page_Manage GroupKasikornbank/a_Go'))

WebUI.setText(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/textarea_Remarks_remark'), 'Test Edit Profile by Automate')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\Bank Potal\\M-08 Merchant GroupMID\\Edit\\Edit Merchant Profile\\Edit Merchant Profile - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\Bank Potal\\M-08 Merchant GroupMID\\Edit\\Edit Merchant Profile\\Edit Merchant Profile - 2.png')

WebUI.click(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/a_Confirm'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\Bank Potal\\M-08 Merchant GroupMID\\Edit\\Edit Merchant Profile\\Edit Merchant Profile - 3.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Edit Company DetailsKasikornbank/div_Your request is successful'), 
    'Your request is successful')

// Suspend MID *********************************************************************************************************************************************
WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/company/viewDetails?itemid=90083')

WebUI.click(findTestObject('Object Repository/Page_Company DetailsKasikornbank/a_View Details'))

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/company/viewManageGroup?itemid=90253')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage GroupKasikornbank/select_Select OneEdit profileSuspend MID'), 
    'suspendMid', true)

WebUI.click(findTestObject('Object Repository/Page_Manage GroupKasikornbank/a_Go'))

WebUI.setText(findTestObject('Object Repository/Page_Suspend MIDKasikornbank/textarea_Suspend MID Reason 1_remarks'), 'Test Suspend MID By Automate')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\Bank Potal\\M-08 Merchant GroupMID\\Suspend\\Suspend MID - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Suspend MIDKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\Bank Potal\\M-08 Merchant GroupMID\\Suspend\\Suspend MID - 2.png')

WebUI.click(findTestObject('Object Repository/Page_Suspend MIDKasikornbank/div_Your request is successful'))

// Reinstate MID  *********************************************************************************************************************************************
WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/company/viewDetails?itemid=90083')

WebUI.click(findTestObject('Object Repository/Page_Company DetailsKasikornbank/a_View Details'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Manage GroupKasikornbank/select_Select OneEdit profileReinstate MID'), 
    'activateMid', true)

WebUI.click(findTestObject('Object Repository/Page_Manage GroupKasikornbank/a_Go'))

WebUI.navigateToUrl('https://mpostest1.kasikornbank.com:7443/company/activateMid?itemid=175141')

WebUI.setText(findTestObject('Object Repository/Page_Activate MIDKasikornbank/textarea_Activate MID Reason 1_remarks'), 
    'Reinstate MID By Automate')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\Bank Potal\\M-08 Merchant GroupMID\\Reinstate\\Reinstate MID - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Activate MIDKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Bank Potal\\Bank Potal\\M-08 Merchant GroupMID\\Reinstate\\Reinstate MID - 2.png')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Reinstate MIDKasikornbank/div_Your request is successful'), 
    'Your request is successful')


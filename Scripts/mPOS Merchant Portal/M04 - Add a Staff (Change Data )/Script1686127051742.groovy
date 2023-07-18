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

WebUI.click(findTestObject('Object Repository/Page_HomeKasikornbank/span_ManageStaffs'))

WebUI.click(findTestObject('Object Repository/Page_All StaffsKasikornbank/div_Add a Staff'))

WebUI.click(findTestObject('Object Repository/Page_Add a StaffKasikornbank/input_Staff Name_mobileUserId'))

WebUI.click(findTestObject('Object Repository/Page_Add a StaffKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal mPOS\\M-04 Add A Staff\\Add Staff - No input.png')

WebUI.click(findTestObject('Object Repository/Page_Add a StaffKasikornbank/div_Add a Staff'))

'Change every test'
WebUI.setText(findTestObject('Object Repository/Page_Add a StaffKasikornbank/input_Staff Name_mobileUserId'), 'Automate003')

WebUI.setText(findTestObject('Object Repository/Page_Add a StaffKasikornbank/input_Name_name'), 'Automate merchant')

WebUI.setText(findTestObject('Object Repository/Page_Add a StaffKasikornbank/input_Contact No_contact'), '0900000000')

WebUI.setText(findTestObject('Object Repository/Page_Add a StaffKasikornbank/input_Email Address_email'), 'Test003@automate.test')

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal mPOS\\M-04 Add A Staff\\Add Staff - 1.png')

WebUI.click(findTestObject('Object Repository/Page_Add a StaffKasikornbank/input_test_paymentSelected'))

WebUI.click(findTestObject('Object Repository/Page_Add a StaffKasikornbank/input_test_paymentSelected'))

WebUI.click(findTestObject('Object Repository/Page_Add a StaffKasikornbank/a_Submit'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal mPOS\\M-04 Add A Staff\\Add Staff - 2.png')

WebUI.click(findTestObject('Object Repository/Page_Add a StaffKasikornbank/a_Confirm'))

WebUI.takeFullPageScreenshot('C:\\Users\\PIKA\\Katalon Studio\\katalon.git\\Test Capture\\Merchant Portal mPOS\\M-04 Add A Staff\\Add Staff - 3.png')


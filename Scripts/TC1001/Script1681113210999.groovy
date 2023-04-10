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

WebUI.openBrowser('https://twitter.com/?lang=th')

WebUI.click(findTestObject('Re_click'))

WebUI.click(findTestObject('Re_click2'))

WebUI.verifyTextPresent('สร้างบัญชีของคุณ', false)

WebUI.setText(findTestObject('Name'), 'Tita')

WebUI.click(findTestObject('U_Em'))

WebUI.setText(findTestObject('Email'), '12345qweqweweee@gmail.com')

WebUI.selectOptionByLabel(findTestObject('Page_/month'), 'มกราคม', false)

WebUI.selectOptionByLabel(findTestObject('Page_/day'), '5', false)

WebUI.selectOptionByLabel(findTestObject('Page_/y'), '2005', false)

WebUI.click(findTestObject('Page_/next'))

WebUI.click(findTestObject('Page_/next'))

WebUI.verifyTextPresent('ขั้นตอนที่ 3 จาก 5', false)


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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('G:\\accpartner.apk', false)

Mobile.tap(findTestObject('Info dan Berita Acc/Lihat Semua'), 0)

WebUI.delay(2)

not_run: Mobile.tap(findTestObject('Info dan Berita Acc/Info dan Berita Option 1'), 0)

not_run: WebUI.delay(2)

not_run: Mobile.tap(findTestObject('Info dan Berita Acc/Btn Back Info dan Berita'), 0)

not_run: WebUI.delay(2)

not_run: Mobile.tap(findTestObject('Info dan Berita Acc/Info dan Berita Option 2'), 0)

not_run: WebUI.delay(2)

not_run: Mobile.tap(findTestObject('Info dan Berita Acc/Btn Back Info dan Berita'), 0)

not_run: WebUI.delay(2)

Mobile.tap(findTestObject('Info dan Berita Acc/Info dan Berita Option 3'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('Info dan Berita Acc/Btn Back Info dan Berita'), 0)

WebUI.delay(2)

not_run: Mobile.setText(findTestObject('Info dan Berita Acc/Search Box info dan berita'), search1, 0)

not_run: Mobile.tap(findTestObject('Info dan Berita Acc/Info dan Berita Option 1'), 0)

not_run: WebUI.delay(2)

not_run: Mobile.tap(findTestObject('Info dan Berita Acc/Btn Back Info dan Berita'), 0)

not_run: Mobile.setText(findTestObject('Info dan Berita Acc/Search Box info dan berita'), search2, 0)

not_run: Mobile.tap(findTestObject('Info dan Berita Acc/Info dan Berita Option 2'), 0)

not_run: WebUI.delay(2)

not_run: Mobile.tap(findTestObject('Info dan Berita Acc/Btn Back Info dan Berita'), 0)

Mobile.setText(findTestObject('Info dan Berita Acc/Search Box info dan berita'), search3, 0)

Mobile.tap(findTestObject('Info dan Berita Acc/Info dan Berita Option 3'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('Info dan Berita Acc/Btn Back Info dan Berita'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('Info dan Berita Acc/Back to Main Menu'), 0)

Mobile.closeApplication()


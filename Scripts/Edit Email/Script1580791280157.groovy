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

Mobile.tap(findTestObject('ViewProfileObject/HomeBtnProfile'), 0)

Mobile.tap(findTestObject('ViewProfileObject/ViewProfile'), 0)

not_run: Mobile.verifyElementVisible(findTestObject('Edit No.hp dan Email/Status - Terverifikasi'), 0)

Mobile.tap(findTestObject('Edit No.hp dan Email/Btn Edit Email'), 0)

Mobile.setText(findTestObject('Edit No.hp dan Email/Set Email Lama'), 'fityanardi24@gmail.com', 0)

Mobile.setText(findTestObject('Edit No.hp dan Email/Set Email Baru'), 'Gery.testacc@gmail.com', 0)

Mobile.tap(findTestObject('Edit No.hp dan Email/Btn Ubah Edit No.hp dan Email'), 0)

Mobile.tap(findTestObject('ViewProfileObject/Back to Profile'), 0)

Mobile.tap(findTestObject('ViewProfileObject/ViewProfile'), 0)

Mobile.tap(findTestObject('ViewProfileObject/Back to Profile'), 0)

not_run: Mobile.tap(findTestObject('ViewProfileObject/btnKeluar'), 0)

not_run: Mobile.tap(findTestObject('ViewProfileObject/btnYa Keluar'), 0)

Mobile.closeApplication()


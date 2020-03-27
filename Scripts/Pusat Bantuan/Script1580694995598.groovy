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

Mobile.tap(findTestObject('View Profile/HomeBtnProfile'), 0)

Mobile.tap(findTestObject('Pusat Bantuan/Pusat Bantuan'), 0)

if (expectedlogin == 'passed') {
    Mobile.tap(findTestObject('Pusat Bantuan/FAQ - Q1'), 0)

    Mobile.verifyElementVisible(findTestObject('Pusat Bantuan/FAQ - A1'), 0)

    Mobile.tap(findTestObject('Pusat Bantuan/FAQ - Q2'), 0)

    Mobile.verifyElementVisible(findTestObject('Pusat Bantuan/FAQ - A2'), 0)

    Mobile.tap(findTestObject('Pusat Bantuan/FAQ - Q3'), 0)

    Mobile.verifyElementVisible(findTestObject('Pusat Bantuan/FAQ - A3'), 0)
}

Mobile.setText(findTestObject('Pusat Bantuan/Search box FAQ'), search, 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Pusat Bantuan/Search box FAQ'), search2, 0)

Mobile.tap(findTestObject('Pusat Bantuan/back To Profille'), 0)

Mobile.closeApplication()


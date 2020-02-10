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

not_run: WebUI.callTestCase(findTestCase('StartApplication_Uninstall_True'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.startApplication('C:\\Users\\asus\\git\\baru fix\\ACC-ACCPartner\\accpartner (2).apk', false)

Mobile.waitForElementPresent(findTestObject('Daftar/tap_daftar'), 0)

Mobile.tap(findTestObject('Daftar/tap_daftar'), 0)

Mobile.tap(findTestObject('Daftar/tap_referral_code'), 0)

if (dealer_info == 'DSO Ciputat') {
    Mobile.setText(findTestObject('Daftar/input_referral_code'), '74DIGC', 0)
} else if (dealer_info == 'TSO Kelapa Gading') {
    Mobile.setText(findTestObject('Daftar/input_referral_code'), 'U4BWIK', 0)
} else {
    Mobile.setText(findTestObject('Daftar/input_referral_code'), var_referral, 0)
}

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)


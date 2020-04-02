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

if (var_opsi_otp == 'hp') {
    Mobile.tap(findTestObject('forgot username/tap - hp otp'), 0)

    Mobile.setText(findTestObject('forgot username/input otp - (1)'), var_otp1, 0)

    Mobile.setText(findTestObject('forgot username/input otp - (2)'), var_otp2, 0)

    Mobile.setText(findTestObject('forgot username/input otp - (3)'), var_otp3, 0)

    Mobile.setText(findTestObject('forgot username/input otp - (4)'), var_otp4, 0)

    Mobile.setText(findTestObject('forgot username/input otp - (5)'), var_otp5, 0)

    Mobile.setText(findTestObject('forgot username/input otp - (6)'), var_otp6, 0)

    Mobile.tap(findTestObject('forgot username/btn - Verifikasi OTP'), 0)
} else if (var_opsi_otp == 'email') {
    Mobile.tap(findTestObject('forgot username/tap - email otp'), 0)

    Mobile.delay(60, FailureHandling.STOP_ON_FAILURE)

    not_run: Mobile.setText(findTestObject('forgot username/input otp - (1)'), var_otp1, 0)

    not_run: Mobile.setText(findTestObject('forgot username/input otp - (2)'), var_otp2, 0)

    not_run: Mobile.setText(findTestObject('forgot username/input otp - (3)'), var_otp3, 0)

    not_run: Mobile.setText(findTestObject('forgot username/input otp - (4)'), var_otp4, 0)

    not_run: Mobile.setText(findTestObject('forgot username/input otp - (5)'), var_otp5, 0)

    not_run: Mobile.setText(findTestObject('forgot username/input otp - (6)'), var_otp6, 0)

    Mobile.tap(findTestObject('forgot username/btn - Verifikasi OTP Email'), 0)
}


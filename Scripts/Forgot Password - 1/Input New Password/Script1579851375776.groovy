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

Mobile.tap(findTestObject('Forgot Password/tap_new_password'), 0)

Mobile.setText(findTestObject('Forgot Password/input_new_password'), var_new_password, 0)

Mobile.tap(findTestObject('Forgot Password/input_confirm_password'), 0)

Mobile.setText(findTestObject('Forgot Password/input_confirm_password'), var_confirm_new_password, 0)

Mobile.tap(findTestObject('Forgot Password/btn_confirm_new_password'), 0)

switch (expected_status) {
    case 'passed':
        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        break
    case 'failedEmptyField':
        Mobile.tap(findTestObject('Forgot Password/warn_is_empty_new_password'), 0)

        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        break
    case 'failedLengthChar':
        Mobile.tap(findTestObject('Forgot Password/warn_length_pass'), 0)

        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        break
    case 'failedPasswordIsNotMatch':
        Mobile.tap(findTestObject('Forgot Password/warn_new_password_is_not_match'), 0)

        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        break
}


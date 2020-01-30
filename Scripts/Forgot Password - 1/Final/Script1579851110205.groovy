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

not_run: Mobile.startApplication('C:\\Users\\asus\\Katalon Studio\\Task ACC Partner\\accpartner.apk', true)

not_run: Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('StartApplication'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Forgot Password/tap_forgot_password'), 0)

Mobile.tap(findTestObject('Forgot Password/tap_forgot_username'), 0)

Mobile.setText(findTestObject('Forgot Password/input_forgot_username'), var_forgot_username, 0)

Mobile.tap(findTestObject('Forgot Password/button_forgot_confirm'), 0)

switch (expected_username) {
    case 'passed':
        if (opt_otp == 'phone') {
            Mobile.tap(findTestObject('Forgot Password/tap_otp_phone_number'), 0)

            Mobile.delay(60, FailureHandling.STOP_ON_FAILURE)

            Mobile.tap(findTestObject('Forgot Password/btn_verif_otp'), 0, FailureHandling.OPTIONAL)

            if (expected_otp == 'passed') {
                WebUI.callTestCase(findTestCase('Forgot Password - 1/Input New Password'), [('var_new_password') : var_new_password
                        , ('var_confirm_new_password') : var_confirm_new_password, ('expected_status') : expected_status], 
                    FailureHandling.STOP_ON_FAILURE)
            } else if (expected_otp == 'failedWrongCode') {
                Mobile.verifyElementVisible(findTestObject('Forgot Password/warn_wrong_verification_code'), 0)
            } else if (expected_otp == 'failedEmptyField') {
                Mobile.verifyElementVisible(findTestObject('Forgot Password/warn_empty_fieldd'), 0)

                Mobile.closeApplication()
            }
        } else if (opt_otp == 'email') {
            Mobile.tap(findTestObject('Forgot Password/tap_otp_email'), 0)

            Mobile.delay(60, FailureHandling.STOP_ON_FAILURE)

            Mobile.tap(findTestObject('Forgot Password/btn_verif_otp_email'), 0)

            if (expected_otp == 'passed') {
                WebUI.callTestCase(findTestCase('Forgot Password - 1/Input New Password'), [('var_new_password') : var_new_password
                        , ('var_confirm_new_password') : var_confirm_new_password, ('expected_status') : expected_status], 
                    FailureHandling.STOP_ON_FAILURE)
            } else if (expected_otp == 'failedWrongCode') {
                Mobile.verifyElementVisible(findTestObject('Forgot Password/warn_wrong_verification_code'), 0)
            } else if (expected_otp == 'failedEmptyField') {
                Mobile.verifyElementVisible(findTestObject('Forgot Password/warn_empty_fieldd'), 0)
            }
        }
        
        break
    case 'failedEmptyUsername':
        Mobile.verifyElementVisible(findTestObject('Forgot Password/warn_forgot_username_is_empty'), 0, FailureHandling.CONTINUE_ON_FAILURE)

        break
    case 'failedUsernameNotMatch':
        Mobile.verifyElementVisible(findTestObject('Forgot Password/warn_forgot_username_not_match'), 0, FailureHandling.CONTINUE_ON_FAILURE)

        break
}

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()


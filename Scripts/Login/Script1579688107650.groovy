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

WebUI.callTestCase(findTestCase('StartApplication_Uninstall_True'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.startApplication('C:\\Users\\asus\\Katalon Studio\\Task ACC Partner\\accpartner.apk', true)

Mobile.tap(findTestObject('Login/tap_username'), 0)

Mobile.setText(findTestObject('Login/input_username'), var_username, 0)

Mobile.tap(findTestObject('Login/tap_password'), 0)

Mobile.setText(findTestObject('Login/input_password'), var_password, 0)

Mobile.tap(findTestObject('Login/button_masuk'), 0)

if (expected_login == 'passed') {
    Mobile.verifyElementVisible(findTestObject('Login/warn_login_success'), 0)

    if (press_back_button == 'yes') {
        Mobile.pressBack()

        if (close_app == 'yes') {
            Mobile.tap(findTestObject('Login/button_close_yes'), 0)

            Mobile.closeApplication()
        } else if (close_app == 'no') {
            Mobile.tap(findTestObject('Login/button_close_no'), 0)
        }
    }
} else if (expected_login == 'failed') {
    switch (status_login) {
        case 'ErrorLengthPassword':
            Mobile.verifyElementVisible(findTestObject('Login/warn_error_length_password'), 0)

            break
        case 'ErrorLengthUsername':
            Mobile.verifyElementVisible(findTestObject('Login/warn_error_length_username'), 0)

            break
        case 'UsernameIsEmpty':
            Mobile.verifyElementVisible(findTestObject('Login/warn_username_is_empty'), 0)

            break
        case 'PasswordIsEmpty':
            Mobile.checkElement(findTestObject('Login/warn_password_is_empty'), 0)

            break
        case 'UsernameDoesntExist':
            Mobile.verifyElementVisible(findTestObject('Login/warn_username_doesnt_exist'), 0)

            break
        case 'WrongPassword':
            Mobile.verifyElementVisible(findTestObject('Login/warn_wrong_username_or_password'), 0)

            break
        case 'ErrorLengthUsernamePassword':
            Mobile.verifyElementVisible(findTestObject('Login/warn_error_length_username'), 0)

            Mobile.verifyElementVisible(findTestObject('Login/warn_error_length_password'), 0)

            break
        case 'WrongPassword3Times':
            for (int i = 0; i < 2; i++) {
                Mobile.clearText(findTestObject('Login/input_password'), 0)

                Mobile.setText(findTestObject('Login/input_password'), var_password, 0)

                Mobile.tap(findTestObject('Login/button_masuk'), 0)
            }
            
            Mobile.verifyElementVisible(findTestObject('Login/warn_wrong_pass_3_times'), 0)

            break
    }
}


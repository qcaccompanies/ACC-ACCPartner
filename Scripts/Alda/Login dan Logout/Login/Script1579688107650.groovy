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

Mobile.waitForElementPresent(findTestObject('Alda/Login/tap_username'), 5)

Mobile.tap(findTestObject('Alda/Login/tap_username'), 0)

Mobile.setText(findTestObject('Alda/Login/input_username'), var_username, 0)

Mobile.tap(findTestObject('Alda/Login/tap_password'), 0)

Mobile.setText(findTestObject('Alda/Login/input_password'), var_password, 0)

Mobile.tap(findTestObject('Alda/Login/button_masuk'), 0)

if (expected_login == 'passed') {
    Mobile.verifyElementVisible(findTestObject('Alda/Login/warn - Hi after login'), 0)

    if (press_back_button == 'yes') {
        Mobile.pressBack()

        Mobile.waitForElementPresent(findTestObject('Alda/Login/tap - Ya'), 0)

        if (close_app == 'yes') {
            Mobile.tap(findTestObject('Alda/Login/tap - Ya'), 0)
        } else if (close_app == 'no') {
            Mobile.tap(findTestObject('Alda/Login/tap - Tidak'), 0)
        }
    }
} else if (expected_login == 'failed') {
    switch (status_login) {
        case 'ErrorLengthPassword':
            Mobile.verifyElementVisible(findTestObject('Alda/Login/warn_error_length_password'), 2, FailureHandling.OPTIONAL)

            break
        case 'ErrorLengthUsername':
            Mobile.verifyElementVisible(findTestObject('Alda/Login/warn_error_length_username'), 2, FailureHandling.OPTIONAL)

            break
        case 'UsernameIsEmpty':
            Mobile.verifyElementVisible(findTestObject('Alda/Login/warn_username_is_empty'), 2, FailureHandling.OPTIONAL)

            break
        case 'PasswordIsEmpty':
            Mobile.verifyElementVisible(findTestObject('Alda/Login/warn_password_is_empty'), 2, FailureHandling.OPTIONAL)

            break
        case 'UsernameDoesntExist':
            Mobile.verifyElementVisible(findTestObject('Alda/Login/warn_username_doesnt_exist'), 2, FailureHandling.OPTIONAL)

            break
        case 'WrongPassword':
            Mobile.verifyElementVisible(findTestObject('Alda/Login/warn_wrong_username_or_password'), 2, FailureHandling.OPTIONAL)

            break
        case 'ErrorLengthUsernamePassword':
            Mobile.verifyElementVisible(findTestObject('Alda/Login/warn_error_length_username'), 2, FailureHandling.OPTIONAL)

            Mobile.verifyElementVisible(findTestObject('Alda/Login/warn_error_length_password'), 2, FailureHandling.OPTIONAL)

            break
        case 'WrongPassword3Times':
            for (int i = 0; i < 2; i++) {
                Mobile.clearText(findTestObject('Alda/Login/input_password'), 2, FailureHandling.OPTIONAL)

                Mobile.setText(findTestObject('Alda/Login/input_password'), var_password, 2, FailureHandling.OPTIONAL)

                Mobile.tap(findTestObject('Alda/Login/button_masuk'), 2, FailureHandling.OPTIONAL)
            }
            
            Mobile.verifyElementVisible(findTestObject('Alda/Login/warn_wrong_pass_3_times'), 2, FailureHandling.OPTIONAL)

            break
    }
    
    Mobile.verifyElementVisible(findTestObject('Alda/Login/button_masuk'), 0, FailureHandling.STOP_ON_FAILURE)
}


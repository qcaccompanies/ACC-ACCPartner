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

Mobile.startApplication('C:\\Users\\ASUS\\Desktop\\accpartner.apk', false)

if (expected_login == 'passed') {
    Mobile.tap(findTestObject('Alda/Logout/tap_akun_new'), 0)

    Mobile.tap(findTestObject('null'), 0)

    Mobile.tap(findTestObject('Alda/Change Password/button_change_password'), 0)

    Mobile.tap(findTestObject('Alda/Change Password/tap_old_password'), 0)

    Mobile.setText(findTestObject('Alda/Change Password/input_old_password'), var_old_password, 0)

    Mobile.tap(findTestObject('Alda/Change Password/tap_new_password'), 0)

    Mobile.setText(findTestObject('Alda/Change Password/input_new_password'), var_new_password, 0)

    Mobile.tap(findTestObject('Alda/Change Password/tap_confirm_new_password'), 0)

    Mobile.setText(findTestObject('Alda/Change Password/input_confirm_new_password'), var_confirm_new_password, 0)

    Mobile.tap(findTestObject('Alda/Change Password/button_confirm_change_password'), 0)

    if (expected_change_password == 'passed') {
        Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

        Mobile.verifyElementNotVisible(findTestObject('Alda/Change Password/button_confirm_change_password'), 3)

        Mobile.tap(findTestObject('Alda/Logout/tap_akun_new'), 0)

        Mobile.tap(findTestObject('Alda/Logout/tap_keluar_new'), 0)

        Mobile.tap(findTestObject('Alda/Logout/tap_ya_logout'), 0)

        Mobile.waitForElementPresent(findTestObject('Alda/Login/tap_username'), 5)

        Mobile.verifyElementVisible(findTestObject('Alda/Login/tap_username'), 0)

        Mobile.tap(findTestObject('Alda/Login/tap_username'), 0)

        Mobile.setText(findTestObject('Alda/Login/input_username'), var_username, 0)

        Mobile.tap(findTestObject('Alda/Login/tap_password'), 0)

        Mobile.setText(findTestObject('Alda/Login/input_password'), var_new_password, 0)

        Mobile.tap(findTestObject('Alda/Login/button_masuk'), 0)

        Mobile.verifyElementVisible(findTestObject('Alda/Login/warn - Hi after login'), 0)

        Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)
    } else if (expected_change_password == 'failed') {
        switch (status_failed.toString()) {
            case 'EmptyField':
                Mobile.verifyElementVisible(findTestObject('Alda/Change Password/warn_empty_password'), 2, FailureHandling.OPTIONAL)

                break
            case 'OldPasswordIsNotMatch':
                Mobile.verifyElementVisible(findTestObject('Alda/Change Password/warn_old_password_is_not_match'), 2, FailureHandling.OPTIONAL)

                break
            case 'InvalidNewPassword':
                Mobile.verifyElementVisible(findTestObject('Alda/Change Password/warn_new_password_invalid'), 2, FailureHandling.OPTIONAL)

                break
            case 'ConfirmNewPasswordIsNotMatch':
                Mobile.verifyElementVisible(findTestObject('Alda/Change Password/warn_confirm_new_password_is_not_match'), 
                    2, FailureHandling.OPTIONAL)

                break
            case 'ErrorLengthPassword':
                Mobile.verifyElementVisible(findTestObject('Alda/Change Password/warn_error_length_password'), 2, FailureHandling.OPTIONAL)

                break
        }
        
        Mobile.verifyElementVisible(findTestObject('Alda/Change Password/button_confirm_change_password'), 0)
    }
}

Mobile.closeApplication()


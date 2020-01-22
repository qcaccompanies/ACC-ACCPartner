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

Mobile.startApplication('F:\\Materi Kuliah (Universitas Atma Jaya Yogyakarta)\\MAGANG\\Task\\accpartner.apk', true)

Mobile.tap(findTestObject('new/tap_forgot_password'), 0)

Mobile.tap(findTestObject('new/tap_forgot_username'), 0)

Mobile.setText(findTestObject('new/input_forgot_username'), var_forgot_username, 0)

Mobile.tap(findTestObject('new/button_forgot_confirm'), 0)

if (expected_username == 'passed') {
    Mobile.verifyElementVisible(findTestObject('new/warn_forgot_verifikasi'), 0)

    if (opt_otp == 'phone') {
        Mobile.tap(findTestObject('new/tap_otp_phone_number'), 0)

        Mobile.setText(findTestObject('new/var_otp_1'), '2', 0)

        Mobile.setText(findTestObject('new/var_otp_2'), '3', 0)

        Mobile.setText(findTestObject('new/var_otp_3'), '2', 0)

        Mobile.setText(findTestObject('new/var_otp_4'), '4', 0)

        Mobile.setText(findTestObject('new/var_otp_5'), '2', 0)

        Mobile.setText(findTestObject('new/var_otp_6'), '5', 0)

        Mobile.tap(findTestObject('new/btn_verif_otp'), 0)
    } else if (opt_otp == 'email') {
        Mobile.tap(findTestObject('new/tap_otp_email'), 0)

        Mobile.setText(findTestObject('new/var_otp_email_1'), '2', 0)

        Mobile.setText(findTestObject('new/var_otp_email_2'), '3', 0)

        Mobile.setText(findTestObject('new/var_otp_email_3'), '2', 0)

        Mobile.setText(findTestObject('new/var_otp_email_4'), '4', 0)

        Mobile.setText(findTestObject('new/var_otp_email_5'), '2', 0)

        Mobile.setText(findTestObject('new/var_otp_email_6'), '5', 0)

        Mobile.tap(findTestObject('new/btn_verif_otp_email'), 0)

        not_run: Mobile.tap(findTestObject('new/warn_empty_otp'), 0)

        not_run: Mobile.tap(findTestObject('new/warn_wrong_otp_email'), 0)
    }
    
    Mobile.tap(findTestObject('new/android.widget.Button0 - Verifikasi'), 0)

    Mobile.tap(findTestObject('new/tap_new_password'), 0)

    Mobile.setText(findTestObject('new/input_new_password'), 'asda', 0)

    Mobile.tap(findTestObject('new/warn_is_empty_new_password'), 0)

    Mobile.tap(findTestObject('new/input_confirm_password'), 0)

    Mobile.setText(findTestObject('new/input_confirm_password'), 'asdfa', 0)

    Mobile.tap(findTestObject('new/warn_length_pass'), 0)

    Mobile.tap(findTestObject('new/warn_new_password_is_not_match'), 0)

    Mobile.tap(findTestObject('new/warn_password_format'), 0)

    Mobile.tap(findTestObject('new/android.widget.Button0 - Konfirmasi'), 0)

    Mobile.closeApplication()
} else if (expected_username == 'failed') {
    Mobile.verifyElementVisible(findTestObject('new/warn_forgot_username_not_match'), 0, FailureHandling.OPTIONAL)

    Mobile.verifyElementVisible(findTestObject('new/warn_forgot_username_is_empty'), 0, FailureHandling.OPTIONAL)
}

Mobile.closeApplication()


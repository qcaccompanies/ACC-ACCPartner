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

Mobile.verifyElementVisible(findTestObject('Alda/Daftar/a - VerifikasiDaftar/warn - Verifikasi untuk Keamanan'), 0)

if (status_verifikasi == 'normal') {
    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    Mobile.setText(findTestObject('Alda/Daftar/new/input_otp_1'), var_otp_1, 0)

    Mobile.setText(findTestObject('Alda/Daftar/new/input_otp_2'), var_otp_2, 0)

    Mobile.setText(findTestObject('Alda/Daftar/new/input_otp_3'), var_otp_3, 0)

    Mobile.setText(findTestObject('Alda/Daftar/new/input_otp_4'), var_otp_4, 0)

    Mobile.setText(findTestObject('Alda/Daftar/new/input_otp_5'), var_otp_5, 0)

    Mobile.setText(findTestObject('Alda/Daftar/new/input_otp_6'), var_otp_6, 0)

    Mobile.tap(findTestObject('Alda/Daftar/a - VerifikasiDaftar/button_verifikasi'), 0)

    switch (expected_verifikasi) {
        case 'passed':
            Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

            Mobile.verifyElementNotVisible(findTestObject('Alda/Daftar/a - VerifikasiDaftar/button_verifikasi'), 2, FailureHandling.OPTIONAL)

            Mobile.waitForElementPresent(findTestObject('Alda/Login/tap_username'), 5)

            Mobile.tap(findTestObject('Alda/Login/tap_username'), 0)

            Mobile.setText(findTestObject('Alda/Login/input_username'), var_username, 0)

            Mobile.tap(findTestObject('Alda/Login/tap_password'), 0)

            Mobile.setText(findTestObject('Alda/Login/input_password'), var_password, 0)

            Mobile.tap(findTestObject('Alda/Login/button_masuk'), 0)

            Mobile.verifyElementVisible(findTestObject('Alda/Login/warn - Hi after login'), 0)

            Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

            Mobile.waitForElementPresent(findTestObject('Alda/Logout/tap_akun_new'), 5)

            Mobile.tap(findTestObject('Alda/Logout/tap_akun_new'), 0)

            Mobile.tap(findTestObject('Alda/Logout/tap_keluar_new'), 0)

            Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

            Mobile.tap(findTestObject('Alda/Logout/tap_ya_logout'), 0)

            break
        case 'failed':
            Mobile.verifyElementVisible(findTestObject('Alda/Daftar/a - VerifikasiDaftar/warn - Kode Verifikasi Anda salah'), 
                2, FailureHandling.OPTIONAL)

            Mobile.verifyElementVisible(findTestObject('Alda/Daftar/a - VerifikasiDaftar/warn - Semua Field Harus Diisi'), 2, 
                FailureHandling.OPTIONAL)

            break
    }
} else if (status_verifikasi == 'kirim_ulang') {
    switch (expected_verifikasi) {
        case 'passed':
            Mobile.delay(90, FailureHandling.STOP_ON_FAILURE)

            Mobile.tap(findTestObject('Alda/Daftar/a - VerifikasiDaftar/tap - Kirim ulang (03)'), 2, FailureHandling.OPTIONAL)

            Mobile.tap(findTestObject('Alda/Daftar/a - VerifikasiDaftar/tap - Kirim ulang (13)'), 2, FailureHandling.OPTIONAL)

            Mobile.tap(findTestObject('Alda/Daftar/a - VerifikasiDaftar/tap - Kirim ulang (23)'), 2, FailureHandling.OPTIONAL)

            Mobile.tap(findTestObject('Alda/Daftar/a - VerifikasiDaftar/tap - Kirim ulang (33)'), 2, FailureHandling.OPTIONAL)

            Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

            Mobile.setText(findTestObject('Alda/Daftar/new/input_otp_1'), var_otp_1, 0)

            Mobile.setText(findTestObject('Alda/Daftar/new/input_otp_2'), var_otp_2, 0)

            Mobile.setText(findTestObject('Alda/Daftar/new/input_otp_3'), var_otp_3, 0)

            Mobile.setText(findTestObject('Alda/Daftar/new/input_otp_4'), var_otp_4, 0)

            Mobile.setText(findTestObject('Alda/Daftar/new/input_otp_5'), var_otp_5, 0)

            Mobile.setText(findTestObject('Alda/Daftar/new/input_otp_6'), var_otp_6, 0)

            Mobile.tap(findTestObject('Alda/Daftar/a - VerifikasiDaftar/button_verifikasi'), 0)

            Mobile.waitForElementPresent(findTestObject('Alda/Login/tap_username'), 5)

            Mobile.tap(findTestObject('Alda/Login/tap_username'), 0)

            Mobile.setText(findTestObject('Alda/Login/input_username'), var_username, 0)

            Mobile.tap(findTestObject('Alda/Login/tap_password'), 0)

            Mobile.setText(findTestObject('Alda/Login/input_password'), var_password, 0)

            Mobile.tap(findTestObject('Alda/Login/button_masuk'), 0)

            Mobile.verifyElementVisible(findTestObject('Alda/Login/warn - Hi after login'), 0)

            Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

            Mobile.waitForElementPresent(findTestObject('Alda/Logout/tap_akun_new'), 5)

            Mobile.tap(findTestObject('Alda/Logout/tap_akun_new'), 0)

            Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

            Mobile.tap(findTestObject('Alda/Logout/tap_keluar_new'), 0)

            Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

            Mobile.tap(findTestObject('Alda/Logout/tap_ya_logout'), 0)

            break
        case 'failed':
            Mobile.verifyElementNotVisible(findTestObject('Alda/Daftar/a - VerifikasiDaftar/warn - 00 29'), 2, FailureHandling.OPTIONAL)

            break
    }
} else if (status_verifikasi == '3_kali_kirim_ulang') {
    switch (expected_verifikasi) {
        case 'passed':
            Mobile.delay(90, FailureHandling.STOP_ON_FAILURE)

            Mobile.tap(findTestObject('Alda/Daftar/a - VerifikasiDaftar/tap - Kirim ulang (03)'), 0, FailureHandling.OPTIONAL)

            Mobile.delay(90, FailureHandling.OPTIONAL)

            Mobile.tap(findTestObject('Alda/Daftar/a - VerifikasiDaftar/tap - Kirim ulang (13)'), 0, FailureHandling.OPTIONAL)

            Mobile.delay(90, FailureHandling.OPTIONAL)

            Mobile.tap(findTestObject('Alda/Daftar/a - VerifikasiDaftar/tap - Kirim ulang (23)'), 0, FailureHandling.OPTIONAL)

            Mobile.delay(90, FailureHandling.OPTIONAL)

            Mobile.tap(findTestObject('Alda/Daftar/a - VerifikasiDaftar/tap - Kirim ulang (33)'), 0, FailureHandling.OPTIONAL)

            Mobile.verifyElementVisible(findTestObject('Alda/Daftar/a - VerifikasiDaftar/warn - Recaptcha memerlukan verifikasi. Saya bukan robot'), 
                2, FailureHandling.OPTIONAL)

            Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

            Mobile.setText(findTestObject('Alda/Daftar/new/input_otp_1'), var_otp_1, 0)

            Mobile.setText(findTestObject('Alda/Daftar/new/input_otp_2'), var_otp_2, 0)

            Mobile.setText(findTestObject('Alda/Daftar/new/input_otp_3'), var_otp_3, 0)

            Mobile.setText(findTestObject('Alda/Daftar/new/input_otp_4'), var_otp_4, 0)

            Mobile.setText(findTestObject('Alda/Daftar/new/input_otp_5'), var_otp_5, 0)

            Mobile.setText(findTestObject('Alda/Daftar/new/input_otp_6'), var_otp_6, 0)

            Mobile.tap(findTestObject('Alda/Daftar/a - VerifikasiDaftar/button_verifikasi'), 0)

            Mobile.waitForElementPresent(findTestObject('Alda/Login/tap_username'), 5)

            Mobile.tap(findTestObject('Alda/Login/tap_username'), 0)

            Mobile.setText(findTestObject('Alda/Login/input_username'), var_username, 0)

            Mobile.tap(findTestObject('Alda/Login/tap_password'), 0)

            Mobile.setText(findTestObject('Alda/Login/input_password'), var_password, 0)

            Mobile.tap(findTestObject('Alda/Login/button_masuk'), 0)

            Mobile.verifyElementVisible(findTestObject('Alda/Login/warn - Hi after login'), 0)

            Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

            Mobile.waitForElementPresent(findTestObject('Alda/Logout/tap_akun_new'), 5)

            Mobile.tap(findTestObject('Alda/Logout/tap_akun_new'), 0)

            Mobile.tap(findTestObject('Alda/Logout/tap_keluar_new'), 0)

            Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

            Mobile.tap(findTestObject('Alda/Logout/tap_ya_logout'), 0)

            break
    }
}


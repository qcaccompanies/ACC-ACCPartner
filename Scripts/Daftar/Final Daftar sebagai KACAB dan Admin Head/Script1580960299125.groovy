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

WebUI.callTestCase(findTestCase('Daftar/Kode Referal'), [('var_referral') : var_referral, ('dealer_info') : dealer_info], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

if (register_status == 'confirm') {
    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Daftar/button_confirm'), 0)

    if (expected_referral == 'passed') {
        WebUI.callTestCase(findTestCase('Daftar/Halaman Daftar'), [('var_full_name') : var_full_name, ('var_username') : var_username
                , ('var_email') : var_email, ('var_phone_number') : var_phone_number, ('var_jabatan') : var_jabatan, ('var_password') : var_password
                , ('var_confirm_password') : var_confirm_password, ('expected_register_status') : expected_register_status
                , ('keterangan') : keterangan, ('var_jalan') : var_jalan, ('var_kode_pos') : var_kode_pos, ('var_input_kode_pos') : var_input_kode_pos
                , ('var_kecamatan') : var_kecamatan, ('var_kelurahan') : var_kelurahan, ('var_kota') : var_kota, ('var_provinsi') : var_provinsi
                , ('expected_dealer_page') : expected_dealer_page, ('status_verifikasi') : status_verifikasi, ('expected_verifikasi') : expected_verifikasi
                , ('var_otp_1') : var_otp_1, ('var_otp_2') : var_otp_2, ('var_otp_3') : var_otp_3, ('var_otp_4') : var_otp_4
                , ('var_otp_5') : var_otp_5, ('var_otp_6') : var_otp_6], FailureHandling.STOP_ON_FAILURE)
    } else if (expected_referral == 'failed') {
        not_run: Mobile.verifyElementVisible(findTestObject('Daftar/warn - REFERAL CODE SALAH'), 0)

        Mobile.verifyElementVisible(findTestObject('Daftar/button_confirm'), 0)
    }
} else if (register_status == 'cancel') {
    Mobile.tap(findTestObject('Daftar/button_cancel'), 0)
}


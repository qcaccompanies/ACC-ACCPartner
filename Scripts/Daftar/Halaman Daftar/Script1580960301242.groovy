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

Mobile.tap(findTestObject('Daftar/tap_full_name'), 0)

Mobile.setText(findTestObject('Daftar/input_full_name'), var_full_name, 0)

Mobile.tap(findTestObject('Daftar/tap_username'), 0)

Mobile.setText(findTestObject('Daftar/input_username'), var_username, 0)

Mobile.tap(findTestObject('Daftar/tap_email'), 0)

Mobile.setText(findTestObject('Daftar/input_email'), var_email, 0)

Mobile.tap(findTestObject('Daftar/tap_phone_number'), 0)

Mobile.setText(findTestObject('Daftar/input_phone_number'), var_phone_number, 0)

Mobile.tap(findTestObject('Daftar/tap_email'), 0)

Mobile.tap(findTestObject('Daftar/tap_phone_number'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Daftar/tap_phone_number'), 0)

Mobile.tapAtPosition(562, 179)

Mobile.tap(findTestObject('Daftar/tap_jabatan - Copy'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Daftar/tap_input_jabatan', [('text') : var_jabatan]), 0, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Daftar/tap_password'), 0)

Mobile.setText(findTestObject('Daftar/input_password'), var_password, 0)

Mobile.tap(findTestObject('Daftar/tap_confirm_password'), 0)

Mobile.setText(findTestObject('Daftar/input_confirm_password'), var_confirm_password, 0)

switch (expected_register_status) {
    case 'passed':
        if ((var_jabatan == 'KACAB') || (var_jabatan == 'ADMIN HEAD')) {
            Mobile.tap(findTestObject('Daftar/button_dealer_info'), 0)

            WebUI.callTestCase(findTestCase('Daftar/Halaman Dealer Info'), [('var_jalan') : var_jalan, ('var_kode_pos') : var_kode_pos
                    , ('var_kecamatan') : var_kecamatan, ('var_kelurahan') : var_kelurahan, ('var_kota') : var_kota, ('var_provinsi') : var_provinsi
                    , ('expected_dealer_page') : expected_dealer_page, ('status_verifikasi') : status_verifikasi, ('expected_verifikasi') : expected_verifikasi], 
                FailureHandling.STOP_ON_FAILURE)
        } else if ((var_jabatan == 'SUPERVISOR') || (var_jabatan == 'SALESMAN')) {
            Mobile.tap(findTestObject('Daftar/button_daftar'), 0)

            WebUI.callTestCase(findTestCase('Daftar/Halaman Verifikasi'), [('status_verifikasi') : status_verifikasi, ('expected_verifikasi') : expected_verifikasi], 
                FailureHandling.STOP_ON_FAILURE)
        }
        
        break
    case 'failed':
        Mobile.tap(findTestObject('Daftar/button_dealer_info'), 0, FailureHandling.CONTINUE_ON_FAILURE)

        if (keterangan == 'empty_field') {
            Mobile.verifyElementVisible(findTestObject('Daftar/warn - Nama harus diisi'), 0, FailureHandling.OPTIONAL)

            Mobile.verifyElementVisible(findTestObject('Daftar/warn - Username harus diisi'), 0, FailureHandling.OPTIONAL)

            Mobile.verifyElementVisible(findTestObject('Daftar/warn - Email harus diisi'), 0, FailureHandling.OPTIONAL)

            Mobile.verifyElementVisible(findTestObject('Daftar/warn - Kata Sandi harus diisi'), 0, FailureHandling.OPTIONAL)

            Mobile.verifyElementVisible(findTestObject('Daftar/warn - No.Handphone Harus Diisi'), 0, FailureHandling.OPTIONAL)

            Mobile.verifyElementVisible(findTestObject('Daftar/warn - Jabatan harus diisi'), 0, FailureHandling.OPTIONAL)
        } else if (keterangan == 'error_length') {
            Mobile.verifyElementVisible(findTestObject('Daftar/warn - Panjang karakter Nama harus diantara 3 sampai 30'), 
                0, FailureHandling.OPTIONAL)

            Mobile.verifyElementVisible(findTestObject('Daftar/warn - Panjang karakter Username harus diantara 6 sampai 20'), 
                0, FailureHandling.OPTIONAL)

            Mobile.verifyElementVisible(findTestObject('Daftar/warn - Panjang karakter Email harus diantara 13 sampai 50'), 
                0, FailureHandling.OPTIONAL)

            Mobile.verifyElementVisible(findTestObject('Daftar/warn - Panjang karakter No.Handphone harus diantara 10 sampai 15'), 
                0, FailureHandling.OPTIONAL)

            Mobile.verifyElementVisible(findTestObject('Daftar/warn - Panjang karakter Password harus diantara 7 sampai 20'), 
                0, FailureHandling.OPTIONAL)
        } else if (keterangan == 'invalid_format') {
            Mobile.verifyElementVisible(findTestObject('Daftar/warn - Format Username tidak sesuai'), 0, FailureHandling.OPTIONAL)

            Mobile.verifyElementVisible(findTestObject('Daftar/warn - Format Email tidak Valid'), 0, FailureHandling.OPTIONAL)

            Mobile.verifyElementVisible(findTestObject('Daftar/warn - Format Password tidak sesuai'), 0, FailureHandling.OPTIONAL)
        } else if (keterangan == 'password_is_not_match') {
            Mobile.verifyElementVisible(findTestObject('Daftar/warn - Kata Sandi tidak sesuai'), 0, FailureHandling.STOP_ON_FAILURE)
        } else if (keterangan == 'username_is_exist') {
            Mobile.verifyElementVisible(findTestObject('Daftar/warn - Username sudah digunakan'), 0, FailureHandling.STOP_ON_FAILURE)
        }
        
        break
}


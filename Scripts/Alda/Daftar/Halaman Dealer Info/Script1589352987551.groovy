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

Mobile.tap(findTestObject('Alda/Daftar/tap_jalan_new'), 0)

Mobile.clearText(findTestObject('Alda/Daftar/Daftar Kacab Update 11 Mei/input_jalan_admin'), 0)

Mobile.setText(findTestObject('Alda/Daftar/Daftar Kacab Update 11 Mei/input_jalan_admin'), var_jalan, 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Alda/Daftar/Daftar Kacab Update 11 Mei/tap_kode_pos'), 0)

Mobile.clearText(findTestObject('Alda/Daftar/Daftar Kacab Update 11 Mei/input_kode_pos'), 0)

Mobile.setText(findTestObject('Alda/Daftar/Daftar Kacab Update 11 Mei/input_kode_pos'), var_kode_pos, 0)

Mobile.tap(findTestObject('Alda/Daftar/a - VerifikasiDaftar/tap_input_kode_pos_fix', [('text') : var_input_kode_pos]), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Alda/Daftar/Daftar Kacab Update 11 Mei/tap_kelurahan'), 0)

Mobile.clearText(findTestObject('Alda/Daftar/Daftar Kacab Update 11 Mei/input_kelurahan'), 0)

Mobile.setText(findTestObject('Alda/Daftar/Daftar Kacab Update 11 Mei/input_kelurahan'), var_kelurahan, 0)

Mobile.tap(findTestObject('Alda/Daftar/a - VerifikasiDaftar/tap_input_kelurahan_fix', [('text') : var_kelurahan]), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Alda/Daftar/Daftar Kacab Update 11 Mei/tap_kecamatan'), 0)

Mobile.clearText(findTestObject('Alda/Daftar/Daftar Kacab Update 11 Mei/input_kecamatan'), 0)

Mobile.setText(findTestObject('Alda/Daftar/Daftar Kacab Update 11 Mei/input_kecamatan'), var_kecamatan, 0)

Mobile.tap(findTestObject('Alda/Daftar/Daftar Kacab Update 11 Mei/tap_kota'), 0)

Mobile.clearText(findTestObject('Alda/Daftar/Daftar Kacab Update 11 Mei/input_kota'), 0)

Mobile.setText(findTestObject('Alda/Daftar/Daftar Kacab Update 11 Mei/input_kota'), var_kota, 0)

Mobile.tap(findTestObject('Alda/Daftar/Daftar Kacab Update 11 Mei/tap_provinsi'), 0)

Mobile.clearText(findTestObject('Alda/Daftar/Daftar Kacab Update 11 Mei/input_provinsi'), 0)

Mobile.setText(findTestObject('Alda/Daftar/Daftar Kacab Update 11 Mei/input_provinsi'), var_provinsi, 0)

Mobile.tap(findTestObject('Alda/Daftar/a - VerifikasiDaftar/tap_input_provinsi_fix', [('text') : var_provinsi]), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Alda/Daftar/button_daftar'), 0)

switch (expected_dealer_page) {
    case 'passed':
        WebUI.callTestCase(findTestCase('Alda/Daftar/Halaman Verifikasi'), [('status_verifikasi') : status_verifikasi, ('expected_verifikasi') : expected_verifikasi
                , ('var_otp_1') : var_otp_1, ('var_otp_2') : var_otp_2, ('var_otp_3') : var_otp_3, ('var_otp_4') : var_otp_4
                , ('var_otp_5') : var_otp_5, ('var_otp_6') : var_otp_6, ('var_username') : var_username, ('var_password') : var_password], 
            FailureHandling.STOP_ON_FAILURE)

        break
    case 'failed':
        Mobile.verifyElementVisible(findTestObject('Alda/Daftar/a - VerifikasiDaftar/warn - Panjang karakter Nama Jalan harus diantara 3 sampai 100'), 
            3, FailureHandling.OPTIONAL)

        Mobile.verifyElementVisible(findTestObject('Alda/Daftar/a - VerifikasiDaftar/warn - Nama jalan harus diisi'), 3, FailureHandling.OPTIONAL)

        Mobile.verifyElementVisible(findTestObject('Alda/Daftar/a - VerifikasiDaftar/warn - Kode Pos harus diisi'), 3, FailureHandling.OPTIONAL)

        Mobile.verifyElementVisible(findTestObject('Alda/Daftar/a - VerifikasiDaftar/warn - Kelurahan harus diisi'), 3, FailureHandling.OPTIONAL)

        Mobile.verifyElementVisible(findTestObject('Alda/Daftar/a - VerifikasiDaftar/warn - Kecamatan harus diisi'), 3, FailureHandling.OPTIONAL)

        Mobile.verifyElementVisible(findTestObject('Alda/Daftar/a - VerifikasiDaftar/warn - Kota harus diisi'), 3, FailureHandling.OPTIONAL)

        Mobile.verifyElementVisible(findTestObject('Alda/Daftar/a - VerifikasiDaftar/warn - Provinsi harus diisi'), 3, FailureHandling.OPTIONAL)

        break
}


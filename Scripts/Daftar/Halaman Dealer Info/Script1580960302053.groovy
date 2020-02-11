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

not_run: Mobile.tap(findTestObject('Daftar/a - VerifikasiDaftar/button_dealer_info'), 0)

Mobile.tap(findTestObject('Daftar/a - VerifikasiDaftar/tap_jalan'), 0)

Mobile.clearText(findTestObject('Daftar/a - VerifikasiDaftar/clear_jalan'), 0)

Mobile.setText(findTestObject('Daftar/a - VerifikasiDaftar/input_jalan'), var_jalan, 0)

Mobile.tap(findTestObject('Daftar/a - VerifikasiDaftar/tap_kode_pos'), 0)

Mobile.clearText(findTestObject('Daftar/a - VerifikasiDaftar/clear_kode_pos'), 0)

Mobile.setText(findTestObject('Daftar/a - VerifikasiDaftar/input_kode_pos'), var_kode_pos, 0)

Mobile.tap(findTestObject('Daftar/a - VerifikasiDaftar/tap_input_kode_pos_fix', [('text') : var_input_kode_pos]), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Daftar/a - VerifikasiDaftar/tap_kelurahan_fix'), 0)

Mobile.clearText(findTestObject('Daftar/a - VerifikasiDaftar/input_kelurahan_fix'), 0)

Mobile.setText(findTestObject('Daftar/a - VerifikasiDaftar/input_kelurahan_fix'), var_kelurahan, 0)

Mobile.tap(findTestObject('Daftar/a - VerifikasiDaftar/tap_input_kelurahan_fix', [('text') : var_kelurahan]), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Daftar/a - VerifikasiDaftar/tap_kecamatan_fix'), 0)

Mobile.clearText(findTestObject('Daftar/a - VerifikasiDaftar/input_kecamatan_fix'), 0)

Mobile.setText(findTestObject('Daftar/a - VerifikasiDaftar/input_kecamatan_fix'), var_kecamatan, 0)

Mobile.tap(findTestObject('Daftar/a - VerifikasiDaftar/tap_kota_fix'), 0)

Mobile.clearText(findTestObject('Daftar/a - VerifikasiDaftar/input_kota_fix'), 0)

Mobile.setText(findTestObject('Daftar/a - VerifikasiDaftar/input_kota_fix'), var_kota, 0)

Mobile.tap(findTestObject('Daftar/a - VerifikasiDaftar/tap_provinsi_fix'), 0)

Mobile.clearText(findTestObject('Daftar/a - VerifikasiDaftar/input_provinsi_fix'), 0)

Mobile.setText(findTestObject('Daftar/a - VerifikasiDaftar/input_provinsi_fix'), var_provinsi, 0)

Mobile.tap(findTestObject('Daftar/a - VerifikasiDaftar/tap_input_provinsi_fix', [('text') : var_provinsi]), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Daftar/button_daftar'), 0)

switch (expected_dealer_page) {
    case 'passed':
        WebUI.callTestCase(findTestCase('Daftar/Halaman Verifikasi'), [('status_verifikasi') : status_verifikasi, ('expected_verifikasi') : expected_verifikasi], 
            FailureHandling.STOP_ON_FAILURE)

        break
    case 'failed':
        Mobile.verifyElementVisible(findTestObject('Daftar/a - VerifikasiDaftar/warn - Panjang karakter Nama Jalan harus diantara 3 sampai 100'), 
            0, FailureHandling.OPTIONAL)

        Mobile.verifyElementVisible(findTestObject('Daftar/a - VerifikasiDaftar/warn - Nama jalan harus diisi'), 0, FailureHandling.OPTIONAL)

        Mobile.verifyElementVisible(findTestObject('Daftar/a - VerifikasiDaftar/warn - Kode Pos harus diisi'), 0, FailureHandling.OPTIONAL)

        Mobile.verifyElementVisible(findTestObject('Daftar/a - VerifikasiDaftar/warn - Kelurahan harus diisi'), 0, FailureHandling.OPTIONAL)

        Mobile.verifyElementVisible(findTestObject('Daftar/a - VerifikasiDaftar/warn - Kecamatan harus diisi'), 0, FailureHandling.OPTIONAL)

        Mobile.verifyElementVisible(findTestObject('Daftar/a - VerifikasiDaftar/warn - Kota harus diisi'), 0, FailureHandling.OPTIONAL)

        Mobile.verifyElementVisible(findTestObject('Daftar/a - VerifikasiDaftar/warn - Provinsi harus diisi'), 0, FailureHandling.OPTIONAL)

        break
}


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

Mobile.tap(findTestObject('Daftar/tap_jalan_new'), 0)

Mobile.clearText(findTestObject('Daftar/new/input_jalan_new_2'), 0)

Mobile.setText(findTestObject('Daftar/new/input_jalan_new_3'), var_jalan, 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Daftar/tap_kode_pos_new'), 0)

Mobile.clearText(findTestObject('Daftar/new/input_kode_pos_new_2'), 0)

Mobile.setText(findTestObject('Daftar/new/input_kode_pos_new_3'), var_kode_pos, 0)

Mobile.tap(findTestObject('Daftar/a - VerifikasiDaftar/tap_input_kode_pos_fix', [('text') : var_input_kode_pos]), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Daftar/tap_kelurahan_new'), 0)

Mobile.clearText(findTestObject('Daftar/new/input_kelurahan_new_3'), 0)

Mobile.setText(findTestObject('Daftar/new/input_kelurahan_new_3'), var_kelurahan, 0)

Mobile.tap(findTestObject('Daftar/a - VerifikasiDaftar/tap_input_kelurahan_fix', [('text') : var_kelurahan]), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Daftar/new/tap_kecamatan_new_2'), 0)

Mobile.clearText(findTestObject('Daftar/new/input_kecamatan_new_3'), 0)

Mobile.setText(findTestObject('Daftar/new/input_kecamatan_new_3'), var_kecamatan, 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Daftar/new/tap_kota_2'), 0)

Mobile.clearText(findTestObject('Daftar/new/input_kota_new_3'), 0)

Mobile.setText(findTestObject('Daftar/new/input_kota_new_3'), var_kota, 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Daftar/new/tap_provinsi_2'), 0)

Mobile.clearText(findTestObject('Daftar/new/input_provinsi_new_3'), 0)

Mobile.setText(findTestObject('Daftar/new/input_provinsi_new_3'), var_provinsi, 0)

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
            3, FailureHandling.OPTIONAL)

        Mobile.verifyElementVisible(findTestObject('Daftar/a - VerifikasiDaftar/warn - Nama jalan harus diisi'), 3, FailureHandling.OPTIONAL)

        Mobile.verifyElementVisible(findTestObject('Daftar/a - VerifikasiDaftar/warn - Kode Pos harus diisi'), 3, FailureHandling.OPTIONAL)

        Mobile.verifyElementVisible(findTestObject('Daftar/a - VerifikasiDaftar/warn - Kelurahan harus diisi'), 3, FailureHandling.OPTIONAL)

        Mobile.verifyElementVisible(findTestObject('Daftar/a - VerifikasiDaftar/warn - Kecamatan harus diisi'), 3, FailureHandling.OPTIONAL)

        Mobile.verifyElementVisible(findTestObject('Daftar/a - VerifikasiDaftar/warn - Kota harus diisi'), 3, FailureHandling.OPTIONAL)

        Mobile.verifyElementVisible(findTestObject('Daftar/a - VerifikasiDaftar/warn - Provinsi harus diisi'), 3, FailureHandling.OPTIONAL)

        break
}


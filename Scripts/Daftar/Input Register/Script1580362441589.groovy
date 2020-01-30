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

Mobile.tap(findTestObject('Daftar sebagai KACAB/tap_full_name'), 0)

Mobile.setText(findTestObject('Daftar sebagai KACAB/input_full_name'), var_full_name, 0)

Mobile.tap(findTestObject('Daftar sebagai KACAB/tap_username'), 0)

Mobile.setText(findTestObject('Daftar sebagai KACAB/input_username'), var_username, 0)

Mobile.tap(findTestObject('Daftar sebagai KACAB/tap_email'), 0)

Mobile.setText(findTestObject('Daftar sebagai KACAB/input_email'), var_email, 0)

Mobile.tap(findTestObject('Daftar sebagai KACAB/tap_phone_number'), 0)

Mobile.setText(findTestObject('Daftar sebagai KACAB/input_phone_number'), '85700997427', 0)

Mobile.tap(findTestObject('Daftar sebagai KACAB/tap_jabatan'), 0)

Mobile.tap(findTestObject('Daftar sebagai KACAB/android.view.View0 - KACAB'), 0)

Mobile.tap(findTestObject('Daftar sebagai KACAB/tap_password'), 0)

Mobile.setText(findTestObject('Daftar sebagai KACAB/input_password'), '12', 0)

Mobile.tap(findTestObject('Daftar sebagai KACAB/tap_confirm_password'), 0)

Mobile.setText(findTestObject('Daftar sebagai KACAB/input_confirm_password'), 'admin123', 0)

Mobile.tap(findTestObject('Daftar sebagai KACAB/button_dealer_info'), 0)

switch (expected_register_status) {
    case 'failedEmptyFullName':
        Mobile.verifyElementVisible(findTestObject('Daftar sebagai KACAB/warn - Nama harus diisi'), 0)

        break
    case 'failedEmptyUsername':
        Mobile.verifyElementVisible(findTestObject('Daftar sebagai KACAB/warn - Username harus diisi'), 0)

        break
    case 'failedEmptyEmail':
        Mobile.verifyElementVisible(findTestObject('Daftar sebagai KACAB/warn - Email harus diisi'), 0)

        break
    case 'failedEmptyPassword':
        Mobile.verifyElementVisible(findTestObject('Daftar sebagai KACAB/warn - Kata Sandi harus diisi'), 0)

        break
    case 'failedEmptyPhoneNumber':
        Mobile.verifyElementVisible(findTestObject('Daftar sebagai KACAB/warn - No.Handphone Harus Diisi'), 0)

        break
    case 'failedLengthUsername':
        Mobile.verifyElementVisible(findTestObject('Daftar sebagai KACAB/warn - Panjang karakter Username harus diantara 6 sampai 20'), 
            0)

        break
    case 'failedLengthEmail':
        Mobile.verifyElementVisible(findTestObject('Daftar sebagai KACAB/warn - Panjang karakter Email harus diantara 13 sampai 50'), 
            0)

        break
    case 'failedLengthPhoneNumber':
        Mobile.verifyElementVisible(findTestObject('Daftar sebagai KACAB/warn - Panjang karakter No.Handphone harus diantara 10 sampai 15'), 
            0)

        break
    case 'failedLengthPassword':
        Mobile.verifyElementVisible(findTestObject('Daftar sebagai KACAB/warn - Panjang karakter Password harus diantara 7 sampai 20'), 
            0)

        break
    case 'failedInvalidUsernameFormat':
        Mobile.verifyElementVisible(findTestObject('Daftar sebagai KACAB/warn - Format Username tidak sesuai'), 0)

        break
    case 'failedInvalidEmailFormat':
        Mobile.verifyElementVisible(findTestObject('Daftar sebagai KACAB/warn - Format Email tidak Valid'), 0)

        break
    case 'failedInvalidPasswordFormat':
        Mobile.verifyElementVisible(findTestObject('Daftar sebagai KACAB/warn - Format Password tidak sesuai'), 0)

        break
    case 'failedPasswordIsNotMatch':
        Mobile.verifyElementVisible(findTestObject('Daftar sebagai KACAB/warn - Kata Sandi tidak sesuai'), 0)

        break
}


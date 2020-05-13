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

WebUI.callTestCase(findTestCase('StartApplication'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Alda/forgot username/tap - Lupa Username Kata Sandi'), 5)

Mobile.tap(findTestObject('Alda/forgot username/tap - Lupa Username Kata Sandi'), 0)

if (var_status_lupa == 'lupa_username') {
    Mobile.tap(findTestObject('Alda/forgot username/tap btn - Lupa Username'), 0)

    Mobile.tap(findTestObject('Alda/forgot username/tap input - email'), 0)

    Mobile.setText(findTestObject('Alda/forgot username/input - email'), var_email_lupa, 0)

    Mobile.tap(findTestObject('Alda/forgot username/btn - Konfirmasi Lupa Username'), 0)

    switch (expected_output_email) {
        case 'passed':
            WebUI.callTestCase(findTestCase('Alda/Forgot Password or Username/verifikasi otp'), [('var_opsi_otp') : var_opsi_otp
                    , ('var_otp1') : var_otp1, ('var_otp2') : var_otp2, ('var_otp3') : var_otp3, ('var_otp4') : var_otp4
                    , ('var_otp5') : var_otp5, ('var_otp6') : var_otp6], FailureHandling.STOP_ON_FAILURE)

            switch (expected_output_otp) {
                case 'passed':
                    Mobile.verifyElementVisible(findTestObject('Alda/forgot username/warn - Username telah di kirim'), 0)

                    Mobile.tap(findTestObject('Alda/forgot username/btn - Kembali ke halaman login'), 0)

                    break
                case 'failedEmptyField':
                    Mobile.verifyElementVisible(findTestObject('Alda/forgot username/warn - Semua Field Harus Diisi'), 2)

                    break
                case 'failedWrongVerificationCode':
                    Mobile.verifyElementVisible(findTestObject('Alda/forgot username/warn - Kode Verifikasi Anda salah'), 2, 
                        FailureHandling.STOP_ON_FAILURE)

                    break
            }
            
            break
        case 'failedEmptyField':
            Mobile.verifyElementVisible(findTestObject('Alda/forgot username/warn - Email harus diisi'), 2, FailureHandling.OPTIONAL)

            break
        case 'failedWrongFormat':
            Mobile.verifyElementVisible(findTestObject('Alda/forgot username/warn - Panjang karakter Email harus diantara 13 sampai 50'), 
                2, FailureHandling.OPTIONAL)

            Mobile.verifyElementVisible(findTestObject('Alda/forgot username/warn - Format Email tidak Valid'), 2, FailureHandling.OPTIONAL)

            break
        case 'failedNotExist':
            Mobile.verifyElementVisible(findTestObject('Alda/forgot username/message error - email tidak ada'), 2)

            break
    }
} else if (var_status_lupa == 'lupa_password') {
    Mobile.tap(findTestObject('Alda/forgot username/tap btn - Lupa Password'), 0)

    Mobile.tap(findTestObject('Alda/forgot username/tap - Username Lupa Password'), 0)

    Mobile.setText(findTestObject('Alda/forgot username/input - username'), var_username_lupa, 0)

    Mobile.tap(findTestObject('Alda/forgot username/btn - Konfirmasi Lupa Password'), 0)

    switch (expected_output_username) {
        case 'passed':
            WebUI.callTestCase(findTestCase('Alda/Forgot Password or Username/verifikasi otp'), [('var_opsi_otp') : var_opsi_otp
                    , ('var_otp1') : var_otp1, ('var_otp2') : var_otp2, ('var_otp3') : var_otp3, ('var_otp4') : var_otp4
                    , ('var_otp5') : var_otp5, ('var_otp6') : var_otp6], FailureHandling.STOP_ON_FAILURE)

            switch (expected_output_otp) {
                case 'passed':
                    Mobile.tap(findTestObject('Alda/forgot username/tap - Kata Sandi Baru'), 0)

                    Mobile.setText(findTestObject('Alda/forgot username/input - new password'), var_new_password, 0)

                    Mobile.tap(findTestObject('Alda/forgot username/tap - Konfirmasi Kata Sandi'), 0)

                    Mobile.setText(findTestObject('Alda/forgot username/input - confirm new password'), var_confirm_new_password, 
                        0)

                    Mobile.tap(findTestObject('Alda/forgot username/btn - Konfirmasi Kata Sandi'), 0)

                    switch (expected_output) {
                        case 'passed':
                            Mobile.waitForElementPresent(findTestObject('Alda/Login/tap_username'), 5)

                            Mobile.verifyElementVisible(findTestObject('Alda/Login/tap_username'), 0)

                            Mobile.tap(findTestObject('Alda/Login/tap_username'), 0)

                            Mobile.setText(findTestObject('Alda/Login/input_username'), var_username_lupa, 0)

                            Mobile.tap(findTestObject('Alda/Login/tap_password'), 0)

                            Mobile.setText(findTestObject('Alda/Login/input_password'), var_new_password, 0)

                            Mobile.tap(findTestObject('Alda/Login/button_masuk'), 0)

                            Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

                            Mobile.verifyElementNotVisible(findTestObject('Alda/Login/button_masuk'), 0)

                            Mobile.tap(findTestObject('Alda/Logout/tap_akun_new'), 0)

                            Mobile.tap(findTestObject('Alda/Logout/tap_keluar_new'), 0)

                            Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

                            break
                        case 'failedEmptyField':
                            Mobile.verifyElementVisible(findTestObject('Alda/forgot username/warn - Harus Diisi'), 2, FailureHandling.OPTIONAL)

                            Mobile.verifyElementVisible(findTestObject('Alda/forgot username/btn - Konfirmasi Kata Sandi'), 0)

                            break
                        case 'failedErrorLength':
                            Mobile.verifyElementVisible(findTestObject('Alda/forgot username/warn - Minimal 7 Karakter'), 2, 
                                FailureHandling.OPTIONAL)

                            Mobile.verifyElementVisible(findTestObject('Alda/forgot username/btn - Konfirmasi Kata Sandi'), 0)

                            break
                        case 'failedErrorFormat':
                            Mobile.verifyElementVisible(findTestObject('Alda/forgot username/warn - Format Password tidak sesuai'), 
                                2, FailureHandling.OPTIONAL)

                            Mobile.verifyElementVisible(findTestObject('Alda/forgot username/btn - Konfirmasi Kata Sandi'), 0)

                            break
                        case 'failedNotMatch':
                            Mobile.verifyElementVisible(findTestObject('Alda/forgot username/warn - Kata Sandi Yang Anda Masukkan Tidak Sama'), 
                                2, FailureHandling.OPTIONAL)

                            Mobile.verifyElementVisible(findTestObject('Alda/forgot username/btn - Konfirmasi Kata Sandi'), 0)

                            break
                        case 'failedUsernameNotExist':
                            Mobile.verifyElementVisible(findTestObject('Alda/forgot username/warn - User name tidak terdaftar'), 
                                2, FailureHandling.OPTIONAL)

                            Mobile.verifyElementVisible(findTestObject('Alda/forgot username/btn - Konfirmasi Kata Sandi'), 0)

                            break
                    }
                    
                    break
                case 'failedEmptyField':
                    Mobile.verifyElementVisible(findTestObject('Alda/forgot username/warn - Semua Field Harus Diisi'), 2, FailureHandling.OPTIONAL)

                    break
                case 'failedWrongVerificationCode':
                    Mobile.verifyElementVisible(findTestObject('Alda/forgot username/warn - Kode Verifikasi Anda salah'), 2, 
                        FailureHandling.OPTIONAL)

                    break
            }
            
            break
        case 'failedWrongFormat':
            Mobile.verifyElementVisible(findTestObject('Alda/forgot username/warn - Format Username tidak sesuai'), 2, FailureHandling.OPTIONAL)

            Mobile.verifyElementVisible(findTestObject('Alda/forgot username/btn - Konfirmasi Lupa Password'), 2)

            break
        case 'failedEmptyField':
            Mobile.verifyElementVisible(findTestObject('Alda/forgot username/warn - Username harus diisi'), 2, FailureHandling.OPTIONAL)

            Mobile.verifyElementVisible(findTestObject('Alda/forgot username/btn - Konfirmasi Lupa Password'), 2)

            break
        case 'failedNotExist':
            Mobile.verifyElementVisible(findTestObject('Alda/forgot username/feedback message - Username'), 2, FailureHandling.OPTIONAL)

            Mobile.verifyElementVisible(findTestObject('Alda/forgot username/btn - Konfirmasi Lupa Password'), 2)

            break
    }
}


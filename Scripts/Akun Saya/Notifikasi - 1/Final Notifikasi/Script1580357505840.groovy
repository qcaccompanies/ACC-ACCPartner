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

if (Mobile.verifyElementVisible(findTestObject('Notifikasi/check_page_log_in'), 0)) {
    WebUI.callTestCase(findTestCase('Login dan Logout/Login'), [('var_username') : var_username, ('var_password') : var_password, ('expected_login') : expected_login
            , ('status_login') : '', ('press_back_button') : '', ('close_app') : ''], FailureHandling.OPTIONAL)

    WebUI.callTestCase(findTestCase('Akun Saya/Notifikasi - 1/En or Dis Notifikasi'), [('var_info_kenaikan_grade') : var_info_kenaikan_grade
            , ('var_verifikasi_akun') : var_verifikasi_akun, ('var_perubahan_data') : var_perubahan_data], FailureHandling.STOP_ON_FAILURE)
} else if (Mobile.verifyElementVisible(findTestObject('Notifikasi/check_page_is_logged_in'), 0)) {
    WebUI.callTestCase(findTestCase('Akun Saya/Notifikasi - 1/En or Dis Notifikasi'), [('var_info_kenaikan_grade') : var_info_kenaikan_grade
            , ('var_verifikasi_akun') : var_verifikasi_akun, ('var_perubahan_data') : var_perubahan_data], FailureHandling.STOP_ON_FAILURE)

    not_run: Mobile.tap(findTestObject('Notifikasi/tap_akun'), 0)

    not_run: Mobile.tap(findTestObject('Notifikasi/tap_notifikasi'), 0)

    not_run: if (var_info_kenaikan_grade == 'enable') {
        Mobile.verifyElementVisible(findTestObject('Notifikasi/warn - notif_enable_info_kenaikan_grade'), 0, FailureHandling.OPTIONAL)

        Mobile.tap(findTestObject('Notifikasi/tap_dis_to_en_info_kenaikan_grade'), 0, FailureHandling.OPTIONAL)
    } else if (var_info_kenaikan_grade == 'disable') {
        Mobile.verifyElementVisible(findTestObject('Notifikasi/warn - notif_disable_info_kenaikan_grade'), 0, FailureHandling.OPTIONAL)

        Mobile.tap(findTestObject('Notifikasi/tap_en_to_dis_info_kenaikan_grade'), 0, FailureHandling.OPTIONAL)
    }
    
    not_run: if (var_verifikasi_akun == 'enable') {
        Mobile.verifyElementVisible(findTestObject('Notifikasi/warn - notif_enable_verifikasi_akun'), 0, FailureHandling.OPTIONAL)

        Mobile.tap(findTestObject('Notifikasi/tap_dis_to_en_verifikasi_akun'), 0, FailureHandling.OPTIONAL)
    } else if (var_verifikasi_akun == 'disable') {
        Mobile.verifyElementVisible(findTestObject('Notifikasi/warn - notif_disable_verifikasi_akun'), 0, FailureHandling.OPTIONAL)

        Mobile.tap(findTestObject('Notifikasi/tap_en_to_dis_verifikasi_akun'), 0, FailureHandling.OPTIONAL)
    }
    
    not_run: if (var_perubahan_data == 'enable') {
        Mobile.verifyElementVisible(findTestObject('Notifikasi/warn - notif_enable_perubahan_data'), 0, FailureHandling.OPTIONAL)

        Mobile.tap(findTestObject('Notifikasi/tap_dis_to_en_perubahan_data'), 0, FailureHandling.OPTIONAL)
    } else if (var_perubahan_data == 'disable') {
        Mobile.verifyElementVisible(findTestObject('Notifikasi/warn - notif_disable_perubahan_data'), 0, FailureHandling.OPTIONAL)

        Mobile.tap(findTestObject('Notifikasi/tap_en_to_dis_perubahan_data'), 0, FailureHandling.OPTIONAL)
    }
}

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()


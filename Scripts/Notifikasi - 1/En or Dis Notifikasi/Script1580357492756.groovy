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

Mobile.tap(findTestObject('Notifikasi/tap_akun'), 0)

Mobile.tap(findTestObject('Notifikasi/tap_notifikasi'), 0)

if (var_info_kenaikan_grade == 'enable') {
    Mobile.verifyElementVisible(findTestObject('Notifikasi/warn - notif_enable_info_kenaikan_grade'), 0, FailureHandling.OPTIONAL)

    Mobile.tap(findTestObject('Notifikasi/tap_dis_to_en_info_kenaikan_grade'), 0, FailureHandling.OPTIONAL)
} else if (var_info_kenaikan_grade == 'disable') {
    Mobile.verifyElementVisible(findTestObject('Notifikasi/warn - notif_disable_info_kenaikan_grade'), 0, FailureHandling.OPTIONAL)

    Mobile.tap(findTestObject('Notifikasi/tap_en_to_dis_info_kenaikan_grade'), 0, FailureHandling.OPTIONAL)
}

if (var_verifikasi_akun == 'enable') {
    Mobile.verifyElementVisible(findTestObject('Notifikasi/warn - notif_enable_verifikasi_akun'), 0, FailureHandling.OPTIONAL)

    Mobile.tap(findTestObject('Notifikasi/tap_dis_to_en_verifikasi_akun'), 0, FailureHandling.OPTIONAL)
} else if (var_verifikasi_akun == 'disable') {
    Mobile.verifyElementVisible(findTestObject('Notifikasi/warn - notif_disable_verifikasi_akun'), 0, FailureHandling.OPTIONAL)

    Mobile.tap(findTestObject('Notifikasi/tap_en_to_dis_verifikasi_akun'), 0, FailureHandling.OPTIONAL)
}

if (var_perubahan_data == 'enable') {
    Mobile.verifyElementVisible(findTestObject('Notifikasi/warn - notif_enable_perubahan_data'), 0, FailureHandling.OPTIONAL)

    Mobile.tap(findTestObject('Notifikasi/tap_dis_to_en_perubahan_data'), 0, FailureHandling.OPTIONAL)
} else if (var_perubahan_data == 'disable') {
    Mobile.verifyElementVisible(findTestObject('Notifikasi/warn - notif_disable_perubahan_data'), 0, FailureHandling.OPTIONAL)

    Mobile.tap(findTestObject('Notifikasi/tap_en_to_dis_perubahan_data'), 0, FailureHandling.OPTIONAL)
}


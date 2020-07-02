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

Mobile.startApplication('C:\\Users\\ASUS\\Desktop\\accpartner.apk', false)

Mobile.tap(findTestObject('Alda/Logout/tap_akun_new'), 0)

Mobile.waitForElementPresent(findTestObject('Alda/Notifikasi/tap_notifikasi_new'), 5)

Mobile.tap(findTestObject('Alda/Notifikasi/tap_notifikasi_new'), 0)

if (var_lebay == 'enable') {
    Mobile.tap(findTestObject('Alda/Notifikasi/tidak_1'), 2, FailureHandling.OPTIONAL)

    Mobile.verifyElementVisible(findTestObject('Alda/Notifikasi/ya_1'), 0, FailureHandling.STOP_ON_FAILURE)
} else if (var_lebay == 'disable') {
    Mobile.tap(findTestObject('Alda/Notifikasi/ya_1'), 2, FailureHandling.OPTIONAL)

    Mobile.verifyElementVisible(findTestObject('Alda/Notifikasi/tidak_1'), 0, FailureHandling.STOP_ON_FAILURE)
}

if (var_pstmn == 'enable') {
    Mobile.tap(findTestObject('Alda/Notifikasi/tidak_2'), 2, FailureHandling.OPTIONAL)

    Mobile.verifyElementVisible(findTestObject('Alda/Notifikasi/ya_2'), 0, FailureHandling.STOP_ON_FAILURE)
} else if (var_pstmn == 'disable') {
    Mobile.tap(findTestObject('Alda/Notifikasi/ya_2'), 2, FailureHandling.OPTIONAL)

    Mobile.verifyElementVisible(findTestObject('Alda/Notifikasi/tidak_2'), 0, FailureHandling.STOP_ON_FAILURE)
}

if (var_apa_aja == 'enable') {
    Mobile.tap(findTestObject('Alda/Notifikasi/tidak_3'), 2, FailureHandling.OPTIONAL)

    Mobile.verifyElementVisible(findTestObject('Alda/Notifikasi/ya_3'), 0, FailureHandling.STOP_ON_FAILURE)
} else if (var_apa_aja == 'disable') {
    Mobile.tap(findTestObject('Alda/Notifikasi/ya_3'), 2, FailureHandling.OPTIONAL)

    Mobile.verifyElementVisible(findTestObject('Alda/Notifikasi/tidak_3'), 0, FailureHandling.STOP_ON_FAILURE)
}

if (var_update == 'enable') {
    Mobile.tap(findTestObject('Alda/Notifikasi/tidak_4'), 2, FailureHandling.OPTIONAL)

    Mobile.verifyElementVisible(findTestObject('Alda/Notifikasi/ya_4'), 0, FailureHandling.STOP_ON_FAILURE)
} else if (var_update == 'disable') {
    Mobile.tap(findTestObject('Alda/Notifikasi/ya_4'), 2, FailureHandling.OPTIONAL)

    Mobile.verifyElementVisible(findTestObject('Alda/Notifikasi/tidak_4'), 0, FailureHandling.STOP_ON_FAILURE)
}

if (var_verifikasi_akun == 'enable') {
    Mobile.tap(findTestObject('Alda/Notifikasi/tidak_5'), 2, FailureHandling.OPTIONAL)

    Mobile.verifyElementVisible(findTestObject('Alda/Notifikasi/ya_5'), 0, FailureHandling.STOP_ON_FAILURE)
} else if (var_verifikasi_akun == 'disable') {
    Mobile.tap(findTestObject('Alda/Notifikasi/ya_5'), 2, FailureHandling.OPTIONAL)

    Mobile.verifyElementVisible(findTestObject('Alda/Notifikasi/tidak_5'), 0, FailureHandling.STOP_ON_FAILURE)
}

if (var_perubahan_data == 'enable') {
    Mobile.tap(findTestObject('Alda/Notifikasi/tidak_6'), 2, FailureHandling.OPTIONAL)

    Mobile.verifyElementVisible(findTestObject('Alda/Notifikasi/ya_6'), 0, FailureHandling.STOP_ON_FAILURE)
} else if (var_perubahan_data == 'disable') {
    Mobile.tap(findTestObject('Alda/Notifikasi/ya_6'), 2, FailureHandling.OPTIONAL)

    Mobile.verifyElementVisible(findTestObject('Alda/Notifikasi/tidak_6'), 0, FailureHandling.STOP_ON_FAILURE)
}

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)


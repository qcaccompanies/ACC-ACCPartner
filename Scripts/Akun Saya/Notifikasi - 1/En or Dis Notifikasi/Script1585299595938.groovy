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

Mobile.tap(findTestObject('Logout/tap_akun_new'), 0)

Mobile.tap(findTestObject('Notifikasi/tap_notifikasi_new'), 0)

if (var_apa_aja == 'enable') {
    Mobile.tap(findTestObject('Notifikasi/tidak_apaaja'), 0, FailureHandling.OPTIONAL)

    Mobile.verifyElementVisible(findTestObject('Notifikasi/ya_apaaja'), 0, FailureHandling.STOP_ON_FAILURE)
} else if (var_apa_aja == 'disable') {
    Mobile.tap(findTestObject('Notifikasi/ya_apaaja'), 0, FailureHandling.OPTIONAL)

    Mobile.verifyElementVisible(findTestObject('Notifikasi/tidak_apaaja'), 0, FailureHandling.STOP_ON_FAILURE)
}

if (var_pstmn == 'enable') {
    Mobile.tap(findTestObject('Notifikasi/tidak_pstmn'), 0, FailureHandling.OPTIONAL)

    Mobile.verifyElementVisible(findTestObject('Notifikasi/ya_pstmn'), 0, FailureHandling.STOP_ON_FAILURE)
} else if (var_pstmn == 'disable') {
    Mobile.tap(findTestObject('Notifikasi/ya_pstmn'), 0, FailureHandling.OPTIONAL)

    Mobile.verifyElementVisible(findTestObject('Notifikasi/tidak_pstmn'), 0, FailureHandling.STOP_ON_FAILURE)
}

if (var_verifikasi_akun == 'enable') {
    Mobile.tap(findTestObject('Notifikasi/tidak_verifikasiakun'), 0, FailureHandling.OPTIONAL)

    Mobile.verifyElementVisible(findTestObject('Notifikasi/ya_verifikasiakun'), 0, FailureHandling.STOP_ON_FAILURE)
} else if (var_verifikasi_akun == 'disable') {
    Mobile.tap(findTestObject('Notifikasi/ya_verifikasiakun'), 0, FailureHandling.OPTIONAL)

    Mobile.verifyElementVisible(findTestObject('Notifikasi/tidak_verifikasiakun'), 0, FailureHandling.STOP_ON_FAILURE)
}

if (var_perubahan_data == 'enable') {
    Mobile.tap(findTestObject('Notifikasi/tidak_perubahan_data'), 0, FailureHandling.OPTIONAL)

    Mobile.verifyElementVisible(findTestObject('Notifikasi/ya_perubahan_data'), 0, FailureHandling.STOP_ON_FAILURE)
} else if (var_perubahan_data == 'disable') {
    Mobile.tap(findTestObject('Notifikasi/ya_perubahan_data'), 0, FailureHandling.OPTIONAL)

    Mobile.verifyElementVisible(findTestObject('Notifikasi/tidak_perubahan_data'), 0, FailureHandling.STOP_ON_FAILURE)
}

if (var_lebay == 'enable') {
    Mobile.tap(findTestObject('Notifikasi/tidak_lebay'), 0, FailureHandling.OPTIONAL)

    Mobile.verifyElementVisible(findTestObject('Notifikasi/ya_lebay'), 0, FailureHandling.STOP_ON_FAILURE)
} else if (var_lebay == 'disable') {
    Mobile.tap(findTestObject('Notifikasi/ya_lebay'), 0, FailureHandling.OPTIONAL)

    Mobile.verifyElementVisible(findTestObject('Notifikasi/tidak_lebay'), 0, FailureHandling.STOP_ON_FAILURE)
}

if (var_update == 'enable') {
    Mobile.tap(findTestObject('Notifikasi/tidak_update'), 0, FailureHandling.OPTIONAL)

    Mobile.verifyElementVisible(findTestObject('Notifikasi/ya_update'), 0, FailureHandling.STOP_ON_FAILURE)
} else if (var_update == 'disable') {
    Mobile.tap(findTestObject('Notifikasi/ya_update'), 0, FailureHandling.OPTIONAL)

    Mobile.verifyElementVisible(findTestObject('Notifikasi/tidak_update'), 0, FailureHandling.STOP_ON_FAILURE)
}


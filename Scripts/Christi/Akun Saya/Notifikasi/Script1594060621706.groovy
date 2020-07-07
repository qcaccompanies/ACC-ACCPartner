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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

Mobile.startApplication('C:\\Users\\ASUS\\git\\Clone ACCPartner 06072020\\accpartner_010720.apk', false)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Christi/login page/android.view.View0 - Akun'), 3)

Mobile.tap(findTestObject('Christi/pengaturan notifikasi page/android.view.View0 - Notifikasi (1)'), 0)

if (var_verifikasi_akun == 'enable') {
    Mobile.tap(findTestObject('Christi/pengaturan notifikasi page/verifikasi akun disable'), 2, FailureHandling.OPTIONAL)

    Mobile.verifyElementVisible(findTestObject('Christi/pengaturan notifikasi page/verifikasi akun enable'), 0, FailureHandling.STOP_ON_FAILURE)
} else if (var_verifikasi_akun == 'disable') {
    Mobile.tap(findTestObject('Christi/pengaturan notifikasi page/verifikasi akun enable'), 2, FailureHandling.OPTIONAL)

    Mobile.verifyElementVisible(findTestObject('Christi/pengaturan notifikasi page/verifikasi akun disable'), 0, FailureHandling.STOP_ON_FAILURE)
}

if (var_perubahan_data == 'enable') {
    Mobile.tap(findTestObject('Christi/pengaturan notifikasi page/perubahan akun disable'), 2, FailureHandling.OPTIONAL)

    Mobile.verifyElementVisible(findTestObject('Christi/pengaturan notifikasi page/perubahan data enable'), 0, FailureHandling.STOP_ON_FAILURE)
} else if (var_perubahan_data == 'disable') {
    Mobile.tap(findTestObject('Christi/pengaturan notifikasi page/perubahan data enable'), 2, FailureHandling.OPTIONAL)

    Mobile.verifyElementVisible(findTestObject('Christi/pengaturan notifikasi page/perubahan akun disable'), 0, FailureHandling.STOP_ON_FAILURE)
}

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)


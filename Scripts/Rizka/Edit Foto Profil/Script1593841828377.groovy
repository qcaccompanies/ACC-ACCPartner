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

Mobile.startApplication('D:\\MY WORLD\\WORKS (TUGAS)\\ACCPartner\\accpartner_010720.apk', false)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementVisible(findTestObject('Rizka/Login - Logout/fieldUsername'), 0, FailureHandling.OPTIONAL)) {
    Mobile.setText(findTestObject('Rizka/Login - Logout/fieldUsername'), 'rizkajuliant20', 0)

    Mobile.setText(findTestObject('Rizka/Login - Logout/fieldPassword'), 'A123456', 0)

    Mobile.tap(findTestObject('Rizka/Login - Logout/btnMasuk'), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)
}

Mobile.tap(findTestObject('Rizka/Edit Foto Profil/btnAkun2'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Rizka/Edit Foto Profil/btnLihatAkun'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Rizka/Edit Foto Profil/btnEditFoto'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

if (info == 'camera') {
    Mobile.tap(findTestObject('Rizka/Edit Foto Profil/btnKamera'), 0)

    if (condition == 'passed') {
        if (infoCamera == 'retake') {
            Mobile.tapAtPosition(357, 1159)

            Mobile.tap(findTestObject('Rizka/Edit Foto Profil/btnAmbilUlang'), 0)

            Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
        }
        
        Mobile.tapAtPosition(357, 1159)

        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Rizka/Edit Foto Profil/btnSelesaiAmbilGambar'), 0)

        Mobile.verifyElementVisible(findTestObject('Rizka/Edit Foto Profil/alertFotoBerhasilDiubah'), 0)
    } else {
        Mobile.pressBack()

        Mobile.verifyElementVisible(findTestObject('Rizka/Edit Foto Profil/btnLihatAkun'), 0)
    }
} else {
    Mobile.tapAtPosition(474, 677)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    if (condition == 'passed') {
        Mobile.tapAtPosition(181, 452)
    } else {
        Mobile.pressBack()

        Mobile.verifyElementVisible(findTestObject('Rizka/Edit Foto Profil/btnKamera'), 0)
    }
}


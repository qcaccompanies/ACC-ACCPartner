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

if (infoCase == 'login') {
    if (Mobile.verifyElementNotVisible(findTestObject('Rizka/Login - Logout/fieldUsername'), 0, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Rizka/Login - Logout/btnAkun'), 0)

        Mobile.tap(findTestObject('Rizka/Login - Logout/btnKeluar'), 0)

        Mobile.tap(findTestObject('Rizka/Login - Logout/btnYaKeluar'), 0)

        Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)
    }
    
    Mobile.setText(findTestObject('Rizka/Login - Logout/fieldUsername'), username, 0)

    Mobile.setText(findTestObject('Rizka/Login - Logout/fieldPassword'), password, 0)

    Mobile.tap(findTestObject('Rizka/Login - Logout/btnMasuk'), 0, FailureHandling.STOP_ON_FAILURE)

    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    if (condition == 'passed') {
        Mobile.verifyElementVisible(findTestObject('Rizka/Login - Logout/verifInfoBeritaACC'), 0)
    } else {
        if (infoCondition == 'allEmpty') {
            Mobile.verifyElementVisible(findTestObject('Rizka/Login - Logout/alertUsernameKosong'), 0)

            Mobile.verifyElementVisible(findTestObject('Rizka/Login - Logout/alertPasswordKosong'), 0)
        } else if (infoCondition == 'passEmpty') {
            Mobile.verifyElementVisible(findTestObject('Rizka/Login - Logout/alertPasswordKosong'), 0)
        } else if (infoCondition == 'unameEmpty') {
            Mobile.verifyElementVisible(findTestObject('Rizka/Login - Logout/alertUsernameKosong'), 0)
        } else if (infoCondition == 'notValid') {
            Mobile.verifyElementVisible(findTestObject('Rizka/Login - Logout/alertUsername6Karakter'), 0)

            Mobile.verifyElementVisible(findTestObject('Rizka/Login - Logout/alertPass7Karakter'), 0)
        } else if (infoCondition == 'accNotRegistered') {
            Mobile.verifyElementVisible(findTestObject('Rizka/Login - Logout/alertUsernameTidakTerdaftar'), 0)
        } else {
            Mobile.verifyElementVisible(findTestObject('Rizka/Login - Logout/alertUsernameKataSandiSalah'), 0)
        }
    }
} else {
    if (Mobile.verifyElementVisible(findTestObject('Rizka/Login - Logout/fieldUsername'), 0, FailureHandling.OPTIONAL)) {
        Mobile.setText(findTestObject('Rizka/Login - Logout/fieldUsername'), username, 0)

        Mobile.setText(findTestObject('Rizka/Login - Logout/fieldPassword'), password, 0)

        Mobile.tap(findTestObject('Rizka/Login - Logout/btnMasuk'), 0, FailureHandling.STOP_ON_FAILURE)

        Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)
    }
    
    Mobile.tap(findTestObject('Rizka/Login - Logout/btnAkun'), 0)

    if (infoCondition == 'cancel') {
        Mobile.tap(findTestObject('Rizka/Login - Logout/btnKeluar'), 0)

        Mobile.tap(findTestObject('Rizka/Login - Logout/btnTidakKeluar'), 0)
    } else {
        Mobile.tap(findTestObject('Rizka/Login - Logout/btnKeluar'), 0)

        Mobile.tap(findTestObject('Rizka/Login - Logout/btnYaKeluar'), 0)
    }
}


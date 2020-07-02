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

WebUI.callTestCase(findTestCase('Christi/Login'), [('username') : username, ('password') : password], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Christi/login page/android.view.View0 - Akun'), 3)

Mobile.tap(findTestObject('Christi/profil page/android.view.View0 - Dealer ID'), 0)

if (status_akun != 'Belum Terverifikasi') {
    Mobile.tap(findTestObject('Christi/profil page/btn edit email'), 0)

    Mobile.tap(findTestObject('Christi/ubah email page/tap email lama'), 0)

    Mobile.setText(findTestObject('Christi/ubah email page/input email lama'), Email_Lama, 0)

    Mobile.tap(findTestObject('Christi/ubah email page/tap email baru'), 0)

    Mobile.setText(findTestObject('Christi/ubah email page/input email baru'), Email_Baru, 0)

    Mobile.tap(findTestObject('Christi/ubah email page/android.widget.Button0 - Ubah Email'), 0)

    WebUI.delay(5)

    if (expected == 'pass') {
        Mobile.pressBack()

        Mobile.tap(findTestObject('View Profile/btnKeluar'), 0)

        Mobile.tap(findTestObject('View Profile/btnYa Keluar'), 0)

        WebUI.delay(5)

        Mobile.tap(findTestObject('Alda/Login/tap_username'), 0)

        Mobile.setText(findTestObject('Alda/Login/input_username'), username, 0)

        Mobile.tap(findTestObject('Alda/Login/tap_password'), 0)

        Mobile.setText(findTestObject('Alda/Login/input_password'), password, 0)

        Mobile.tap(findTestObject('Alda/Login/button_masuk'), 0)

        WebUI.delay(5)

        Mobile.tap(findTestObject('Christi/login page/android.view.View0 - Akun'), 0)

        Mobile.tap(findTestObject('Christi/profil page/android.view.View0 - Dealer ID'), 0)

        Mobile.verifyElementVisible(findTestObject('Edit No.hp dan Email/Profile Status - Reverify'), 0)
    } else if (expected == 'fail') {
        switch (status_fail.toString()) {
            case 'new email empty':
                Mobile.verifyElementExist(findTestObject('Christi/ubah email page/email baru harus diisi'), 0)

                break
            case 'old email empty':
                Mobile.verifyElementExist(findTestObject('Christi/ubah email page/email lama harus diisi'), 0)

                break
            case 'old email wrong':
                Mobile.verifyElementExist(findTestObject('Christi/ubah email page/android.view.View0 - Email lama yang diinput tidak sesuai.'), 
                    0)

                break
            case 'new email to short':
                Mobile.verifyElementExist(findTestObject('Christi/ubah email page/android.view.View0 - Email minimal 7 karakter dan maksimal 50 karakter'), 
                    0)

                break
            case 'new email not valid':
                Mobile.verifyElementExist(findTestObject('Christi/ubah email page/android.view.View0 - Email baru tidak valid'), 
                    0)

                break
        }
    }
    
    WebUI.delay(5)
} else if (status_akun == 'Belum Terverifikasi') {
    Mobile.verifyElementVisible(findTestObject('Christi/ubah email page/android.view.View0 - Belum Terverifikasi'), 0)

    Mobile.verifyElementVisible(findTestObject('Christi/ubah email page/cannot edit email'), 0)

    Mobile.pressBack()

    WebUI.delay(5)
}

Mobile.closeApplication()


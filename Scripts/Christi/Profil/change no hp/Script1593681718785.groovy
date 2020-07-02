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

Mobile.startApplication('C:\\Users\\ASUS\\git\\ACC-ACCPartner\\accpartner_010720.apk', false)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Christi/login page/android.view.View0 - Akun'), 3)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Christi/profil page/android.view.View0 - Dealer ID'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Christi/profil page/btn edit no tlpn'), 0)

Mobile.tap(findTestObject('Christi/profil page/tap no hp lama'), 0)

Mobile.setText(findTestObject('Christi/profil page/Input_NoHpLama'), NoHp_Lama, 0)

Mobile.tap(findTestObject('Christi/profil page/tap no hp baru'), 0)

Mobile.setText(findTestObject('Christi/profil page/Input_HandPhoneBaru'), NoHp_Baru, 0)

Mobile.tap(findTestObject('Christi/profil page/android.widget.Button0 - Ubah'), 0)

if (expected == 'pass') {
    Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementVisible(findTestObject('Christi/profil page/android.view.View0 - Reverify'))
} else if (expected == 'fail') {
    switch (error.toString()) {
        case 'nomor lama salah':
            Mobile.verifyElementExist(findTestObject('Christi/profil page/android.view.View0 - No. Handphone lama yang diinput tidak sesuai'), 
                0)

            break
        case 'no baru tidak valid':
            Mobile.verifyElementExist(findTestObject('Christi/profil page/android.view.View0 - Nomor Ponsel Anda Tidak Valid'), 
                0)

            break
        case 'nomor lama tidak diisi':
            Mobile.verifyElementExist(findTestObject('Christi/profil page/No_Lama Harus Diisi'), 0)

            break
        case 'no baru tidak diisi':
            Mobile.verifyElementExist(findTestObject('Christi/profil page/No_Baru Harus Diisi'), 0)

            break
    }
}

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()


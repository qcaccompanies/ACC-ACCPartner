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

Mobile.tap(findTestObject('Christi/login page/android.view.View0 - Akun'), 3)

Mobile.delay(3)

Mobile.tap(findTestObject('Christi/performance page/android.widget.TextView0 - Selengkapnya'), 3)

Mobile.tap(findTestObject('Alda/Performance/dropdown_bulan_new (2)'), 0)

switch (var_bulan) {
    case 'Jan 2020':
        Mobile.tap(findTestObject('Alda/Performance/new/android.view.View0 - Jan 2020 (1)'), 0)

        break
    case 'Feb 2020':
        Mobile.tap(findTestObject('Alda/Performance/new/android.view.View0 - Feb 2020 (1)'), 0)

        break
    case 'Mar 2020':
        Mobile.tap(findTestObject('Alda/Performance/new/android.view.View0 - Mar 2020 (1)'), 0)

        break
    case 'Apr 2020':
        Mobile.tap(findTestObject('Alda/Performance/new/android.view.View0 - Apr 2020 (1)'), 0)

        break
    case 'Mei 2020':
        Mobile.tap(findTestObject('Alda/Performance/new/android.view.View0 - Mei 2020 (1)'), 0)

        break
    case 'Jun 2020':
        Mobile.tap(findTestObject('Alda/Performance/new/android.view.View0 - Jun 2020 (1)'), 0)

        break
    case 'Jul 2020':
        Mobile.tap(findTestObject('Alda/Performance/new/android.view.View0 - Jul 2020 (1)'), 0)

        break
    case 'Ags 2020':
        Mobile.tap(findTestObject('Alda/Performance/new/android.view.View0 - Ags 2020 (1)'), 0)

        break
    case 'Sep 2020':
        Mobile.tap(findTestObject('Alda/Performance/new/android.view.View0 - Sep 2020 (1)'), 0)

        break
    case 'Okt 2020':
        Mobile.tap(findTestObject('Alda/Performance/new/android.view.View0 - Okt 2020 (1)'), 0)

        break
    case 'Nov 2020':
        Mobile.tap(findTestObject('Alda/Performance/new/android.view.View0 - Nov 2020 (1)'), 0)

        break
    case 'Des 2020':
        Mobile.tap(findTestObject('Alda/Performance/new/android.view.View0 - Des 2020 (1)'), 0)

        break
}

Mobile.delay(3)

Mobile.verifyElementText(findTestObject('Alda/Performance/coba_verify', [('text') : var_bulan]), var_bulan)

Mobile.closeApplication()


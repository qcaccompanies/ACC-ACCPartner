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

WebUI.callTestCase(findTestCase('Login'), [('var_username') : username, ('var_password') : katasandi, ('expected_login') : expected
        , ('status_login') : '', ('press_back_button') : '', ('close_app') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

Mobile.tap(findTestObject('ViewProfileObject/HomeBtnProfile'), 0)

Mobile.tap(findTestObject('ViewProfileObject/ViewProfile'), 0)

WebUI.delay(5)

Mobile.tap(findTestObject('New Photo Profile/ChangePhoto (1)'), 0)

Mobile.tap(findTestObject('New Photo Profile/Select Cameraa'), 0)

WebUI.delay(5)

Mobile.tap(findTestObject('New Photo Profile/Take Photo Btn'), 0)

Mobile.tap(findTestObject('New Photo Profile/notify Coba Ulang OK'), 1)

not_run: Mobile.verifyElementVisible(findTestObject('New Photo Profile/Notify Photo Berhasil Upload'), 1)

WebUI.delay(5)

Mobile.tap(findTestObject('New Photo Profile/ChangePhoto (2)'), 0)

WebUI.delay(5)

Mobile.tap(findTestObject('New Photo Profile/Select Galery'), 0)

WebUI.delay(5)

Mobile.tap(findTestObject('New Photo Profile/namaFoto', [('text') : namafoto]), 0)

not_run: Mobile.verifyElementVisible(findTestObject('New Photo Profile/Notify Photo Berhasil Upload'), 0)

WebUI.delay(5)

Mobile.tap(findTestObject('ViewProfileObject/Back to Profile'), 0)

Mobile.tap(findTestObject('ViewProfileObject/btnKeluar'), 0)

Mobile.tap(findTestObject('ViewProfileObject/btnYa Keluar'), 0)

Mobile.closeApplication()


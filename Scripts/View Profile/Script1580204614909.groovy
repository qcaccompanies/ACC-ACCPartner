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

not_run: WebUI.callTestCase(findTestCase('Alda/Login dan Logout/Login'), [('var_username') : username, ('var_password') : katasandi
        , ('expected_login') : expectedlogin, ('status_login') : '', ('press_back_button') : '', ('close_app') : ''], FailureHandling.STOP_ON_FAILURE)

Mobile.startApplication('G:\\accpartner.apk', false)

WebUI.delay(15)

Mobile.tap(findTestObject('View Profile/HomeBtnProfile'), 0)

Mobile.tap(findTestObject('View Profile/ViewProfile'), 0)

if (expectedlogin == 'pass') {
    Mobile.verifyElementVisible(findTestObject('View Profile/View_Profile - Nama User'), 0)

    Mobile.verifyElementVisible(findTestObject('View Profile/View_Profile - Job User'), 0)

    Mobile.verifyElementVisible(findTestObject('View Profile/View_Profile - Status User'), 0)

    Mobile.verifyElementVisible(findTestObject('View Profile/View_Profile - Bergabung'), 0)

    Mobile.verifyElementVisible(findTestObject('View Profile/View_Profile - Daeler'), 0)

    Mobile.verifyElementVisible(findTestObject('View Profile/View_Profile - Alamat Daeler'), 0)

    Mobile.verifyElementVisible(findTestObject('View Profile/View_Profile - Email User'), 0)

    Mobile.verifyElementVisible(findTestObject('View Profile/View_Profile - No.HP User'), 0)

    Mobile.verifyElementVisible(findTestObject('View Profile/View_Profile - Username'), 0)
}

Mobile.tap(findTestObject('View Profile/Back to Profile'), 0)

not_run: Mobile.tap(findTestObject('View Profile/btnKeluar'), 0)

not_run: Mobile.tap(findTestObject('View Profile/btnTidak Keluar'), 0)

Mobile.closeApplication()


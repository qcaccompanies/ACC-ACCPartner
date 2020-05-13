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

WebUI.callTestCase(findTestCase('Alda/Login dan Logout/Login'), [('var_username') : var_username, ('var_password') : var_password
        , ('expected_login') : '', ('status_login') : '', ('press_back_button') : '', ('close_app') : ''], FailureHandling.STOP_ON_FAILURE)

if (expected_login == 'passed') {
    Mobile.tap(findTestObject('Alda/Logout/tap_akun_new'), 0)

    Mobile.tap(findTestObject('Alda/Logout/tap_keluar_new'), 0)

    if (expected_logout == 'passed') {
        if (status_logout == 'yes') {
            Mobile.tap(findTestObject('Alda/Logout/tap_ya_logout'), 0)
        } else if (status_logout == 'no') {
            Mobile.tap(findTestObject('Alda/Logout/tap_tidak_logout'), 0)
        }
    }
}


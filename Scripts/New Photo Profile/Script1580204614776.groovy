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

not_run: WebUI.callTestCase(findTestCase('Login dan Logout/Login'), [('var_username') : username, ('var_password') : katasandi
        , ('expected_login') : expected, ('status_login') : '', ('press_back_button') : '', ('close_app') : ''], FailureHandling.STOP_ON_FAILURE)

Mobile.startApplication('G:\\accpartner.apk', false)

WebUI.delay(5)

Mobile.tap(findTestObject('View Profile/HomeBtnProfile'), 0)

Mobile.tap(findTestObject('View Profile/ViewProfile'), 0)

WebUI.delay(5)

if (UploadBy == 'Camera') {
    Mobile.tap(findTestObject('New Photo Profile/New Photo - ChangePhoto (1)'), 0)

    Mobile.tap(findTestObject('New Photo Profile/New Photo - Select Cameraa'), 0)

    WebUI.delay(5)

    if (cancel == 'No') {
        if (ulangTake == 'No') {
            Mobile.tap(findTestObject('New Photo Profile/New Photo - btn_Take_Picture'), 0)

            Mobile.tap(findTestObject('New Photo Profile/New Photo - Take_Picture - Oke'), 1)
        } else {
            Mobile.tap(findTestObject('New Photo Profile/New Photo - btn_Take_Picture'), 0)

            Mobile.tap(findTestObject('New Photo Profile/New Photo - Take_Picture - Ulangi'), 1)

            Mobile.tap(findTestObject('New Photo Profile/New Photo - btn_Take_Picture'), 0)

            Mobile.tap(findTestObject('New Photo Profile/New Photo - Take_Picture - Oke'), 1)
        }
        
        WebUI.delay(5)

        not_run: Mobile.verifyElementVisible(findTestObject('New Photo Profile/Notify Photo Berhasil Upload'), 1)
    } else {
        Mobile.tap(findTestObject('New Photo Profile/New Photo - Take_Picture - Batal'), 1)

        WebUI.delay(5)

        Mobile.tap(findTestObject('New Photo Profile/New Photo - Batal Select Camera or Gallery'), 1)
    }
} else {
    Mobile.tap(findTestObject('New Photo Profile/New Photo - ChangePhoto (2)'), 0)

    WebUI.delay(5)

    Mobile.tap(findTestObject('New Photo Profile/New Photo - Select Galery'), 0)

    WebUI.delay(5)

    if (cancel == 'No') {
        Mobile.scrollToText(namafoto, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('New Photo Profile/New Photo - Gallery Select Photo'), 0)

        not_run: Mobile.verifyElementVisible(findTestObject('New Photo Profile/Notify Photo Berhasil Upload'), 0)

        WebUI.delay(10)
    } else {
        Mobile.pressBack()

        WebUI.delay(5)

        Mobile.tap(findTestObject('New Photo Profile/New Photo - Batal Select Camera or Gallery'), 1)
    }
}

Mobile.tap(findTestObject('View Profile/Back to Profile'), 0)

Mobile.closeApplication()


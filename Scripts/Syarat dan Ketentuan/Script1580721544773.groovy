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

Mobile.startApplication('G:\\accpartner.apk', false)

Mobile.tap(findTestObject('ViewProfileObject/HomeBtnProfile'), 0)

Mobile.tap(findTestObject('Syarat dan Ketentuan/Profile - Syarat dan Ketentuan'), 0)

if (expectedLogin == 'Passed') {
    Mobile.tap(findTestObject('Syarat dan Ketentuan/SK - Syarat Ketentuan'), 0)

    not_run: Mobile.swipe(100, 300, 100, 1070)

    Mobile.tap(findTestObject('Syarat dan Ketentuan/SK - Syarat Ketentuan'), 0)

    Mobile.tap(findTestObject('Syarat dan Ketentuan/SK - Hak Cipta dan Merek Dagang'), 0)

    Mobile.verifyElementVisible(findTestObject('Syarat dan Ketentuan/Desc Hak Cipta'), 0)

    Mobile.tap(findTestObject('Syarat dan Ketentuan/SK - Hak Cipta dan Merek Dagang'), 0)

    Mobile.tap(findTestObject('Syarat dan Ketentuan/SK - Tentang Aplikasi'), 0)

    Mobile.tap(findTestObject('Syarat dan Ketentuan/SK - Tentang Aplikasi'), 0)

    not_run: CustomKeywords.'mobile.ScrollUpDown.UpDown'(100, 0, 100, 10)

    not_run: Mobile.swipe(100, 300, 100, 800)

    not_run: Mobile.verifyElementVisible(findTestObject('Syarat dan Ketentuan/Desc Tentang Aplikasi'), 0)

    Mobile.tap(findTestObject('Syarat dan Ketentuan/SK - Penggunaan Aplikasi'), 0)

    Mobile.tap(findTestObject('Syarat dan Ketentuan/SK - Penggunaan Aplikasi'), 0)

    Mobile.tap(findTestObject('Syarat dan Ketentuan/SK - Penggunaan Aplikasi Lain'), 0)

    Mobile.tap(findTestObject('Syarat dan Ketentuan/SK - Penggunaan Aplikasi Lain'), 0)

    Mobile.tap(findTestObject('Syarat dan Ketentuan/SK - Cidera Janji'), 0)

    Mobile.tap(findTestObject('Syarat dan Ketentuan/SK - Cidera Janji'), 0)

    Mobile.tap(findTestObject('Syarat dan Ketentuan/SK - Pembatasan Tanggung Jawab'), 0)

    Mobile.tap(findTestObject('Syarat dan Ketentuan/SK - Pembatasan Tanggung Jawab'), 0)
}

Mobile.closeApplication()


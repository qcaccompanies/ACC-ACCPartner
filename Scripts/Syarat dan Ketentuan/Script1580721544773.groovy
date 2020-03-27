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

Mobile.tap(findTestObject('View Profile/HomeBtnProfile'), 0)

Mobile.tap(findTestObject('Syarat dan Ketentuan/Profile - Syarat dan Ketentuan'), 0)

if (expectedLogin == 'Passed') {
    Mobile.tap(findTestObject('Syarat dan Ketentuan/Syarat Ketentuan 1'), 0)

    Mobile.verifyElementVisible(findTestObject('Syarat dan Ketentuan/Syarat Ketentuan 1 - isi'), 0)

    Mobile.tap(findTestObject('Syarat dan Ketentuan/Syarat Ketentuan 2'), 0)

    Mobile.verifyElementVisible(findTestObject('Syarat dan Ketentuan/Syarat Ketentuan 2 - isi'), 0)

    Mobile.tap(findTestObject('Syarat dan Ketentuan/Syarat Ketentuan 3'), 0)

    Mobile.verifyElementVisible(findTestObject('Syarat dan Ketentuan/Syarat Ketentuan 3 - isi'), 0)
}

Mobile.setText(findTestObject('Syarat dan Ketentuan/Search Box Syarat Ketentuan'), search1, 0)

Mobile.clearText(findTestObject('Syarat dan Ketentuan/Search Box Syarat Ketentuan'), 0)

Mobile.setText(findTestObject('Syarat dan Ketentuan/Search Box Syarat Ketentuan'), search2, 0)

Mobile.tap(findTestObject('Pusat Bantuan/back To Profille'), 0)

Mobile.closeApplication()


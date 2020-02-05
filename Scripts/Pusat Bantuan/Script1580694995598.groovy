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

Mobile.tap(findTestObject('Pusat Bantuan/Pusat Bantuan'), 0)

if (expectedlogin == 'passed') {
    Mobile.tap(findTestObject('Pusat Bantuan/FAQ1'), 0)

    not_run: Mobile.verifyElementVisible(findTestObject('Pusat Bantuan/FAQ2'), 0)

    Mobile.tap(findTestObject('Pusat Bantuan/FAQ2'), 0)

    Mobile.verifyElementVisible(findTestObject('Pusat Bantuan/FAQ2A'), 0)

    Mobile.tap(findTestObject('Pusat Bantuan/FAQ3'), 0)

    Mobile.verifyElementVisible(findTestObject('Pusat Bantuan/FAQ3A'), 0)

    Mobile.tap(findTestObject('Pusat Bantuan/FAQ4'), 0)

    Mobile.verifyElementVisible(findTestObject('Pusat Bantuan/FAQ4A'), 0)

    Mobile.tap(findTestObject('Pusat Bantuan/FAQ5'), 0)

    Mobile.verifyElementVisible(findTestObject('Pusat Bantuan/FAQ5A'), 0)

    not_run: Mobile.scrollToText('1', FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Pusat Bantuan/FAQ6'), 0)

    not_run: Mobile.verifyElementVisible(findTestObject('Pusat Bantuan/FAQ - A6'), 0)

    not_run: Mobile.tap(findTestObject('Pusat Bantuan/FAQ - Q7'), 0)

    not_run: Mobile.verifyElementVisible(findTestObject('Pusat Bantuan/FAQ - A7'), 0)

    not_run: Mobile.tap(findTestObject('Pusat Bantuan/FAQ - Q8'), 0)

    not_run: Mobile.verifyElementVisible(findTestObject('Pusat Bantuan/FAQ - A8'), 0)

    not_run: Mobile.tap(findTestObject('Pusat Bantuan/FAQ - Q9'), 0)

    not_run: Mobile.verifyElementVisible(findTestObject('Pusat Bantuan/FAQ - A9'), 0)

    not_run: Mobile.tap(findTestObject('Pusat Bantuan/FAQ - Q10'), 0)

    not_run: Mobile.verifyElementVisible(findTestObject('Pusat Bantuan/FAQ - A10'), 0)

    not_run: Mobile.tap(findTestObject('Pusat Bantuan/FAQ - Q11'), 0)

    not_run: Mobile.verifyElementVisible(findTestObject('Pusat Bantuan/FAQ - A11'), 0)

    not_run: Mobile.tap(findTestObject('Pusat Bantuan/FAQ - Q12'), 0)

    not_run: Mobile.verifyElementVisible(findTestObject('Pusat Bantuan/FAQ - A12'), 0)

    not_run: Mobile.tap(findTestObject('Pusat Bantuan/FAQ - Q13'), 0)

    not_run: Mobile.verifyElementVisible(findTestObject('Pusat Bantuan/FAQ - A13'), 0)

    not_run: Mobile.tap(findTestObject('Pusat Bantuan/FAQ - Q14'), 0)

    not_run: Mobile.tap(findTestObject('Pusat Bantuan/FAQ - Q15'), 0)

    not_run: Mobile.tap(findTestObject('Pusat Bantuan/FAQ - Q16'), 0)

    not_run: Mobile.tap(findTestObject('Pusat Bantuan/FAQ - Q17'), 0)

    not_run: Mobile.tap(findTestObject('Pusat Bantuan/FAQ - Q18'), 0)

    not_run: Mobile.tap(findTestObject('Pusat Bantuan/FAQ - Q19'), 0)

    not_run: Mobile.tap(findTestObject('Pusat Bantuan/FAQ - Q20'), 0)

    not_run: Mobile.tap(findTestObject('Pusat Bantuan/FAQ - Q21'), 0)
}

Mobile.setText(findTestObject('Pusat Bantuan/Search box FAQ'), 'FAQ', 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Pusat Bantuan/Search box FAQ'), search2, 0)

Mobile.tap(findTestObject('Pusat Bantuan/back To Profille'), 0)

Mobile.closeApplication()


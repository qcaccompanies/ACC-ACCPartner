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

Mobile.startApplication('C:\\Users\\asus\\Downloads\\accpartner (3).apk', true)

WebUI.callTestCase(findTestCase('Login dan Logout/Login'), [('var_username') : var_username, ('var_password') : var_password
        , ('expected_login') : expected_login, ('status_login') : status_login, ('press_back_button') : '', ('close_app') : ''], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Performance/tap_performance'), 0)

Mobile.tap(findTestObject('Performance/tap_menu_performance'), 0)

Mobile.tap(findTestObject('Performance/dd_bulan'), 0)

Mobile.tap(findTestObject('Performance/tap_input_bulan_performance', [('text') : var_bulan]), 0)


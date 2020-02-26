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

Mobile.startApplication('C:\\Users\\Asus\\Downloads\\accpartner.apk', true)

Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/android.widget.EditText0'), 'fityan', 0)

Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/android.widget.EditText0 (1)'), '081234567890', 0)

Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/android.widget.Image0 - acc_partner_theme.CameraAdd'), 
    0)

Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/android.view.View0 - Camera'), 0)

Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/android.view.View0 - acc_partner_theme.photocamera'), 0)

Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/android.widget.Button0 - Konfirmasi'), 0)

Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/android.widget.Button0 - Ajukan Pembiayaan'), 0)

Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/android.view.View0 - Info Pengajuan'), 0)

Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/android.view.View0 - Asuransi'), 0)

Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/android.view.View0 - Asuransi'), 0)

Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/android.view.View0 - Data Debitur'), 0)

Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/android.view.View0 - Data Debitur'), 0)

Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/android.widget.EditText0 (2)'), 'tidak ada ', 0)

Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/android.widget.Button0 - Ya Informasi Sudah Benar'), 0)

Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/android.widget.Button0 - Selesai'), 0)

Mobile.closeApplication()


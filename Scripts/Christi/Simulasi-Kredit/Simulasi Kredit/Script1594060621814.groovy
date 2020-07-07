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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('C:\\Users\\ASUS\\git\\Clone ACCPartner 06072020\\accpartner_010720.apk', true)

Mobile.tap(findTestObject('Christi/simulasi kredit page/Btn Simulasi Kredit'), 0)

Mobile.tap(findTestObject('Christi/simulasi kredit page/paket kredit off'), 0)

Mobile.tap(findTestObject('Christi/simulasi kredit page/android.widget.EditText0 - Area Pengajuan'), 0)

Mobile.tap(findTestObject('Christi/simulasi kredit page/pilih area pengajuan'), 0)

Mobile.tap(findTestObject('Christi/simulasi kredit page/android.widget.EditText - tap Cabang ACC'), 0)

Mobile.setText(findTestObject('Christi/simulasi kredit page/android.widget.EditText - input cabang acc'), 'KUDUS', 0)

Mobile.tap(findTestObject('Christi/simulasi kredit page/pilih cabang acc'), 0)

Mobile.tap(findTestObject('Christi/simulasi kredit page/tap brand'), 0)

Mobile.setText(findTestObject('Christi/simulasi kredit page/android.widget.EditText - input brand'), 'DAIHATSU', 0)

Mobile.tap(findTestObject('Christi/simulasi kredit page/pilih nama brand'), 0)

Mobile.tap(findTestObject('Christi/simulasi kredit page/tap type'), 0)

Mobile.setText(findTestObject('Christi/simulasi kredit page/android.widget.EditText - input type'), 'TERIOS', 0)

Mobile.tap(findTestObject('Christi/simulasi kredit page/tap model'), 0)

Mobile.setText(findTestObject('Christi/simulasi kredit page/android.widget.EditText0 - input model'), 'R AT CUSTOM ', 0)

Mobile.tap(findTestObject('Christi/simulasi kredit page/tap tahun'), 0)

Mobile.setText(findTestObject('Christi/simulasi kredit page/android.widget.EditText - input tahun'), '2020', 0)

Mobile.tap(findTestObject('Christi/simulasi kredit page/android.view.View0 - 2020'), 0)

Mobile.tap(findTestObject('Christi/simulasi kredit page/tap otr'), 0)

Mobile.setText(findTestObject('Christi/simulasi kredit page/android.widget.EditText - input otr'), '5000000', 0)

not_run: Mobile.getText(findTestObject('Christi/simulasi kredit page/android.widget.TextView0 - Harga OTR Mobil Minimal Rp. 20.000.000'), 
    0)

not_run: Mobile.getText(findTestObject('Christi/simulasi kredit page/android.widget.TextView0 - Harus diisi'), 0)

not_run: Mobile.getText(findTestObject('Christi/simulasi kredit page/android.widget.TextView0 - Harus diisi'), 0)

Mobile.tap(findTestObject('Christi/simulasi kredit page/android.widget.EditText - input persen'), 0)

Mobile.tap(findTestObject('Christi/simulasi kredit page/android.widget.EditText - input rupiah'), 0)

Mobile.tap(findTestObject('Christi/simulasi kredit page/pilih periode pembiayaan'), 0)

Mobile.tap(findTestObject('Christi/simulasi kredit page/pilih pembayaran angsuran ADDB'), 0)

Mobile.tap(findTestObject('Christi/simulasi kredit page/pilih pembayaran angsuran'), 0)

Mobile.getText(findTestObject('Christi/simulasi kredit page/android.widget.TextView0 - Harus diisi (1)'), 0)

Mobile.tap(findTestObject('Christi/simulasi kredit page/android.widget.EditText0 (11)'), 0)

Mobile.getText(findTestObject('Christi/simulasi kredit page/android.widget.TextView0 - Panjang TDP minimal 8 digit.'), 0)

Mobile.setText(findTestObject('Christi/simulasi kredit page/android.widget.EditText0 (12)'), '12345000', 0)

Mobile.tap(findTestObject('Christi/simulasi kredit page/android.widget.EditText0 (13)'), 0)

Mobile.getText(findTestObject('Christi/simulasi kredit page/android.widget.TextView0 - Panjang Angsuran minimal 6 digit.'), 
    0)

Mobile.tap(findTestObject('Christi/simulasi kredit page/android.widget.EditText0 (14)'), 0)

Mobile.getText(findTestObject('Christi/simulasi kredit page/android.widget.TextView0 - Panjang PDC minimal 4 digit.'), 0)

Mobile.tap(findTestObject('Christi/simulasi kredit page/android.widget.Button0 - Pilih Asuransi'), 0)

Mobile.closeApplication()


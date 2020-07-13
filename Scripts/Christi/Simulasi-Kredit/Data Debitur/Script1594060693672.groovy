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
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.delay(3)

Mobile.tap(findTestObject('Christi/simulasi kredit page/Data Debitur/tap input nama'), 0)

Mobile.setText(findTestObject('Christi/simulasi kredit page/Data Debitur/Set nama'), NamaKTP, 0)

Mobile.tap(findTestObject('Christi/simulasi kredit page/Data Debitur/tap no hp'), 0)

if (fail == 'nama ktp empty') {
    Mobile.verifyElementExist(findTestObject('Christi/simulasi kredit page/android.widget.TextView0 - Nama harus diisi'), 
        3)
} else if (fail == 'nama ktp (3-30 karakter)') {
    Mobile.verifyElementExist(findTestObject('Christi/simulasi kredit page/android.widget.TextView0 - Panjang karakter Nama harus diantara 3 sampai 30'), 
        3)
} else {
    Mobile.setText(findTestObject('Christi/simulasi kredit page/Data Debitur/set input no hp'), NoHP, 0)

    if (fail == 'no hp empty') {
        Mobile.verifyElementExist(findTestObject('Christi/simulasi kredit page/android.widget.TextView0 - No.Handphone Harus Diisi'), 
            3)
    } else if (fail == 'no hp (10-15 digit)') {
        Mobile.verifyElementExist(findTestObject('Christi/simulasi kredit page/android.widget.TextView0 - Panjang karakter No.Handphone harus diantara 10 sampai 15'), 
            3)
    } else {
        WebUI.delay(3)

        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/Data Debitur - Btn Add KTP'), 0)

        if (UploadBy == 'Camera') {
            Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/Data Debitur - Camera Upload'), 0)

            Mobile.tap(findTestObject('Christi/simulasi kredit page/Data Debitur/android.widget.Image0 - acc_partner_theme.photocamera'), 
                0)

            not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/Data Debitur - Camera Shoot'), 0)

            WebUI.delay(3)

            Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/Data Debitur - Camera Konfirmasi'), 0)
        } else if (UploadBy == 'Gallery') {
            Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/Data Debitur - Galery Upload'), 0)

            Mobile.scrollToText(FileName, FailureHandling.STOP_ON_FAILURE)

            Mobile.doubleTap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/Data Debitur - Upload FileName'), 0)
        }
        
        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/android.widget.Button0 - Ajukan Pembiayaan'), 0)

        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/Data Debitur - Info Asuransi'), 0)

        not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/Data Debitur - Info Pengajuan'), 0)

        not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/Data Debitur - Info Asuransi'), 0)

        not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/Data Debitur - Info Data Debitur'), 0)

        not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/Data Debitur - Info Data Debitur'), 0)

        not_run: Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Ringkasan_Pengajuan/Ringkasan - Set Text Pengajuan'), 
            'testing apps', 0)

        not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/Data Debitur - Informasi Sudah Benar'), 
            0)

        not_run: WebUI.delay(10)

        not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/Data Debitur - Btn Selesai'), 0)

        not_run: WebUI.delay(10)
    }
}

WebUI.delay(5)


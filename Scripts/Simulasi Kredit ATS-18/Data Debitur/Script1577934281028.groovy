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

Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/Nama_Sesuai_KTP'), NamaKTP, 0)

Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/On_No.Hp'), 0)

Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/On_No.Hp'), NoHP, 0)

if (AdaFoto == 'Ada') {
    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Ktp'), 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/Galleri_BTN'), 0)

    Mobile.scrollToText(Picture, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/SelectFoto', [('text') : Picture]), 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/NPWP'), 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/Galleri_BTN'), 0)

    Mobile.scrollToText(Picture, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/SelectFoto', [('text') : Picture]), 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/KartuKeluarga'), 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/Galleri_BTN'), 0)

    Mobile.scrollToText(Picture, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/SelectFoto', [('text') : Picture]), 0)

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/Ajukan_Pembiayaan_BTN'), 0)

    if (Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/Alert_No_Hp_Harus_Diisi'), 0, 
        FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/Ajukan_Pembiayaan_BTN'), 0, FailureHandling.STOP_ON_FAILURE)
    } else {
        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Ringkasan_Pengajuan/Drop_Down_Ringkasan_Asuransi'), 0)

        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Ringkasan_Pengajuan/Drop_Down_Data_Debitur'), 0)

        Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Ringkasan_Pengajuan/Btn_Informasi_Sudah_Benar'), 0)

        Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Ringkasan_Pengajuan/Selesai_BTN'), 0)
    }
} else {
    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/Ajukan_Pembiayaan_BTN'), 0)

    Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Ringkasan_Pengajuan/Alert_KTP_Harus_Diupload'), 
        0)
}


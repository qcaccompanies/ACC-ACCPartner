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

WebUI.delay(0)

Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/android.widget.EditText0'), NamaKTP, 0)

Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/android.widget.EditText0 (1)'), NoHP, 0)

WebUI.delay(3)

Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/Add_KTP_ByCamera'), 0)

Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/android.view.View0 - Camera'), 0)

Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/android.view.View0 - acc_partner_theme.photocamera'), 0)

WebUI.delay(3)

Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/android.widget.Button0 - Konfirmasi'), 0)

not_run: WebUI.delay(8)

not_run: WebUI.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/Notify_Berhasill_Upload_KTP'))

WebUI.delay(3)

Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/android.widget.Button0 - Ajukan Pembiayaan'), 0)

Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/android.view.View0 - Info Pengajuan'), 0)

Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/android.view.View0 - Asuransi'), 0)

Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/android.view.View0 - Asuransi'), 0)

Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/android.view.View0 - Data Debitur'), 0)

Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/android.view.View0 - Data Debitur'), 0)

Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Ringkasan_Pengajuan/set_text_pengajuan'), 'testing apps', 0)

Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/android.widget.Button0 - Ya Informasi Sudah Benar'), 0)

WebUI.delay(10)

Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/android.widget.Button0 - Selesai'), 0)

not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/SetNama'), 0, FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/SetNama'), NamaKTP, 0)

not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/SetNoHP'), 0)

not_run: Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/SetNoHP'), NoHP, 0)

not_run: if (AdaFoto == 'Ada') {
    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Add_KTP'), 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Upload_By_Camera'), 0)

    not_run: Mobile.scrollToText(Picture, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Capture_Kamera'), 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Btn_Konfirmasi'), 0)

    Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Verify_Upload_Done_KTP'), 0)

    not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Add_NPWP'), 0)

    not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/Galleri_BTN'), 0)

    not_run: Mobile.scrollToText(Picture, FailureHandling.STOP_ON_FAILURE)

    not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/SelectFoto', [('text') : Picture]), 0)

    not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Add_KK'), 0)

    not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/Galleri_BTN'), 0)

    not_run: Mobile.scrollToText(Picture, FailureHandling.STOP_ON_FAILURE)

    not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/SelectFoto', [('text') : Picture]), 0)

    not_run: Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Btn_Ajukan_pembiayaan'), 0)

    if (Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Data_Debitur/Alert_No_Hp_Harus_Diisi'), 0, 
        FailureHandling.OPTIONAL)) {
        Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Btn_Ajukan_pembiayaan'), 0, FailureHandling.STOP_ON_FAILURE)
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

    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)
}


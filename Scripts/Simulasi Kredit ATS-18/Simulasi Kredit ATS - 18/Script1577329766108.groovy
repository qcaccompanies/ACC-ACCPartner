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

WebUI.callTestCase(findTestCase('StartApplication'), [:], FailureHandling.STOP_ON_FAILURE)

if (PaketOnOff == 'On') {
    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Btn_Tambah_Simulasi'), 0)

    Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/PaketOn'), 0)

    not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Area_Pengajuan'), 0)

    not_run: Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Area_Pengajuan'), AreaPengajuan, 0)

    not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Select', [('text') : AreaPengajuan]), 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Cabang_ACC'), 0)

    Mobile.clearText(findTestObject('Simulasi Kredit ATS - 18/Cabang_ACC'), 0)

    Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Cabang_ACC'), Cabang, 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Select', [('text') : Cabang]), 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Paket_Simulasi'), 0)

    Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Paket_Simulasi'), Paket, 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Brand_Simulasi'), 0)

    Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Brand_Simulasi'), Brand, 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Select', [('text') : Brand]), 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Type_Simulasi'), 0)

    Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Type_Simulasi'), Type, 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Select', [('text') : Type]), 0)

    Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Model_Simulasi'), Model, 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Select', [('text') : Model]), 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Tahun_Simulasi'), 0)

    Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Tahun_Simulasi'), Tahun, 0)

    CustomKeywords.'mobile.ScrollUpDown.UpDown'(100, 0, 100, 100)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Tahun_Option (1)'), 0)

    not_run: Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/OTR_Simulation'), OTR, 0)

    not_run: Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/DP_Percent_Simulation'), DP_PERSEN, 0)

    not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Dp_Nominal'), 0)

    not_run: Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    not_run: Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Dp_Nominal'), DP_UANG, 0)

    not_run: CustomKeywords.'mobile.ScrollUpDown.UpDown'(0, 1582, 0, 1582)

    Mobile.swipe(100, 970, 300, 970)

    if (Periode == '12') {
        Mobile.tapAtPosition(70, 1197)
    } else if (Periode == '24') {
        Mobile.tapAtPosition(307, 1197)
    } else if (Periode == '36') {
        Mobile.tapAtPosition(540, 1197)
    } else if (Periode == '48') {
        Mobile.tapAtPosition(777, 1197)
    } else if (Periode == '60') {
        Mobile.tapAtPosition(1010, 1197)
    }
} else if (PaketOnOff == 'Off') {
    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Btn_Tambah_Simulasi'), 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Paket_Kredit'), 0)

    Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/PaketOff'), 0)

    not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Area_Pengajuan'), 0)

    not_run: Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Area_Pengajuan'), AreaPengajuan, 0)

    not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Select', [('text') : AreaPengajuan]), 0)

    not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Set_CabangACCOFF'), 0)

    not_run: Mobile.clearText(findTestObject('Simulasi Kredit ATS - 18/Set_CabangACCOFF'), 0)

    not_run: Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Set_CabangACCOFF'), Cabang, 0)

    not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Select', [('text') : Cabang]), 0)

    not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Paket_Simulasi'), 0)

    not_run: Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Paket_Simulasi'), Paket, 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Set_BrandOFF'), 0)

    Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Set_BrandOFF'), Brand, 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Select', [('text') : Brand]), 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Set_Type_OFF'), 0)

    Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Set_Type_OFF'), Type, 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Select', [('text') : Type]), 0)

    Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Set_ModelOFF'), Model, 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Select', [('text') : Model]), 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Set_TahunOFF'), 0)

    Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Set_TahunOFF'), Tahun, 0)

    CustomKeywords.'mobile.ScrollUpDown.UpDown'(100, 0, 100, 100)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Option2019'), 0)

    Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Set_OTR_OFF'), OTR, 0)

    not_run: Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Set_PersenOFF'), DP_PERSEN, 0)

    not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Set_NominalOFF'), DP_UANG)

    not_run: Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    not_run: Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Set_NominalOFF'), DP_UANG, 0)

    not_run: CustomKeywords.'mobile.ScrollUpDown.UpDown'(0, 1582, 0, 1582)

    Mobile.swipe(100, 970, 300, 970)

    if (Periode == '12') {
        Mobile.tapAtPosition(70, 1197)
    } else if (Periode == '24') {
        Mobile.tapAtPosition(307, 1197)
    } else if (Periode == '36') {
        Mobile.tapAtPosition(540, 1197)
    } else if (Periode == '48') {
        Mobile.tapAtPosition(777, 1197)
    } else if (Periode == '60') {
        Mobile.tapAtPosition(1010, 1197)
    }
    
    not_run: Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Set_TDP_OFF'), TDP, 0)

    not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Set_AngsuranOFF (1)'), 0)

    not_run: Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Set_AngsuranOFF (1)'), Angsuran, 0)

    not_run: Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Set_PDC_OFF (1)'), PDC, 0)

    Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/android.widget.EditText0 (1)'), TDP, 0)

    Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/android.widget.EditText0 (2)'), Angsuran, 0)

    Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/android.widget.EditText0 (3)'), PDC, 0)
}

Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Simulasi_Pilih Asuransi'), 0)

WebUI.callTestCase(findTestCase('Simulasi Kredit ATS-18/Asuransi'), [('Tahun2') : Tahun2, ('Tahun3') : Tahun3, ('Tahun4') : Tahun4
        , ('Tahun5') : Tahun5, ('Pembayaran1') : Pembayaran1, ('Pembayaran2') : Pembayaran2, ('Pembayaran3') : Pembayaran3
        , ('Pembayaran4') : Pembayaran4, ('Pembayaran5') : Pembayaran5, ('CreditProtection') : CreditProtection, ('Plat') : Plat], 
    FailureHandling.STOP_ON_FAILURE)


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

Mobile.startApplication('C:\\Users\\ASUS\\git\\Clone ACCPartner 06072020\\accpartner_010720.apk', false)

Mobile.tap(findTestObject('Christi/simulasi kredit page/Btn Simulasi Kredit'), 3)

Mobile.tap(findTestObject('Christi/simulasi kredit page/tap area pengajuan'), 0)

switch (AreaPengajuan.toString()) {
    case 'DKI Jakarta, Banten, Jawa Barat':
        Mobile.tap(findTestObject('Christi/simulasi kredit page/android.view.View0 - DKI Jakarta Banten Jawa Barat'), 0)

        break
    case 'Jawa Tengah dan DIY':
        Mobile.tap(findTestObject('Christi/simulasi kredit page/android.view.View0 - Jawa Tengah dan DIY'), 0)

        break
    case 'Jawa Timur, Bali dan sekitarnya':
        Mobile.tap(findTestObject('Christi/simulasi kredit page/android.view.View0 - Jawa Timur Bali dan sekitarnya'), 0)

        break
    case 'Kalimantan, Sulawesi, Papua dan sekitarnya':
        Mobile.tap(findTestObject('Christi/simulasi kredit page/android.view.View0 - Kalimantan Sulawesi Papua dan sekitarnya'), 
            0)

        break
    case 'Sumatera dan sekitarnya':
        Mobile.tap(findTestObject('Christi/simulasi kredit page/android.view.View0 - Sumatera dan sekitarnya'), 0)

        break
}

Mobile.tap(findTestObject('Christi/simulasi kredit page/tap cabang'), 0)

Mobile.setText(findTestObject('Christi/simulasi kredit page/android.widget.EditText - Cabang'), Cabang, 0)

Mobile.tap(findTestObject('Christi/simulasi kredit page/android.view.View0 - Select Cabang', [('text') : Cabang]), 0)

if (PaketOnOff == 'On') {
    Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/PaketOn'), 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Paket_Simulasi'), 0)

    Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Paket_Simulasi'), Paket, 0)
} else if (PaketOnOff == 'Off') {
    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Paket_Kredit'), 0)

    Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/PaketOff'), 0)
}

Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Simulasi/Simulasi _ Set_Brand'), 2)

Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Simulasi/Simulasi _ Set_Brand'), Brand, 0)

Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Select', [('text') : Brand]), 0)

if (Mobile.verifyElementNotExist(findTestObject('Christi/simulasi kredit page/android.widget.TextView0 - Harus dipilih'), 
    3)) {
    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Type_Simulasi'), 0)

    Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Type_Simulasi'), Type, 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Select', [('text') : Type]), 0)
}

if (Mobile.verifyElementNotExist(findTestObject('Christi/simulasi kredit page/android.widget.TextView0 - Harus dipilih'), 
    3)) {
    Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Model_Simulasi'), Model, 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Select', [('text') : Model]), 0)
}

if (Mobile.verifyElementNotExist(findTestObject('Christi/simulasi kredit page/android.widget.TextView0 - Silakan pilih'), 
    3)) {
    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Tahun_Simulasi'), 0)

    Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Tahun_Simulasi'), Tahun, 0)

    if (Tahun == '2019') {
        Mobile.tap(findTestObject('Christi/simulasi kredit page/android.view.View0 - 2019'), 0)
    } else if (Tahun == '2020') {
        Mobile.tap(findTestObject('Christi/simulasi kredit page/android.view.View0 - 2020'), 0)
    } else {
        Mobile.tap(findTestObject('Christi/simulasi kredit page/android.view.View0 - atau'), 0)

        Mobile.verifyElementExist(findTestObject('Christi/simulasi kredit page/android.widget.TextView0 - Tahun harus dipilih'), 
            0)
    }
}

WebUI.delay(3)

Mobile.swipe(785, 1400, 785, 700)

if (Mobile.verifyElementNotExist(findTestObject('Christi/simulasi kredit page/android.widget.TextView0 - Harus dipilih'), 
    3)) {
    Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/OTR_Simulation'), OTR, 0)
}

not_run: Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/DP_Percent_Simulation'), DP_PERSEN, 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

if (Periode == '24') {
    Mobile.swipe(75, 860, 300, 860)
} else if (Periode == '36') {
    Mobile.swipe(75, 860, 300, 860)

    WebUI.delay(2)

    Mobile.swipe(300, 900, 540, 900)
} else if (Periode == '48') {
    Mobile.swipe(85, 900, 320, 900)

    WebUI.delay(2)

    Mobile.swipe(320, 900, 660, 900)

    WebUI.delay(2)

    Mobile.swipe(660, 900, 800, 900)
} else if (Periode == '60') {
    Mobile.swipe(85, 900, 320, 900)

    WebUI.delay(2)

    Mobile.swipe(320, 900, 660, 900)

    WebUI.delay(2)

    Mobile.swipe(600, 900, 800, 900)

    WebUI.delay(2)

    Mobile.swipe(800, 900, 990, 900)
}

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

if (PembayaranAngsuran == 'ADDM') {
    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Simulasi/Simulasi _ ADDM'), 3)
} else {
    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Simulasi/Simulasi _ ADDB'), 3)
}

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

if (PaketOnOff == 'Off') {
    Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Simulasi/Simulasi _ Set_Text_TDP'), TDP, 3)

    Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Simulasi/Simulasi _ Set_Text_Angsuran (1)'), Angsuran, 3)

    Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Simulasi/Set_PDC'), PDC, 3)
}

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Simulasi_Pilih Asuransi'), 2)

WebUI.callTestCase(findTestCase('Christi/Simulasi-Kredit/Christi Asuransi'), [('PaketOnOff') : PaketOnOff, ('Periode') : Periode
        , ('Pembayaran1') : Pembayaran1, ('Pembayaran2') : Pembayaran2, ('Pembayaran3') : Pembayaran3, ('Pembayaran4') : Pembayaran4
        , ('Pembayaran5') : Pembayaran5, ('Plat') : Plat, ('CreditProtection') : CreditProtection, ('ProtectionType') : ProtectionType
        , ('NamaKTP') : NamaKTP, ('NoHP') : NoHP, ('UploadBy') : UploadBy, ('FileName') : FileName], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('new simulasi kredit/Asuransi'), [('AreaPengajuan') : 'DKI Jakarta, Banten, Jawa Barat'
        , ('Cabang') : 'FATMAWATI', ('Brand') : 'TOYOTA', ('Type') : 'ALL NEW ALTIS', ('Model') : '1.8 G A/T', ('Tahun') : Tahun
        , ('OTR') : OTR, ('DP_PERSEN') : DP_PERSEN, ('DP_UANG') : DP_UANG, ('Periode') : Periode, ('Picture') : Picture, ('Pembayaran1') : Pembayaran1
        , ('Pembayaran2') : Pembayaran2, ('Pembayaran3') : Pembayaran3, ('Pembayaran4') : Pembayaran4, ('Pembayaran5') : Pembayaran5
        , ('CreditProtection') : CreditProtection, ('Plat') : Plat, ('NamaKTP') : NamaKTP, ('NoHP') : NoHP, ('AdaFoto') : AdaFoto
        , ('PaketOnOff') : PaketOnOff, ('PDC') : PDC, ('TDP') : TDP, ('Angsuran') : Angsuran, ('ProtectionType') : ProtectionType
        , ('Paket') : Paket, ('PembayaranAngsuran') : PembayaranAngsuran, ('UploadBy') : UploadBy, ('FileName') : FileName], 
    FailureHandling.STOP_ON_FAILURE)

not_run: if (PaketOnOff == 'On') {
    Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/PaketOn'), 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Paket_Simulasi'), 0)

    Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Paket_Simulasi'), Paket, 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Simulasi/Simulasi _ Set_Brand'), 0)

    Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Simulasi/Simulasi _ Set_Brand'), Brand, 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Select', [('text') : Brand]), 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Type_Simulasi'), 0)

    Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Type_Simulasi'), Type, 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Select', [('text') : Type]), 0)

    Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Model_Simulasi'), Model, 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Select', [('text') : Model]), 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Tahun_Simulasi'), 0)

    Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Tahun_Simulasi'), Tahun, 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Tahun2020_ON'), 0)

    not_run: WebUI.delay(3)

    not_run: Mobile.swipe(785, 1400, 785, 700)

    Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/OTR_Simulation'), OTR, 0)

    Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/DP_Percent_Simulation'), DP_PERSEN, 0)

    not_run: Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Dp_Nominal'), 0)

    not_run: Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Dp_Nominal'), DP_UANG, 0)

    not_run: CustomKeywords.'mobile.ScrollUpDown.UpDown'(0, 1582, 0, 1582)

    not_run: Mobile.swipe(100, 970, 300, 970)

    Mobile.swipe(450, 1070, 450, 542)

    if (Periode == '24') {
        Mobile.swipe(75, 860, 300, 860)
    } else if (Periode == '36') {
        Mobile.swipe(75, 860, 300, 860)

        WebUI.delay(2)

        Mobile.swipe(300, 900, 540, 900)
    } else if (Periode == '48') {
        Mobile.swipe(85, 900, 320, 900)

        WebUI.delay(2)

        Mobile.swipe(320, 900, 660, 900)

        WebUI.delay(2)

        Mobile.swipe(660, 900, 800, 900)
    } else if (Periode == '60') {
        Mobile.swipe(85, 900, 320, 900)

        WebUI.delay(2)

        Mobile.swipe(320, 900, 660, 900)

        WebUI.delay(2)

        Mobile.swipe(600, 900, 800, 900)

        WebUI.delay(2)

        Mobile.swipe(800, 900, 990, 900)
    }
    
    if (PembayaranAngsuran == 'ADDM') {
        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Simulasi/Simulasi _ ADDM'), 0)
    } else {
        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Simulasi/Simulasi _ ADDB'), 0)
    }
} else if (PaketOnOff == 'Off') {
    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Paket_Kredit'), 0)

    Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/PaketOff'), 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Set_BrandOFF'), 0)

    Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Set_BrandOFF'), Brand, 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Select', [('text') : Brand]), 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Set_Type_OFF'), 0)

    Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Set_Type_OFF'), Type, 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Select', [('text') : Type]), 0)

    Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Set_ModelOFF'), Model, 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Set_ModelOFF'), 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Select', [('text') : Model]), 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Simulasi/Simulasi _ Set_Text_Tahun OFF'), 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Set_TahunOFF'), 0)

    Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Set_TahunOFF'), Tahun, 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Option_2019 (2)'), 0)

    not_run: Mobile.swipe(785, 1400, 785, 700)

    not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Simulasi/Simulasi _ Set_Text_TahunOFF_2019'), 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Set_OTR_OFF'), 0)

    Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Set_OTR_OFF'), OTR, 0)

    Mobile.swipe(450, 1070, 450, 542)

    not_run: Mobile.swipe(785, 1400, 785, 700)

    not_run: Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Set_PersenOFF'), DP_PERSEN, 0)

    not_run: Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Set_NominalOFF'), DP_UANG)

    not_run: Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Set_NominalOFF'), DP_UANG, 0)

    not_run: CustomKeywords.'mobile.ScrollUpDown.UpDown'(0, 1582, 0, 1582)

    not_run: Mobile.swipe(85, 900, 320, 900)

    if (Periode == '24') {
        Mobile.swipe(85, 900, 320, 900)
    } else if (Periode == '36') {
        Mobile.swipe(85, 900, 320, 900)

        WebUI.delay(2)

        Mobile.swipe(320, 900, 660, 900)
    } else if (Periode == '48') {
        Mobile.swipe(85, 900, 320, 900)

        WebUI.delay(2)

        Mobile.swipe(320, 900, 660, 900)

        WebUI.delay(2)

        Mobile.swipe(660, 900, 800, 900)
    } else if (Periode == '60') {
        Mobile.swipe(85, 900, 320, 900)

        WebUI.delay(2)

        Mobile.swipe(320, 900, 660, 900)

        WebUI.delay(2)

        Mobile.swipe(600, 900, 800, 900)

        WebUI.delay(2)

        Mobile.swipe(800, 900, 990, 900)
    }
    
    if (PembayaranAngsuran == 'ADDM') {
        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Simulasi/Simulasi _ ADDM_OFF'), 0)
    } else {
        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Simulasi/Simulasi _ ADDB_OFF'), 0)
    }
    
    Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Simulasi/Simulasi _ Set_Text_TDP'), TDP, 0)

    Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Simulasi/Simulasi _ Set_Text_Angsuran (1)'), Angsuran, 0)

    Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Simulasi/Set_PDC'), PDC, 0)
}


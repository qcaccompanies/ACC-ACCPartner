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

not_run: Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Set_Plat'), Plat, 0)

if (Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Tahun 2'), 0, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Option_Tahun2'), 0)

    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Option_AllRisk_Tahun2'), 0)

    if (Pembayaran2 == 'Credit') {
        not_run: if (Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Tahun 3'), 0, FailureHandling.OPTIONAL)) {
            Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Year3'), 0)

            Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/ChooseRisk', [('text') : Tahun3]), 0)
        }
        
        not_run: if (Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Tahun 4'), 0, FailureHandling.OPTIONAL)) {
            Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Year4'), 0)

            Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/ChooseRisk', [('text') : Tahun4]), 0)
        }
        
        not_run: if (Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Tahun 5'), 0, FailureHandling.OPTIONAL)) {
            Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Year5'), 0)

            Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/ChooseRisk', [('text') : Tahun5]), 0)
        }
    } else if (Pembayaran2 == 'Cash') {
        if (Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Tahun 3'), 0, FailureHandling.OPTIONAL)) {
            Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Year3'), 0)

            Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/ChooseRisk', [('text') : Tahun3]), 0)

            if (Pembayaran3 == 'Credit') {
                if (Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Tahun 4'), 0, FailureHandling.OPTIONAL)) {
                    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Year4'), 0)

                    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/ChooseRisk', [('text') : Tahun4]), 0)
                }
                
                if (Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Tahun 5'), 0, FailureHandling.OPTIONAL)) {
                    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Year5'), 0)

                    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/ChooseRisk', [('text') : Tahun5]), 0)
                }
            } else if (Pembayaran3 == 'Cash') {
                if (Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Tahun 4'), 0, FailureHandling.OPTIONAL)) {
                    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Year4'), 0)

                    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/ChooseRisk', [('text') : Tahun4]), 0)

                    if (Pembayaran4 == 'Credit') {
                        if (Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Tahun 5'), 0, 
                            FailureHandling.OPTIONAL)) {
                            Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Year5'), 0)

                            Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/ChooseRisk', [('text') : Tahun5]), 
                                0)
                        }
                    } else if (Pembayaran4 == 'Cash') {
                        if (Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Tahun 5'), 0, 
                            FailureHandling.OPTIONAL)) {
                            Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Year5'), 0)

                            Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/ChooseRisk', [('text') : Tahun5]), 
                                0)
                        }
                    }
                }
            }
        }
    }
    
    Mobile.closeApplication()
}

if (CreditProtection == 'Yes') {
    not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Checkbox_Credit_Protection'), 0)
} else if (CreditProtection == 'No') {
    Mobile.uncheckElement(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Checkbox_Credit_Protection'), 0)
}

Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/android.widget.EditText0 (4)'), Plat, 30)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Alert_Plat_Harus_Diisi'), 0, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Btn_Masukkan_Data_Debitur'), 0, FailureHandling.STOP_ON_FAILURE)
} else {
    Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Btn_Masukkan_Data_Debitur'), 0)

    WebUI.callTestCase(findTestCase('Simulasi Kredit ATS-18/Data Debitur'), [('Picture') : Picture, ('NamaKTP') : NamaKTP
            , ('NoHP') : NoHP], FailureHandling.STOP_ON_FAILURE)
}


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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

if (Pembayaran1 == 'Credit') {
    if (Periode == '24') {
        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Asuransi_Option2'), 0)

        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Option_AllRisk_Tahun2'), 0)
    }
    
    if (Periode == '36') {
        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Year3'), 0)

        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/ChooseRisk', [('text') : Tahun3]), 0)
    }
    
    if (Periode == '48') {
        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Year4'), 0)

        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/ChooseRisk', [('text') : Tahun4]), 0)
    }
    
    if (Periode == '60') {
        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Year5'), 0)

        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/ChooseRisk', [('text') : Tahun5]), 0)
    }
} else if (Pembayaran1 == 'Cash') {
    Mobile.tapAtPosition(642, 441)

    if (Mobile.verifyElementExist(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Tahun 2'), 0)) {
        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Asuransi_Option2'), 0)

        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Option_AllRisk_Tahun2'), 0)

        if (Pembayaran2 == 'Credit') {
            if (Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Tahun 3'), 0, FailureHandling.OPTIONAL)) {
                not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Year3'), 0)

                not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/ChooseRisk', [('text') : Tahun5]), 
                    0)
            }
            
            if (Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Tahun 4'), 0, FailureHandling.OPTIONAL)) {
                not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Year4'), 0)

                not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/ChooseRisk', [('text') : Tahun5]), 
                    0)
            }
            
            if (Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Tahun 5'), 0, FailureHandling.OPTIONAL)) {
                not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Year5'), 0)

                not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/ChooseRisk', [('text') : Tahun5]), 
                    0)
            }
        } else if (Pembayaran2 == 'Cash') {
            Mobile.tapAtPosition(642, 740)

            if (Mobile.verifyElementExist(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Tahun 3'), 0)) {
                not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Year3'), 0)

                not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/ChooseRisk', [('text') : Tahun5]), 
                    0)

                if (Pembayaran3 == 'Credit') {
                    if (Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Tahun 4'), 0, FailureHandling.OPTIONAL)) {
                        not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Year4'), 0)

                        not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/ChooseRisk', [('text') : Tahun4]), 
                            0)
                    }
                    
                    if (Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Tahun 5'), 0, FailureHandling.OPTIONAL)) {
                        not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Year5'), 0)

                        not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/ChooseRisk', [('text') : Tahun5]), 
                            0)
                    }
                } else if (Pembayaran3 == 'Cash') {
                    Mobile.tapAtPosition(642, 1040)

                    if (Mobile.verifyElementExist(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Tahun 4'), 0)) {
                        not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Year4'), 0)

                        not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/ChooseRisk', [('text') : Tahun4]), 
                            0)

                        if (Pembayaran4 == 'Credit') {
                            if (Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Tahun 5'), 
                                0, FailureHandling.OPTIONAL)) {
                                not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Year5'), 0)

                                not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/ChooseRisk', [('text') : Tahun5]), 
                                    0)
                            }
                        } else if (Pembayaran4 == 'Cash') {
                            Mobile.tapAtPosition(642, 1340)

                            if (Mobile.verifyElementExist(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Tahun 5'), 0)) {
                                not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Year5'), 0)

                                not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/ChooseRisk', [('text') : Tahun5]), 
                                    0)

                                if (Pembayaran5 == 'Credit') {
                                    if (Mobile.verifyElementExist(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Tahun 5'), 
                                        0)) {
                                        not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Year5'), 0)

                                        not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/ChooseRisk', 
                                                [('text') : Tahun5]), 0)
                                    }
                                } else if (Pembayaran4 == 'Cash') {
                                    Mobile.tapAtPosition(642, 1640)
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

WebUI.delay(3)

if (Periode == '12') {
    if (PaketOnOff == 'On') {
        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat12_On'), 0)

        Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat12_On'), Plat, 0)
    } else {
        Mobile.delay(5)

        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat1212'), 0)

        Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat1212'), Plat, 0)
    }
} else if (Periode == '24') {
    if (PaketOnOff == 'On') {
        Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat24_On'), Plat, 0)

        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat24_On'), 0)
    } else {
        Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat24 (1)'), Plat, 0)

        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat24 (1)'), 0)
    }
} else if (Periode == '36') {
    if (PaketOnOff == 'On') {
        Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat36_On'), Plat, 0)

        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat36_On'), 0)
    } else {
        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat36'), 0)

        Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat36'), Plat, 0)
    }
} else if (Periode == '48') {
    if (PaketOnOff == 'On') {
        Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat48_On'), Plat, 0)

        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat48_On'), 0)
    } else {
        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat48'), 0)

        Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat48'), Plat, 0)
    }
} else if (Periode == '60') {
    if (PaketOnOff == 'On') {
        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat60_On'), 0, FailureHandling.STOP_ON_FAILURE)

        Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat60_On'), Plat, 0)
    } else {
        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/set_plat60'), 0, FailureHandling.STOP_ON_FAILURE)

        Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Asuransi/set_plat60'), Plat, 0)
    }
}

WebUI.delay(3)

if (Fail == 'plat empty') {
    Mobile.verifyElementExist(findTestObject('Christi/simulasi kredit page/Asuransi/android.widget.TextView0 - Kode Plat harus diisi (1)'), 
        0)
} else {
    if (Periode == '12') {
        Mobile.tapAtPosition(385, 925)
    } else if (Periode == '24') {
        Mobile.tapAtPosition(385, 1225)
    } else if (Periode == '36') {
        Mobile.tapAtPosition(385, 1525)
    } else if (Periode == '48') {
        Mobile.swipe(1000, 1880, 1000, 1100)

        Mobile.tapAtPosition(385, 1485)
    } else if (Periode == '60') {
        Mobile.swipe(1000, 1880, 1000, 1100)

        Mobile.tapAtPosition(385, 1485)
    }
    
    Mobile.tap(findTestObject('Christi/simulasi kredit page/Asuransi/Btn Masukan Data Debitur Enable'), 0)

    Mobile.callTestCase(findTestCase('Christi/Simulasi-Kredit/Data Debitur'), [('NamaKTP') : NamaKTP, ('NoHP') : NoHP, ('UploadBy') : UploadBy
            , ('FileName') : FileName, ('expected') : Expected, ('fail') : Fail], FailureHandling.STOP_ON_FAILURE)
}


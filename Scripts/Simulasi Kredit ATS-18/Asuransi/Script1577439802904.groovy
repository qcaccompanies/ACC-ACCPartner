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

if (Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Tahun 2'), 0, FailureHandling.OPTIONAL)) {
    if (Pembayaran1 == 'Credit') {
        if (Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Tahun 2'), 0, FailureHandling.OPTIONAL)) {
            Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Asuransi_Option2'), 0)

            Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Option_AllRisk_Tahun2'), 0)
        }
        
        if (Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Tahun 3'), 0, FailureHandling.OPTIONAL)) {
            Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Year3'), 0)

            Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/ChooseRisk', [('text') : Tahun3]), 0)
        }
        
        if (Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Tahun 4'), 0, FailureHandling.OPTIONAL)) {
            Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Year4'), 0)

            Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/ChooseRisk', [('text') : Tahun4]), 0)
        }
        
        if (Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Tahun 5'), 0, FailureHandling.OPTIONAL)) {
            Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Year5'), 0)

            Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/ChooseRisk', [('text') : Tahun5]), 0)
        }
    } else if (Pembayaran1 == 'Cash') {
        Mobile.tapAtPosition(642, 441)

        if (Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Tahun 2'), 0, FailureHandling.OPTIONAL)) {
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

                if (Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Tahun 3'), 0, FailureHandling.OPTIONAL)) {
                    not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Year3'), 0)

                    not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/ChooseRisk', [('text') : Tahun5]), 
                        0)

                    if (Pembayaran3 == 'Credit') {
                        if (Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Tahun 4'), 0, 
                            FailureHandling.OPTIONAL)) {
                            not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Year4'), 0)

                            not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/ChooseRisk', [('text') : Tahun4]), 
                                0)
                        }
                        
                        if (Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Tahun 5'), 0, 
                            FailureHandling.OPTIONAL)) {
                            not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Year5'), 0)

                            not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/ChooseRisk', [('text') : Tahun5]), 
                                0)
                        }
                    } else if (Pembayaran3 == 'Cash') {
                        Mobile.tapAtPosition(642, 1040)

                        if (Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Tahun 4'), 0, 
                            FailureHandling.OPTIONAL)) {
                            not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Year4'), 0)

                            not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/ChooseRisk', [('text') : Tahun4]), 
                                0)

                            if (Pembayaran4 == 'Credit') {
                                if (Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Tahun 5'), 
                                    0, FailureHandling.OPTIONAL)) {
                                    not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Year5'), 0)

                                    not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/ChooseRisk', [
                                                ('text') : Tahun5]), 0)
                                }
                            } else if (Pembayaran4 == 'Cash') {
                                Mobile.tapAtPosition(642, 1340)

                                if (Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Tahun 5'), 
                                    0, FailureHandling.OPTIONAL)) {
                                    not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Year5'), 0)

                                    not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/ChooseRisk', [
                                                ('text') : Tahun5]), 0)

                                    if (Pembayaran5 == 'Credit') {
                                        if (Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Tahun 5'), 
                                            0, FailureHandling.OPTIONAL)) {
                                            not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Year5'), 
                                                0)

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
}

WebUI.delay(3)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

if (Periode == '12') {
    if (CreditProtection == 'Yes') {
        Mobile.delay(5)

        if (ProtectionType == 'Credit') {
            Mobile.delay(5)

            not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Asuransi - Btn_Masukkan_Data_Debitur'), 
                0)
        } else {
            Mobile.delay(5)

            Mobile.tapAtPosition(385, 925)

            not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Asuransi - Btn_Masukkan_Data_Debitur'), 
                0)
        }
    } else if (CreditProtection == 'No') {
        Mobile.delay(5)

        not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/AccProtecy'), 0)

        not_run: Mobile.tapAtPosition(90, 850)

        not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/creditprotect'), 0)

        Mobile.delay(5)
    }
    
    if (PaketOnOff == 'On') {
        Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat12_On'), Plat, 0)

        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat12_On'), 0)

        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Asuransi - Btn_Masukkan_Data_Debitur'), 0)
    } else {
        Mobile.delay(5)

        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat1212'), 0)

        Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat1212'), Plat, 0)

        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/btn_masukkan data debitur'), 0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Asuransi/alert'), 0, FailureHandling.OPTIONAL)) {
        if (PaketOnOff == 'On') {
            Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat12_On'), Plat, 0)

            Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat12_On'), 0)
        } else {
            Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat12'), Plat, 0)

            Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat12'), 0)
        }
    }
} else if (Periode == '24') {
    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

    if (PaketOnOff == 'On') {
        Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat24_On'), Plat, 0)

        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat24_On'), 0)
    } else {
        Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat24 (1)'), Plat, 0)

        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat24 (1)'), 0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Alert_Plat_Harus_Diisi'), 0, FailureHandling.OPTIONAL)) {
        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        if (PaketOnOff == 'On') {
            Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat24_On'), 0)

            Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat24_On'), Plat, 0)
        } else {
            Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat24 (1)'), Plat, 0)

            Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat24 (1)'), 0)
        }
    }
    
    if (CreditProtection == 'Yes') {
        if (ProtectionType == 'Credit') {
            Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Asuransi - Btn_Masukkan_Data_Debitur'), 0)
        } else {
            Mobile.tapAtPosition(385, 1225)

            Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Asuransi - Btn_Masukkan_Data_Debitur'), 0)
        }
    } else if (CreditProtection == 'No') {
        not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Asuransi - Acc Credit Protection'), 0)

        Mobile.tapAtPosition(85, 1125)

        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Asuransi - Btn_Masukkan_Data_Debitur'), 0)
    }
} else if (Periode == '36') {
    if (PaketOnOff == 'On') {
        Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat36_On'), Plat, 0)

        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat36_On'), 0)
    } else {
        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat36'), 0)

        Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat36'), Plat, 0)
    }
    
    if (Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Alert_Plat_Harus_Diisi'), 0, FailureHandling.OPTIONAL)) {
        if (PaketOnOff == 'On') {
            Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat36_On'), Plat, 0)

            Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat36_On'), 0)
        } else {
            Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat36'), 0)

            Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat36'), Plat, 0)
        }
    }
    
    if (CreditProtection == 'Yes') {
        if (ProtectionType == 'Credit') {
            Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Asuransi - Btn_Masukkan_Data_Debitur'), 0)
        } else {
            Mobile.tapAtPosition(385, 1525)

            Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Asuransi - Btn_Masukkan_Data_Debitur'), 0)
        }
    } else if (CreditProtection == 'No') {
        not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Asuransi - Acc Credit Protection'), 0)

        Mobile.tapAtPosition(85, 1415)

        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Asuransi - Btn_Masukkan_Data_Debitur'), 0)
    }
} else if (Periode == '48') {
    if (PaketOnOff == 'On') {
        Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat48_On'), Plat, 0)

        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat48_On'), 0)
    } else {
        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat48'), 0)

        Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat48'), Plat, 0)
    }
    
    Mobile.swipe(1000, 1880, 1000, 1100)

    if (Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Alert_Plat_Harus_Diisi'), 0, FailureHandling.OPTIONAL)) {
        if (PaketOnOff == 'On') {
            Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat48_On'), Plat, 0)

            Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat48_On'), 0)
        } else {
            Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat48'), 0)

            Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat48'), Plat, 0)
        }
        
        Mobile.swipe(1000, 1880, 1000, 1100)
    }
    
    if (CreditProtection == 'Yes') {
        if (ProtectionType == 'Credit') {
            Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Asuransi - Btn_Masukkan_Data_Debitur'), 0)
        } else {
            Mobile.tapAtPosition(385, 1485)

            Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Asuransi - Btn_Masukkan_Data_Debitur'), 0)
        }
    } else if (CreditProtection == 'No') {
        not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Asuransi - Acc Credit Protection'), 0)

        Mobile.tapAtPosition(85, 1385)

        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Asuransi - Btn_Masukkan_Data_Debitur'), 0)
    }
} else if (Periode == '60') {
    if (PaketOnOff == 'On') {
        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat60_On'), 0, FailureHandling.STOP_ON_FAILURE)

        Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat60_On'), Plat, 0)
    } else {
        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/set_plat60'), 0, FailureHandling.STOP_ON_FAILURE)

        Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Asuransi/set_plat60'), Plat, 0)
    }
    
    Mobile.swipe(1000, 1880, 1000, 1100)

    if (Mobile.verifyElementVisible(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Alert_Plat_Harus_Diisi'), 0, FailureHandling.OPTIONAL)) {
        if (PaketOnOff == 'On') {
            Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat60_On'), 0, FailureHandling.STOP_ON_FAILURE)

            Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Set_Plat60_On'), Plat, 0)
        } else {
            Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/set_plat60'), 0, FailureHandling.STOP_ON_FAILURE)

            Mobile.setText(findTestObject('Simulasi Kredit ATS - 18/Asuransi/set_plat60'), Plat, 0)
        }
    }
    
    if (CreditProtection == 'Yes') {
        if (ProtectionType == 'Credit') {
            Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Asuransi - Btn_Masukkan_Data_Debitur'), 0)
        } else {
            Mobile.tapAtPosition(385, 1485)

            Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Asuransi - Btn_Masukkan_Data_Debitur'), 0)
        }
    } else if (CreditProtection == 'No') {
        not_run: Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Asuransi - Acc Credit Protection'), 0)

        Mobile.tapAtPosition(85, 1385)

        Mobile.tap(findTestObject('Simulasi Kredit ATS - 18/Asuransi/Asuransi - Btn_Masukkan_Data_Debitur'), 0)
    }
}

not_run: Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Simulasi Kredit ATS-18/Data Debitur'), [('Picture') : Picture, ('NamaKTP') : NamaKTP, ('NoHP') : NoHP
        , ('FileName') : FileName, ('UploadBy') : UploadBy], FailureHandling.STOP_ON_FAILURE)


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

WebUI.delay(3)

if (Pembayaran1 == 'Credit') {
    Mobile.verifyElementNotChecked(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 1 - Credit'), 0)

    if (Periode == '24') {
        Mobile.verifyElementNotChecked(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 2 - Credit'), 0)
    }
    
    if (Periode == '36') {
        Mobile.verifyElementNotChecked(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 2 - Credit'), 0)

        Mobile.verifyElementNotChecked(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 3 - Credit'), 0)
    }
    
    if (Periode == '48') {
        Mobile.verifyElementNotChecked(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 2 - Credit'), 0)

        Mobile.verifyElementNotChecked(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 3 - Credit'), 0)

        Mobile.verifyElementNotChecked(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 4 - Credit'), 0)
    }
    
    if (Periode == '60') {
        Mobile.verifyElementNotChecked(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 2 - Credit'), 0)

        Mobile.verifyElementNotChecked(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 3 - Credit'), 0)

        Mobile.verifyElementNotChecked(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 4 - Credit'), 0)

        Mobile.verifyElementNotChecked(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 5 - Credit'), 0)
    }
} else if (Pembayaran1 == 'Cash') {
    WebUI.delay(3)

    Mobile.tapAtPosition(642, 441)

    not_run: Mobile.tap(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 1 - Credit'), 0)

    if (Periode == '24') {
        if (Pembayaran2 == 'Credit') {
            Mobile.verifyElementExist(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 2 - Credit'), 0)
        } else if (Pembayaran2 == 'Cash') {
            Mobile.tapAtPosition(642, 740)

            not_run: Mobile.tap(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 2 - Credit'), 0)

            Mobile.verifyElementExist(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 2 - Cash'), 0)
        }
    }
    
    if (Periode == '36') {
        if (Pembayaran2 == 'Credit') {
            Mobile.verifyElementExist(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 2 - Credit'), 0)
        } else if (Pembayaran2 == 'Cash') {
            Mobile.tapAtPosition(642, 740)

            not_run: Mobile.tap(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 2 - Credit'), 0)

            Mobile.verifyElementExist(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 2 - Cash'), 0)

            if (Pembayaran3 == 'Credit') {
                Mobile.verifyElementExist(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 2 - Credit'), 
                    0)

                Mobile.verifyElementExist(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 3 - Credit'), 
                    0)
            } else if (Pembayaran3 == 'Cash') {
                Mobile.tapAtPosition(642, 1040)

                not_run: Mobile.tap(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 3 - Credit'), 0)

                Mobile.verifyElementExist(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 3 - Cash'), 0)
            }
        }
    }
    
    if (Periode == '48') {
        if (Pembayaran2 == 'Credit') {
            Mobile.verifyElementExist(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 2 - Credit'), 0)
        } else if (Pembayaran2 == 'Cash') {
            Mobile.tapAtPosition(642, 740)

            not_run: Mobile.tap(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 2 - Credit'), 0)

            Mobile.verifyElementExist(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 2 - Cash'), 0)

            if (Pembayaran3 == 'Credit') {
                Mobile.verifyElementExist(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 2 - Credit'), 
                    0)

                Mobile.verifyElementExist(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 3 - Credit'), 
                    0)
            } else if (Pembayaran3 == 'Cash') {
                Mobile.tapAtPosition(642, 1040)

                not_run: Mobile.tap(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 3 - Credit'), 0)

                Mobile.verifyElementExist(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 3 - Cash'), 0)

                if (Pembayaran4 == 'Credit') {
                    Mobile.verifyElementExist(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 2 - Credit'), 
                        0)

                    Mobile.verifyElementExist(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 3 - Credit'), 
                        0)

                    Mobile.verifyElementExist(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 4 - Credit'), 
                        0)
                } else if (Pembayaran4 == 'Cash') {
                    Mobile.tapAtPosition(642, 1340)

                    not_run: Mobile.tap(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 4 - Credit'), 0)

                    Mobile.verifyElementExist(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 4 - Cash'), 
                        0)
                }
            }
        }
    }
    
    if (Periode == '60') {
        if (Pembayaran2 == 'Credit') {
            Mobile.verifyElementExist(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 2 - Credit'), 0)
        } else if (Pembayaran2 == 'Cash') {
            Mobile.tapAtPosition(642, 740)

            not_run: Mobile.tap(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 2 - Credit'), 0)

            Mobile.verifyElementExist(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 2 - Cash'), 0)

            if (Pembayaran3 == 'Credit') {
                Mobile.verifyElementExist(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 2 - Credit'), 
                    0)

                Mobile.verifyElementExist(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 3 - Credit'), 
                    0)
            } else if (Pembayaran3 == 'Cash') {
                Mobile.tapAtPosition(642, 1040)

                not_run: Mobile.tap(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 3 - Credit'), 0)

                Mobile.verifyElementExist(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 3 - Cash'), 0)

                if (Pembayaran4 == 'Credit') {
                    Mobile.verifyElementExist(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 2 - Credit'), 
                        0)

                    Mobile.verifyElementExist(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 3 - Credit'), 
                        0)

                    Mobile.verifyElementExist(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 4 - Credit'), 
                        0)
                } else if (Pembayaran4 == 'Cash') {
                    Mobile.tapAtPosition(642, 1340)

                    not_run: Mobile.tap(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 4 - Credit'), 0)

                    Mobile.verifyElementExist(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 4 - Cash'), 
                        0)

                    if (Pembayaran5 == 'Credit') {
                        Mobile.verifyElementExist(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 2 - Credit'), 
                            0)

                        Mobile.verifyElementExist(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 3 - Credit'), 
                            0)

                        Mobile.verifyElementExist(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 4 - Credit'), 
                            0)

                        Mobile.verifyElementExist(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 5 - Credit'), 
                            0)
                    } else if (Pembayaran5 == 'Cash') {
                        Mobile.tapAtPosition(642, 1640)

                        not_run: Mobile.tap(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 5 - Credit'), 
                            0)

                        Mobile.verifyElementChecked(findTestObject('Christi/simulasi kredit page/Asuransi/Pembayaran 5 - Cash'), 
                            0)
                    }
                }
            }
        }
    }
}

WebUI.delay(3)

if (CreditProtection == 'Yes') {
    Mobile.verifyElementExist(findTestObject('Christi/simulasi kredit page/Asuransi/android.widget.Credit Protection Check'), 
        0)

    Mobile.tap(findTestObject('Christi/simulasi kredit page/Asuransi/android.view.View0 - Kode Plat No.Polisi'), 0)

    Mobile.setText(findTestObject('Christi/simulasi kredit page/Asuransi/android.widget.EditText0'), 'AB', 0)

    if (ProtectionType == 'Credit') {
        Mobile.tap(findTestObject('Christi/simulasi kredit page/Asuransi/Protection Type Credit'), 0)
    } else if (ProtectionType == 'Cash') {
        Mobile.tap(findTestObject('Christi/simulasi kredit page/Asuransi/Protection Type Cash'), 0)
    }
    
    Mobile.tap(findTestObject('Christi/simulasi kredit page/Asuransi/Btn Masukan Data Debitur Enable'), 0)

    WebUI.delay(3)

    not_run: WebUI.callTestCase(findTestCase('Christi/Simulasi-Kredit/Data Debitur'), [('Picture') : Picture, ('NamaKTP') : NamaKTP
            , ('NoHP') : NoHP, ('UploadBy') : UploadBy, ('FileName') : FileName], FailureHandling.STOP_ON_FAILURE)
} else if (CreditProtection == 'No') {
    Mobile.verifyElementExist(findTestObject('Christi/simulasi kredit page/Asuransi/android.widget.Credit Protection UnCheck'), 
        0)

    Mobile.verifyElementExist(findTestObject('Christi/simulasi kredit page/Asuransi/Btn Masukan Data Debitur Disable'), 
        0)

    not_run: switch (Periode.toString()) {
        case '12':
            if (Pembayaran1 == 'Credit') {
            } else if (Pembayaran1 == 'Cash') {
            }
            
            break
        case '24':
            break
        case '36':
            break
        case '48':
            break
        case '60':
            break
    }
}


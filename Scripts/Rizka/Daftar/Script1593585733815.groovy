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

Mobile.startApplication('D:\\MY WORLD\\WORKS (TUGAS)\\ACCPartner\\accpartner_010720.apk', false)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/btnDaftar'), 0)

Mobile.setText(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/fieldReferral'), referralCode, 0)

if (expectedReferral == 'failed') {
    if (info == 'referralCodeKosong') {
        Mobile.tap(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/btnKonfirmasi'), 0)

        Mobile.verifyElementNotVisible(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/fieldNamaLengkap'), 0)
    } else if (info == 'referralCodeSalah') {
        Mobile.tap(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/btnKonfirmasi'), 0)

        Mobile.verifyElementVisible(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/alertReferralCodeSalah'), 0)
    } else if (info == 'batal') {
        Mobile.tap(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/btnBatal'), 0)

        Mobile.verifyElementNotVisible(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/fieldNamaLengkap'), 0)
    }
} else {
    Mobile.tap(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/btnKonfirmasi'), 0)

    Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

    Mobile.setText(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/fieldNamaLengkap'), namaLengkap, 0)

    Mobile.hideKeyboard()

    Mobile.tapAtPosition(680, 400)

    Mobile.setText(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/fieldUsername'), username, 0)

    Mobile.hideKeyboard()

    Mobile.tapAtPosition(680, 400)

    Mobile.setText(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/fieldEmail'), email, 0)

    Mobile.hideKeyboard()

    Mobile.tapAtPosition(680, 400)

    Mobile.setText(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/fieldNoHP'), noHP, 0)

    Mobile.hideKeyboard()

    Mobile.tapAtPosition(680, 400)

    Mobile.tapAtPosition(551, 853)

    if (divisi == 'KACAB') {
        Mobile.tap(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/divisiKACAB'), 0)
    } else if (divisi == 'ADMIN HEAD') {
        Mobile.tap(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/divisiADMINHEAD'), 0)
    } else if (divisi == 'SALESMAN') {
        Mobile.tap(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/divisiSALESMAN'), 0)
    } else if (divisi == 'SUPERVISOR') {
        Mobile.tap(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/divisiSUPERVISOR'), 0)
    }
    
    Mobile.setText(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/fieldPassword'), password, 0)

    Mobile.hideKeyboard()

    Mobile.tapAtPosition(680, 400)

    Mobile.setText(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/fieldKonfirmasiPassword'), confirmationPass, 0)

    Mobile.hideKeyboard()

    Mobile.tapAtPosition(680, 400)

    Mobile.tapAtPosition(362, 1199)

    if (expectedForm == 'failed') {
        if (info == 'namaKosong') {
            Mobile.verifyElementVisible(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/alertNamaHarusDiisi'), 0)
        } else if (info == 'namaTidakSesuai') {
            Mobile.verifyElementVisible(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/alertNama3Sampai30'), 0)
        } else if (info == 'usernameKosong') {
            Mobile.verifyElementVisible(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/alertUsernameHarusDiisi'), 0)
        } else if (info == 'usernameKurang') {
            Mobile.verifyElementVisible(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/alertUsername6Sampai20'), 0)
        } else if (info == 'usernameHarusAlfanumerik') {
            Mobile.verifyElementVisible(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/alertUsernameTidakSesuai'), 
                0)
        } else if (info == 'emailKosong') {
            Mobile.verifyElementVisible(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/alertEmailHarusDiisi'), 0)
        } else if (info == 'emailKurang') {
            Mobile.verifyElementVisible(findTestObject('Rizka/alertEmailTidakValid'), 0)
        } else if (info == 'emailTidakSesuai') {
            Mobile.verifyElementVisible(findTestObject('Rizka/alertEmailTidakValid'), 0)
        } else if (info == 'noHPKosong') {
            Mobile.verifyElementVisible(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/alertHPHarusDiisi'), 0)
        } else if (info == 'noHPTidakSesuai') {
            Mobile.verifyElementVisible(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/alertHP10sampai15'), 0)
        } else if (info == 'noHPTidakValid') {
            Mobile.verifyElementVisible(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/alertHPTidakValid'), 0)
        } else if (info == 'passwordKosong') {
            Mobile.verifyElementVisible(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/alertPassHarusDiisi'), 0)
        } else if (info == 'passwordKurang') {
            Mobile.verifyElementVisible(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/alertPass7Sampai20'), 0)
        } else if (info == 'passwordTidakSesuai') {
            Mobile.verifyElementVisible(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/alertPassBelumSesuai'), 0)
        } else if (info == 'konfirmasiPasswordKosong') {
            Mobile.verifyElementVisible(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/alertKonPassHarudDiisi'), 0)
        } else if (info == 'konfimasiPasswordTidakSama') {
            Mobile.verifyElementVisible(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/alertKonPassBelumSesuai'), 0)
        }
    } else {
        if (expectedDealerInfo == 'failed') {
            if (info == 'fieldDealerInfoKosong') {
                if (Mobile.verifyElementVisible(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/etKodePos'), 0, FailureHandling.OPTIONAL)) {
                    Mobile.tap(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/dropdownKodePos'), 0, FailureHandling.STOP_ON_FAILURE)

                    Mobile.setText(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/etKodePos'), kodePos, 0)

                    Mobile.hideKeyboard()

                    Mobile.tapAtPosition(680, 400)

                    Mobile.tap(findTestObject('Rizka/kelurahan2'), 0, FailureHandling.STOP_ON_FAILURE)

                    Mobile.setText(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/etKelurahan'), kelurahan, 0)

                    Mobile.hideKeyboard()

                    Mobile.tapAtPosition(680, 400)

                    Mobile.tap(findTestObject('Rizka/provinsi2'), 0, FailureHandling.STOP_ON_FAILURE)

                    Mobile.setText(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/etProvinsi'), provinsi, 0)

                    Mobile.hideKeyboard()

                    Mobile.tapAtPosition(680, 400)

                    Mobile.tap(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/btnDaftarDealerInfo'), 0)

                    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

                    Mobile.verifyElementVisible(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/alertKodePosKosong'), 
                        0)

                    Mobile.verifyElementVisible(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/alertKelurahanKosong'), 
                        0)

                    Mobile.verifyElementVisible(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/alertProvinsiKosong'), 
                        0)
                }
            } else {
                not_run: Mobile.tap(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/btnDaftarDealerInfo'), 0)

                Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

                Mobile.setText(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/otp1'), otp1, 0)

                Mobile.setText(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/otp2'), otp2, 0)

                Mobile.setText(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/otp3'), otp3, 0)

                Mobile.setText(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/otp4'), otp4, 0)

                Mobile.setText(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/otp5'), otp5, 0)

                Mobile.setText(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/otp6'), otp6, 0)

                Mobile.tap(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/btnVerifikasi'), 0)

                Mobile.verifyElementVisible(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/alertKodeVerifikasiAndaSalah'), 
                    0)
            }
        } else {
            not_run: Mobile.tap(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/btnDaftarDealerInfo'), 0)

            Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

            Mobile.setText(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/otp1'), otp1, 0)

            Mobile.setText(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/otp2'), otp2, 0)

            Mobile.setText(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/otp3'), otp3, 0)

            Mobile.setText(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/otp4'), otp4, 0)

            Mobile.setText(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/otp5'), otp5, 0)

            Mobile.setText(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/otp6'), otp6, 0)

            Mobile.tap(findTestObject('Rizka/Daftar - KACAB dan ADMIN HEAD/btnVerifikasi'), 0)
        }
    }
}


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

Mobile.tap(findTestObject('Rizka/Lupa Username dan Password/btnLupaUsernamePass'), 0)

if (infoHelp == 'lupaPassword') {
    Mobile.tap(findTestObject('Rizka/Lupa Username dan Password/btnLupaPassword'), 0)

    Mobile.setText(findTestObject('Rizka/Lupa Username dan Password/fieldUsername'), username, 0)

    Mobile.tap(findTestObject('Rizka/Lupa Username dan Password/btnKonfirmasiUsername'), 0)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    if (expected == 'passed') {
        Mobile.tap(findTestObject('Rizka/Lupa Username dan Password/btnPhoneLupaKataSandi'), 0, FailureHandling.STOP_ON_FAILURE)

        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        not_run: Mobile.setText(findTestObject('Rizka/Lupa Username dan Password/otp1'), otp1, 0)

        not_run: Mobile.setText(findTestObject('Rizka/Lupa Username dan Password/otp2'), otp2, 0)

        not_run: Mobile.setText(findTestObject('Rizka/Lupa Username dan Password/otp3'), otp3, 0)

        not_run: Mobile.setText(findTestObject('Rizka/Lupa Username dan Password/otp4'), otp4, 0)

        not_run: Mobile.setText(findTestObject('Rizka/Lupa Username dan Password/otp5'), otp5, 0)

        not_run: Mobile.setText(findTestObject('Rizka/Lupa Username dan Password/otp6'), otp6, 0)

        Mobile.delay(50)

        Mobile.tap(findTestObject('Rizka/Lupa Username dan Password/btnVerifikasiLupaKataSandi'), 0, FailureHandling.STOP_ON_FAILURE)

        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        Mobile.setText(findTestObject('Rizka/Lupa Username dan Password/fieldNewPass'), kataSandiBaru, 0)

        Mobile.setText(findTestObject('Rizka/Lupa Username dan Password/fieldNewConPass'), verifKataSandiBaru, 0)

        Mobile.tap(findTestObject('Rizka/Lupa Username dan Password/btnKonfirmasiLupaKataSandi'), 0)

        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('Rizka/Lupa Username dan Password/btnLupaUsernamePass'), 0)
    } else {
        if (info == 'usernameKosong') {
            Mobile.verifyElementVisible(findTestObject('Rizka/Lupa Username dan Password/alertFormatUsernameTidakSesuai'), 
                0)
        } else if (info == 'usernameInvalid') {
            Mobile.verifyElementVisible(findTestObject('Rizka/Lupa Username dan Password/alertFormatUsernameTidakSesuai'), 
                0)
        } else {
            Mobile.tap(findTestObject('Rizka/Lupa Username dan Password/btnPhoneLupaKataSandi'), 0, FailureHandling.STOP_ON_FAILURE)

            Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

            not_run: Mobile.setText(findTestObject('Rizka/Lupa Username dan Password/otp1'), otp1, 0)

            not_run: Mobile.setText(findTestObject('Rizka/Lupa Username dan Password/otp2'), otp2, 0)

            not_run: Mobile.setText(findTestObject('Rizka/Lupa Username dan Password/otp3'), otp3, 0)

            not_run: Mobile.setText(findTestObject('Rizka/Lupa Username dan Password/otp4'), otp4, 0)

            not_run: Mobile.setText(findTestObject('Rizka/Lupa Username dan Password/otp5'), otp5, 0)

            not_run: Mobile.setText(findTestObject('Rizka/Lupa Username dan Password/otp6'), otp6, 0)

            Mobile.delay(50)

            Mobile.tap(findTestObject('Rizka/Lupa Username dan Password/btnVerifikasiLupaKataSandi'), 0, FailureHandling.STOP_ON_FAILURE)

            Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

            if (info == 'otpKosong') {
                Mobile.verifyElementVisible(findTestObject('Rizka/Lupa Username dan Password/alertOTPKosongLupaKataSandi'), 
                    0)
            } else if (info == 'otpSalah') {
                Mobile.verifyElementVisible(findTestObject('Rizka/Lupa Username dan Password/alertOTPSalahLupaKataSandi'), 
                    0)
            } else {
                Mobile.setText(findTestObject('Rizka/Lupa Username dan Password/fieldNewPass'), kataSandiBaru, 0)

                Mobile.setText(findTestObject('Rizka/Lupa Username dan Password/fieldNewConPass'), verifKataSandiBaru, 0)

                Mobile.tap(findTestObject('Rizka/Lupa Username dan Password/btnKonfirmasiLupaKataSandi'), 0)

                Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

                if (info == 'fieldKeduanyaKosong') {
                    Mobile.verifyElementVisible(findTestObject('Rizka/Lupa Username dan Password/alertPassBaruKosong'), 
                        0)

                    Mobile.verifyElementVisible(findTestObject('Rizka/Lupa Username dan Password/alertConPassBaruKosong'), 
                        0)
                } else if (info == 'passKurang') {
                    Mobile.verifyElementVisible(findTestObject('Rizka/Lupa Username dan Password/alertPassMin7'), 0)
                } else if (info == 'passAlfanumerik') {
                    Mobile.verifyElementVisible(findTestObject('Rizka/Lupa Username dan Password/alertPassAlfanumerik'), 
                        0)
                } else if (info == 'conPassTidakSama') {
                    Mobile.verifyElementVisible(findTestObject('Rizka/Lupa Username dan Password/alertConPassTidakSama'), 
                        0)
                } else if (info == 'conPassKurang') {
                    Mobile.verifyElementVisible(findTestObject('Rizka/Lupa Username dan Password/alertConPassMin7'), 0)
                }
            }
        }
    }
} else {
    Mobile.tap(findTestObject('Rizka/Lupa Username dan Password/btnLupaUsername'), 0)

    Mobile.setText(findTestObject('Rizka/Lupa Username dan Password/fieldEmail'), email, 0)

    Mobile.tap(findTestObject('Rizka/Lupa Username dan Password/btnKonfirmasi'), 0)

    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    if (expected == 'passed') {
        Mobile.tap(findTestObject('Rizka/Lupa Username dan Password/btnVerifPhone'), 0)

        not_run: Mobile.setText(findTestObject('Rizka/Lupa Username dan Password/otp1'), otp1, 0)

        not_run: Mobile.setText(findTestObject('Rizka/Lupa Username dan Password/otp2'), otp2, 0)

        not_run: Mobile.setText(findTestObject('Rizka/Lupa Username dan Password/otp3'), otp3, 0)

        not_run: Mobile.setText(findTestObject('Rizka/Lupa Username dan Password/otp4'), otp4, 0)

        not_run: Mobile.setText(findTestObject('Rizka/Lupa Username dan Password/otp5'), otp5, 0)

        not_run: Mobile.setText(findTestObject('Rizka/Lupa Username dan Password/otp6'), otp6, 0)

        Mobile.delay(50)

        Mobile.tap(findTestObject('Rizka/Lupa Username dan Password/btnVerifikasi'), 0, FailureHandling.STOP_ON_FAILURE)

        Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

        Mobile.verifyElementVisible(findTestObject('Rizka/Lupa Username dan Password/verifUsernameSudahDikirim'), 0)
    } else {
        if (info == 'emailKosong') {
            Mobile.verifyElementVisible(findTestObject('Rizka/Lupa Username dan Password/alertEmailHarusDiisi'), 0)
        } else if (info == 'emailKurang') {
            Mobile.verifyElementVisible(findTestObject('Rizka/Lupa Username dan Password/alertEmail13Sampai50'), 0)
        } else if (info == 'emailTidakSesuai') {
            Mobile.verifyElementVisible(findTestObject('Rizka/Lupa Username dan Password/alertEmailTidakSesuai'), 0)
        } else {
            Mobile.tap(findTestObject('Rizka/Lupa Username dan Password/btnVerifPhone'), 0)

            Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

            not_run: Mobile.setText(findTestObject('Rizka/Lupa Username dan Password/otp1'), otp1, 0)

            not_run: Mobile.setText(findTestObject('Rizka/Lupa Username dan Password/otp2'), otp2, 0)

            not_run: Mobile.setText(findTestObject('Rizka/Lupa Username dan Password/otp3'), otp3, 0)

            not_run: Mobile.setText(findTestObject('Rizka/Lupa Username dan Password/otp4'), otp4, 0)

            not_run: Mobile.setText(findTestObject('Rizka/Lupa Username dan Password/otp5'), otp5, 0)

            not_run: Mobile.setText(findTestObject('Rizka/Lupa Username dan Password/otp6'), otp6, 0)

            Mobile.delay(50)

            Mobile.tap(findTestObject('Rizka/Lupa Username dan Password/btnVerifikasi'), 0, FailureHandling.STOP_ON_FAILURE)

            Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

            if (info == 'otpKosong') {
                Mobile.verifyElementVisible(findTestObject('Rizka/Lupa Username dan Password/alertOTPKosong'), 0)
            } else if (info == 'otpSalah') {
                Mobile.verifyElementVisible(findTestObject('Rizka/Lupa Username dan Password/alertKodeOTPSalah'), 0)
            }
        }
    }
}


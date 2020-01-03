import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import internal.GlobalVariable as GlobalVariable

'required for PathUtil to get the current app path'
def appPath = PathUtil.relativeToAbsolutePath(GlobalVariable.ApkName, RunConfiguration.getProjectDir())

Mobile.startApplication(appPath, false)


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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Login/Test_Case_Login'), [('email') : 'bravo@gmail.com', ('password') : 'password\r\n', ('headingText') : 'Hello Again!'
        , ('paraText') : 'Welcome Back'], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Dashboard_Objects/Verify_Create_Barber_Objects/svg_bravo_text-gray-400 text-14'))

WebUI.delay(2)

WebUI.click(findTestObject('Dashboard_Objects/Verify_Create_Barber_Objects/a_Dashboard Admin Settings'))

WebUI.delay(2)

WebUI.click(findTestObject('Dashboard_Objects/Verify_Create_Barber_Objects/p_All Barbers'))

try {
    WebUI.verifyElementText(findTestObject('Dashboard_Objects/Verify_Create_Barber_Objects/h1_All Salons'), headingText)

    WebUI.verifyElementText(findTestObject('Dashboard_Objects/Verify_Create_Barber_Objects/div_EFGH Barber'), barberName)

    WebUI.verifyElementText(findTestObject('Dashboard_Objects/Verify_Create_Barber_Objects/div_ABCD Salon'), barberWorksAt)

    WebUI.verifyElementText(findTestObject('Dashboard_Objects/Verify_Create_Barber_Objects/div_1pm-6pm'), barberTimings)

    WebUI.takeScreenshot()
}
catch (Exception e) {
} 
finally { 
    WebUI.closeBrowser()
}


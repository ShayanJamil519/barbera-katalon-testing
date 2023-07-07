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

WebUI.click(findTestObject('Appointment_Objects/a_Book Now'))

WebUI.delay(2)

WebUI.click(findTestObject('Appointment_Objects/p_Alex Barber'))

WebUI.delay(2)

try {
    WebUI.verifyElementText(findTestObject('Appointment_Objects/h2_Book Now'), headingText)

    WebUI.setText(findTestObject('Appointment_Objects/input_Book Now_cname'), customerName)

    WebUI.setText(findTestObject('Signup_Objects/Page_Barbera - Book Best Barber in Your Area/input_role'), appointmentDate)

    WebUI.selectOptionByValue(findTestObject('Appointment_Objects/select_Select your Package  50010002000'), appointmentPackage, 
        false)

    WebUI.takeScreenshot()

    WebUI.click(findTestObject('Appointment_Objects/button_Book Appointment'))

    WebUI.delay(2)

    WebUI.callTestCase(findTestCase('Appointment/Test_Case_Verify_Appointment'), [('headingText') : 'Today\'s Appointments'
            , ('appointmentDate') : '2023-07-02T00:00:00.000Z', ('customerName') : 'bravo'], FailureHandling.STOP_ON_FAILURE)
}
catch (Exception e) {
} 
finally { 
    WebUI.closeBrowser()
}


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

WebUI.navigateToUrl('https://kind-gray-bluefish-tie.cyclic.app/specificBarber/62d295d35a61c523c04a085e/Alex%20Barber/Alpha%20Barbers')

try {
    WebUI.verifyElementText(findTestObject('Review_Objects/h2_Submit Your Review For Alex Barber Barber'), headingText)

    WebUI.click(findTestObject('Review_Objects/label_5 Stars'))

    WebUI.setText(findTestObject('Review_Objects/textarea_Submit Your Review ForAlex BarberBarber_submitDialogTextArea'), 
        review)

    WebUI.takeScreenshot()

    WebUI.click(findTestObject('Review_Objects/button_Submit'))

    WebUI.delay(10)
}
catch (Exception e) {
} 
finally { 
    WebUI.closeBrowser()
}


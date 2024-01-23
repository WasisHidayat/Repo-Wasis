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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://iglo-dev.ekreasi.com/msl/landing')

WebUI.click(findTestObject('Object Repository/Sun life Detail polis/Page_My Sun Life/button_Log In'))

WebUI.setText(findTestObject('Object Repository/Sun life Detail polis/Page_okta-dev-12789139 - Sign In/input_identifier'), 
    'hari.sabintang@indocyber.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Sun life Detail polis/Page_okta-dev-12789139 - Sign In/input_credentials.passcode'), 
    'VpPqM6/QKln4pL8M9Th8UA==')

WebUI.click(findTestObject('Object Repository/Sun life Detail polis/Page_okta-dev-12789139 - Sign In/label_Keep me signed in'))

WebUI.click(findTestObject('Object Repository/Sun life Detail polis/Page_okta-dev-12789139 - Sign In/input_button button-primary'))

WebUI.click(findTestObject('Object Repository/Sun life Detail polis/Page_Beranda  My Sun Life/buttonclose-confirm'))

WebUI.click(findTestObject('Object Repository/Sun life Detail polis/Page_Beranda  My Sun Life/a_A002268521'))

WebUI.click(findTestObject('Object Repository/Sun life Detail polis/Page_Beranda  My Sun Life/span_Lihat detail'))

WebUI.closeBrowser()


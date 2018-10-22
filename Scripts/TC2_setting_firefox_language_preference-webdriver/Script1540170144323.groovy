import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.firefox.FirefoxOptions


System.setProperty('webdriver.gecko.driver',
	'C:\\Katalon_Studio_Windows_64-5.8.0\\configuration\\resources\\drivers\\firefox_win64\\geckodriver.exe')
FirefoxOptions ffoptions = new FirefoxOptions().addPreference("intl.accept_languages", 'ru')
driver = new FirefoxDriver(ffoptions);
driver.get("https://www.google.com");


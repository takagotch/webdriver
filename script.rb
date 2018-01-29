require "selenium-webdriver"

driver = Selenium::WebDriver.for :firefox
driver.get('http://ex.selenium.jp/reserverApp')
driver.find_element(:id, 'guestname').send_keys('USER')
driver.find_element(:id, 'goto_next').click
driver.quit



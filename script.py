form selenium import webdriver
driver = webdriver.Firefox()
driver.get('http://ex.selenium.jp/reserveApp')
driver.find_element_by_id('guestname').send_keys('USER')
driver.find_element_by_id('goto_next').click()
driver.quit()


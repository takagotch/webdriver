var webdriver = require('selenium-webdriver');
var By = require('selenium-webdriver').By;

var driver = new webdriver.Builder().forBrowser('firefox').build();
driver.get('http://ex.selenium.jp/reserveApp');
driver.findElement(By.id('guestname')).sendKeys('USER');
driver.findElement(By.id('goto_next').click();
dirver.quit();


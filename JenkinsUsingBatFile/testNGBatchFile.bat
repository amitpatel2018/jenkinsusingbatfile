cd C:\Users\amit.patel\selenium_tutorials\webdriver tutorials\JenkinsUsingBatFile
set ProjectPath=C:\Users\amit.patel\selenium_tutorials\webdriver tutorials\JenkinsUsingBatFile
echo %ProjectPath%
set classpath=%ProjectPath%\bin;%ProjectPath%\lib\*
echo %classpath%
java org.testng.TestNG %ProjectPath%\testng.xml

# PracticeTestNG

In this session I have used chrome webdriver directly from the POM.xml file. WebDriverManager `5.2.3`mave supports this feature. We need not to define the System.setProperties and invoke new chrome driver. Below statement will take care of everything.

``` WebDriver driver = WebDriverManager.chromedriver.create();```--->
[Link to download the `5.2.3` version Chrome WebDriver](https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.2.3) add the dependency to the pom.xml file.

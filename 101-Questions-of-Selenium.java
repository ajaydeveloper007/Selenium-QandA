1. What is Selenium?
Selenium is a robust test automation suite that is used for automating web-based applications. It supports multiple browsers, programming languages, and platforms.

2. What are the different forms of Selenium?
Selenium comes in four forms-

Selenium WebDriver – Selenium WebDriver is used to automate web applications by directly calling the browser’s native methods.
The Selenium IDE Plugin – Selenium IDE is an open-source test automation tool that works on record and playback principles.
Selenium RC component – Selenium Remote Control(RC) is officially deprecated by Selenium and it used to work using javascript to automate web applications.
Selenium Grid – Allows Selenium tests to run in parallel across multiple machines.

3. What are some advantages of Selenium?
Following are the advantages of Selenium-

Selenium is open source and free to use without any licensing cost.
It supports multiple languages like Java, Ruby, Python, etc.
Selenium supports multi-browser testing.
It has vast resources and helping-community over the internet.
Using the Selenium IDE component, non-programmers can also write automation scripts.
Using the Selenium Grid component, distributed testing can be carried out on remote machines.

4. What are some limitations of Selenium?
Following are the limitations of Selenium–

We cannot test desktop applications using Selenium.
We cannot test web services using Selenium.
Programming language knowledge is required for creating robust scripts in Selenium Webdriver.
Also, we have to rely on external libraries and tools for performing tasks like – logging(log4J), testing framework-(TestNG, JUnit), reading from external files (POI for excels), etc.


5. Which browsers/drivers are supported by Selenium Webdriver?
Some commonly used browsers supported by Selenium are-

Google Chrome – ChromeDriver
Firefox – FireFoxDriver
Internet Explorer – InternetExplorerDriver
Safari – SafariDriver
HtmlUnit (Headless browser) – HtmlUnitDriver
Android – Selendroid/Appium
IOS – ios-driver/Appium


6. What is Selenium 4 and how is it different from other Selenium versions?
Selenium 4 is the latest version of Selenium that is W3C (World Wide Web Consortium) compliant. 
In simple words, this makes the Selenium test suites more stable and reduces compatibility issues across different Web browsers.

Those who have used Selenium 3 and lower version would know that a Selenium test uses JSON wire protocol to communicate with web browsers. 
In the case of Selenium 4 there is no need for encoding and decoding the API requests using the JSON wire protocol for communication between browsers and test scripts. 
This allows the WebDriver to interact directly with the target browser.

7. What are some features of Selenium 4?
The different features of Selenium 4 are-

It is W3C compliant. This makes the cross-browser tests more stable.
A new Selenium 4 IDE for both Chrome and Firefox is introduced.
The Selenium 4 IDE tests can be exported to desired programming languages – C#, Java, Javascript, etc.
The Selenium Grid feature is more user-friendly and comes with docker support (a set of platform-as-a-service products that use OS-level virtualization to deliver software in packages called containers).
Documentation is more detailed and improved in Selenium 4.

8. Can we test APIs or web services using Selenium Webdriver?
No. Selenium WebDriver uses the browser’s native method to automate web applications. So, there is no support for testing web services using Selenium WebDriver.

9. What are the various ways of locating an element in Selenium?
The different locators in Selenium are-

Id
XPath
CSS selector
className
tagName
name
link text
partialLinkText

10. How can we inspect the web element attributes in order to use them in different locators?
In order to locate web elements, we can use the Developer tool and plugins like Firebug.
We can launch the developer tool by pressing F12 on the browser. Users can easily hover over any element and find its different HTML properties.

Firebug is a plugin of Firefox that provides various development tools for debugging applications. From an automation perspective, we use Firebug specifically for inspecting web elements in order to find their attributes like id, class, name, etc. in different locators.


11. What is an XPath?
Xpath or XML path is a query language that is used for selecting nodes from XML documents. Also, it is one of the locators supported by Selenium Webdriver.


12. What is an absolute XPath?
An absolute XPath is a way of locating an element using an XML expression, beginning from the root node i.e. HTML node in the case of web pages.

The main disadvantage of absolute XPath is that even if there is a slight change in the UI or any element, the whole XPath will fail.
Example – html/body/div/div[2]/div/div/div/div[1]/div/input


13. What is a relative XPath?
A relative XPath is a way of locating an element using an XML expression, starting from anywhere in the HTML document.

In this way, there are different ways of creating robust relative XPaths that have minimal or no change with the changes in other UI elements.
Example – //input[@id=’username’]

14. What is the difference between a single slash(/) and a double slash(//) in XPath?
In XPath, a single slash is used for creating absolute XPaths, beginning from the root node. Whereas double slash is used for creating relative XPaths.

15. How can we locate an element by only partially matching the value of its attributes in Xpath?
Using contains() method we can locate an element by partially matching its attribute’s value. This is particularly helpful in scenarios where the attributes have dynamic values with a certain constant part.

xPath expression = //*[contains(@name,'user')]
Basically, the above statement will match all the values of the name attribute containing the word ‘user’ in them.


16. How can we locate elements using their text in XPath?
Using the text() method –

xPathExpression = //*[text()='username']


17. How can we move to the parent of an element using XPath?
Using ‘/..’ after the XPath expression of the child element, we can move to the parent of an element.
For example, the locator //div[@id=”childId”]/.. will move to the parent of the div element with id value as ‘childId’.

18. How can we move to the nth-child element using XPath?
Basically, there are two ways of navigating to the nth element using XPath-

Using square brackets with index position-
Example – div[2] will find the second div element.
Using position()-
Example – div[position()=3] will find the third div element.


19. What is the syntax of finding elements by class using CSS Selector?
By using .className in the CSS locator, we can select all the elements belonging to a particular class e.g. ‘.red’ will select all elements having class ‘red’.


20. What is the syntax of finding elements by id using CSS Selector?
By using #idValue in the CSS locator, we can select all the elements belonging to a particular class e.g. ‘#userId’ will select the element having an id – userId.

21. How can we select elements by their attribute value using the CSS Selector?
Using [attribute=value] in the CSS locator, we can select all the elements belonging to a particular class e.g. ‘[type=small]’ will select the element having attribute type of value ‘small’.

22. How can we move to the nth-child element using the CSS selector?
Using :nth-child(n) in the CSS locator, we can move to the nth child element e.g. div:nth-child(2) will locate the 2nd div element of its parent.

23. What is the fundamental difference between XPath and CSS selectors?
The fundamental difference between XPath and CSS selector is – using XPaths we can traverse up in the document i.e. 
we can move to parent elements. Whereas using the CSS selector, we can only move downwards in the document.

24. How can we launch different browsers in Selenium WebDriver?
By creating an instance of the desired browser driver e.g. below command will initialize the Firefox browser.

WebDriver driver = new FirefoxDriver();

25. What is the use of driver.get(“URL”) and driver.navigate().to(“URL”) commands? Is there any difference between the two?
Both driver.get(“URL”) and driver.navigate().to(“URL”) commands are used to navigate to a URL passed as a parameter.
There is a minor difference between the two commands-

driver.navigate() allows moving back and forward in browser history with the help of driver.navigate().forward() and driver.navigate().back() commands.
In the case of single-page applications (where the URL is appended by ‘#’ to navigate to different sections of the page)-
driver.navigate().to() navigates to a particular section by changing the URL without refreshing the page.
Whereas driver.get() refreshes the page.

This refreshing of the page is also the primary reason why history is not maintained in the case of the driver.get() command.

26. How can we type text in a textbox element using Selenium?
With the help of the sendKeys() method, we can type text in a textbox-

WebElement searchTextBox = driver.findElement(By.id("srch"));
searchTextBox.sendKeys("searchTerm");

27. How can we clear a text written in a textbox?
In order to delete the text written in a textbox, we can use the clear() method.

driver.findElement(By.id("elementLocator")).clear();

28. How to check a checkbox in Selenium?
The same click() method that we use for clicking buttons or radio buttons can be used for checking the checkbox as well.


29. How can we submit a form in Selenium?
Using the submit() method we can submit a form in selenium.

driver.findElement(By.id("form1")).submit();
Also, we can use the click() method for the same purpose.

30. Explain the difference between close and quit commands.
The difference between close and quit commands is-
driver.close() – Used to close the current browser having a focus.
driver.quit() – Used to close all the browser instances.

31. How to switch between multiple windows in Selenium?
Selenium has driver.getWindowHandles() and driver.switchTo().window(“{windowHandleName}”) commands to work with multiple windows.

The getWindowHandles() command returns a list of ids corresponding to each window. If we pass a particular window handle to the driver.switchTo().window(“{windowHandleName}”) command then we can switch control/focus to that particular window.

for (String windowHandle : driver.getWindowHandles()) {
     driver.switchTo().window(handle);
}

32. What is the difference between driver.getWindowHandle() and driver.getWindowHandles() in Selenium?
The driver.getWindowHandle() returns a handle of the current window (a single unique identifier).
Whereas driver.getWindowHandles() returns a set of handles of all the windows available.

33. How can we move to a particular frame in Selenium?
The driver.switchTo() command is used for switching to a particular iframe.

driver.switchTo().frame("{frameIndex/frameId/frameName}");

For locating a frame, we can either use the index (starting from 0), its name, or its Id.

34. Can we move back and forward in the browser using Selenium?
Yes, using driver.navigate().back() and driver.navigate().forward() commands, we can move backward and forward in a browser.

35. What are the different ways to refresh a browser?
There a multiple ways to refresh a page in Selenium-

Using driver.navigate().refresh() command.
Using sendKeys(Keys.F5) on any textbox on the webpage.
By using driver.get(“URL”) on the current URL or using driver.getCurrentUrl().
Using driver.navigate().to(“URL”) on the current URL or driver.navigate().to(driver.getCurrentUrl());

36. How can we maximize the browser window in Selenium?
We can maximize the browser window using the following command-

driver.manage().window().maximize();

37. How can we fetch a text written over an element?
Using the getText() method we can fetch the text over an element.

String text = driver.findElement("elementLocator").getText();

38. How can we find the value of different attributes like name, class, and value of an element?
Using getAttribute(“{attributeName}”) method, we can find the value of different attributes of an element e.g.-

String valueAttribute =
driver.findElement(By.id("locator")).getAttribute("value");

39. How to delete cookies in Selenium?
Using deleteAllCookies() method.

driver.manage().deleteAllCookies();

40. What is an implicit wait in Selenium?
An implicit wait is a type of wait that waits for a specified time while locating an element before throwing NoSuchElementException. By default, Selenium tries to find web elements immediately when required without any wait. So, it is good to use implicit wait. This wait is applied to all the elements of the current driver instance.

driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


41. What is an explicit wait in Selenium?
An explicit wait is a type of wait that is applied to a particular web element until the expected condition specified is met.

WebDriverWait wait = new WebDriverWait(driver, 10);
WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("elementId")));

42. What are some expected conditions in Explicit waits?
Some of the commonly used expected conditions of an element in explicit waits are-

elementToBeClickable(WebElement element or By locator)
stalenessOf(WebElement element)
visibilityOf(WebElement element)
visibilityOfElementLocated(By locator)
invisibilityOfElementLocated(By locator)
attributeContains(WebElement element, String attribute, String value)
alertIsPresent()
titleContains(String title)
titleIs(String title)
textToBePresentInElementLocated(By, String)

43. What is a fluent wait?
A fluent wait is a type of wait in which we can also specify the polling intervals (the time intervals after which the driver 
will try to find the elements when not located) along with the maximum timeout value.

Wait wait = new FluentWait(driver)
 
    .withTimeout(20, SECONDS)
 
    .pollingEvery(5, SECONDS)
 
    .ignoring(NoSuchElementException.class);
 
  WebElement textBox = wait.until(new Function<webdriver,webElement>() {
 
    public WebElement apply(WebDriver driver) {
 
    return driver.findElement(By.id("textBoxId"));
 
    }
}
);

44. What are the different keyboard operations that can be performed in Selenium?
The different keyboard operations that can be performed in Selenium are-

.sendKeys(“sequence of characters”) – Used for passing character sequence to an input or textbox element.
.pressKey(“non-text keys”) – Used for keys like control, function keys etc that are non-text.
.releaseKey(“non-text keys”) – Used in conjunction with the keypress event to simulate releasing a key from the keyboard event.

45. What are the different mouse actions that can be performed using Selenium?
The different mouse events supported in Selenium are-

click(WebElement element)
doubleClick(WebElement element)
contextClick(WebElement element)
mouseDown(WebElement element)
mouseUp(WebElement element)
mouseMove(WebElement element)
mouseMove(WebElement element, long xOffset, long yOffset)

46. Write the code to double-click an element.
Code to double-click an element-

Actions action = new Actions(driver);
WebElement element=driver.findElement(By.id("elementId"));
action.doubleClick(element).perform();

47. Write the code to right-click an element.
Code to right-click an element in selenium-

Actions action = new Actions(driver);
WebElement element=driver.findElement(By.id("elementId"));
action.contextClick(element).perform();

48. How to mouse hover an element in Selenium?
Code to mouse hover over an element-

Actions action = new Actions(driver);
WebElement element=driver.findElement(By.id("elementId"));
action.moveToElement(element).perform();

49. How to fetch the current page URL in Selenium?
In order to fetch the current page URL, we can use the getCurrentURL() command.

driver.getCurrentUrl();

50. How can we fetch the title of the page in Selenium?
Using driver.getTitle() command, we can fetch the page title in Selenium. This method returns a string containing the title of the webpage.

51. How can we fetch the page source in Selenium?
Using the driver.getPageSource() command, we can fetch the page source in selenium. This method returns a string containing the page source.

52. How to verify tooltip text using Selenium?
Tooltips web elements have an attribute of type ‘title’. By fetching the value of the ‘title’ attribute, we can verify the tooltip text in selenium.

String toolTipText = element.getAttribute("title");

53. How to locate a link using its text in Selenium?
Using linkText() and partialLinkText() methods, we can locate a link. The difference between the two is – linkText() matches the complete string passed as a parameter to the link texts. Whereas partialLinkText() only matches the string parameter partially.

WebElement link1 = driver.findElement(By.linkText("artOfTesting"));
WebElement link2 = driver.findElement(By.partialLinkText("artOf"));

54. What are DesiredCapabilities in Selenium WebDriver?
Desired capabilities are a set of key-value pairs that are used for storing or configuring browser-specific properties. 
For example – the browser’s version, platform, etc in the browser instances.

55. How can we find all the links on a web page?
All the links are of anchor tag ‘a’. So by locating elements of tagName ‘a’ we can find all the links on a webpage.

List<WebElement> links = driver.findElements(By.tagName("a"));

56. What are some commonly encountered exceptions in Selenium?
Some of the commonly seen exceptions in Selenium are-

NoSuchElementException – When no element can be located by the locator provided.
ElementNotVisibleException – When an element is present in the DOM but is not visible.
NoAlertPresentException – When we try to switch to an alert box but the targetted alert is not present.
NoSuchFrameException – When we try to switch to a frame but the targetted frame is not present.
NoSuchWindowException – When we try to switch to a window but the targetted window is not present.
UnexpectedAlertPresentException – When an unexpected alert blocks the normal interaction of the driver.
TimeoutException – When a command execution gets a timeout.
InvalidElementStateException – When the state of an element is not appropriate for the desired action.
NoSuchAttributeException – When we are trying to fetch an attribute’s value but the attribute is not correct.
WebDriverException – When there is some issue with the driver instance preventing it from getting launched.

57. How can we capture screenshots using Selenium?
In order to take screenshots in Selenium, we can use the getScreenshotAs method of the TakesScreenshot interface.

File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(scrFile, new File("D:\\testScreenShot.jpg"));

58. How to handle dropdowns in Selenium?
Using Select class-

Select countriesDropDown = new Select(driver.findElement(By.id("countries")));
dropdown.selectByVisibleText("India");
//or using index of the option starting from 0
dropdown.selectByIndex(1);
//or using its value attribute
dropdown.selectByValue("Ind");

59. How to check which option in the dropdown is selected?
Using is Selected() method, we can check the state of a dropdown’s option.

Select countriesDropDown = new Select(driver.findElement(By.id("countries")));
dropdown.selectByVisibleText("India");
 
//returns true or false value 
System.out.println(driver.findElement(By.id("India")).isSelected());

60. How can we check if an element is getting displayed on a web page?
Using the isDisplayed() method we can check if an element is getting displayed on a web page.

driver.findElement(By locator).isDisplayed();

61. How can we check if an element is enabled for interaction on a web page?
Using the isEnabled method, we can check if an element is enabled or not.

driver.findElement(By locator).isEnabled();


62. What is the difference between driver.findElement() and driver.findElements() commands?
The difference between driver.findElement() and driver.findElements() commands are-

findElement() returns a single WebElement (found first) based on the locator passed as a parameter. Whereas findElements() returns a list of WebElements, all satisfying the locator value passed.

Syntax of findElement()-
WebElement textbox = driver.findElement(By.id(“textBoxLocator”));

Whereas the syntax of findElements()-
List <WebElement> elements = driver.findElements(By.id(“value”));

Another difference between the two is – if no element is found then findElement() throws NoSuchElementException whereas findElements() returns a list of 0 elements.
Selenium interview questions and answers

63. How can we handle window UI elements and window POP-ups using selenium?
Selenium is used for automating web-based applications only(or browsers only). If we want to handle window GUI elements then we can use tools like AutoIT.

AutoIT is a freeware used for automating Windows GUI. The AutoIt scripts follow the simple BASIC language-like syntax. Also, it can be easily integrated with Selenium tests.

64. What is Robot API?
Robot API is used for handling Keyboard or mouse events.

Robot robot = new Robot();
//Simulate enter key action
robot.keyPress(KeyEvent.VK_ENTER);

65. How to do file upload in Selenium?
File upload action can be performed in multiple ways-

Using element.sendKeys(“path of file”) on the web element of ‘input’ tag and type ‘file’ i.e. the elements should be like –
<input type=”file” name=”fileUpload”>
With the help of Robot API.
Using the AutoIT API.

66. How to handle the HTTPS website in Selenium or how to accept the SSL untrusted connection?
Using profiles, we can handle accepting the SSL untrusted connection certificate. Profiles are basically a set of user preferences stored in a file.

FirefoxProfile profile = new FirefoxProfile();
profile.setAcceptUntrustedCertificates(true); 
profile.setAssumeUntrustedCertificateIssuer(false);
WebDriver driver = new FirefoxDriver(profile); 

67. How to do drag and drop in Selenium?
Using the Action class, drag and drop can be performed in Selenium. Sample code-

Actions builder = new Actions(driver);
Action dragAndDrop = builder.clickAndHold(SourceElement)
.moveToElement(TargetElement)
.release(TargetElement)
.build();
dragAndDrop.perform();

68. How to execute JavaScript code in Selenium?
JavaScript code can be executed in Selenium using JavaScriptExecuter. Sample code for javascript execution-

WebDriver driver = new FireFoxDriver();
if (driver instanceof JavascriptExecutor) {
 ((JavascriptExecutor)driver).executeScript("{JavaScriptCode}");
}

69. How to handle alerts in Selenium?
In order to accept or dismiss an alert box, the alert class is used. This requires first switching to the alert box and then using accept() or dismiss() command as the case may be.

Alert alert = driver.switchTo().alert(); 
//To accept the alert
alert.accept();
Alert alert = driver.switchTo().alert(); 
//To cancel the alert box
alert.dismiss();

70. What is HtmlUnitDriver?
HtmlUnitDriver is the fastest WebDriver. Unlike other drivers (FireFoxDriver, ChromeDriver, etc), 
the HtmlUnitDriver is non-GUI. On executing test scripts, no browser gets visible.

71. How to handle hidden elements in Selenium WebDriver?
Using JavaScript executor we can handle hidden elements-

(JavascriptExecutor(driver))
 .executeScript("document.getElementsByClassName(locator).click();");

72. What is Page Object Model or POM?
Page Object Model (POM) is a design pattern in Selenium. A design pattern is a solution or a set of standards that are used for solving commonly occurring software problems.

Now coming to POM – POM helps to create a framework for maintaining selenium scripts. In POM for each page of the application, a class is created having the web elements belonging to the page and methods handling the events on that page. The test scripts are maintained in separate files and the methods of the page object files are called from the test scripts file.

In this way, we can create a robust automation framework using POM.

73. What are the advantages of POM?
The advantages are POM are-

Using POM, we can create an Object Repository i.e. a set of web elements in separate files along with their associated functions. In this way, keeping the code clean.
For any change in UI(or web elements), only page object files are required to be updated leaving test files unchanged.
It makes code reusable as well as maintainable.

74. What is Page Factory?
Page factory is an implementation of the Page Object Model in Selenium. It provides @FindBy annotation to find web elements. In addition, there is a PageFactory.initElements() method to initialize all web elements defined with @FindBy annotation.

public class SamplePage {
    WebDriver driver;
    @FindBy(id="search")
    WebElement searchTextBox;
   
    @FindBy(name="searchBtn")
    WebElement searchButton;
    //Constructor
    public samplePage(WebDriver driver){
        this.driver = driver;
        //initElements method to initialize all elements
        PageFactory.initElements(driver, this);
    }
    
    //Sample method
    public void search(String searchTerm){
        searchTextBox.sendKeys(searchTerm);  
        searchButton.click();
    }
}


75. What is an Object repository?
An object repository is the centralized location of all the objects or WebElements of the test scripts. 
In Selenium, we can implement an object repository using the Page Object Model as well as Page Factory design patterns.

76. What is a data-driven framework?
A data-driven framework is one in which the test data is put in external files like CSV, Excel, etc. 
Basically, the test data is separated from the test logic that is written in test script files. 
The test data drives the test cases, i.e. the test methods run for each set of test data values.

TestNG provides inherent support for data-driven testing using @dataProvider annotation.

77. What is a keyword-driven framework?
A keyword-driven framework is one in which we associate the normal set of actions with keywords and keep them in an external file usually in tabular form.

For example, we can use-

launchBrowser() keyword, for the action of launching a browser.
writeInTextBox(webElement, textToWrite) keyword, for the action to write in a textbox with keyword, etc.
The framework contains the code to perform the action based on a keyword specified in the external file.

In this way, a person of a non-programming background can also write the test steps in a file as long as all the keywords are present in the framework along with the implementation.

78. What is a hybrid framework?
A hybrid framework is a combination of two or more frameworks. For example, a combination of data-driven and keyword-driven frameworks is also a hybrid framework.

79. What is Selenium Grid?
Selenium Grid is a tool that helps in distributed testing. Using Grid, we can run test scripts in different machines having different browsers, 
browser versions, platforms, etc in parallel. 
In the Selenium grid, there is a hub that is a central server managing all the distributed machines known as nodes.

80. What are some advantages of the Selenium grid?
The advantages of the Selenium grid are-

It allows running test cases in parallel thereby saving test execution time.
Multi-browser testing is possible using the Selenium grid by running the test on machines having different browsers.
Additionally, we can do multi-platform testing by configuring nodes having different operating systems.

81. What is a hub in the Selenium Grid?
A hub is a server or a central point in the Selenium grid that controls the test executions on the different machines.

82. What is a node in the Selenium Grid?
Nodes are the machines that are attached to the selenium grid hub and have selenium instances running the test scripts. Unlike a hub, 
there can be multiple nodes in the selenium grid.

83. Explain the line of code Webdriver driver = new FirefoxDriver();.
This is one of the most frequently asked Selenium interview questions. In the line of code Webdriver driver = new FirefoxDriver(); ‘WebDriver’ 
is an interface and we are creating an object of type WebDriver 
instantiating an object of FirefoxDriver class.

84 What is the purpose of creating a reference variable- ‘driver’ of type WebDriver instead of directly creating a FireFoxDriver object 
or any other driver’s reference in the statement Webdriver driver = new FirefoxDriver();?
By creating a reference variable of type WebDriver, we can use the same variable to work with multiple browsers like ChromeDriver, IEDriver, etc.

85. Name an API used for reading and writing data to Excel files.
Apache POI API and JXL(Java Excel API) can be used for reading, writing, and updating Excel files.

86. Name an API used for logging in Java.
Log4j is an open-source API widely used for logging in Java. It supports multiple levels of logging like – ALL, DEBUG, INFO, WARN, ERROR, TRACE, and FATAL.

87. What is the use of logging in automation?
Logging helps in debugging the tests when required and also provides storage of the test’s runtime behavior.

88. What is TestNG?
TestNG(NG for Next Generation) is a testing framework that can be integrated with Selenium or any other automation tool. Moreover, 
it provides multiple capabilities like assertions, reporting, parallel test execution, etc.

89. What are some advantages of TestNG?
Following are the advantages of TestNG-

TestNG provides different assertions that help in checking the expected and actual results.
It provides parallel execution of test methods.
We can define the dependency of one test method over others in TestNG.
Also, we can assign priority to test methods in selenium.
It allows the grouping of test methods into test groups.
It allows data-driven testing using @DataProvider annotation.
TestNG has inherent support for reporting.
It has support for parameterizing test cases using @Parameters annotation.

90. What are commonly used TestNG annotations?
The commonly used TestNG annotations are-

@Test – The @Test annotation marks a method as a test method.
@BeforeSuite – The annotated method will run only once before all tests in this suite have run.
@AfterSuite -The annotated method will run only once after all tests in this suite have run.
@BeforeClass – The annotated method will run only once before the first test method in the current class is invoked.
@AfterClass – The annotated method will run only once after all the test methods in the current class have been run.
@BeforeTest – The annotated method will run before any test method belonging to the classes inside the <test> tag is run.
@AfterTest – The annotated method will run after all the test methods belonging to the classes inside the <test> tag have run.
@BeforeMethod – The annotated method will run before each test method marked by @Test annotation.
@AfterMethod – The annotated method will run after each test method marked by @Test annotation.
@DataProvider-The @DataProvider annotation is used to pass test data to the test method. The test method will run as per the number of rows of data passed via the data provider method.


91. What are some common assertions provided by TestNG?
Some of the common assertions provided by TestNG are-

assertEquals(String actual, String expected, String message) – (and other overloaded data types in parameters)
assertNotEquals(double data1, double data2, String message) – (and other overloaded data type in parameters)
assertFalse(boolean condition, String message)
assertTrue(boolean condition, String message)
assertNotNull(Object object)
fail(boolean condition, String message)
true(String message)

92. What is the use of the testng.xml file?
A testng.xml file is used for configuring the whole test suite. In this file, we can create a test suite, create test groups, 
mark tests for parallel execution, add listeners, and pass parameters to test scripts. 
Later, this testng.xml file can be used for triggering the test suite.

93. How can we pass the parameter to the test script using TestNG?
Using @Parameter annotation and the ‘parameter’ tag in testng.xml we can pass parameters to the test script.
Sample testng.xml –

<suite name="sampleTestSuite">
   <test name="sampleTest">   
      <parameter name="sampleParamName" value="sampleValue"/>
      <classes>
         <class name="TestFile" />
      </classes>      
   </test>
</suite>


94. How can we create a data-driven framework using TestNG?
Using @DataProvider we can create a data-driven framework. Basically, we can pass test data to the associated test method and then multiple iterations of the test run for the different test data values passed from the @DataProvider method. The method annotated with @DataProvider annotation return a 2D array of object.

//Data provider returning 2D array of 3*2 matrix
 @DataProvider(name = "dataProvider1")
   public Object[][] dataProviderMethod1() {
      return new Object[][] {{"kuldeep","rana"}, {"k1","r1"},{"k2","r2"}};
   }
   //This method is bound to the above data provider returning 2D array of 3*2 matrix
   //The test case will run 3 times with different set of values
   @Test(dataProvider = "dataProvider1")
   public void sampleTest(String s1, String s2) {
      System.out.println(s1 + " " + s2);
   }

95. What is the use of @Listener annotation in TestNG?
Listeners are used for performing some action in case an event gets triggered. Usually, testNG listeners are used for configuring reports and logging. One of the most widely used listeners in testNG is the ITestListener interface.

It has methods like onTestSuccess, onTestFailure, onTestSkipped, etc. We need to implement this interface by creating a listener class of our own. After that using the @Listener annotation, we can specify that for a particular test class, a customized listener class should be used.

@Listeners(PackageName.CustomizedListenerClassName.class)
public class TestClass { 
    WebDriver driver= new FirefoxDriver();
    
    @Test 
    public void testMethod(){
    //test logic
    }
} 

96. How can we make one test method dependent on others using TestNG?
Using the ‘dependsOnMethods’ parameter inside @Test annotation in TestNG, we can make one test method run only after the successful execution of the dependent test method.

 @Test(dependsOnMethods = { "preTests" })


96. How can we make one test method dependent on others using TestNG?
Using the ‘dependsOnMethods’ parameter inside @Test annotation in TestNG, we can make one test method run only after the successful execution of the dependent test method.

 @Test(dependsOnMethods = { "preTests" })
97. How can we set the priority of test cases in TestNG?
Using the priority parameter in @Test annotation in TestNG we can define the priority of test cases. The default priority of the test when not specified is the integer value 0. Example-

@Test(priority=1)

98. What is the default priority of a test method in TestNG?
The default priority of a test when not specified is integer value 0. So, if we have one test case with priority 1 and one without any 
priority then the test without any priority value will execute first.

99. How to prevent a test case from running using TestNG?
A Test method can be disabled from getting executed by setting the “enabled” attribute as false.

//In case of a test method
@Test(enabled = false)
public void testMethod1() {
  //Test logic
}
 
 
//In case of test method belonging to a group
@Test(groups = {"NegativeTests"}, enabled = false)
public void testMethod2() {
  //Test logic
}

100. How can we run test cases in parallel using TestNG?
In order to run the tests in parallel just add these two key-value pairs in the suite-

parallel=”{methods/tests/classes}”
thread-count=”{number of threads you want to run simultaneously}”.
<suite name="ArtOfTestingSuite" parallel="methods" thread-count="5">

101. What is the use of @Factory annotation in TestNG?
@Factory annotation helps in the dynamic execution of test cases. Using @Factory annotation, we can pass parameters to the whole test class at run time. The parameters passed can then be used by one or more test methods of that class.

For example – there are two classes TestClass and the TestFactory class. Because of the @Factory annotation, the test methods in class TestClass will run twice with the data “k1” and “k2”.

public class TestClass{
    private String str;
 
    //Constructor
    public TestClass(String str) {
        this.str = str;
    }
 
    @Test
    public void TestMethod() {
        System.out.println(str);
    }
}
 
public class TestFactory{
    //The test methods in class TestClass will run twice with data "k1" and "k2"
    @Factory
    public Object[] factoryMethod() {
        return new Object[] { new TestClass("K1"), new TestClass("k2") };
    }
}

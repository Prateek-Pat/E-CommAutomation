# E-CommAutomation


Dependencies required 
++++++++++++++++++++++

1) Pom.xml >
		Add Dependencies 
		1) Selenium-java > <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java --> 
		2) TestNG > 	   <!-- https://mvnrepository.com/artifact/org.testng/testng -->
		3) POI > 		   <!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->
		4) Comman-io >     <!-- https://mvnrepository.com/artifact/org.apache.commons/commons-io -->
		


++++++++++++++++++++++++++++++++++++++++++
url: https://www.demoblaze.com/index.html
++++++++++++++++++++++++++++++++++++++++++

++++++++++
TestCases
++++++++++

TestCase 1) Login_Functionality = Done
++++++++++++++++++++++++++++++++

1) Navigate to URL < https://www.demoblaze.com/index.html# >
2) Click on SignUp Button fill form
3) Click on Login Button & fill form
4) Verify if UserName is visible

TestCase 2) Scrolling_Functionality
+++++++++++++++++++++++++++++++++++

1) Navigate to URL < https://www.demoblaze.com/index.html# >
2) Image Verification 
3) Tap on arrow right arrow to verify scrolliing functionality

TestCase 3) Verify_Categories
+++++++++++++++++++++++++++++++

1) Navigate to URL < https://www.demoblaze.com/index.html# >
2) Category > Phone > Click on NOKIA Lumia 1520 > Verify whether NOKIA lumia is displayed or not
3) Category > Laptop > Click on MacBook Air > Verify whether MackBook Air is displayed or not
4) Category > Monitors > Click on Asus Monitor > Verify whether Assus monitor is displayed or not

TestCase 4) Verify Phone Add_to_Cart_Functionality
+++++++++++++++++++++++++++++++++++++++++++++++++++

1) Navigate to URL > < https://www.demoblaze.com/index.html# >
2) Category > Phone > Clcik on NOKIA LUMIA
3) Verify whether NOKIA LUMIA is displayed or not
4) Click on ADD_TO_CART button
5) Click on OK button on pop up
6) Navigate to CART secction and check if NOKIA LUMIA is added in same section

TestCase 5) Verify Laptop Add_to_Cart_Functionality
+++++++++++++++++++++++++++++++++++++++++++++++++++

1) Navigate to URL > < https://www.demoblaze.com/index.html# >
2) Category > Laptop > Clcik on MACBOOK AIR
3) Verify whether MACBOOK AIR is displayed or not
4) Click on ADD_TO_CART button
5) Click on OK button on pop up 
6) Navigate to CART section and check if MACBOOK AIR is added in same section


TestCase 6) Verify Laptop Add_to_Cart_Functionality
+++++++++++++++++++++++++++++++++++++++++++++++++++
	
1) Navigate to URL > < https://www.demoblaze.com/index.html# >
2) Category > Monitors > Click on ASUS MONITOR
3) Verify whether ASUS MONITOR is displayed or not
4) Click on ADD_TO_CART button
5) Click on OK button on pop up 
6) Navigate to CART section and check if ASUS MONITOR is added in same section


TestCase 7) Verify Delete_item_from_Cart_Functionality
+++++++++++++++++++++++++++++++++++++++++++++++++++++++

1) Navigate to URL > < https://www.demoblaze.com/index.html# >
2) Cart > Tap on Cart link 
3) Verify whether text PRODUCT visible on cart page or not
4) Delete MACBOOK AIR from cart
5) Click on PLACE ORDER button
6) Fill Place Order form & click on PURCHASE
7) Confirmation Popup > Click on OK button

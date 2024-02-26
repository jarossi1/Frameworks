Readme File 

C.
--
(folders) d287-javaframeworks / src / main / resources / templates /mainscreen.html   

-Changed Line 14. title to Carolina Computer Shop

-Changed Line 19. h1 to Computer Shop

-Changed Line 22. h2 to Computer Parts

-Changed Line 58. h2 Computer Products

D.
--
(folders) d287-javaframeworks / src / main / resources / templates /

-Templates: Added about.html page

-Lines 8 - 15: added About Us header, information about Carolina Computer Store, and contact information  

(folders) d287-javaframeworks / src / main / java / com.example.demo / controllers

-Controller: added a controller named AboutController Lines 1 - 13

(folders) d287-javaframeworks / src / main / resources / templates /  mainscreen.html

-Line 20: added a link on mainscreen.html to about.html

(folders) d287-javaframeworks / src / main / resources / templates /  about.html

-Line 9: added a link on about.html back to mainscreen.html

E.
--
(folders) d287-javaframeworks / src / main / java / com.example.demo / bootstrap / BootStrapData

-BootStrapData Lines 39 - 102 : added if statement to ensure no duplicates in my outsourcedPartRepository and Added my Parts to outsourcedPartRepository and saved information

-BootStrapData Lines 119 - 141: added if statement to ensure no duplicates in my productRepository and Added my Products to productRepository and saved information

F.
--

(folders) d287-javaframeworks / src / main / resources / templates /mainscreen.html

-Mainscreen.html Lines 90-91 - added buynow button link with on click feature

(folders) d287-javaframeworks / src / main / java / com.example.demo / Product

Product.java Lines 108-114: added boolean if - else to check inv for product and return true (inv--) or false

(folders) d287-javaframeworks / src / main / resources / templates /

-Templates added outofstock.html Lines 1-11: added h1 header stating product is out of stock and adding a link back to mainscreen.html

-Templates added thankyou.html Lines 1-11: added h1 header stating (Thank you! Your Purchase has been Completed!) and adding a link back to mainscreen.html

(folders) d287-javaframeworks / src / main / java / com.example.demo / controllers / AddProductController

-Controllers in AddProductController.java Lines 176-186: added  controller for buyNow button if purchaseNow is successful return the thankyou.html else return outOfstock.html

-------
Edit/Updates
BootStrapData.java: added a .setcompanyname for all OutsourcedParts (MicroTech)

mainscreen.html Line 22 put "Computer Parts" for the header

mainscreen.html Line 58 put "Computer Products" for the header

-----

G.
--
(folders) d287-javaframeworks / src / main / java / com.example.demo / Part

Part.java Line 32 - 36: Added a minInv and maxInv to the part entity also created getters and setters Lines: 91 - 101

(folders) d287-javaframeworks / src / main / java / com.example.demo / bootstrap / BootStrapData

BootStrapData.java Line 48 - 95: Added setMaxInv and setMinInv with a 2 for min and 5 for max to my OutsourcedParts inventory.

(Edit BootStrapData: Changed Prices Lowered cost for OutsourcedParts Line 48 - 95)

(folders) d287-javaframeworks / src / main / resources / templates / InhousePartForm.html

InhousePartForm.html Line 24 - 26 were added to the form to input user data

(folders) d287-javaframeworks / src / main / resources / templates / OutsourcedPartForm.html

Line 25 - 27 for OutsourcedPartForm.html were added to the form to input user data

(folders) d287-javaframeworks / src / main / resources / application.properties

application.properties Line 6: changed the file name to match my shop

NEXT STEP MOVED TO STEP H Modify the code to enforce that the inventory is between or at the minimum and maximum value.

H.
--
(folders) d287-javaframeworks / src / main / java / com.example.demo / Part

-Line 32- 35 added message for min and max

-Line 110-112 added logic for code to be between min and max


(folders) d287-javaframeworks / src / main / java / com.example.demo / controllers/ AddinhousePartController

-Line 44 - 48 added if statement for  Inv must be between the min and max value


(folders) d287-javaframeworks / src / main / java / com.example.demo / controllers/ AddOutsourcedPartController

-Line 44 - 49 added if statement for  Inv must be between the min and max value

(folders) d287-javaframeworks / src / main / resources / templates / Mainscreen.html (updated)

-Line 39 - 40 , Line 49 - 50 made a column for minInv and maxInv


I.
--
folders) d287-javaframeworks / src / test / com.example.demo / domain / PartTest

Added unit tests for min and max on lines 167 - 184

J.
--

removed DeletePartValidator to clean code 














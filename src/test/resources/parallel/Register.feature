Feature: Register page
@smoke
Scenario: user registration
Given launching chromebrowser
And entering url as "https://automationteststore.com/"
And user clicking on Login or Register Button
And click on Register account continue button
And user enters the following details
|First Name|pcts|
|Last Name|palur|
|E-Mail|pctsp7750@gmail.com|
|Address 1|Ngocolony|
|City|Tirupathi|
|pincode|517507|
|Login name|pctsp77750|
|Password|The@1234|
|Password Confirm|The@1234|
And select county as India
And select state as Andhra pradesh
And click on subscribe btn
And click on i have read policy
And click on continue


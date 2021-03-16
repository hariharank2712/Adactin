Feature: Hotel Booking In Adactin Application

Scenario: Login Functionality
Given user Launch The Application
When user Enter Username In Username Field
And user Enter Password In Password Field
Then user Click On The Login Button And It Navigate To The Search HotelPage

Scenario: Search Hotel Functionality
When user Select The Location In Location Field
And user Select The Hotels In Hotel Field
And user Select The RoomType In RoomType Field
And user Select The NumberOfRoom In NumberOfRoom Field
And user Enter The CheckInDate In CheckInDate Field
And user Enter The CheckOutDate In CheckOutDate Field
And user Select The AdultsPerRoom In AdultsPerRoom Field
And user Select The ChildrenPerRoom In ChildrenPerRoom Field
Then user Click On The Search Button And Is Navigate To The Select Hotel Page

Scenario: Select Hotel Functionality
When Click On The Radio Button
Then user Click On The Continue Button And Is Navigate To The Book Hotel Page

Scenario: Book Hotel Functionality
When user Enter The FirstName In FirstName Field
And user Enter The LastName In LastName Field
And user Enter The BillingAddress In BillingAddress Field
And user Enter The CreditCardNumber In CreditCardNumber Field
And user Select The CreditCardType In CreditCardType Field
And user Select The Month In Month Field
And user Select The Year In Year Field
And user Enter The CVVNumber In CVVNumber Field
Then user Click The BookNow Button And Is Navigate To The Booking Conformation Page

Scenario: Booking Conformation Hotel Functionality
Then user Click The SearchHotel Button 

Scenario: LogOut Functionality
Then user Click The LogOut Button 

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>show Reservation</title>
</head>
<body>
	<h2>Flight Details</h2>

	Flight Number:${flight.flightNumber}
	<br> Operating Airlines:${flight.operatingAirlines}
	<br> Departure City:${flight.departureCity}
	<br> Arrival City:${flight.arrivalCity}
	<br> Departure Date:${flight.dateOfDeparture}
	<br>

	<h2>Enter Passenger Details</h2>

	<form action = "CompleteReservation" method = "post">
		<pre>
FirstName <input type = "text" name = "firstName"/>
LastName <input type = "text" name = "lastName"/>
Age <input type = "text" name = "age"/>
Gender <input type = "text" name = "gender"/>
Phone <input type = "text" name = "phone"/>
<input type="submit" value="CompleteReservation" />
<input type="hidden" name="flightId" value="${flight.id}" />

<h2>Enter the Payment Details</h2>

Card Number:<input type = "text" name =  "cardNumber"/>
Card Holder Name:<input type = "text" name = "cardHolderName"/>
CVV:<input type = "text" name = "cvv"/>
Expiration Date:<input type="text" name ="expirationDate"/>
Amount:<input type = "text" name = "amount"/>
<input type = "submit" value = "Save"/>
</pre>
	</form>
</body>
</html>
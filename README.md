# apprenticeship-project

This program accepts a list of order objects and outputs the fees for each one. Run the OrderProcessorClient to test this program.

The order object will have a list of items, each with the following attributes:

* height (float - inch)
* width (float - inch)
* depth (float - inch)
* price (float)


Each order item can be charged the following fees:

* service fee (float): 3% of the item price or $1.50, whichever is greater
* fulfillment fee (float):  derived by summing all the dimension attributes and applying the following table:

Value	Charge
<10	$1.20
<20	$2.50
<30	$3.73
<40	$4.92
>=41	$7.12

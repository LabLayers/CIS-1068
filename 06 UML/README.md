# Taxi App UML

Note: Contructors not included, instructor recommended use of + instead of - for some class variables at the time

````
User
--
+name: String
+username: String
+home: Address
+work: Address
+email: String
+isDriver: boolean
+handicapped: boolean
+joined: Date
+payment: Array[CreditCards]
-password: String
--
+toString(): String
+ValidateCredentials(username:String, password:String): boolean
+UpdatePassword(username:String, oldPassword:String, newPassword:String): boolean
+UpdateEmail(username:String, password:String, newEmail:String): boolean
+BillUser(cardname:String, amount:BigDecimal, password:String):boolean
+RefundUser(cardname:String, amount:BigDecimal):boolean
+GetUserData(): String
+MemberSince(): String
+GetHomeAddress(AddressType:String): Address 
+UpdateAddress(AddressType:String): Address
+HireDriver()
+CarsOwned(): int
+ListCarsOwned(): String
+TripsDriven(): int
+FireDriver()
+DeleteUser()
````

````
Address
--
+nickname: String
+street: String
+unit: String
+city: String
+postal: int
+country: String
+x: BigDecimal
+y: BigDecimal
--
+toString(): String
+GetAddress(): String
+GetCoordinates(): String
+GetNickName(): String
+SetAddress(street:String, unit:String, city:String, postal:int, country:String)
+SetNickname(nickname:String)
````

````
Trip
--
+from: Address
+to: Address
+driver: User
+riders: Array[User]
+car: Car
+rating: int
+price: BigDecimal
+distance: float
+start: Date
+end: Date
--
+toString(): String
+SetPickup(from:Address)
+SetDestination(to:Address)
+GetRiders(): Array[User]
+GetDriver(): User
+GetCarInfo(): String
+CalculatePrice(distance:float): BigDecimal
+SetRating(rating:int)
+GetRating(rating:int)
````

````
Car
--
+owner: User
+make: String
+model: String
+color: String
+plate: String
+year: int
--
+toString(): String
+GetCarInfo(): String
+GetPlate(): String
+SetOwner(user:User)
````

````
CreditCard
--
+cardname: String
-num: int
-ccv: int
-exp_month: String
-exp_year: int
-billing: Address
--
+SetBillingAddress(address:Address)
+GetCardName(): String
+ValidateCard(num:int): boolean
````
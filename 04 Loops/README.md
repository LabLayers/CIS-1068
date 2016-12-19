# Meal Plans - Pusedo Code Assignment

## Write a description of what your program does and for whom, what it need and what it will produce. This should be in the form of several sentences. 

You are a confused Temple University freshman trying to determine whether or not to purchase a meal plan.

Each meal plan gives you a fixed amount of meals per week and is valid for 20 weeks. A meal purchased individually costs $8.49. Based on the amount of meals per week you plan to consume on campus, you want to determine if it’s cheaper to purchase a meal plan or to purchase meals individually.

A chart of meal plans can be found at http://housing.temple.edu/housing-and-dining-costs/meal-plans 

## Write pseudocode for your program. Turn the description into statements that are similar to code, but as readable as English

**Variables:**

- $plan_rate - meal plan rate
- #plan_type - meal plan type (number of meals per week)
- $plan_meal - cost per meal based on meal *plan*
- #actual - average number of meals you plan to consume per week
- $actual_rate - cost of meals purchased individually based on #actual
- #weeks - to keep track of # of weeks in while loop

**Steps:**

1. ask for double input “How much does the meal plan cost?”
store in $plan_rate
2. ask for double input “How many meals per week does the meal plan provide?”
3. store in #plan_type
4. ask for double input “On average, how many meals do you actually plan to eat on campus per week?”
5. store in #actual

**Code:**

````
#weeks = 1
while #weeks <= 20  (weeks)
	$actual_rate += #actual * $8.49 (cost per meal purchased individually)
	weeks++ (add 1 to #weeks)

if $actual_rate < $plan_rate print “It is cheaper to purchase meals individually ($actual_rate/semester) than to purchase a meal plan ($plan_rate/semester).”
else if $actual_rate > $plan_rate print “It is cheaper to purchase a meal plan ($plan_rate/semester) than it is to purchase a meal individually ($actual_rate/semester).”
else (if $actual_rate == $plan_rate) print “It costs the same to purchase a meal plan than it is to purchase a meal individually. ($actual_rate/semester)” 
````

## Test your algorithm with at least three sets of test data and prove that the code will work as intended.

````
$plan_rate = 695
#plan_type = 5
#actual = 4

$actual_rate = 679

It is cheaper to purchase a meal individually ($695/semester) than it is to purchase a meal plan ($679/semester).
````

````
$plan_rate = 1097
#plan_type = 8
#actual = 6

$actual_rate = 1018.8

It is cheaper to purchase meals individually ($1018.80/semester) than to purchase a meal plan ($1097/semester).
````

````
$plan_rate = 1356
#plan_type = 10
#actual = 10

$actual_rate = 1698

It is cheaper to purchase a meal plan ($1356/semester) than it is to purchase a meal individually ($1698/semester).
````
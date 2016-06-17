Feature: online calculator
Scenario Outline: multiplication
Given user enter <parama> and <paramb> in input box
And select <operator>
When click on calculate
Then result should be <result>
Examples:
| parama	| paramb	| operator	| result	|
| 2     	| 5     	| "Mul" 	| 10    	|
| 4     	| 5     	| "Add" 	| 9      	|
| 10     	| 5     	| "Comp" 	| 10      	|
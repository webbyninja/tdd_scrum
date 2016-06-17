Feature: calculator
Scenario Outline: ATDD
Given user enter <expr>
Then result should be <result>

Examples:
| expr | result	|
| "1,2,3,3,+,-" 	| "-4" |
| "2,3,^,4,5,+,+" 	| "17" |
| "10,50,%" 	| "5" |
 
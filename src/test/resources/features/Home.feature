Feature: Retail Home Page
​Background: 

    Given User is on retail website
    

@RetailHome
Scenario: Verify Shop by Department sidebar
    
    Then below options are present in Shop by Department sidebar
         |Electronics|Computers|Smart Home|Sports|Automative|
    
@Departments
Scenario Outline: Verify department sidebar options
    When User click on All section
    When User on '<department>'
    Then below options are present in department
         | <optionOne>         | <optionTwo>           |

    Examples:
    | department            | optionOne                          | optionTwo             |
    | Electronics           | TV & Video                         | Video Games              |
    | Computers             | Accessories                        | Networking               |
    | Smart Home            | Smart Home Lighting                | Plugs and Outlets        |
    | Sports                | Athletic Clothing                  | Exercise & Fitness       |
    | Automotive            | Automotive Parts & Accessories     | Motorcycle & Powersports |
Feature: Practice on lesson

  Scenario Outline: Testing something
    Given student:
      | name   | <name> |
      | age    | <age>  |
      | height | 210    |
      | weight | 300    |

    When we requesting name and age together

    Then response must be <nameAge>

    Examples:
      | name                | age | nameAge                 |
      | Nil                 | 19  | Nil: 19                 |
      | Zhrulj              | 23  | Zhrulj: 23              |
      | Pechenjkovij monstr | 99  | Pechenjkovij monstr: 99 |
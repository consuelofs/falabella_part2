@buyWithWarranty
Feature: Buy with extended warranty
As a user
I want to make a buy in falabella web site
Background:
    Given user navigates to GOOGLE and search "falabella"
    And user goes to first result

  Scenario Outline: buy products with warranty user not loged
        When user goes to falabella home page and search "ps4"
        Then sees product detail
        And adds product to back
        And go to the shopping Bag
        And increase to 2 products to buy
        And chooses warranty option "<warranty_opt>"
        Then user goes to buy product
    Examples:
    |  warranty_opt             |
    |  No, gracias              |
    |  Consolas 1 Año $ 31.990  |
    |  Consolas 2 Años $ 49.990 |
    |  Consolas 3 Años $ 89.990 |


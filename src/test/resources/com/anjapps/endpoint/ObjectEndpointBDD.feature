Feature: URL Object Operations

  Scenario: Add urls as objects
    Given the following url test data
      | id  | title     | link                       | desc                    |
      | 1   | ashu | http://www.anjapps.com/  | AnjApps India Pvt Ltd |
      | 2   | dewie     | http://www.anjapps.com/  | AnjApps India Pvt Ltd |
      | 3   | goofy     | http://www.anjapps.com/  | AnjApps India Pvt Ltd |
      | 4   | scrooge   | http://www.anjapps.com/  | AnjApps India Pvt Ltd |
      | 5   | daisy     | http://www.anjapps.com/  | AnjApps India Pvt Ltd |
      | 6   | minnie    | http://www.anjapps.com/  | AnjApps India Pvt Ltd |
      | 7   | mickey    | http://www.anjapps.com/  | AnjApps India Pvt Ltd |
      | 8   | fethry    | http://www.anjapps.com/  | AnjApps India Pvt Ltd |
    When the id '2' has been already exits don't add it again
    Then the total there should be '8' Urls.

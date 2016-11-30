
Feature: Rest Endpoint App Feature
  This is rest based application with object endpoint,
  Url can be accessed and tested using http://localhost:8181/apps/object

  Scenario: Test Object Endpoint
    This schenario is testing object endpoint for get method - "http://localhost:8181/apps/object"
    Given Open firefox
    When Open url for get object
    Then User should see Object Get!
    
    
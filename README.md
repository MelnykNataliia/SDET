# Trainee SDET tech task

## UI test
The test searches for a movie by title "Back to the future".

### Task List
- [X] **Navigate to https://www.imdb.com/**
    - [X] Make sure the page is opened
- [X] **Search the movie by title** "Back to the future" and open its page 
(keep in mind this is the first part of the trilogy that came out in 1985)
    - [X] Once you’re on the movie page, **make sure the movie description is**: 
          "Marty McFly, a 17-year-old high school student, is accidentally sent 
          thirty years into the past in a time-traveling DeLorean invented by his 
          close friend, the eccentric scientist Doc Brown."
  
### Technologies applied
* Java 17
* Selenium
* JUnit 5

**To run the test, go to [src/test/java/tests/Task.java]()**

### Test result
**Test failed: actual result ≠ expected result**
		
**Expected:** "Marty McFly, a 17-year-old high school student, is accidentally sent **thirty** years into the past
		in a time-traveling DeLorean invented by his close friend, the **eccentric** scientist Doc Brown."

**but was:** "Marty McFly, a 17-year-old high school student, is accidentally sent **30** years into the past
     	in a time-traveling DeLorean invented by his close friend, the **maverick** scientist Doc Brown."
		 

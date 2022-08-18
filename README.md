# Chapter-11-Example-Project-Binary-Search-on-Sorted-Random-Number-Array
In this project, create a sorted integer array and implement a binary search to find a specific element and report its position. Ask the user how large the array is, fill it with random numbers, display it, sort it, and display it again. In a loop, ask the user which number to find, search for it, and report the position where it was found. The user will enter a sentinel value to stop the loop, and the program will respond with a goodbye message.  You will include unit testing in this project, for the binary search. After writing that code, test it with a fixed array, so it has predictable results. Note that you don’t need any classes for this project, but you do need helper methods for the binary search (which must be recursive) and printing the array.  Generate random numbers that begin at 1 and go up to 5 times the size of the array, and fill the array with those random numbers.  Sort the array with the Java API method for sorting. Add this import in the code:       import java.util.Arrays;  After filling the array with random numbers, sort it with this call to the method for sorting arrays:       Arrays.sort(yourArray);  Use the recursive binary search algorithm in the book in Fig 11.8. This algorithm works but can be improved so it runs fewer times. In the bottom section with the comment “continue recursion”, it calculates the variable mid, then checks if the value at that point is larger or smaller than the target. What if it is equal to the target? If it is equal, then it has found the target in the array, so the recursion can stop. There are actually 4 base cases. If the target is at the first or last position, there is no need to search further -- those are base cases. If the first position equals the last position, every position has been searched, so either the target is in that position or it was not found -- base case. If none of those base cases have been reached, the else clause continues the recursion, calculating a new mid point;  if the new mid point is the target, that's a base case. 

![binarySearchRecursive](https://github.com/bell-kevin/Chapter-11-Example-Project-Binary-Search-on-Sorted-Random-Number-Array/blob/main/c11-binary-correction.PNG)

This helper method needs an array in the parameters. Create unit tests to verify that this method works as it should. Create a fixed array with 10 numbers, which could be as simple as "1, 2, 3, 4, 5, 6, 7, 8, 9, 10". Then test this method with different search numbers, two that are at or near the middle, two that are at or near the left end, two that are at or near the right end, and two that are not in the list. Run another unit test with a size of 20 numbers for the array. Take a screenshot of successful results of the tests.  Run the program with an array size of 10, filled with random numbers and sorted, and find a number near the left end, a number near the right end, and a number that is not in the list. Take a screenshot.  Run the program two more times, once with an array size of 20, and once with an array size of 50. In each execution, ask for a number near the left end, a number near the right end, and a number that is not in the array. Take screenshots of each execution.     Submission: the specific screenshots (for execution of the program, and for unit tests) and the root folder for the project  Note that you must use correct formatting in the code -- appropriate indentation is most important. You can use Shift-Alt-F to have NetBeans automatically format the code correctly. If the formatting is incorrect, it will be returned to you for changes with a grade of zero.  Note: You need to submit the whole project for these assignments. In File Explorer, go to the location where you created the project. There will be a folder with the name of your project -- that is the root folder of the project.  If you submit the root folder of the project, the instructor can run it on a different machine to grade it. If you don't submit the proper folder, it won't run on another machine, and the assignment will be marked with a zero.

== We're Using GitHub Under Protest ==

This project is currently hosted on GitHub.  This is not ideal; GitHub is a
proprietary, trade-secret system that is not Free and Open Souce Software
(FOSS).  We are deeply concerned about using a proprietary system like GitHub
to develop our FOSS project. I have a [website](bellKevin.me) where the
project contributors are actively discussing how we can move away from GitHub
in the long term.  We urge you to read about the [Give up GitHub](https://GiveUpGitHub.org) campaign 
from [the Software Freedom Conservancy](https://sfconservancy.org) to understand some of the reasons why GitHub is not 
a good place to host FOSS projects.

If you are a contributor who personally has already quit using GitHub, please
[email me](bellKevin.me) for how to send us contributions without
using GitHub directly.

Any use of this project's code by GitHub Copilot, past or present, is done
without our permission.  We do not consent to GitHub's use of this project's
code in Copilot.

![Logo of the GiveUpGitHub campaign](https://sfconservancy.org/img/GiveUpGitHub.png)


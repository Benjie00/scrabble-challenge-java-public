# The Scrabble Challenge
- [The Scrabble Challenge](#the-scrabble-challenge)
  - [About](#about)
    - [Methodology](#methodology)
  - [Getting Started](#getting-started)
    - [Prerequisites:](#prerequisites)
    - [Installation:](#installation)
    - [Project Structure:](#project-structure)
  - [Problem Statements](#problem-statements)
        - [Letter Values](#letter-values)
  - [Project Review](#project-review)
    - [Main Takeaways:](#main-takeaways)
    - [Future ideas:](#future-ideas)


## About
**Date of completion: 27/10/2022**

This is a recreation of a pre-digital futures academy challenge written in JavaScript (completed in early September 2022).

This project is designed to develop skills in Test-Driven Developement (TTD) and Java.


### Methodology
1. Test was run and subsequently failed.
2. Code was written to pass the test. 
3. Test was run, test passed.

## Getting Started

### Prerequisites:
- [Intellij](https://www.jetbrains.com/idea/)

### Installation:
1. Clone the repository
   ```
    git clone https://github.com/Benjie00/scrabble-challenge-java
   ```
 
2. Enter directory
   ```
    cd scrabble-challenge
   ```
3. Run tests


### Project Structure:
- Scrabble class (source code) is located at this path: src/main/java/Scrabble.class/
- Scrabble tests are located at this path: src/test/java/ScrabbleTest.class/

## Problem Statements

Given a word, compute the scrabble score for that word.

##### Letter Values

| Letter                       | Value |
| ---------------------------- | ----- |
| A, E, I, O, U, L, N, R, S, T | 1     |
| D, G                         | 2     |
| B, C, M, P                   | 3     |
| F, H, V, W, Y                | 4     |
| K                            | 5     |
| J, X                         | 8     |
| Q, Z                         | 10    |

## Project Review
### Main Takeaways:
- Developed knowledge of overloaded constructors.
- Reflected on my last scrabble project to write more efficnet code.
- Developed understanding of different Java exceptions from failing tests, e.g. NullPointerExceptionor array ArrayIndexOutOfBoundsException. 

### Future ideas:
- Take a user input on a scrabble word. 
- Make it multiplayer, by asking how many users will be playing, then detecting which users word has the highest score and printing the winner.
  





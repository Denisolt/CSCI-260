## Course: CSCI-260 Spring 2016
Date Created: 11/17/2016

Final project written for Data Structures

## Project Description:
Implementation of Stack, LinkedList and Queue from scratch using Java

## Execution:
Use any JAVA IDE (Netbeans, Eclipse, BlueJ) in order to run or command line:
```
cd CSCI-260/src/CSCI-260/
javac List.java
java List.java
```

## Testing:
| Sample List Test                   | Standard Output |
| :--------------------------------- | :-------------: |
|List<Character> list = new List<>();|                 |
|list.insert(1, 'B');                |                 |
|list.insert(0, 'A');                |                 |
|list.insert(2, 'C');                |                 |
|list.print();                       |   [A, B, C]     |
|list.insert(1, 'X');                |                 |
|list.print();                       |   [A, X, B, C]  |
|list.delete(0);                     |                 |
|list.print();                       |   [X, B, C]     |
|                                    |                 |
|Method Return                       |                 |
|list.find('C');                     |   2             |    
|list.find('D');                     |  -1             |
|list.get(0);                        |  'X'            |

This project was created in Netbeans

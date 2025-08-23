# Sum of Squares — Java Assignment (Plain Java)

## Goal
Implement the method:

```java
public static int sumOfSquares(int n)
```

- It should return the sum of squares from 1 to n.  
- For example: `sumOfSquares(3) = 1^2 + 2^2 + 3^2 = 14`.  
- If `n <= 0`, return 0.  

---

## How to Work Locally

### 1. Compile the code
From the root of the repository:
```bash
javac -cp lib/junit-platform-console-standalone.jar -d out $(find src -name "*.java")
```

### 2. Run all tests
```bash
java -jar lib/junit-platform-console-standalone.jar -cp out --scan-classpath
```

### 3. Run a single test method (example)
```bash
java -jar lib/junit-platform-console-standalone.jar -cp out --select-method edu.classroom.AssignmentTest#testSmallNumbers
```

---

## Project Structure
```
src/
  main/java/edu/classroom/Assignment.java   # implement your solution here
  test/java/edu/classroom/AssignmentTest.java # test cases
.github/
  workflows/classroom.yml   # GitHub Actions workflow for CI/autograding
  classroom/autograding.json # Autograding config (points per test)
```

---

## Autograding
- Each test case is worth **2 points**.  
- Total = **8 points**.  
- Partial credit is given if only some tests pass.  

---

## Tips
- Start simple, test with small values first.  
- Be careful with loops and off-by-one errors.  
- You can also implement using the formula: `n(n+1)(2n+1)/6`.  

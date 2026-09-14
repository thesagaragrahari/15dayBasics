# Day 02 — Java Foundations + Two Pointers

> **Goal:** Strengthen one important Java foundation while learning to recognize when two indices/pointers can reduce unnecessary work in an array or string problem.
>
> **Important:** Do not look at an optimal solution before attempting the problem yourself.

---

# Part 1 — Java Concept

## Topic: `String`, `StringBuilder`, and Immutability

Today, understand how Java handles strings. This is important for backend development because strings are used everywhere: API requests, validation, JSON fields, logs, database values, authentication data, and more.

### Learn and explain in your own words

1. What is a `String` in Java?
2. What does **String immutability** mean?
3. What happens when you do:

```java
String s = "hello";
s = s + " world";
```

4. Why can repeated string concatenation inside a loop become inefficient?
5. What is `StringBuilder`?
6. When would you prefer `StringBuilder` over `String` concatenation?
7. What is the difference between:

```java
String s1 = "hello";
String s2 = new String("hello");
```

8. What does `==` compare for objects, and how is it different from `.equals()`?

Do not memorize definitions. Write the explanation as if you were explaining it to another Java developer.

### Small Java experiment

Create a Java file:

```text
JavaStringBasics.java
```

Use it to demonstrate:

- String immutability
- `==` vs `.equals()`
- `StringBuilder`

Keep the experiment simple. The goal is understanding, not building a large program.

---

# Part 2 — DSA Concept

## Topic: Two Pointers

Before solving the problem, write your own notes explaining:

1. What is the **two-pointer technique**?
2. Why can two pointers sometimes reduce an `O(n²)` solution to `O(n)`?
3. What does it mean for pointers to move **towards each other**?
4. When would you use pointers from the **left and right ends**?
5. What is the difference between:
   - two pointers moving toward each other
   - two pointers moving in the same direction
6. What assumptions about the input can make the technique possible? (For example: sorted data.)

Use your own words. Do not copy a definition from the internet.

---

# Part 3 — DSA Problem: Valid Palindrome

Solve **LeetCode #125 — Valid Palindrome**.

## Step A — Understand

Given a string, determine whether it is a palindrome after:

- converting uppercase letters to lowercase
- ignoring non-alphanumeric characters

Examples:

```text
"A man, a plan, a canal: Panama" → true
"race a car" → false
" " → true
```

Document:

- What is the input?
- What is the output?
- What characters should be ignored?
- Is case important?

## Step B — Straightforward approach

Do **not** start with two pointers.

Think of the simplest correct solution you can create.

Possible direction to explore:

- create/clean the required representation
- compare characters from the beginning and end

Document:

- your approach
- why it works
- time complexity
- space complexity

## Step C — Improve it yourself

Now ask yourself:

> **"Do I really need to create another string, or can I compare the required characters directly?"**

Try to improve the space usage.

Do not search for the solution yet.

Document:

- what changed
- why it is better
- time complexity
- space complexity

## Step D — Java implementation

Create:

```text
TwoPointers.java
```

Implement your final solution in Java.

---

# Part 4 — Connect Java + DSA

This is the important part of today's learning.

While solving the palindrome problem, consciously think about the Java concepts you learned:

- `String` is immutable.
- Creating many intermediate strings can use additional memory.
- `StringBuilder` can efficiently build a mutable sequence.
- Java provides useful character/string operations such as `Character.isLetterOrDigit()` and `Character.toLowerCase()`.

You do **not** need to force `StringBuilder` into the final two-pointer solution. The goal is to understand **why** different Java tools have different trade-offs.

Write a short note answering:

> **How did today's Java knowledge influence the way I thought about the palindrome problem?**

---

# Part 5 — Manual Thinking Exercise

Consider:

```text
"Madam"
```

Walk through your algorithm manually.

Show the pointer positions at each important step and explain why the pointers move.

Then consider:

```text
"A man, a plan, a canal: Panama"
```

Explain how your algorithm handles spaces, commas, and uppercase letters.

---

# Part 6 — Mentor Challenge

Before asking for review, answer these questions in your README:

### Java

1. Why is `String` immutable?
2. Why can repeated `String` concatenation be expensive?
3. When would you use `StringBuilder`?
4. Why should `.equals()` normally be used for comparing String contents instead of `==`?

### DSA

5. Why does checking characters from both ends work for a palindrome?
6. Why can we skip non-alphanumeric characters?
7. What would happen if we moved only the left pointer?
8. Can this problem be solved in `O(n)` time?
9. Can it be solved using `O(1)` auxiliary space?
10. What was the first mistake or confusing part in your thinking?

---

# Part 7 — Deliverables

Your `day-02` folder should contain:

```text
day-02/
├── README.md
├── Java/
│   └── JavaStringBasics.java
└── DSA/
    └── TwoPointers.java
```

Your README should contain:

- Java String notes
- Java experiment observations
- Two-pointer notes
- problem understanding
- straightforward approach
- optimized approach
- complexity analysis
- manual walkthrough
- Java + DSA connection
- key insights
- initial difficulty/mistakes

---

# Part 8 — Completion Criteria

Day 02 is complete only when:

- [ ] You can explain String immutability in your own words.
- [ ] You understand `==` vs `.equals()` for Strings.
- [ ] You understand why/when `StringBuilder` is useful.
- [ ] You completed the small Java experiment.
- [ ] You can explain the two-pointer technique without memorizing a definition.
- [ ] You attempted the straightforward palindrome solution before optimizing.
- [ ] You can explain why the optimized approach works.
- [ ] You implemented the final Java solution.
- [ ] You analyzed time and space complexity.
- [ ] You documented your Java + DSA connection.
- [ ] You documented your mistake/confusion.
- [ ] You pushed the work to GitHub.
- [ ] You completed the mentor review.

---

## Mentor Rule

**Do the work first. Ask for help when you are stuck.**

When you come back for review, show me:

1. Your Java experiment/code
2. Your first DSA approach
3. Your optimized approach
4. Your complexity analysis
5. Your explanation of the key insight
6. Anything you were confused about

I will review your thinking first, then your code.

# Day 02 — Two Pointers

> **Goal:** Learn to recognize when two indices/pointers can reduce unnecessary work in an array or string problem.
>
> **Important:** Do not look at an optimal solution before attempting the problem yourself.

---

## 1. Concept — Two Pointers

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

## 2. Problem — Valid Palindrome

Solve **LeetCode #125 — Valid Palindrome**.

### First understand the problem

Given a string, determine whether it is a palindrome after:

- converting uppercase letters to lowercase
- ignoring non-alphanumeric characters

Examples:

```text
"A man, a plan, a canal: Panama" → true
"race a car" → false
" " → true
```

### Your tasks

#### Step A — Understand

Document:

- What is the input?
- What is the output?
- What characters should be ignored?
- Is case important?

#### Step B — Brute-force / straightforward approach

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

#### Step C — Improve it yourself

Now ask yourself:

> **"Do I really need to create another string, or can I compare the required characters directly?"**

Try to improve the space usage.

Do not search for the solution yet.

Document:

- what changed
- why it is better
- time complexity
- space complexity

#### Step D — Java implementation

Create:

```text
TwoPointers.java
```

Implement your final solution in Java.

---

## 3. Thinking Exercise

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

## 4. Mentor Challenge

Before asking for review, answer these questions in your README:

1. Why does checking characters from both ends work for a palindrome?
2. Why can we skip non-alphanumeric characters?
3. What would happen if we moved only the left pointer?
4. Can this problem be solved in `O(n)` time?
5. Can it be solved using `O(1)` auxiliary space?
6. What was the first mistake or confusing part in your thinking?

---

## 5. Deliverables

Your `day-02` folder should contain:

```text
day-02/
├── README.md
└── DSA/
    └── TwoPointers.java
```

Your README should contain:

- Two-pointer notes
- problem understanding
- straightforward approach
- optimized approach
- complexity analysis
- manual walkthrough
- key insight
- initial difficulty/mistakes

---

## 6. Completion Criteria

Day 02 is complete only when:

- [ ] You can explain the two-pointer technique without memorizing a definition.
- [ ] You attempted the straightforward solution before optimizing.
- [ ] You can explain why the optimized approach works.
- [ ] You implemented the final Java solution.
- [ ] You analyzed time and space complexity.
- [ ] You documented your mistake/confusion.
- [ ] You pushed the work to GitHub.
- [ ] You completed the mentor review.

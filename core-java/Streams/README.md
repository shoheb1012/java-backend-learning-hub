
#  MASTER STREAMS – 60 HANDS-ON QUESTIONS (Java)

### **LEVEL 1 — EASY / BASICS**

1. Given a list of integers, return a list of even numbers using streams.
2. Find all strings starting with the letter “A” from a list of strings.
3. Convert a list of strings to uppercase using `map()`.
4. Given a list of numbers, return a list with distinct elements using `distinct()`.
5. Sort a list of numbers in ascending and descending order using streams.
6. Count how many strings in a list have length greater than 5.
7. Check if a number list contains any negative number using `anyMatch()`.
8. Check if all numbers are positive using `allMatch()`.
9. Find the first element of a list using `findFirst()`.
10. Convert a list of strings into their lengths using streams.

---

### **LEVEL 2 — INTERMEDIATE / MOST ASKED**

11. Given a list of integers, find the **maximum** and **minimum** using streams.
12. Find the **second highest** number using streams.
13. Find the **sum of all even numbers** using `reduce()`.
14. Find the **average** of a list of numbers.
15. Remove all null values from a list using streams.
16. Given a list of employees, filter all employees whose salary > 50k.
17. Sort employees by name and then by salary.
18. Count employees working in each department (group by department).
19. Find the total salary paid per department.
20. Find employee with the highest salary using streams.

---

### **LEVEL 3 — ADVANCED / COMPANY LEVEL**

21. Convert a list of sentences into a list of individual words using `flatMap()`.
22. Find duplicate elements in a list using streams.
23. Remove duplicate elements without using Set.
24. Given a list of numbers, separate them into odd & even using `partitioningBy()`.
25. Find the element that appears most frequently in a list.
26. Given a map<String, List<Integer>>, flatten all values into a single list.
27. Convert list → map with key=name, value=salary using `Collectors.toMap()`.
28. Handle duplicate keys when converting to map (merge function).
29. Reverse sort by multiple fields (salary desc, age asc).
30. Convert a list of objects to a CSV string using `joining()`.

---

### **LEVEL 4 — DEEP STREAMS & TRICKY**

31. Find the longest string in a list.
32. Find the shortest string.
33. Given list of employees, group by department → inside each dept sort by salary.
34. Given list of products, get top 3 most expensive.
35. Join names of employees into a single comma-separated string.
36. Convert a primitive stream to wrapper stream (int → Integer).
37. Convert wrapper stream to primitive stream (Integer → int).
38. Implement pagination logic using streams (skip, limit).
39. Check if list is empty using streams (no if condition).
40. Find sum of squares of all numbers.
41. Find product of all numbers using reduce.
42. Find employees whose joining year = current year using date + streams.
43. Find the difference between highest and lowest salary using streams.
44. Implement custom comparator inside stream.
45. Collect employees into `TreeMap` sorted by name.

---

### **LEVEL 5 — EXPERT / INTERVIEW LEVEL**

46. Write a custom collector that calculates average salary.
47. Implement parallel stream and measure performance difference.
48. Safely use parallel streams with thread-safe data.
49. Given a list of transactions, find total amount per customer sorted by amount.
50. Given a list<Optional<Employee>>, extract only non-empty employees.
51. Convert nested list `List<List<Integer>>` into a single flattened sorted list.
52. Create a histogram of word frequency from a paragraph using streams.
53. Implement grouping by multiple fields (city → department → employees).
54. Given a list of orders, find the order containing highest number of items.
55. Convert JSON list string to objects → filter using streams (requires dependency).
56. Implement your own version of `map()` using reduce.
57. Implement your own version of `filter()` using reduce.
58. Write a stream pipeline that calculates:

    * filter even numbers
    * square them
    * sort in descending
    * take top 3
59. Convert list to immutable list using collectors.
60. Safely handle NullPointer inside stream using `Optional.ofNullable()`.


package oop.AccessModifiersA1;

public class AccessModifiersNotes {
    /*
    | Access Modifier         | **Class (Top-level)** | **Inner Class / Method / Variable / Constructor** | **Accessible in Same Class** | **Same Package** | **Subclass (diff package)** | **Other Packages**     |
| ----------------------- | --------------------- | ------------------------------------------------- | ---------------------------- | ---------------- | --------------------------- | ---------------------- |
| `public`                | ✅ Yes                 | ✅ Yes                                             | ✅ Yes                        | ✅ Yes            | ✅ Yes                       | ✅ Yes                  |
| `protected`             | ❌ No (Top-level only) | ✅ Yes                                             | ✅ Yes                        | ✅ Yes            | ✅ Yes                       | ❌ No (unless subclass) |
| *default* (no modifier) | ✅ Yes                 | ✅ Yes                                             | ✅ Yes                        | ✅ Yes            | ❌ No                        | ❌ No                   |
| `private`               | ❌ No                  | ✅ Yes                                             | ✅ Yes                        | ❌ No             | ❌ No                        | ❌ No                   |


| Context             | `public` | `protected` | *default* | `private` |
| ------------------- | -------- | ----------- | --------- | --------- |
| **Top-level Class** | ✅        | ❌           | ✅         | ❌         |
| **Inner Class**     | ✅        | ✅           | ✅         | ✅         |
| **Method**          | ✅        | ✅           | ✅         | ✅         |
| **Variable**        | ✅        | ✅           | ✅         | ✅         |
| **Constructor**     | ✅        | ✅           | ✅         | ✅         |




     */
}

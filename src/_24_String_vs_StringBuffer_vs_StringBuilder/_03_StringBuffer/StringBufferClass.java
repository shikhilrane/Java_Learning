package _24_String_vs_StringBuffer_vs_StringBuilder._03_StringBuffer;

public class StringBufferClass {
    public static void main(String[] args) {
        // StringBuffer
        StringBuffer sb = new StringBuffer("Hello ");

        // 1. Append
        sb.append("World");                // The World will be added to last
        System.out.println(sb);

        // 2. Insert
        sb.insert(5, " Java");  // " Java" will be added in sb from index 5
        System.out.println(sb);

        // 3. Replace
        sb.replace(5,10," JavaScript");
        System.out.println(sb);

        // 4. Delete
        sb.delete(5,16);
        System.out.println(sb);

        // 5. Reverse
        sb.reverse();
        System.out.println(sb);

        // 6. CharAt
        System.out.println(sb.charAt(4));

        // 7. Length
        System.out.println(sb.length());

        // 8. SubString
        System.out.println(sb.substring(1,4));

        // 9. IndexOf
        System.out.println(sb.indexOf("e"));

        // 10. IndexOf with fromIndex
        System.out.println(sb.indexOf("l",8));

        // 11. Delete character at
        System.out.println(sb.deleteCharAt(8));

        // 12. Method Chaining
        sb.append("3").reverse().replace(2,4, "hii");
        System.out.println(sb);

        // 13. Capacity
        System.out.println("Capacity: " + sb.capacity());

        // 14. Ensure Capacity
        sb.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(50): " + sb.capacity());

        // 15. Trim To Size
        sb.trimToSize();
        System.out.println("Capacity after trimToSize(): " + sb.capacity());

        // 16. Converting to Immutable String
        String str = sb.toString();
        System.out.println(str);
    }
}

/*
    1. StringBuffer is mutable
    2. It gets stored in Heap, not in String Pool Area
    3. StringBuffer provides method chaining
    4. Slower than StringBuilder because there is an overhead of synchronization for thread safety, but faster than String
    5. StringBuffer is ThreadSafe
    6. If we want thread-safe String that change further, then we will use StringBuffer
*/

/*
    StringBuffer Notes:
        1. StringBuffer is a mutable class.
        2. It is used when String content changes frequently.
        3. It is thread-safe because its methods are synchronized.
        4. Due to synchronization, it is slower than StringBuilder.
        5. All modification methods change the same object instead of creating a new object.
        6. Common methods:
            - append()          : Adds data at the end.
            - insert()          : Inserts data at a specific index.
            - replace()         : Replaces characters.
            - delete()          : Deletes a range of characters.
            - deleteCharAt()    : Deletes a character at a specific index.
            - reverse()         : Reverses the content.
            - charAt()          : Returns character at an index.
            - length()          : Returns current length.
            - substring()       : Returns a substring.
            - indexOf()         : Finds first occurrence.
            - toString()        : Converts StringBuffer to String.

    Capacity Methods:
        1. capacity()
            - Returns the current storage capacity.
            - Default capacity = 16.
            - If initialized with a String:
                  capacity = String length + 16.

        2. ensureCapacity(n)
            - Ensures that the capacity is at least 'n'.
            - If current capacity is enough, nothing changes.
            - Otherwise capacity increases automatically.

        3. trimToSize()
            - Reduces capacity to the current length.
            - Helps save memory when extra capacity is no longer needed.

    Memory Management:
        1. StringBuffer creates only one object in Heap Memory.
        2. All modifications happen on the same object.
        3. When the current capacity becomes full, Java creates a larger internal character array.
        4. New Capacity Formula:
                (Old Capacity × 2) + 2
        5. Existing characters are copied into the new array.
        6. The old array becomes eligible for Garbage Collection.
        7. Since the same object is modified repeatedly, StringBuffer is memory-efficient.
        8. Methods are synchronized, making it thread-safe but slower than StringBuilder.

    Execution:
        1. Create StringBuffer.
        2. Perform append(), insert(), replace(), delete(), reverse(), etc.
        3. Check capacity().
        4. Increase capacity using ensureCapacity().
        5. Reduce extra capacity using trimToSize().
        6. Convert StringBuffer to String using toString().
*/
package _18_Enums._03_Enum_with_Method;

public class Demo4 {
    public static void main(String[] args) {
        Direction d = Direction.NORTH;
        d.move();
    }
}

enum Direction {
    // NORTH, SOUTH, EAST and WEST are enum constants.
    // Each enum constant is an object of the Direction enum.
    // Since they have their own class body {}, they behave like anonymous subclasses
    // and can provide their own implementation of move().
    NORTH {
        @Override
        public void move() {
            System.out.println("Move up (Y + 1)");
        }
    },
    SOUTH {
        @Override
        public void move() {
            System.out.println("Move down (Y - 1)");
        }
    },
    EAST {
        @Override
        public void move() {
            System.out.println("Move right (X + 1)");
        }
    },
    WEST {
        @Override
        public void move() {
            System.out.println("Move left (X - 1)");
        }
    };

    public abstract void move();
}

/*
    Enum with Method Notes:

    1. Every enum constant is an object of the enum class.
    2. Each enum constant can provide its own implementation of a method.
    3. move() is declared as abstract, so every enum constant must override it.
    4. This is called Constant-Specific Method Implementation.
    5. It is useful when every enum constant has different behavior.
    6. No if-else or switch statement is required because each constant knows its own behavior.

    Execution:
        1. Store NORTH enum constant in variable d.
        2. Call d.move().
        3. Since d is NORTH, NORTH's overridden move() method is executed.
        4. Output: Move up (Y + 1)
*/
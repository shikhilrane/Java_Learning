package _04_Variables;/*                                                               VARIABLES IN JAVA
 * 1. It is a name of reserved memory location
 * 2. name of variable should not begin with number
 * 3. no whitespace allowed
 * 4. java keyword can't be used
 * 5. give a meaningful names to variable
 * 6. all lowercase should be used when creating a single word variable
 * 7. Naming convention :-
 *    lowercase -> macbookpro (for packages)
 *    UPPERCASE -> MACBOOKPRO (for constants)
 *    camelCase -> macBookPro (for functions and variables)
 *    PascalCase -> MacBookPro (for classes)
 *    SNAKE_CASE (upper) -> MACBOOK_PRO (for constants with space)
 *    snake_case -> macbook_pro (general)
 * 8. Only you can start variable name by letter, _(underscore), $
 */



public class Variables {
    public static void main(String[] args) {
        int a = 10;
        //  ^
        //  |
        // variable
        String b = "SKR";
        System.out.println(a + 4);
        System.out.println("Value of \'b\' is " + b);
        a = 16;
        System.out.println(a);
    }
}


/*
 * Identifiers :- (i.e. nomenclature of any component in java particularly variable)
 *  1. all identifier begin with A-Z or a-z or $ or _ (e.g. $hikhil)
 *  2. after first character we can use any character (e.g. $hikh@il)
 *  3. we can't use java keyword as identifier
 *  4. identifiers are case sensitive
 *  5. whitespaces are not permitted
 */
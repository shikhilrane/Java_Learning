package _18_Enums._02_Enum_with_Property_Constructor_getter_Method;

public class MonthClass {
    public static void main(String[] args) {
        Month month = Month.OCTOBER;
        System.out.println(month.getLowercase());
        System.out.println(month.getShortform());
        System.out.println(month.display());
    }
}

package _18_Enums._02_Enum_with_Property_Constructor_getter_Method;

public enum Month {
    JANUARY("January","JAN"),
    FEBRUARY("February", "FEB"),
    MARCH("March", "MAR"),
    APRIL("April", "APR"),
    MAY("May", "MAY"),
    JUNE("June", "JUN"),
    JULY("July", "JUL"),
    AUGUST("August", "AUG"),
    SEPTEMBER("September", "SEP"),
    OCTOBER("October", "OCT"),
    NOVEMBER("November", "NOV"),
    DECEMBER("December", "DEC");

    private final String lowercase;
    private final String shortform;

    Month(String lowercase, String shortform) {
        this.lowercase = lowercase;
        this.shortform = shortform;
    }

    public String getLowercase() {
        return lowercase;
    }

    public String getShortform() {
        return shortform;
    }

    public boolean display(){
        System.out.println("Name is " + this.name() + " and in lowercase " + this.getLowercase() + " and its shortform is " + this.getShortform());
        return true;
    }
}


// Whenever we use () in front of any field, then it means that we want to call custom constructor of Enum
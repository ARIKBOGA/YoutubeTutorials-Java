package ENUM;

public enum Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

class Test{
    public static void main(String[] args) {
        Days d1 = Days.MONDAY;
        boolean b = d1 instanceof Days;

        System.out.println(d1.name().equalsIgnoreCase("monday"));

        
    }
}

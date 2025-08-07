package enumeration;

enum DaysOfWeek {
    MONDAY {
        @Override
        public String getNumberOfDay() {
            return "1st day of the week";
        }
    },
    TUESDAY {
        @Override
        public String getNumberOfDay() {
            return "2nd day of the week";
        }
    },
    WEDNESDAY {
        @Override
        public String getNumberOfDay() {
            return "3rd day of the week";
        }
    },
    THURSDAY {
        @Override
        public String getNumberOfDay() {
            return "4th day of the week";
        }
    },
    FRIDAY {
        @Override
        public String getNumberOfDay() {
            return "5th day of the week";
        }
    },
    SATURDAY {
        @Override
        public String getNumberOfDay() {
            return "6th day of the week";
        }
    },
    SUNDAY {
        @Override
        public String getNumberOfDay() {
            return "7th day of the week";
        }
    };

    public abstract String getNumberOfDay();
}

public class EnumAbstractMethods {
    public DaysOfWeek day;

    public EnumAbstractMethods(DaysOfWeek day) {
        this.day = day;
    }

    public static void main(String[] args) {
        EnumAbstractMethods daynum = new EnumAbstractMethods(DaysOfWeek.MONDAY);
        System.out.println("The " + daynum.day.name() + " is " + daynum.day.getNumberOfDay());

        daynum = new EnumAbstractMethods(DaysOfWeek.SATURDAY);
        System.out.println("The " + daynum.day.name() + " is " + daynum.day.getNumberOfDay());
    }
}
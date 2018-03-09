package Converter;

/**
 * Collect the unit which has a value,multiplier to convert this unit to a quantity of a "standard" unit.
 * For Length,let meter be the "standard" unit. Hence, meter has a value of 1.0. Kilometer has a value of 1000.0.
 * @author Raksani Khunamas.
 */

    public enum Length {
        Mile(1609.344),
        Kilometer(1000.0),
        Meter(1.0),
        Centimeter(0.0100),
        Foot (0.30480),
        Wa(2.00000),
        AU(149597870700.0) ;

        //attributes of the enum members.
        private final double value;
        //constructor
        private Length(double value){
        this.value = value;
        }

        /**
         * get value of Length.
         * @return value
         */
        public double getValue(){
        return this.value;
    }
}

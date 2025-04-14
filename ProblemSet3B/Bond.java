public class Bond {

    private double sellingPrice;
    private double faceValue;
    private double interestPayment;
    private double duration;

    private YieldCalculation yieldCalculation;

    public Bond (double sellingPrice, double faceValue, double interestPayment, double duration){
        if (sellingPrice <= 0 || faceValue <= 0 || duration <= 0) {
            throw new IllegalArgumentException("Selling Price, Face Value and Duration must be greater than zero!");
        }
        if (interestPayment < 0){
            throw new IllegalArgumentException("Interest Payment cannot be negative!");
        }
        this.sellingPrice = sellingPrice;
        this.faceValue = faceValue;
        this.interestPayment = interestPayment;
        this.duration = duration;
    }

    public double getSellingPrice(){
        return sellingPrice;
    }

    public double getFaceValue(){
        return faceValue;
    }

    public double getInterestPayment(){
        return interestPayment;
    }

    public double getDuration(){
        return duration;
    }

    public void setYieldCalculation(YieldCalculation yield_Calculation) {
        this.yieldCalculation = yield_Calculation;
    }

    public double calculateYTM(){
        double result = this.yieldCalculation.yieldToMaturity(this);
        return result;
    }


    public static class BondBuilder{

        private double sellingPrice = 1000.0;
        private double faceValue = 1000.0;
        private double interestPayment = 10.0;
        private double duration = 1.0;

        public Bond createBond(){
            return new Bond(sellingPrice, faceValue, interestPayment, duration);
        }

        public BondBuilder setSellingPrice(double sellingPrice) {
            this.sellingPrice = sellingPrice;
            return this;
        }

        public BondBuilder setFaceValue(double faceValue) {
            this.faceValue = faceValue;
            return this;
        }

        public BondBuilder setInterestPayment(double interestPayment) {
            this.interestPayment = interestPayment;
            return this;
        }

        public BondBuilder setDuration(double duration) {
            this.duration = duration;
            return this;
        }

    }

}

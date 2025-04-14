public class WithCouponYield implements YieldCalculation {
    @Override
    public double yieldToMaturity(Bond bond) {
        // Step 1: Set initial upper and lower bounds
        double rUp = 1.0;
        double rDown = 1e-10; // 10^(-10)
        double delta = rUp - rDown;

        // Step 2: Perform bisection method
        while (delta > 1e-5) {
            double rMiddle = (rUp + rDown) / 2.0;

            // Compute f(r) using the given formula
            double frMiddle = bond.getSellingPrice() - (
                    (bond.getInterestPayment() * (1 - Math.pow(1 / (1 + rMiddle), bond.getDuration())) / rMiddle) +
                            (bond.getFaceValue() / Math.pow(1 + rMiddle, bond.getDuration()))
            );

            double frDown = bond.getSellingPrice() - (
                    (bond.getInterestPayment() * (1 - Math.pow(1 / (1 + rDown), bond.getDuration())) / rDown) +
                            (bond.getFaceValue() / Math.pow(1 + rDown, bond.getDuration()))
            );

            // Step 3: Update bounds based on the sign of f(r)
            if (frMiddle * frDown > 0) {
                rDown = rMiddle;
            } else {
                rUp = rMiddle;
            }

            delta = rUp - rDown;
        }

        // Step 4: Compute final result
        return (rUp + rDown) / 2.0;
    }
}

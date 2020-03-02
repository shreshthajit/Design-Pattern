package factory;

import MyWork.CapitalStrategy;
import MyWork.Loan;

import java.time.ZonedDateTime;

public class FactoryMethodMain {
    public static Loan CreateTermLoan(double commitment, int riskRating, ZonedDateTime maturity) {
        return new Loan(null, commitment, 0.00, riskRating, maturity, null);
    }

    public static Loan CreateTermLoan(CapitalStrategy capitalStrategy, double commitment,
                                      double outstanding, int riskRating,
                                      ZonedDateTime maturity, ZonedDateTime expiry) {
        return new Loan(capitalStrategy,
                commitment, outstanding, riskRating,
                maturity, null);
    }

    public static Loan CreateRevolver(double commitment, int riskRating, ZonedDateTime maturity, ZonedDateTime expiry) {
        return new Loan(null, commitment, 0.00, riskRating, maturity, expiry);
    }

    public static Loan CreateRevolver(CapitalStrategy capitalStrategy, double commitment, int riskRating, ZonedDateTime maturity, ZonedDateTime expiry) {
        return new Loan(capitalStrategy, commitment, 0.00, riskRating, maturity, expiry);
    }

    public static Loan CreateRCTL(double commitment, double outstanding,
                                  int riskRating, ZonedDateTime maturity, ZonedDateTime expiry) {
        return new Loan(null, commitment, outstanding, riskRating, maturity, expiry);
    }

    public static Loan CreateRCTL(CapitalStrategy capitalStrategy, double commitment, double outstanding,
                                  int riskRating, ZonedDateTime maturity, ZonedDateTime expiry) {
        return new Loan(capitalStrategy, commitment, outstanding, riskRating, maturity, expiry);
    }
}

package MyWork;

import java.time.ZonedDateTime;

public class Loan {
    private final double _outstanding;
    private final int _riskRating;
    private final ZonedDateTime _maturity;
    private final ZonedDateTime _expiry;
    private final CapitalStrategy _capitalStrategy;
    private double _commitment;

    public Loan(CapitalStrategy capitalStrategy, double commitment,double outstanding, int riskRating,
                ZonedDateTime maturity, ZonedDateTime expiry) {
        this._commitment = commitment;
        this._outstanding = outstanding;
        this._riskRating = riskRating;
        this._maturity = maturity;
        this._expiry = expiry;

        if (capitalStrategy != null) {
            this._capitalStrategy = capitalStrategy;
        } else {
            if (expiry == null)
                this._capitalStrategy = new CapitalStrategyTermLoan();
            else if (maturity == null)
                this._capitalStrategy = new CapitalStrategyRevolver();
            else
                this._capitalStrategy = new CapitalStrategyRCTL();
        }
    }


    public CapitalStrategy GetCapitalStrategy() {
        return _capitalStrategy;
    }
}

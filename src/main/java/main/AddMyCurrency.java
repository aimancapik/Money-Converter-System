
package main;

/**
 *
 * @author Khairul Hakimi
 */
public class AddMyCurrency { // to add more currency
    private int currencyId;
    private String currencyName;
    private double rate;
    private String currencySymbol;
    
    public int getCurrencyId() { //to get currencyID
        return currencyId;
    }

    public void setCurrencyId(int currencyId) {//to set currencyID
        this.currencyId = currencyId;
    }
    

    public String getCurrencyName() {//to get CurrencyName
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {//to set CurrencyName
        this.currencyName = currencyName;
    }

    public double getRate() { //to get rate
        return rate;
    }

    public void setRate(double rate) {//to set rate
        this.rate = rate;
    }
    
    public String getCurrencySymbol() {//to get currencySymbol
        return currencySymbol;
    }

    public void setCurrencySymbol (String currencySymbol) {//to set currencySymbol
        this.currencySymbol = currencySymbol;
    }
}

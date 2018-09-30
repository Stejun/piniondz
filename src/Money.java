public class Money {
    private int unit;
    private int fractions;

    public Money(int unit, int fractions) {
        this.unit = unit;
        this.fractions = fractions;
    }

    public int getUnit() {
        return unit;
    }

    public int getFractions() {
        return fractions;
    }

    public Money add(Money amount) {
        int totalInFractions = moneyToFractions(this) + moneyToFractions(amount);
        return fractionsToMoney(totalInFractions);
    }

    public Money subtract(Money amount) {
        int totalInFractions = moneyToFractions(this) - moneyToFractions(amount);
        return fractionsToMoney(totalInFractions);
    }

    private int moneyToFractions(Money amount) {
        return amount.fractions + (amount.unit * 100);
    }

    private Money fractionsToMoney(int fractionsTotal) {
        int unit = unitFromFractions(fractionsTotal);
        int fractions = unitToFractions(unit, fractionsTotal);
        return new Money(unit, fractions);
    }

    private int unitFromFractions(int fractions) {
        return Math.floorDiv(fractions, 100);
    }

    private int unitToFractions(int unit, int fractions) {
        return fractions - (unit * 100);
    }


}

package money;

public interface Expression {

	Expression plus(Money addend);
	Money reduce(Bank bank, String to);
}

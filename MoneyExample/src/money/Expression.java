package money;

public interface Expression {

	Expression plus(Money addend);
	Money reduce(String to);
}

package loja;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DescontoStrategyFactory {
	
	private static DescontoStrategyFactory instance;
	
	private DescontoStrategyFactory() {
		
	}
	
	public static DescontoStrategyFactory getInstance() {
		if (instance == null)
			instance = new DescontoStrategyFactory();
		return instance;
	}
	
	public IDescontoStrategy createDescontoStrategy() {
		LocalDate now = LocalDate.now();
		DayOfWeek today = now.getDayOfWeek();
		if (today.equals(DayOfWeek.WEDNESDAY))
			return new DescontoAbsoluto(100);
		if (today.equals(DayOfWeek.SATURDAY) || today.equals(DayOfWeek.SUNDAY))
			return new DescontoPercentual(0.9);
		return new SemDesconto();
	}

}

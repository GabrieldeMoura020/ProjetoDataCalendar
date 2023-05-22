import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Fatura {

	public static void main(String[] args) {

		LocalDate dataVencimento = LocalDate.parse(args [1]);
		LocalDate dataLimite = dataVencimento.plusDays(10);
		
		if (dataLimite.getDayOfWeek() == DayOfWeek.SATURDAY) {
			dataLimite = dataLimite.plusDays(2);			
		} else if (dataLimite.getDayOfWeek() == DayOfWeek.SUNDAY){
			dataLimite = dataLimite.plusDays(1);
		}
		
		LocalDate dataAtual = LocalDate.now();
		long diasParaPagar = ChronoUnit.DAYS.between(dataAtual, dataLimite);
		
		System.out.println("Você tem "+ diasParaPagar + " dias para pagar!");
		
	}

}

package javainterview;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Write a java stream program to find sum of Transaction Amounts of Each Day ?

class Transaction
{
	private LocalDate date;
	private Double amount;

	Transaction(LocalDate date, Double amount)
	{
		this.date = date;
		this.amount = amount;
	}

	public LocalDate getDate()
	{
		return date;
	}

	public Double getAmount()
	{
		return amount;
	}

}

public class M78
{
	public static void main(String[] args)
	{
		Transaction transaction1 = new Transaction(LocalDate.of(2025, 05, 25), 200.0);
		Transaction transaction2 = new Transaction(LocalDate.of(2025, 03, 14), 500.0);
		Transaction transaction3 = new Transaction(LocalDate.of(2025, 04, 20), 800.0);
		Transaction transaction4 = new Transaction(LocalDate.of(2025, 01, 10), 1200.0);
		
		List<Transaction> transactions = Arrays.asList(transaction1,transaction2,transaction3,transaction4);
		
		Map<LocalDate, Double> sumByDate = transactions.stream().collect(Collectors.groupingBy(Transaction::getDate,Collectors.summingDouble(Transaction::getAmount)));
		
		sumByDate
		.forEach((date,sum)->System.out.println("Date :" +date+" sum: "+sum));
	}
}

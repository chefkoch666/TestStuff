package de.edlich.vfhvws.dsls;

public class RunMe {
	 
	public static void main(String[] args) {
		Order o = new Order.Builder()
				    .buy(100, "IBM")
						.atLimitPrice(300)
						.allOrNone()
						.valueAs(new StandardOrderValuer())
						.build();
		System.out.println(o.toString());
		}
	}
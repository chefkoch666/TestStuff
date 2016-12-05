package de.edlich.vfhvws.dsls;

public class StandardOrderValuer implements OrderValuer {
  public int valueAs(int qty, int unitPrice) {
	  return qty*unitPrice;
	}
}
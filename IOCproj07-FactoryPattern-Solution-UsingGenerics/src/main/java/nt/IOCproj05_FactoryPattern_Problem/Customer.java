package nt.IOCproj05_FactoryPattern_Problem;

public class Customer extends Person {
 private int txtId;
 private double billAmount;
public Customer(String name, String addrs, AadharDetails aadhar, int txtId, double billAmount) {
	super(name, addrs, aadhar);
	this.txtId = txtId;
	this.billAmount = billAmount;
}
@Override
public String toString() {
	return "Customer [txtId=" + txtId + ", billAmount=" + billAmount + "]";
}
 
 
}

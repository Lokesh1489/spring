package nt.IOCproj05_FactoryPattern_Problem;

public class AadharDetails {
	private long aadharNo;
	private int age;
	private long moblieNo;

	public AadharDetails(long aadharNo, int age, long moblieNo) {
		super();
		this.aadharNo = aadharNo;
		this.age = age;
		this.moblieNo = moblieNo;
	}

	@Override
	public String toString() {
		return "AadharDetails [aadharNo=" + aadharNo + ", age=" + age + ", moblieNo=" + moblieNo + "]";
	}

}

package com.reddy.device.aeroplane;

public class AeroPlane {

	private Integer planNo;
	private String company;
	private String govt;

	public AeroPlane() {

	}

	public AeroPlane(int planNo, String company, String govt) {
		super();
		this.planNo = planNo;
		this.company = company;
		this.govt = govt;
	}

	public int getPlanNo() {
		return planNo;
	}

	public void setPlanNo(int planNo) {
		this.planNo = planNo;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getGovt() {
		return govt;
	}

	public void setGovt(String govt) {
		this.govt = govt;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("invoked method pointing to null");
			
				if (obj instanceof AeroPlane) {
					AeroPlane casted = (AeroPlane) obj;
					Integer match = casted.getPlanNo();
					if (this.planNo.equals(match)) {
						System.out.println("To print plane no :"+getPlanNo());
						System.out.println("Plane no are's same");
						return true;
					} else {
						System.err.println("Plane no are's not match");
						return false;

					}

				}

			

		}
		System.err.println("NOT MATCH'S");
		return false;

	}

	@Override
	protected void finalize() throws Throwable {

		super.finalize();
	}

	@Override
	public String toString() {

		return super.toString();
	}

	@Override
	public int hashCode() {

		return super.hashCode();
	}

}

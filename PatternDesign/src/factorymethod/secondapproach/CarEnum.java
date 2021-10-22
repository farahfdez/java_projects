package factorymethod.secondapproach;

public enum CarEnum {
	
	RENAULT("Renault", Renault.class.getName()),
	PEUGEOT("Peugeot", Peugeot.class.getName());
	
	private String brand;
	private String className;
	
	private CarEnum(String brand, String className) {
		this.brand = brand;
		this.className = className;
	}	
	public String getBrand() {
		return brand;
	}
	public String getClassName() {
		return className;
	}

	public static CarEnum fromBrand(String brand) {
		if (brand != null) {
			for (CarEnum b : values()) {
				if (brand.equals(b.getBrand())) {
					return b;
				}
			}
		}
		return null;
	}
	
	

}

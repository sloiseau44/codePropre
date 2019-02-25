package ex3;
public enum TypeOiseau  {
	Aigle, Moinneau, Pigeon;

	public String deplacer() {
		switch (this) {
		case Aigle:
			return Aigle.toString() + " vol";
		case Pigeon:
			return Pigeon.toString() + " vol";
		case Moinneau:
			return Moinneau.toString() + " vol";
		default:
			return this.toString() + " vol";
		}
	}

	public String getChant() {
		switch (this) {
		case Aigle:
			return Aigle.toString() + " chante";
		case Pigeon:
			return Pigeon.toString() + " chante";
		case Moinneau:
			return Moinneau.toString() + " chante";
		default:
			return this.toString() + " chante";
		}
	}
}
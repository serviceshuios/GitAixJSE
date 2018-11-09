package metier;

public interface IPersonne {
	public void bonjour();
	public default String identite() {
		return "comportement par défaut";
	}
}

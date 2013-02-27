package MineSweeper;

public enum TypeOfMenu {
	ONE("10 Bombs in 9*9"), TWO("40 Bombs in 16*16"), THREE("100 Bombs in 16*30");
	
	private final String text;
	
	private TypeOfMenu(final String text) {
        this.text = text;
    }

	@Override
    public String toString() {
        return text;
	}
}

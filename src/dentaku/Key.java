package dentaku;

 class Key {
 private String key;
 private double mem01;
 private double mem02;
 private String memStatus01;
 private String memStatus02;
 private String separationPresent;
 private String separation01;
 private String separation02;
 private String separationStatus01;
 private String separationStatus02;
 final String EMPTY="EMPTY";
 final String SAVED="SAVED";
 private KeyMap keyMap;
 private Num num;
 private Ope ope;
 ComputeValues computeValues;
 Compute compute;
 public Key() {
		inzValues();
		mem01 = 0;
		keyMap = new KeyMap();
		num = new Num();
		ope = new Ope();
		computeValues = new ComputeValues();
		compute = new Compute();

	}

	private void inzValues() {
		mem02 = 0;
		memStatus01 = EMPTY;
		memStatus02 = EMPTY;
		separationPresent = "";
		separation01 = "";
		separation02 = "";
		separationStatus01 = EMPTY;
		separationStatus02 = EMPTY;

	}

	private void setComputeValues() {
		computeValues.mem01 = mem01;
		computeValues.mem02 = mem02;
		computeValues.memStatus01 = memStatus01;
		computeValues.memStatus02 = memStatus02;
		computeValues.separationPresent = separationPresent;
		computeValues.separation01 = separation01;
		computeValues.separation02 = separation02;
		computeValues.separationStatus01 = separationStatus01;
		computeValues.separationStatus02 = separationStatus02;

	}

	public ComputeValues getComputeValues() {
		computeValues.mem01 = mem01;
		computeValues.mem02 = mem02;
		computeValues.memStatus01 = memStatus01;
		computeValues.memStatus02 = memStatus02;
		computeValues.separationPresent = separationPresent;
		computeValues.separation01 = separation01;
		computeValues.separation02 = separation02;
		computeValues.separationStatus01 = separationStatus01;
		computeValues.separationStatus02 = separationStatus02;
		return computeValues;

	}

	public void setKey(String key){
		String mapLetter;
		String stringLetter;
		char charLetter;
		this.key=key;
		for (int i = 0; i < this.key.length(); i++) {
			stringLetter=String.valueOf(this.key.charAt(i));
			mapLetter=keyMap.value(stringLetter);
			charLetter=mapLetter.charAt(0);
			if (Character.isDigit(charLetter)) {
				if (memStatus01==EMPTY&&memStatus02==EMPTY) {
					mem01=num.assemble(mapLetter);
					setComputeValues();
				} else if (memStatus01==SAVED && memStatus02==EMPTY) {
					mem02=num.assemble(mapLetter);
					setComputeValues();
				}
			}else if (ope.assemble(mapLetter)) {
				if (separationStatus01==EMPTY && separationStatus02==EMPTY) {
					num.setNum(0);
					separationPresent=mapLetter;
					separation01=separationPresent;
					separationStatus01=SAVED;
					memStatus01=SAVED;
					setComputeValues();

				}else if (separationStatus01==SAVED && separationStatus02==EMPTY) {
					num.setNum(0);
					separationPresent=mapLetter;
					separation02=separationPresent;
					separationStatus02=SAVED;
					memStatus02=SAVED;
					setComputeValues();
				}
			}
		}
		if (separationStatus01==SAVED&&separationStatus02==SAVED) {
			setComputeValues();
			compute.setComputeValues(computeValues);
			mem01=compute.runCompute();
			inzValues();
		}
	}
 

}
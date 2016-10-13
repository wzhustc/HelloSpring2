package com.springtutorial.DI;

public class TestEditor3 {
	private SpellChecker spellChecker;

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	
	
	public void spellCheck() {
		System.out.println("调用spellChecking方法");
		spellChecker.spellChecking();
	}
}

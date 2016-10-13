package com.springtutorial.DI;

/**
 * 通过setter方法注入bean
 * @author zhangwei19619
 *
 */
public class TestEditor2 {
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

package com.springtutorial.DI;

public class TestEditor {
	private SpellChecker spellChecker;
	
	public TestEditor(SpellChecker spellChecker) {
		System.out.println("TestEditor 构造函数被调用、");
		this.spellChecker = spellChecker;
	}
	
	public void spellCheck() {
		System.out.println("调用spellChecking方法");
		spellChecker.spellChecking();
	}
	
}

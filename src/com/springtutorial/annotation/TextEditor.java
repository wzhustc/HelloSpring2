package com.springtutorial.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	
	private SpellChecker spellChecker;
	
	public TextEditor() {
		System.out.println("Inside TextEditor constructor." );
	}
	
	@Autowired
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	
	public SpellChecker getSpellChecker( ){
	      return spellChecker;
	}
	
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}

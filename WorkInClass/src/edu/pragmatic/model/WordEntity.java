package edu.pragmatic.model;

public class WordEntity {

	private String word;
	private String translation;

	public WordEntity(String word, String translation) {
		this.word = word;
		this.translation = translation;

	}

	public String getWord() {
		return word;

	}

	public String getTranslation() {
		return translation;

	}
}
package edu.pragmatic.model;

import java.util.*;

public class Dictionary {

	private Map<String, WordEntity> wordEntities = new HashMap<>();

	public void addWord(WordEntity wordEntity) {
		wordEntities.put(wordEntity.getWord(), wordEntity);
	}

	public WordEntity search(String word) {
		return wordEntities.get(word);
	}
}

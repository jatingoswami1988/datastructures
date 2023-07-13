package com.fis;

import java.util.HashSet;
import java.util.Set;

public class WordSearch {

	public static WordSearch wordSearch = new WordSearch();

	public Set<String> words = new HashSet<String>();

	public Set<String> findMatches(String wordPattern) {
		Set<String> finalResult = new HashSet<String>();
		char[] word = wordPattern.toCharArray();
		for (String w : words) {
			char[] temp = w.toCharArray();
			if (word.length == temp.length) {
				boolean flag = true;
				for (int i = 0; i < temp.length; i++) {
					if (word[i] != temp[i] && word[i] != '.') {
						flag = false;
						break;
					}
				}
				if (flag) {
					finalResult.add(temp.toString());

				}
				flag = true;
			}
		}
		return finalResult;
	}

	public static void main(String[] args) {
		System.out.println(WordSearch.builder().addWord("apple").addWord("ample").build().findMatches("a.ple"));

	}

	public WordSearch addWord(String word) {
		wordSearch.getWords().add(word);
		return wordSearch;
	}

	private static WordSearch builder() {
		return wordSearch;
	}

	public WordSearch build() {
		return wordSearch;
	}

	public Set<String> getWords() {
		return words;
	}

	public void setWords(Set<String> words) {
		this.words = words;
	}

}

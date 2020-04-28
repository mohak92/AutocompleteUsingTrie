package com.mohak.autocompleteUsingTrie;

import java.util.List;

public class App {

	public static void main(String[] args) {
		Trie trie = new Trie();
		
		trie.insert("apple");
		trie.insert("apply");
		trie.insert("approve");
		trie.insert("newyork");
		trie.insert("newjersey");
		trie.insert("newengland");
		trie.insert("newamsterdam");
		
		List<String> list = trie.allWordsWithPrefix("new");
		for(String s : list) {
			System.out.println(s);
		}
		
		System.out.println();

		List<String> list2 = trie.allWordsWithPrefix("app");
		for(String s : list2) {
			System.out.println(s);
		}
	}

}

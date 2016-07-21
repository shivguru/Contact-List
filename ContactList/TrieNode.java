package ContactList;

import java.util.HashMap;

/**
 * Created by shiv on 21/05/15.
 */
public class TrieNode {
    char letter;
    TrieNode[] links;
    HashMap<Character,TrieNode> neighbours;
    boolean fullWord;

    TrieNode(char letter)
    {
        this.letter = letter;
        links = new TrieNode[26];
        neighbours=new HashMap<Character,TrieNode>();
        //this.fullWord = fullWord;
    }
}



package ContactList;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;


public class PrefixTree
{
    static TrieNode createTree()
    {
        return(new TrieNode('\0'));
    }

    static void insertWord(TrieNode root, String word)
    {
        //int offset = 97;
        int l = word.length();
        char[] letters = word.toCharArray();
        TrieNode curNode = root;

        for (int i = 0; i < l; i++)
        {


            TrieNode t=new TrieNode(letters[i]);

            if(!curNode.neighbours.containsKey(letters[i]))
                curNode.neighbours.put(letters[i],t);
            
            curNode=curNode.neighbours.get(letters[i]);


        }
        curNode.fullWord=true;
    }


    public static int bfs(TrieNode rootNode) {
        Queue queue = new LinkedList();
        queue.add(rootNode);
        int totalNames = 0;
        while(!queue.isEmpty()) {
            TrieNode node = (TrieNode) queue.remove();
            if (node.fullWord && !node.neighbours.values().isEmpty()) {
                totalNames++;
            }
            for (TrieNode childNode: node.neighbours.values()) {
                queue.add(childNode);
            }
        }
        return totalNames;
    }

    public static void main(String[] args)
    {
        //initialize reader and writer
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int t = Integer.parseInt(bufferReader.readLine());
            for(int tc=0; tc<t; tc++) {
                int n = Integer.parseInt(bufferReader.readLine());
                TrieNode tree = createTree();
                // create the trie for the test case
                for(int numWords=0;numWords<n;numWords++)
                {
                    String s=bufferReader.readLine().toLowerCase();
                   // System.out.println(s);
                    insertWord(tree,s);
                }
                int total=bfs(tree);
                System.out.println("Case #"+(tc+1)+": "+total);

                if (tc != t) {
                    bufferReader.readLine();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}


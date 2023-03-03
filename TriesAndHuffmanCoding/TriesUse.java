package TriesAndHuffmanCoding;

public class TriesUse {
    public static void main(String[] args) {
        tries trie = new tries();
        trie.add("SARVESH");
        trie.add("SAR");
        System.out.println(trie.search("SARVESH"));
        trie.add("WHATUP");
        System.out.println(trie.search("WHATUP"));
        trie.remove("WHATUP");
        System.out.println(trie.search("WHATUP"));
    }
}

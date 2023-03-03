package TriesAndHuffmanCoding;

public class tries {
    private TrieNode root;
    private int numWords;
    public tries(){
        root=new TrieNode('\0');
        numWords=0;
    }

    private boolean add(TrieNode root, String word){
        if(word.length() == 0){
            if(root.isTerminal) {
                return false;
            }
            else {
                root.isTerminal = true;
                return true;
            }
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if(child == null){
            child = new TrieNode(word.charAt(0));
            root.children[childIndex] = child;
            root.childCount++;
        }
        return add(child, word.substring(1));
    }

    public void add(String word){
        if(add(root, word)) {
            numWords++;
        }
    }

    public int countWords() {
        // Write your code here
        return numWords;
    }

    private boolean searchHelper(TrieNode root,String word){
        if(word.length()==0){
            return true;
        }

        int childIndex= word.charAt(0)-'A';
        TrieNode child = root.children[childIndex];
        if(child==null){
            return false;
        }
        if(word.length()==1){
            if(child.isTerminal==true){
                return true;
            }
            else{
                return false;
            }
        }
        return searchHelper(child, word.substring(1));
    }

    public boolean search(String word){
        if(word.length()==0){
            return true;
        }
        return searchHelper(root,word);

    }
    public void remove(String word){
        if(remove(root, word)) {
            numWords--;
        }
    }


    private boolean remove(TrieNode root, String word) {
        if(word.length() == 0){
            if(root.isTerminal) {
                root.isTerminal = false;
                return true;
            }
            else {
                return false;
            }
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if(child == null){
            return false;
        }
        boolean ans = remove(child, word.substring(1));
        // We can remove child node only if it is non terminating and its number of children are 0

        if(!child.isTerminal && child.childCount == 0){
            root.children[childIndex] = null;
            child = null;
            root.childCount--;
        }
        return ans;
    }
}

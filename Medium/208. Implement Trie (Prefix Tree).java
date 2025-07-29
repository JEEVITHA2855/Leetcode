class TrieNode {
    TrieNode[] child=new TrieNode[26];
    boolean isEnd=false;
}

class Trie{
    private TrieNode root;
    public Trie(){
        root=new TrieNode();
    }
    public void insert(String word){
        TrieNode node=root;
        for (char ch:word.toCharArray()){
            int ind=ch-'a';
            if(node.child[ind]==null)
                node.child[ind]=new TrieNode();
            node=node.child[ind];
        }
        node.isEnd=true;
    }
    public boolean search(String word) {
        TrieNode node=root;
        for (char ch:word.toCharArray()){
            int ind=ch-'a';
            if (node.child[ind]==null)
                return false;
            node=node.child[ind];
        }
        return node.isEnd;
    }
    public boolean startsWith(String prefix) {
        TrieNode node=root;
        for(char ch:prefix.toCharArray()){
            int ind=ch-'a';
            if(node.child[ind]==null)
                return false;
            node=node.child[ind];
        }
        return true;
    }
}

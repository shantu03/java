public class TrieNode {

    TrieNode children[];

    boolean isEndOfWord=false;

    public TrieNode(){
        children=new TrieNode[26];
    }

    public static boolean search(TrieNode root,String key)
    {
        TrieNode curr=root;

        for (char ch : key.toCharArray()) {
            if(curr.children[ch-'a']==null) return false;
            curr=curr.children[ch-'a'];
        }

        return curr.isEndOfWord;
    }
    public static boolean prefix(TrieNode root,String key)
    {
        TrieNode curr=root;

        for (char ch : key.toCharArray()) {
            if(curr.children[ch-'a']==null) return false;
            curr=curr.children[ch-'a'];
        }

        return true;
    }

    public static void   insert(TrieNode root,String key)
    {
        TrieNode curr=root;
        for (char ch : key.toCharArray()) {

            if(curr.children[ch-'a']==null)
            {

                curr.children[ch - 'a']=new TrieNode();
            }

            curr=curr.children[ch - 'a'];
            
        }

        curr.isEndOfWord=true;
    }
    
}

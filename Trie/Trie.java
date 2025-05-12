public class Trie {

    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEndOfWord;

        TrieNode() {
            isEndOfWord = false;
            for (int i = 0; i < 26; i++)
                children[i] = null;
        }
    }

    private final TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (current.children[index] == null)
                current.children[index] = new TrieNode();
            current = current.children[index];
        }
        current.isEndOfWord = true;
    }

    public boolean search(String word) {
        TrieNode node = searchNode(word);
        return node != null && node.isEndOfWord;
    }

    public boolean startsWith(String prefix) {
        return searchNode(prefix) != null;
    }

    private TrieNode searchNode(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (current.children[index] == null)
                return null;
            current = current.children[index];
        }
        return current;
    }

    public boolean delete(String word) {
        return delete(root, word, 0);
    }

    private boolean delete(TrieNode current, String word, int depth) {
        if (current == null)
            return false;

        if (depth == word.length()) {
            if (!current.isEndOfWord)
                return false;
            current.isEndOfWord = false;
            return isEmpty(current);
        }

        int index = word.charAt(depth) - 'a';
        if (delete(current.children[index], word, depth + 1)) {
            current.children[index] = null;
            return !current.isEndOfWord && isEmpty(current);
        }

        return false;
    }

    private boolean isEmpty(TrieNode node) {
        for (int i = 0; i < 26; i++)
            if (node.children[i] != null)
                return false;
        return true;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("apple");
        trie.insert("app");
        trie.insert("bat");

        System.out.println(trie.search("app"));
        System.out.println(trie.search("apple"));
        System.out.println(trie.search("bat"));
        System.out.println(trie.search("bad"));
        System.out.println(trie.startsWith("ap"));
        System.out.println(trie.startsWith("ba"));
        System.out.println(trie.startsWith("ca"));
        System.out.println(trie.startsWith("le"));
        trie.delete("apple");
        System.out.println(trie.search("apple"));
        System.out.println(trie.search("app"));
    }
}

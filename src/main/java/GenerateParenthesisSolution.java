import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesisSolution {
    public List<String> generateParenthesis(int n) {
        List<String> r = new ArrayList<>();
        dfs(r, "", n, n);
        return r;
    }

    // depth first search
    public void dfs(List<String> res, String s, int l, int r) {
        // make sure the we always start with an open paren
        if (l > r) {
            return;
        }

        // we are done with this recursive iteration
        // add to list and return
        if (l == 0 && r == 0) {
            res.add(s);
            return;
        }

        // create an open paren
        if (l > 0) {
            dfs(res, s + "(", l - 1, r);
        }

        // create a closing paren
        if (r > 0) {
            dfs(res, s + ")", l, r - 1);
        }
    }
}

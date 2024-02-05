package pack1;
import java.util.LinkedList;
public class LLTasks {
    public static LinkedList<Object> revert(LinkedList<Object> ll) {
        LinkedList<Object> res = new LinkedList<>();
        for (int i = ll.size(); i >0 ; i--) {
            res.add(ll.removeLast());
        }
        return res;
    }
}

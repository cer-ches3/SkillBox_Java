import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class NodeValuesSumCalculator extends RecursiveTask<Long> {
    private Node node;

    public NodeValuesSumCalculator(Node node) {
        this.node = node;
    }

    @Override
    protected Long compute() {
        long sum = node.getValue();
        List<NodeValuesSumCalculator> taskList = new ArrayList<>();
        for (Node child : node.getChildren()) {
            NodeValuesSumCalculator task = new NodeValuesSumCalculator(child);
            task.fork();
            taskList.add(task);
        }
        for (NodeValuesSumCalculator task : taskList) {
            sum += task.join();
        }
        return null;
    }
}

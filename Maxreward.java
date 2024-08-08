
import java.util.*;

public class Maxreward{
    public static long maximumReward(int n, List<Pair<Long, Long>> tasks) {
        Collections.sort(tasks, (a, b) -> (int) (a.first - b.first));
        long currentTime = 0;
        long reward = 0;
        System.out.println(tasks);
        for (Pair<Long, Long> task : tasks) {
            currentTime += task.first;
            reward += task.second - currentTime;
        }

        return reward;
    }

    public static void main(String[] args) {
        List<Pair<Long, Long>> tasks = new ArrayList<>();
        tasks.add(new Pair<>(6L, 10L));
        tasks.add(new Pair<>(8L, 15L));
        tasks.add(new Pair<>(5L, 12L));
        
        System.out.println(maximumReward(3, tasks)); // Output: 2
    }
}

class Pair<X, Y> {
    X first;
    Y second;

    Pair(X first, Y second) {
        this.first = first;
        this.second = second;
    }
}


// import java.util.*;

// public class Maxr{
//     public static Integer maximumReward(int n, List<Task> tasks) {
//         Collections.sort(tasks, (a, b) -> (int) (a.duration - b.duration));
//         Integer currentTime = 0;
//         Integer reward = 0;
//         System.out.println(tasks);
//         for(int i=0;i<n;i++) {
//             currentTime += tasks.get(i).duration;
//             reward += tasks.get(i).deadline - currentTime;
//         }
//         return reward;
//     }

//     public static void main(String[] args) {
//         List<Task> tasks = new ArrayList<>();
//         tasks.add(new Task(6, 10));
//         tasks.add(new Task(8, 15));
//         tasks.add(new Task(5, 12));

//         System.out.println(maximumReward(3, tasks)); // Output: 2
//     }
// }

// class Task {
//     int duration;
//     int deadline;

//     public Task(int duration, int deadline) {
//         this.duration = duration;
//         this.deadline = deadline;
//     }
// }

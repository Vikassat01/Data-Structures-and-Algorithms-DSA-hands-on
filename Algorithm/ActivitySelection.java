package Algorithm;
import java.util.*;


    class Activity {
        int start, end;

        Activity(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public class ActivitySelection {
        public static void selectActivities(Activity[] activities) {
            Arrays.sort(activities, Comparator.comparingInt(a -> a.end));

            int lastEndTime = -1;
            for (Activity activity : activities) {
                if (activity.start >= lastEndTime) {
                    System.out.println("Selected Activity: " + activity.start + " - " + activity.end);
                    lastEndTime = activity.end;
                }
            }
        }

        public static void main(String[] args) {
            Activity[] activities = {
                    new Activity(1, 3),
                    new Activity(2, 4),
                    new Activity(3, 5),
                    new Activity(0, 6),
                    new Activity(5, 7),
                    new Activity(8, 9)
            };
            selectActivities(activities);
        }
    }



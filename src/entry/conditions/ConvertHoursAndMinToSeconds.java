package entry.conditions;

public class ConvertHoursAndMinToSeconds {
    public int hoursMinutesToSeconds(int hours, int minutes) {
        return (hours * 3600) + (minutes * 60);
    }
}

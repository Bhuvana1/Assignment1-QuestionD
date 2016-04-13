import java.util.ArrayList;

public class TestMerge {
private ArrayList<String> events= new ArrayList<string();
public void createEvents(){
events.add("we are going to movie today");
events.add("Birthday Party");
}
public void Thoughtfortheday(){
System.out.println("Welcome All");
}
public void upcomingEvents(){
System.out.println("CPS upcoming events");
for(String event:events)
System.out.println(events);
}

public static void main (String[] args)
{
TestMerge tm = new TestMerge();
tm.Thoughtfortheday();
tm.createEvents();
tm.upcomingEvents();
}


}

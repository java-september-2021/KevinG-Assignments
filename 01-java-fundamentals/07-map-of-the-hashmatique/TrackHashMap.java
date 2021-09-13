import java.util.HashMap;

public class TrackHashMap {
    public static void main(String [] args) {
        HashMap <String, String> trackList = new HashMap<String, String>();

        trackList.put("Ben","Ben, the two of us need look no more");
        trackList.put("Got to be There","Got to be there, got to be there (got to be there) In the morning");
        trackList.put("Rockin Robin", "He rocks in the tree tops all day long Hoppin' and a-boppin'and singing his song ll the little birdies on Jaybird Street Love to hear the robin go tweet tweet tweet  ");
        trackList.put("ABC", "A buh-buh buh buh-buh A buh-buh buh buh-buh You went to school to learn, girl Things you never, never knew before Like I before E except after C");

        System.out.println("The track requested: "+ trackList.get("ABC"));

        for(HashMap.Entry<String, String> track: trackList.entrySet()) {
            System.out.println(track.getKey() + ":" + track.getValue());
        }

    }

}
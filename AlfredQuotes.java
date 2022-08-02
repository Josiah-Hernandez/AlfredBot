import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return String.format ("Hello, great to see you. How's it going?" + name);
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date todayDate = new Date();
        return String.format("Todays Date Is %s", new Date());
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        if (conversation.indexOf("Alexis") >= 0){
            return "Alexis is alright";
        }

        if(conversation.indexOf("Alexis") >= 0 ){
            return "Alexis is a know it all";

            }
            return "We Own Everything";  
    }

	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}


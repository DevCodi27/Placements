package Day2;

public class MagicTicket {
    public void ticket(String c)
    {
        c=c.toLowerCase();
        char ch = c.charAt(0);

        if(ch=='e')
        {
            System.out.println("Early Bird Ticket");
        } else if (ch == 'd') {
            System.out.println("Discount Ticket");
        } else if (ch == 'v') {

            System.out.println("VIP Ticket");
            
        } else if (ch == 's') {
            System.out.println("Standard Ticket");
        }
        else if(ch == 'c')
        {
            System.out.println("Children Ticket");
        }
        else {
            System.out.println("Invalid Ticket");
        }
        {

        }
    }
}
